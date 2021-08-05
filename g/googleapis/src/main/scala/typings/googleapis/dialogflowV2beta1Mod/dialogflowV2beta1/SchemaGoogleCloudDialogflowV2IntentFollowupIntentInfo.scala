package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single followup intent in the chain.
  */
trait SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo extends StObject {
  
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
object SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo](x: Self) {
    
    inline def setFollowupIntentName(value: String): Self = StObject.set(x, "followupIntentName", value.asInstanceOf[js.Any])
    
    inline def setFollowupIntentNameUndefined: Self = StObject.set(x, "followupIntentName", js.undefined)
    
    inline def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    inline def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
  }
}
