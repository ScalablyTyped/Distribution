package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3PageInfoFormInfo extends StObject {
  
  /** Optional for both WebhookRequest and WebhookResponse. The parameters contained in the form. Note that the webhook cannot add or remove any form parameter. */
  var parameterInfo: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo]] = js.native
}
object GoogleCloudDialogflowCxV3PageInfoFormInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3PageInfoFormInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3PageInfoFormInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3PageInfoFormInfoMutableBuilder[Self <: GoogleCloudDialogflowCxV3PageInfoFormInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterInfo(value: js.Array[GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo]): Self = StObject.set(x, "parameterInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterInfoUndefined: Self = StObject.set(x, "parameterInfo", js.undefined)
    
    @scala.inline
    def setParameterInfoVarargs(value: GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo*): Self = StObject.set(x, "parameterInfo", js.Array(value :_*))
  }
}
