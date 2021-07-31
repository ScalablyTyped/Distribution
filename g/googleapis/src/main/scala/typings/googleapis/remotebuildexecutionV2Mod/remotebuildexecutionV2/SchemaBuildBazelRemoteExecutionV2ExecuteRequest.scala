package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request message for Execution.Execute.
  */
trait SchemaBuildBazelRemoteExecutionV2ExecuteRequest extends StObject {
  
  /**
    * The digest of the Action to execute.
    */
  var actionDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /**
    * An optional policy for execution of the action. The server will have a
    * default policy if this is not provided.
    */
  var executionPolicy: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ExecutionPolicy] = js.undefined
  
  /**
    * An optional policy for the results of this execution in the remote cache.
    * The server will have a default policy if this is not provided. This may
    * be applied to both the ActionResult and the associated blobs.
    */
  var resultsCachePolicy: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy] = js.undefined
  
  /**
    * If true, the action will be executed anew even if its result was already
    * present in the cache. If false, the result may be served from the
    * ActionCache.
    */
  var skipCacheLookup: js.UndefOr[Boolean] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2ExecuteRequest {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ExecuteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecuteRequest]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ExecuteRequestMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2ExecuteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "actionDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDigestUndefined: Self = StObject.set(x, "actionDigest", js.undefined)
    
    @scala.inline
    def setExecutionPolicy(value: SchemaBuildBazelRemoteExecutionV2ExecutionPolicy): Self = StObject.set(x, "executionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionPolicyUndefined: Self = StObject.set(x, "executionPolicy", js.undefined)
    
    @scala.inline
    def setResultsCachePolicy(value: SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy): Self = StObject.set(x, "resultsCachePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsCachePolicyUndefined: Self = StObject.set(x, "resultsCachePolicy", js.undefined)
    
    @scala.inline
    def setSkipCacheLookup(value: Boolean): Self = StObject.set(x, "skipCacheLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipCacheLookupUndefined: Self = StObject.set(x, "skipCacheLookup", js.undefined)
  }
}
