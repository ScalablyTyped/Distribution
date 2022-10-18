package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2Context extends StObject {
  
  /**
    * Optional. The number of conversational query requests after which the context expires. The default is `0`. If set to `0`, the context expires immediately. Contexts expire
    * automatically after 20 minutes if there are no matching queries.
    */
  var lifespanCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. The unique identifier of the context. Format: `projects//agent/sessions//contexts/`, or `projects//agent/environments//users//sessions//contexts/`. The `Context ID` is
    * always converted to lowercase, may only contain characters in a-zA-Z0-9_-% and may be at most 250 bytes long. If `Environment ID` is not specified, we assume default 'draft'
    * environment. If `User ID` is not specified, we assume default '-' user. The following context names are reserved for internal use by Dialogflow. You should not use these contexts or
    * create contexts with these names: * `__system_counters__` * `*_id_dialog_context` * `*_dialog_params_size`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The collection of parameters associated with this context. Depending on your protocol or client library language, this is a map, associative array, symbol table,
    * dictionary, or JSON object composed of a collection of (MapKey, MapValue) pairs: - MapKey type: string - MapKey value: parameter name - MapValue type: - If parameter's entity type
    * is a composite entity: map - Else: depending on parameter value type, could be one of string, number, boolean, null, list or map - MapValue value: - If parameter's entity type is a
    * composite entity: map from composite entity property names to property values - Else: parameter value
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object GoogleCloudDialogflowV2Context {
  
  inline def apply(): GoogleCloudDialogflowV2Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Context]
  }
  
  extension [Self <: GoogleCloudDialogflowV2Context](x: Self) {
    
    inline def setLifespanCount(value: Double): Self = StObject.set(x, "lifespanCount", value.asInstanceOf[js.Any])
    
    inline def setLifespanCountUndefined: Self = StObject.set(x, "lifespanCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
