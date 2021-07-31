package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An optional Metadata to attach to any RPC request to tell the server about
  * an external context of the request. The server may use this for logging or
  * other purposes. To use it, the client attaches the header to the call using
  * the canonical proto serialization: name:
  * google.devtools.remoteexecution.v1test.requestmetadata-bin contents: the
  * base64 encoded binary RequestMetadata message.
  */
trait SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata extends StObject {
  
  /**
    * An identifier that ties multiple requests to the same action. For
    * example, multiple requests to the CAS, Action Cache, and Execution API
    * are used in order to compile foo.cc.
    */
  var actionId: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier to tie multiple tool invocations together. For example,
    * runs of foo_test, bar_test and baz_test on a post-submit of a given
    * patch.
    */
  var correlatedInvocationsId: js.UndefOr[String] = js.undefined
  
  /**
    * The details for the tool invoking the requests.
    */
  var toolDetails: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails] = js.undefined
  
  /**
    * An identifier that ties multiple actions together to a final result. For
    * example, multiple actions are required to build and run foo_test.
    */
  var toolInvocationId: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadataMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testRequestMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    @scala.inline
    def setCorrelatedInvocationsId(value: String): Self = StObject.set(x, "correlatedInvocationsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelatedInvocationsIdUndefined: Self = StObject.set(x, "correlatedInvocationsId", js.undefined)
    
    @scala.inline
    def setToolDetails(value: SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails): Self = StObject.set(x, "toolDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolDetailsUndefined: Self = StObject.set(x, "toolDetails", js.undefined)
    
    @scala.inline
    def setToolInvocationId(value: String): Self = StObject.set(x, "toolInvocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolInvocationIdUndefined: Self = StObject.set(x, "toolInvocationId", js.undefined)
  }
}
