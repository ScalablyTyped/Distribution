package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3PageInfoFormInfo extends StObject {
  
  /**
    * Optional for both WebhookRequest and WebhookResponse. The parameters contained in the form. Note that the webhook cannot add or remove any form parameter.
    */
  var parameterInfo: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3PageInfoFormInfo {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3PageInfoFormInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3PageInfoFormInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3PageInfoFormInfo](x: Self) {
    
    inline def setParameterInfo(value: js.Array[SchemaGoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo]): Self = StObject.set(x, "parameterInfo", value.asInstanceOf[js.Any])
    
    inline def setParameterInfoUndefined: Self = StObject.set(x, "parameterInfo", js.undefined)
    
    inline def setParameterInfoVarargs(value: SchemaGoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo*): Self = StObject.set(x, "parameterInfo", js.Array(value*))
  }
}
