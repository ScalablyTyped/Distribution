package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageSelectItemInfo extends StObject {
  
  /** Required. A unique key that will be sent back to the agent if this response is given. */
  var key: js.UndefOr[String] = js.native
  
  /** Optional. A list of synonyms that can also be used to trigger this item in dialog. */
  var synonyms: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudDialogflowV2IntentMessageSelectItemInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageSelectItemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSelectItemInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageSelectItemInfoMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageSelectItemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
  }
}
