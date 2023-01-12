package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsCoreTypes.ipfsCoreTypesStrings.invalid
import typings.ipfsCoreTypes.ipfsCoreTypesStrings.valid
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteServiceMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * Registers remote pinning service with a given name. Errors if service
      * with the given name is already registered.
      */
    def add(name: String, credentials: Credentials & AbortOptions & OptionExtension): js.Promise[Unit] = js.native
    
    /**
      * List registered remote pinning services.
      */
    def ls(): js.Promise[js.Array[RemotePinService]] = js.native
    /**
      * List registered remote pinning services.
      */
    def ls(options: typings.ipfsCoreTypes.anon.Stat & AbortOptions & OptionExtension): js.Promise[js.Array[RemotePinServiceWithStat]] = js.native
    /**
      * List registered remote pinning services.
      */
    @JSName("ls")
    var ls_Original: (js.Function1[
        /* options */ typings.ipfsCoreTypes.anon.Stat & AbortOptions & OptionExtension, 
        js.Promise[js.Array[RemotePinServiceWithStat]]
      ]) & (js.Function1[
        /* options */ js.UndefOr[AbortOptions & OptionExtension], 
        js.Promise[js.Array[RemotePinService]]
      ]) = js.native
    
    /**
      * Unregisters remote pinning service with a given name. If service with such
      * name isn't registered this is a noop.
      */
    def rm(name: String): js.Promise[Unit] = js.native
    def rm(name: String, options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
  }
  
  trait Credentials extends StObject {
    
    /**
      * Service endpoint
      */
    var endpoint: URL
    
    /**
      * Service key
      */
    var key: String
  }
  object Credentials {
    
    inline def apply(endpoint: URL, key: String): Credentials = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      inline def setEndpoint(value: URL): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidStat
    extends StObject
       with Stat {
    
    var pinCount: Unit
    
    var status: invalid
  }
  object InvalidStat {
    
    inline def apply(pinCount: Unit): InvalidStat = {
      val __obj = js.Dynamic.literal(pinCount = pinCount.asInstanceOf[js.Any], status = "invalid")
      __obj.asInstanceOf[InvalidStat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidStat] (val x: Self) extends AnyVal {
      
      inline def setPinCount(value: Unit): Self = StObject.set(x, "pinCount", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: invalid): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait PinCount extends StObject {
    
    var failed: Double
    
    var pinned: Double
    
    var pinning: Double
    
    var queued: Double
  }
  object PinCount {
    
    inline def apply(failed: Double, pinned: Double, pinning: Double, queued: Double): PinCount = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], pinning = pinning.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinCount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PinCount] (val x: Self) extends AnyVal {
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setPinned(value: Double): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinning(value: Double): Self = StObject.set(x, "pinning", value.asInstanceOf[js.Any])
      
      inline def setQueued(value: Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemotePinService extends StObject {
    
    /**
      * Service endpoint URL
      */
    var endpoint: URL
    
    /**
      * Service name
      */
    var service: String
  }
  object RemotePinService {
    
    inline def apply(endpoint: URL, service: String): RemotePinService = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemotePinService]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemotePinService] (val x: Self) extends AnyVal {
      
      inline def setEndpoint(value: URL): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemotePinServiceWithStat
    extends StObject
       with RemotePinService {
    
    /**
      * Pin count on the remote service. It is fetched from the remote service and
      * is done only if `pinCount` option is used. Furthermore it may not be
      * present if service was unreachable.
      */
    var stat: Stat
  }
  object RemotePinServiceWithStat {
    
    inline def apply(endpoint: URL, service: String, stat: Stat): RemotePinServiceWithStat = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemotePinServiceWithStat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemotePinServiceWithStat] (val x: Self) extends AnyVal {
      
      inline def setStat(value: Stat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsCoreTypes.distSrcPinRemoteServiceMod.ValidStat
    - typings.ipfsCoreTypes.distSrcPinRemoteServiceMod.InvalidStat
  */
  trait Stat extends StObject
  object Stat {
    
    inline def InvalidStat(pinCount: Unit): typings.ipfsCoreTypes.distSrcPinRemoteServiceMod.InvalidStat = {
      val __obj = js.Dynamic.literal(pinCount = pinCount.asInstanceOf[js.Any], status = "invalid")
      __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcPinRemoteServiceMod.InvalidStat]
    }
    
    inline def ValidStat(pinCount: PinCount): typings.ipfsCoreTypes.distSrcPinRemoteServiceMod.ValidStat = {
      val __obj = js.Dynamic.literal(pinCount = pinCount.asInstanceOf[js.Any], status = "valid")
      __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcPinRemoteServiceMod.ValidStat]
    }
  }
  
  trait ValidStat
    extends StObject
       with Stat {
    
    var pinCount: PinCount
    
    var status: valid
  }
  object ValidStat {
    
    inline def apply(pinCount: PinCount): ValidStat = {
      val __obj = js.Dynamic.literal(pinCount = pinCount.asInstanceOf[js.Any], status = "valid")
      __obj.asInstanceOf[ValidStat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidStat] (val x: Self) extends AnyVal {
      
      inline def setPinCount(value: PinCount): Self = StObject.set(x, "pinCount", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: valid): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
