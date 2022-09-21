package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1FulfillmentSetParameterAction extends StObject {
  
  /**
    * Display name of the parameter.
    */
  var parameter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The new value of the parameter. A null value clears the parameter.
    */
  var value: js.UndefOr[Any | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1FulfillmentSetParameterAction {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1FulfillmentSetParameterAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1FulfillmentSetParameterAction]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1FulfillmentSetParameterAction](x: Self) {
    
    inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterNull: Self = StObject.set(x, "parameter", null)
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
