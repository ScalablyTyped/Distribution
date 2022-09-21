package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1DocumentTextAnchor extends StObject {
  
  /**
    * Contains the content of the text span so that users do not have to look it up in the text_segments. It is always populated for formFields.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text segments from the Document.text.
    */
  var textSegments: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta1DocumentTextAnchorTextSegment]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1DocumentTextAnchor {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1DocumentTextAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1DocumentTextAnchor]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1DocumentTextAnchor](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setTextSegments(value: js.Array[SchemaGoogleCloudDocumentaiV1beta1DocumentTextAnchorTextSegment]): Self = StObject.set(x, "textSegments", value.asInstanceOf[js.Any])
    
    inline def setTextSegmentsUndefined: Self = StObject.set(x, "textSegments", js.undefined)
    
    inline def setTextSegmentsVarargs(value: SchemaGoogleCloudDocumentaiV1beta1DocumentTextAnchorTextSegment*): Self = StObject.set(x, "textSegments", js.Array(value*))
  }
}
