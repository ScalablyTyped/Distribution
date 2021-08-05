package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Capabilities of the remote cache system.
  */
trait SchemaBuildBazelRemoteExecutionV2CacheCapabilities extends StObject {
  
  /**
    * Capabilities for updating the action cache.
    */
  var actionCacheUpdateCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities] = js.undefined
  
  /**
    * Supported cache priority range for both CAS and ActionCache.
    */
  var cachePriorityCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2PriorityCapabilities] = js.undefined
  
  /**
    * All the digest functions supported by the remote cache. Remote cache may
    * support multiple digest functions simultaneously.
    */
  var digestFunction: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Maximum total size of blobs to be uploaded/downloaded using batch
    * methods. A value of 0 means no limit is set, although in practice there
    * will always be a message size limitation of the protocol in use, e.g.
    * GRPC.
    */
  var maxBatchTotalSizeBytes: js.UndefOr[String] = js.undefined
  
  /**
    * Whether absolute symlink targets are supported.
    */
  var symlinkAbsolutePathStrategy: js.UndefOr[String] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2CacheCapabilities {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2CacheCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2CacheCapabilities]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2CacheCapabilities](x: Self) {
    
    inline def setActionCacheUpdateCapabilities(value: SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities): Self = StObject.set(x, "actionCacheUpdateCapabilities", value.asInstanceOf[js.Any])
    
    inline def setActionCacheUpdateCapabilitiesUndefined: Self = StObject.set(x, "actionCacheUpdateCapabilities", js.undefined)
    
    inline def setCachePriorityCapabilities(value: SchemaBuildBazelRemoteExecutionV2PriorityCapabilities): Self = StObject.set(x, "cachePriorityCapabilities", value.asInstanceOf[js.Any])
    
    inline def setCachePriorityCapabilitiesUndefined: Self = StObject.set(x, "cachePriorityCapabilities", js.undefined)
    
    inline def setDigestFunction(value: js.Array[String]): Self = StObject.set(x, "digestFunction", value.asInstanceOf[js.Any])
    
    inline def setDigestFunctionUndefined: Self = StObject.set(x, "digestFunction", js.undefined)
    
    inline def setDigestFunctionVarargs(value: String*): Self = StObject.set(x, "digestFunction", js.Array(value :_*))
    
    inline def setMaxBatchTotalSizeBytes(value: String): Self = StObject.set(x, "maxBatchTotalSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchTotalSizeBytesUndefined: Self = StObject.set(x, "maxBatchTotalSizeBytes", js.undefined)
    
    inline def setSymlinkAbsolutePathStrategy(value: String): Self = StObject.set(x, "symlinkAbsolutePathStrategy", value.asInstanceOf[js.Any])
    
    inline def setSymlinkAbsolutePathStrategyUndefined: Self = StObject.set(x, "symlinkAbsolutePathStrategy", js.undefined)
  }
}
