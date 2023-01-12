package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1Action extends StObject {
  
  /** Apps Script function to invoke when the containing element is clicked/activated. */
  var function: js.UndefOr[String] = js.undefined
  
  /** Specifies the loading indicator that the action displays while making the call to the action. */
  var loadIndicator: js.UndefOr[String] = js.undefined
  
  /** List of action parameters. */
  var parameters: js.UndefOr[js.Array[GoogleAppsCardV1ActionParameter]] = js.undefined
  
  /**
    * Indicates whether form values persist after the action. The default value is `false`. If `true`, form values remain after the action is triggered. When using
    * [LoadIndicator.NONE](workspace/add-ons/reference/rpc/google.apps.card.v1#loadindicator) for actions, `persist_values` = `true`is recommended, as it ensures that any changes made by
    * the user after form or on change actions are sent to the server are not overwritten by the response. If `false`, the form values are cleared when the action is triggered. When
    * `persist_values` is set to `false`, it is strongly recommended that the card use [LoadIndicator.SPINNER](workspace/add-ons/reference/rpc/google.apps.card.v1#loadindicator) for all
    * actions, as this locks the UI to ensure no changes are made by the user while the action is being processed. Not supported by Google Chat apps.
    */
  var persistValues: js.UndefOr[Boolean] = js.undefined
}
object GoogleAppsCardV1Action {
  
  inline def apply(): GoogleAppsCardV1Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsCardV1Action] (val x: Self) extends AnyVal {
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setLoadIndicator(value: String): Self = StObject.set(x, "loadIndicator", value.asInstanceOf[js.Any])
    
    inline def setLoadIndicatorUndefined: Self = StObject.set(x, "loadIndicator", js.undefined)
    
    inline def setParameters(value: js.Array[GoogleAppsCardV1ActionParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: GoogleAppsCardV1ActionParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setPersistValues(value: Boolean): Self = StObject.set(x, "persistValues", value.asInstanceOf[js.Any])
    
    inline def setPersistValuesUndefined: Self = StObject.set(x, "persistValues", js.undefined)
  }
}
