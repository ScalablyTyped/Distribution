package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRepoMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * Perform garbage collection on the repo
      *
      * Any unpinned blocks will be deleted
      */
    def gc(): AsyncIterable[GCResult] = js.native
    def gc(options: GCOptions & OptionExtension): AsyncIterable[GCResult] = js.native
    
    /**
      * Return stats about the repo
      */
    def stat(): js.Promise[StatResult] = js.native
    def stat(options: AbortOptions & OptionExtension): js.Promise[StatResult] = js.native
    
    /**
      * If the repo has been initialized, report the current version,
      * otherwise report the version that would be initialized
      */
    def version(): js.Promise[Double] = js.native
    def version(options: AbortOptions & OptionExtension): js.Promise[Double] = js.native
  }
  
  trait GCError
    extends StObject
       with GCResult {
    
    var cid: js.UndefOr[scala.Nothing] = js.undefined
    
    var err: js.Error
  }
  object GCError {
    
    inline def apply(err: js.Error): GCError = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
      __obj.asInstanceOf[GCError]
    }
    
    extension [Self <: GCError](x: Self) {
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    }
  }
  
  trait GCOptions
    extends StObject
       with AbortOptions {
    
    var quiet: js.UndefOr[Boolean] = js.undefined
  }
  object GCOptions {
    
    inline def apply(): GCOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GCOptions]
    }
    
    extension [Self <: GCOptions](x: Self) {
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsCoreTypes.distSrcRepoMod.GCSuccess
    - typings.ipfsCoreTypes.distSrcRepoMod.GCError
  */
  trait GCResult extends StObject
  object GCResult {
    
    inline def GCError(err: js.Error): typings.ipfsCoreTypes.distSrcRepoMod.GCError = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcRepoMod.GCError]
    }
    
    inline def GCSuccess(cid: CID[Any, Double, Double, Version]): typings.ipfsCoreTypes.distSrcRepoMod.GCSuccess = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcRepoMod.GCSuccess]
    }
  }
  
  trait GCSuccess
    extends StObject
       with GCResult {
    
    var cid: CID[Any, Double, Double, Version]
    
    var err: js.UndefOr[scala.Nothing] = js.undefined
  }
  object GCSuccess {
    
    inline def apply(cid: CID[Any, Double, Double, Version]): GCSuccess = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[GCSuccess]
    }
    
    extension [Self <: GCSuccess](x: Self) {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatResult extends StObject {
    
    var numObjects: js.BigInt
    
    var repoPath: String
    
    var repoSize: js.BigInt
    
    var storageMax: js.BigInt
    
    var version: String
  }
  object StatResult {
    
    inline def apply(
      numObjects: js.BigInt,
      repoPath: String,
      repoSize: js.BigInt,
      storageMax: js.BigInt,
      version: String
    ): StatResult = {
      val __obj = js.Dynamic.literal(numObjects = numObjects.asInstanceOf[js.Any], repoPath = repoPath.asInstanceOf[js.Any], repoSize = repoSize.asInstanceOf[js.Any], storageMax = storageMax.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatResult]
    }
    
    extension [Self <: StatResult](x: Self) {
      
      inline def setNumObjects(value: js.BigInt): Self = StObject.set(x, "numObjects", value.asInstanceOf[js.Any])
      
      inline def setRepoPath(value: String): Self = StObject.set(x, "repoPath", value.asInstanceOf[js.Any])
      
      inline def setRepoSize(value: js.BigInt): Self = StObject.set(x, "repoSize", value.asInstanceOf[js.Any])
      
      inline def setStorageMax(value: js.BigInt): Self = StObject.set(x, "storageMax", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
