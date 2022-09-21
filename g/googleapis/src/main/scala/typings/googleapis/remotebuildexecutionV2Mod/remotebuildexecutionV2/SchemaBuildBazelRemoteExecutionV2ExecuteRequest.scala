package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2ExecuteRequest extends StObject {
  
  /**
    * The digest of the Action to execute.
    */
  var actionDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /**
    * An optional policy for execution of the action. The server will have a default policy if this is not provided.
    */
  var executionPolicy: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ExecutionPolicy] = js.undefined
  
  /**
    * An optional policy for the results of this execution in the remote cache. The server will have a default policy if this is not provided. This may be applied to both the ActionResult and the associated blobs.
    */
  var resultsCachePolicy: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy] = js.undefined
  
  /**
    * If true, the action will be executed even if its result is already present in the ActionCache. The execution is still allowed to be merged with other in-flight executions of the same action, however - semantically, the service MUST only guarantee that the results of an execution with this field set were not visible before the corresponding execution request was sent. Note that actions from execution requests setting this field set are still eligible to be entered into the action cache upon completion, and services SHOULD overwrite any existing entries that may exist. This allows skip_cache_lookup requests to be used as a mechanism for replacing action cache entries that reference outputs no longer available or that are poisoned in any way. If false, the result may be served from the action cache.
    */
  var skipCacheLookup: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2ExecuteRequest {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2ExecuteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecuteRequest]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2ExecuteRequest](x: Self) {
    
    inline def setActionDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "actionDigest", value.asInstanceOf[js.Any])
    
    inline def setActionDigestUndefined: Self = StObject.set(x, "actionDigest", js.undefined)
    
    inline def setExecutionPolicy(value: SchemaBuildBazelRemoteExecutionV2ExecutionPolicy): Self = StObject.set(x, "executionPolicy", value.asInstanceOf[js.Any])
    
    inline def setExecutionPolicyUndefined: Self = StObject.set(x, "executionPolicy", js.undefined)
    
    inline def setResultsCachePolicy(value: SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy): Self = StObject.set(x, "resultsCachePolicy", value.asInstanceOf[js.Any])
    
    inline def setResultsCachePolicyUndefined: Self = StObject.set(x, "resultsCachePolicy", js.undefined)
    
    inline def setSkipCacheLookup(value: Boolean): Self = StObject.set(x, "skipCacheLookup", value.asInstanceOf[js.Any])
    
    inline def setSkipCacheLookupNull: Self = StObject.set(x, "skipCacheLookup", null)
    
    inline def setSkipCacheLookupUndefined: Self = StObject.set(x, "skipCacheLookup", js.undefined)
  }
}
