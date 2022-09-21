package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3ProcessRequest extends StObject {
  
  /**
    * The document payload, the [content] and [mime_type] fields must be set.
    */
  var document: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3Document] = js.undefined
  
  /**
    * Specifies which fields to include in ProcessResponse's document.
    */
  var fieldMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An inline document proto.
    */
  var inlineDocument: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3Document] = js.undefined
  
  /**
    * A raw document content (bytes).
    */
  var rawDocument: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3RawDocument] = js.undefined
  
  /**
    * Whether Human Review feature should be skipped for this request. Default to false.
    */
  var skipHumanReview: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3ProcessRequest {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3ProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3ProcessRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3ProcessRequest](x: Self) {
    
    inline def setDocument(value: SchemaGoogleCloudDocumentaiV1beta3Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskNull: Self = StObject.set(x, "fieldMask", null)
    
    inline def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    inline def setInlineDocument(value: SchemaGoogleCloudDocumentaiV1beta3Document): Self = StObject.set(x, "inlineDocument", value.asInstanceOf[js.Any])
    
    inline def setInlineDocumentUndefined: Self = StObject.set(x, "inlineDocument", js.undefined)
    
    inline def setRawDocument(value: SchemaGoogleCloudDocumentaiV1beta3RawDocument): Self = StObject.set(x, "rawDocument", value.asInstanceOf[js.Any])
    
    inline def setRawDocumentUndefined: Self = StObject.set(x, "rawDocument", js.undefined)
    
    inline def setSkipHumanReview(value: Boolean): Self = StObject.set(x, "skipHumanReview", value.asInstanceOf[js.Any])
    
    inline def setSkipHumanReviewNull: Self = StObject.set(x, "skipHumanReview", null)
    
    inline def setSkipHumanReviewUndefined: Self = StObject.set(x, "skipHumanReview", js.undefined)
  }
}
