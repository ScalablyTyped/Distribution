package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2Environment extends StObject {
  
  /** Optional. The agent version loaded into this environment. Format: `projects//agent/versions/`. */
  var agentVersion: js.UndefOr[String] = js.undefined
  
  /** Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique identifier of this agent environment. Format: `projects//agent/environments/`. For Environment ID, "-" is reserved for 'draft' environment. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The state of this environment. This field is read-only, i.e., it cannot be set by create and update methods. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. The last update time of this environment. This field is read-only, i.e., it cannot be set by create and update methods. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2Environment {
  
  inline def apply(): GoogleCloudDialogflowV2Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Environment]
  }
  
  extension [Self <: GoogleCloudDialogflowV2Environment](x: Self) {
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
