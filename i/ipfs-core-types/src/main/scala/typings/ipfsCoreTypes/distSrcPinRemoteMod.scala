package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteMod {
  
  trait API[OptionExtension] extends StObject {
    
    /**
      * Pin a content with a given CID to a remote pinning service.
      */
    def add(cid: CID[Any, Double, Double, Version], options: AddOptions & AbortOptions & OptionExtension): js.Promise[Pin]
    
    /**
      * Returns a list of matching pins on the remote pinning service.
      */
    def ls(query: Query & AbortOptions & OptionExtension): AsyncIterable[Pin]
    
    /**
      * Removes a single pin object matching query allowing it to be garbage
      * collected (if needed). Will error if multiple pins match provided
      * query. To remove all matches use `rmAll` instead.
      */
    def rm(query: Query & AbortOptions & OptionExtension): js.Promise[Unit]
    
    /**
      * Removes all pin object that match given query allowing them to be garbage
      * collected if needed.
      */
    def rmAll(query: Query & AbortOptions & OptionExtension): js.Promise[Unit]
    
    /**
      * API for configuring remote pinning services.
      */
    var service: typings.ipfsCoreTypes.distSrcPinRemoteServiceMod.API[js.Object]
  }
  object API {
    
    inline def apply[OptionExtension](
      add: (CID[Any, Double, Double, Version], AddOptions & AbortOptions & OptionExtension) => js.Promise[Pin],
      ls: Query & AbortOptions & OptionExtension => AsyncIterable[Pin],
      rm: Query & AbortOptions & OptionExtension => js.Promise[Unit],
      rmAll: Query & AbortOptions & OptionExtension => js.Promise[Unit],
      service: typings.ipfsCoreTypes.distSrcPinRemoteServiceMod.API[js.Object]
    ): API[OptionExtension] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), ls = js.Any.fromFunction1(ls), rm = js.Any.fromFunction1(rm), rmAll = js.Any.fromFunction1(rmAll), service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[API[OptionExtension]]
    }
    
    extension [Self <: API[?], OptionExtension](x: Self & API[OptionExtension]) {
      
      inline def setAdd(
        value: (CID[Any, Double, Double, Version], AddOptions & AbortOptions & OptionExtension) => js.Promise[Pin]
      ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setLs(value: Query & AbortOptions & OptionExtension => AsyncIterable[Pin]): Self = StObject.set(x, "ls", js.Any.fromFunction1(value))
      
      inline def setRm(value: Query & AbortOptions & OptionExtension => js.Promise[Unit]): Self = StObject.set(x, "rm", js.Any.fromFunction1(value))
      
      inline def setRmAll(value: Query & AbortOptions & OptionExtension => js.Promise[Unit]): Self = StObject.set(x, "rmAll", js.Any.fromFunction1(value))
      
      inline def setService(value: typings.ipfsCoreTypes.distSrcPinRemoteServiceMod.API[js.Object]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddOptions
    extends StObject
       with RemoteServiceOptions {
    
    /**
      * If true, will add to the queue on the remote service and return
      * immediately. If false or omitted will wait until pinned on the
      * remote service.
      */
    var background: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional name for pinned data; can be used for lookups later (max 255
      * characters)
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Optional list of multiaddrs known to provide the data (max 20).
      */
    var origins: js.UndefOr[js.Array[Multiaddr_]] = js.undefined
  }
  object AddOptions {
    
    inline def apply(service: String): AddOptions = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOptions]
    }
    
    extension [Self <: AddOptions](x: Self) {
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrigins(value: js.Array[Multiaddr_]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setOriginsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "origins", js.Array(value*))
    }
  }
  
  trait Pin extends StObject {
    
    var cid: CID[Any, Double, Double, Version]
    
    var name: String
    
    var status: Status
  }
  object Pin {
    
    inline def apply(cid: CID[Any, Double, Double, Version], name: String, status: Status): Pin = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pin]
    }
    
    extension [Self <: Pin](x: Self) {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Query
    extends StObject
       with RemoteServiceOptions {
    
    /**
      * If provided, will only include pin objects that have a CID from the given
      * set.
      */
    var cid: js.UndefOr[js.Array[CID[Any, Double, Double, Version]]] = js.undefined
    
    /**
      * If passed, will only include pin objects with names that have this name
      * (case-sensitive, exact match).
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Return pin objects for pins that have one of the specified status values.
      * If omitted treated as ["pinned"]
      */
    var status: js.UndefOr[js.Array[Status]] = js.undefined
  }
  object Query {
    
    inline def apply(service: String): Query = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    extension [Self <: Query](x: Self) {
      
      inline def setCid(value: js.Array[CID[Any, Double, Double, Version]]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setCidVarargs(value: (CID[Any, Double, Double, Version])*): Self = StObject.set(x, "cid", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStatus(value: js.Array[Status]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStatusVarargs(value: Status*): Self = StObject.set(x, "status", js.Array(value*))
    }
  }
  
  trait RemoteServiceOptions extends StObject {
    
    /**
      * Name of the remote pinning service to use.
      */
    var service: String
  }
  object RemoteServiceOptions {
    
    inline def apply(service: String): RemoteServiceOptions = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteServiceOptions]
    }
    
    extension [Self <: RemoteServiceOptions](x: Self) {
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.queued
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.pinning
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.pinned
    - typings.ipfsCoreTypes.ipfsCoreTypesStrings.failed
  */
  trait Status extends StObject
  object Status {
    
    inline def failed: typings.ipfsCoreTypes.ipfsCoreTypesStrings.failed = "failed".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.failed]
    
    inline def pinned: typings.ipfsCoreTypes.ipfsCoreTypesStrings.pinned = "pinned".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.pinned]
    
    inline def pinning: typings.ipfsCoreTypes.ipfsCoreTypesStrings.pinning = "pinning".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.pinning]
    
    inline def queued: typings.ipfsCoreTypes.ipfsCoreTypesStrings.queued = "queued".asInstanceOf[typings.ipfsCoreTypes.ipfsCoreTypesStrings.queued]
  }
}
