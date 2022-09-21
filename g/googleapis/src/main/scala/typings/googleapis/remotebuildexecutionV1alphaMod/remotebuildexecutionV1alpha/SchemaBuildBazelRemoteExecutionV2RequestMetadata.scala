package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2RequestMetadata extends StObject {
  
  /**
    * An identifier that ties multiple requests to the same action. For example, multiple requests to the CAS, Action Cache, and Execution API are used in order to compile foo.cc.
    */
  var actionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A brief description of the kind of action, for example, CppCompile or GoLink. There is no standard agreed set of values for this, and they are expected to vary between different client tools.
    */
  var actionMnemonic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An identifier for the configuration in which the target was built, e.g. for differentiating building host tools or different target platforms. There is no expectation that this value will have any particular structure, or equality across invocations, though some client tools may offer these guarantees.
    */
  var configurationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An identifier to tie multiple tool invocations together. For example, runs of foo_test, bar_test and baz_test on a post-submit of a given patch.
    */
  var correlatedInvocationsId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An identifier for the target which produced this action. No guarantees are made around how many actions may relate to a single target.
    */
  var targetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The details for the tool invoking the requests.
    */
  var toolDetails: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ToolDetails] = js.undefined
  
  /**
    * An identifier that ties multiple actions together to a final result. For example, multiple actions are required to build and run foo_test.
    */
  var toolInvocationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2RequestMetadata {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2RequestMetadata]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2RequestMetadata](x: Self) {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    inline def setActionMnemonic(value: String): Self = StObject.set(x, "actionMnemonic", value.asInstanceOf[js.Any])
    
    inline def setActionMnemonicNull: Self = StObject.set(x, "actionMnemonic", null)
    
    inline def setActionMnemonicUndefined: Self = StObject.set(x, "actionMnemonic", js.undefined)
    
    inline def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdNull: Self = StObject.set(x, "configurationId", null)
    
    inline def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
    
    inline def setCorrelatedInvocationsId(value: String): Self = StObject.set(x, "correlatedInvocationsId", value.asInstanceOf[js.Any])
    
    inline def setCorrelatedInvocationsIdNull: Self = StObject.set(x, "correlatedInvocationsId", null)
    
    inline def setCorrelatedInvocationsIdUndefined: Self = StObject.set(x, "correlatedInvocationsId", js.undefined)
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setToolDetails(value: SchemaBuildBazelRemoteExecutionV2ToolDetails): Self = StObject.set(x, "toolDetails", value.asInstanceOf[js.Any])
    
    inline def setToolDetailsUndefined: Self = StObject.set(x, "toolDetails", js.undefined)
    
    inline def setToolInvocationId(value: String): Self = StObject.set(x, "toolInvocationId", value.asInstanceOf[js.Any])
    
    inline def setToolInvocationIdNull: Self = StObject.set(x, "toolInvocationId", null)
    
    inline def setToolInvocationIdUndefined: Self = StObject.set(x, "toolInvocationId", js.undefined)
  }
}
