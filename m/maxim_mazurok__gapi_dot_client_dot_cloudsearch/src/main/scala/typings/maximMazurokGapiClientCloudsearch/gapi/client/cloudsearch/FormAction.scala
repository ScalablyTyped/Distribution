package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormAction extends StObject {
  
  /** Apps script function that should be invoked in the developer's apps script when the containing element is clicked/activated. */
  var actionMethodName: js.UndefOr[String] = js.undefined
  
  var loadIndicator: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[js.Array[ActionParameter]] = js.undefined
  
  /**
    * Indicates whether form values persist after the action. When false, the Apps Script is responsible for persisting values, by setting any form field values using the formInputs in
    * the event. Disabling this behavior can be used if the add-on needs the ability to clear form fields, for example, as with persistent values, there is no means for clearing existing
    * values. When disabling persistent values, it is strongly recommended that the add-on use LoadIndicator.SPINNER for all events, as this locks the UI to ensure no changes are made by
    * the user while the action is being processed. When using LoadIndicator.NONE for any of the actions, persistent values are recommended, as it ensures that any changes made by the
    * user after form / on change actions are sent to the server are not overwritten by the response. Persistent values disabled by default. While we recommend persistent values be used
    * in the typical use case, we do not enable by default, as doing so would change the current behavior of existing add-ons in prod.
    */
  var persistValues: js.UndefOr[Boolean] = js.undefined
}
object FormAction {
  
  inline def apply(): FormAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormAction]
  }
  
  extension [Self <: FormAction](x: Self) {
    
    inline def setActionMethodName(value: String): Self = StObject.set(x, "actionMethodName", value.asInstanceOf[js.Any])
    
    inline def setActionMethodNameUndefined: Self = StObject.set(x, "actionMethodName", js.undefined)
    
    inline def setLoadIndicator(value: String): Self = StObject.set(x, "loadIndicator", value.asInstanceOf[js.Any])
    
    inline def setLoadIndicatorUndefined: Self = StObject.set(x, "loadIndicator", js.undefined)
    
    inline def setParameters(value: js.Array[ActionParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: ActionParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setPersistValues(value: Boolean): Self = StObject.set(x, "persistValues", value.asInstanceOf[js.Any])
    
    inline def setPersistValuesUndefined: Self = StObject.set(x, "persistValues", js.undefined)
  }
}
