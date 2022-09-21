package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * All the digest functions supported by the remote cache. Remote cache may support multiple digest functions simultaneously.
    */
  var digestFunction: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Maximum total size of blobs to be uploaded/downloaded using batch methods. A value of 0 means no limit is set, although in practice there will always be a message size limitation of the protocol in use, e.g. GRPC.
    */
  var maxBatchTotalSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Compressors supported by the "compressed-blobs" bytestream resources. Servers MUST support identity/no-compression, even if it is not listed here. Note that this does not imply which if any compressors are supported by the server at the gRPC level.
    */
  var supportedCompressor: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether absolute symlink targets are supported.
    */
  var symlinkAbsolutePathStrategy: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setDigestFunctionNull: Self = StObject.set(x, "digestFunction", null)
    
    inline def setDigestFunctionUndefined: Self = StObject.set(x, "digestFunction", js.undefined)
    
    inline def setDigestFunctionVarargs(value: String*): Self = StObject.set(x, "digestFunction", js.Array(value*))
    
    inline def setMaxBatchTotalSizeBytes(value: String): Self = StObject.set(x, "maxBatchTotalSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchTotalSizeBytesNull: Self = StObject.set(x, "maxBatchTotalSizeBytes", null)
    
    inline def setMaxBatchTotalSizeBytesUndefined: Self = StObject.set(x, "maxBatchTotalSizeBytes", js.undefined)
    
    inline def setSupportedCompressor(value: js.Array[String]): Self = StObject.set(x, "supportedCompressor", value.asInstanceOf[js.Any])
    
    inline def setSupportedCompressorNull: Self = StObject.set(x, "supportedCompressor", null)
    
    inline def setSupportedCompressorUndefined: Self = StObject.set(x, "supportedCompressor", js.undefined)
    
    inline def setSupportedCompressorVarargs(value: String*): Self = StObject.set(x, "supportedCompressor", js.Array(value*))
    
    inline def setSymlinkAbsolutePathStrategy(value: String): Self = StObject.set(x, "symlinkAbsolutePathStrategy", value.asInstanceOf[js.Any])
    
    inline def setSymlinkAbsolutePathStrategyNull: Self = StObject.set(x, "symlinkAbsolutePathStrategy", null)
    
    inline def setSymlinkAbsolutePathStrategyUndefined: Self = StObject.set(x, "symlinkAbsolutePathStrategy", js.undefined)
  }
}
