package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentFollowupIntentInfo extends StObject {
  
  /**
    * The unique identifier of the followup intent. Format: `projects//agent/intents/`.
    */
  var followupIntentName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of the followup intent's parent. Format: `projects//agent/intents/`.
    */
  var parentFollowupIntentName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentFollowupIntentInfo {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentFollowupIntentInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentFollowupIntentInfo](x: Self) {
    
    inline def setFollowupIntentName(value: String): Self = StObject.set(x, "followupIntentName", value.asInstanceOf[js.Any])
    
    inline def setFollowupIntentNameNull: Self = StObject.set(x, "followupIntentName", null)
    
    inline def setFollowupIntentNameUndefined: Self = StObject.set(x, "followupIntentName", js.undefined)
    
    inline def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    inline def setParentFollowupIntentNameNull: Self = StObject.set(x, "parentFollowupIntentName", null)
    
    inline def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
  }
}
