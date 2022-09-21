package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult extends StObject {
  
  /**
    * The unique identifier of the flow validation result. Format: `projects//locations//agents//flows//validationResult`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last time the flow was validated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains all validation messages.
    */
  var validationMessages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1ValidationMessage]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setValidationMessages(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1ValidationMessage]): Self = StObject.set(x, "validationMessages", value.asInstanceOf[js.Any])
    
    inline def setValidationMessagesUndefined: Self = StObject.set(x, "validationMessages", js.undefined)
    
    inline def setValidationMessagesVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1ValidationMessage*): Self = StObject.set(x, "validationMessages", js.Array(value*))
  }
}
