package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1EnvironmentHistoryEntry extends StObject {
  
  /**
    * The agent version loaded into this environment history entry.
    */
  var agentVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The creation time of this environment history entry.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The developer-provided description for this environment history entry.
    */
  var description: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1EnvironmentHistoryEntry {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1EnvironmentHistoryEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1EnvironmentHistoryEntry]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1EnvironmentHistoryEntry](x: Self) {
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionNull: Self = StObject.set(x, "agentVersion", null)
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
