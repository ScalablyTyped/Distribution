package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadata extends StObject {
  
  /**
    * The creation time of the operation.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of response details of each document.
    */
  var individualProcessStatuses: js.UndefOr[
    js.Array[SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus]
  ] = js.undefined
  
  /**
    * The state of the current batch processing.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A message providing more details about the current state of processing. For example, the error message if the operation is failed.
    */
  var stateMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last update time of the operation.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setIndividualProcessStatuses(value: js.Array[SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus]): Self = StObject.set(x, "individualProcessStatuses", value.asInstanceOf[js.Any])
    
    inline def setIndividualProcessStatusesUndefined: Self = StObject.set(x, "individualProcessStatuses", js.undefined)
    
    inline def setIndividualProcessStatusesVarargs(value: SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus*): Self = StObject.set(x, "individualProcessStatuses", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageNull: Self = StObject.set(x, "stateMessage", null)
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
