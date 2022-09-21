package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceActionresultsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64 characters long.
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    */
  var instanceName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.undefined
  
  /**
    * The priority (relative importance) of this content in the overall cache. Generally, a lower value means a longer retention time or other advantage, but the interpretation of a given value is server-dependent. A priority of 0 means a *default* value, decided by the server. The particular semantics of this field is up to the server. In particular, every server will have their own supported range of priorities, and will decide how these map into retention/eviction policy.
    */
  @JSName("resultsCachePolicy.priority")
  var resultsCachePolicyDotpriority: js.UndefOr[Double] = js.undefined
  
  /**
    * The size of the blob, in bytes.
    */
  var sizeBytes: js.UndefOr[String] = js.undefined
}
object ParamsResourceActionresultsUpdate {
  
  inline def apply(): ParamsResourceActionresultsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceActionresultsUpdate]
  }
  
  extension [Self <: ParamsResourceActionresultsUpdate](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setRequestBody(value: SchemaBuildBazelRemoteExecutionV2ActionResult): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResultsCachePolicyDotpriority(value: Double): Self = StObject.set(x, "resultsCachePolicy.priority", value.asInstanceOf[js.Any])
    
    inline def setResultsCachePolicyDotpriorityUndefined: Self = StObject.set(x, "resultsCachePolicy.priority", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
