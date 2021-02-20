package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentFollowupIntentInfo extends StObject {
  
  /** The unique identifier of the followup intent. Format: `projects//agent/intents/`. */
  var followupIntentName: js.UndefOr[String] = js.native
  
  /** The unique identifier of the followup intent's parent. Format: `projects//agent/intents/`. */
  var parentFollowupIntentName: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentFollowupIntentInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentFollowupIntentInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentFollowupIntentInfoMutableBuilder[Self <: GoogleCloudDialogflowV2IntentFollowupIntentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowupIntentName(value: String): Self = StObject.set(x, "followupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowupIntentNameUndefined: Self = StObject.set(x, "followupIntentName", js.undefined)
    
    @scala.inline
    def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
  }
}
