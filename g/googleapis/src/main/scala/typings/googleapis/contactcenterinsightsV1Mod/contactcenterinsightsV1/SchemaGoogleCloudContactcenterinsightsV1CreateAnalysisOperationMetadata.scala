package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1CreateAnalysisOperationMetadata extends StObject {
  
  /**
    * Output only. The Conversation that this Analysis Operation belongs to.
    */
  var conversation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the operation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the operation finished running.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1CreateAnalysisOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1CreateAnalysisOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1CreateAnalysisOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1CreateAnalysisOperationMetadata](x: Self) {
    
    inline def setConversation(value: String): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    inline def setConversationNull: Self = StObject.set(x, "conversation", null)
    
    inline def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
  }
}
