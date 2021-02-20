package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1Context extends StObject {
  
  /**
    * Optional. The number of conversational query requests after which the context expires. The default is `0`. If set to `0`, the context expires immediately. Contexts expire
    * automatically after 20 minutes if there are no matching queries.
    */
  var lifespanCount: js.UndefOr[Double] = js.native
  
  /**
    * Required. The unique identifier of the context. Supported formats: - `projects//agent/sessions//contexts/`, - `projects//locations//agent/sessions//contexts/`, -
    * `projects//agent/environments//users//sessions//contexts/`, - `projects//locations//agent/environments//users//sessions//contexts/`, The `Context ID` is always converted to
    * lowercase, may only contain characters in a-zA-Z0-9_-% and may be at most 250 bytes long. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID`
    * is not specified, we assume default '-' user. The following context names are reserved for internal use by Dialogflow. You should not use these contexts or create contexts with
    * these names: * `__system_counters__` * `*_id_dialog_context` * `*_dialog_params_size`
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. The collection of parameters associated with this context. Depending on your protocol or client library language, this is a map, associative array, symbol table,
    * dictionary, or JSON object composed of a collection of (MapKey, MapValue) pairs: - MapKey type: string - MapKey value: parameter name - MapValue type: - If parameter's entity type
    * is a composite entity: map - Else: string or number, depending on parameter value type - MapValue value: - If parameter's entity type is a composite entity: map from composite
    * entity property names to property values - Else: parameter value
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1Context with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudDialogflowV2beta1Context {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1Context]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1ContextMutableBuilder[Self <: GoogleCloudDialogflowV2beta1Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifespanCount(value: Double): Self = StObject.set(x, "lifespanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifespanCountUndefined: Self = StObject.set(x, "lifespanCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1Context with TopLevel[js.Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
