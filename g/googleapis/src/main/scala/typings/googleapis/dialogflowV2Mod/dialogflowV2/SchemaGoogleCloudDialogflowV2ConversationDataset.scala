package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ConversationDataset extends StObject {
  
  /**
    * Output only. The number of conversations this conversation dataset contains.
    */
  var conversationCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Metadata set during conversation data import.
    */
  var conversationInfo: js.UndefOr[SchemaGoogleCloudDialogflowV2ConversationInfo] = js.undefined
  
  /**
    * Output only. Creation time of this dataset.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The description of the dataset. Maximum of 10000 bytes.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The display name of the dataset. Maximum of 64 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Input configurations set during conversation data import.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2InputConfig] = js.undefined
  
  /**
    * Output only. ConversationDataset resource name. Format: `projects//locations//conversationDatasets/`
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ConversationDataset {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ConversationDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ConversationDataset]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ConversationDataset](x: Self) {
    
    inline def setConversationCount(value: String): Self = StObject.set(x, "conversationCount", value.asInstanceOf[js.Any])
    
    inline def setConversationCountNull: Self = StObject.set(x, "conversationCount", null)
    
    inline def setConversationCountUndefined: Self = StObject.set(x, "conversationCount", js.undefined)
    
    inline def setConversationInfo(value: SchemaGoogleCloudDialogflowV2ConversationInfo): Self = StObject.set(x, "conversationInfo", value.asInstanceOf[js.Any])
    
    inline def setConversationInfoUndefined: Self = StObject.set(x, "conversationInfo", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInputConfig(value: SchemaGoogleCloudDialogflowV2InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
