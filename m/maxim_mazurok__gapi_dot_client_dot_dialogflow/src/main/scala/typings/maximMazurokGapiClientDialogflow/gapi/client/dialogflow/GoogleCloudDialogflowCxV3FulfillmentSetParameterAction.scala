package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3FulfillmentSetParameterAction extends StObject {
  
  /** Display name of the parameter. */
  var parameter: js.UndefOr[String] = js.undefined
  
  /** The new value of the parameter. A null value clears the parameter. */
  var value: js.UndefOr[Any] = js.undefined
}
object GoogleCloudDialogflowCxV3FulfillmentSetParameterAction {
  
  inline def apply(): GoogleCloudDialogflowCxV3FulfillmentSetParameterAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3FulfillmentSetParameterAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3FulfillmentSetParameterAction] (val x: Self) extends AnyVal {
    
    inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
