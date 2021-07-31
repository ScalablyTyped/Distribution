package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single followup intent in the chain.
  */
trait SchemaGoogleCloudDialogflowV2beta1IntentFollowupIntentInfo extends StObject {
  
  /**
    * The unique identifier of the followup intent. Format:
    * `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
    */
  var followupIntentName: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the followup intent&#39;s parent. Format:
    * `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
    */
  var parentFollowupIntentName: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentFollowupIntentInfo {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentFollowupIntentInfo]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentFollowupIntentInfoMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentFollowupIntentInfo] (val x: Self) extends AnyVal {
    
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
