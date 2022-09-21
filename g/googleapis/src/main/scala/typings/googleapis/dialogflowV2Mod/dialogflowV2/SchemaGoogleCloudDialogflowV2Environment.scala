package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2Environment extends StObject {
  
  /**
    * Optional. The agent version loaded into this environment. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
    */
  var agentVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The fulfillment settings to use for this environment.
    */
  var fulfillment: js.UndefOr[SchemaGoogleCloudDialogflowV2Fulfillment] = js.undefined
  
  /**
    * Output only. The unique identifier of this agent environment. Supported formats: - `projects//agent/environments/` - `projects//locations//agent/environments/` The environment ID for the default environment is `-`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of this environment. This field is read-only, i.e., it cannot be set by create and update methods.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Text to speech settings for this environment.
    */
  var textToSpeechSettings: js.UndefOr[SchemaGoogleCloudDialogflowV2TextToSpeechSettings] = js.undefined
  
  /**
    * Output only. The last update time of this environment. This field is read-only, i.e., it cannot be set by create and update methods.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2Environment {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Environment]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2Environment](x: Self) {
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionNull: Self = StObject.set(x, "agentVersion", null)
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFulfillment(value: SchemaGoogleCloudDialogflowV2Fulfillment): Self = StObject.set(x, "fulfillment", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentUndefined: Self = StObject.set(x, "fulfillment", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTextToSpeechSettings(value: SchemaGoogleCloudDialogflowV2TextToSpeechSettings): Self = StObject.set(x, "textToSpeechSettings", value.asInstanceOf[js.Any])
    
    inline def setTextToSpeechSettingsUndefined: Self = StObject.set(x, "textToSpeechSettings", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
