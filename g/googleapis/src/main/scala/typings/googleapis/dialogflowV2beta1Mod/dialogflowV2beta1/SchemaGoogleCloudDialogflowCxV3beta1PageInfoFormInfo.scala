package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfo extends StObject {
  
  /**
    * Optional for both WebhookRequest and WebhookResponse. The parameters contained in the form. Note that the webhook cannot add or remove any form parameter.
    */
  var parameterInfo: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfo {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfo](x: Self) {
    
    inline def setParameterInfo(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo]): Self = StObject.set(x, "parameterInfo", value.asInstanceOf[js.Any])
    
    inline def setParameterInfoUndefined: Self = StObject.set(x, "parameterInfo", js.undefined)
    
    inline def setParameterInfoVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo*): Self = StObject.set(x, "parameterInfo", js.Array(value*))
  }
}
