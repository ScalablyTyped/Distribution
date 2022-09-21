package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1BatchProcessRequest extends StObject {
  
  /**
    * The overall output config for batch process.
    */
  var documentOutputConfig: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentOutputConfig] = js.undefined
  
  /**
    * The input documents for batch process.
    */
  var inputDocuments: js.UndefOr[SchemaGoogleCloudDocumentaiV1BatchDocumentsInputConfig] = js.undefined
  
  /**
    * Whether Human Review feature should be skipped for this request. Default to false.
    */
  var skipHumanReview: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1BatchProcessRequest {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1BatchProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1BatchProcessRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1BatchProcessRequest](x: Self) {
    
    inline def setDocumentOutputConfig(value: SchemaGoogleCloudDocumentaiV1DocumentOutputConfig): Self = StObject.set(x, "documentOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentOutputConfigUndefined: Self = StObject.set(x, "documentOutputConfig", js.undefined)
    
    inline def setInputDocuments(value: SchemaGoogleCloudDocumentaiV1BatchDocumentsInputConfig): Self = StObject.set(x, "inputDocuments", value.asInstanceOf[js.Any])
    
    inline def setInputDocumentsUndefined: Self = StObject.set(x, "inputDocuments", js.undefined)
    
    inline def setSkipHumanReview(value: Boolean): Self = StObject.set(x, "skipHumanReview", value.asInstanceOf[js.Any])
    
    inline def setSkipHumanReviewNull: Self = StObject.set(x, "skipHumanReview", null)
    
    inline def setSkipHumanReviewUndefined: Self = StObject.set(x, "skipHumanReview", js.undefined)
  }
}
