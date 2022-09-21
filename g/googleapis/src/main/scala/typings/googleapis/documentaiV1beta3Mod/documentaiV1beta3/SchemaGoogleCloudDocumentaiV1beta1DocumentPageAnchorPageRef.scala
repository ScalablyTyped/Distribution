package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1DocumentPageAnchorPageRef extends StObject {
  
  /**
    * Optional. Identifies the bounding polygon of a layout element on the page.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta1BoundingPoly] = js.undefined
  
  /**
    * Optional. Confidence of detected page element, if applicable. Range [0, 1].
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Deprecated. Use PageRef.bounding_poly instead.
    */
  var layoutId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The type of the layout element that is being referenced if any.
    */
  var layoutType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Index into the Document.pages element, for example using Document.pages to locate the related page element. This field is skipped when its value is the default 0. See https://developers.google.com/protocol-buffers/docs/proto3#json.
    */
  var page: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1DocumentPageAnchorPageRef {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1DocumentPageAnchorPageRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1DocumentPageAnchorPageRef]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1DocumentPageAnchorPageRef](x: Self) {
    
    inline def setBoundingPoly(value: SchemaGoogleCloudDocumentaiV1beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setLayoutId(value: String): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
    
    inline def setLayoutIdNull: Self = StObject.set(x, "layoutId", null)
    
    inline def setLayoutIdUndefined: Self = StObject.set(x, "layoutId", js.undefined)
    
    inline def setLayoutType(value: String): Self = StObject.set(x, "layoutType", value.asInstanceOf[js.Any])
    
    inline def setLayoutTypeNull: Self = StObject.set(x, "layoutType", null)
    
    inline def setLayoutTypeUndefined: Self = StObject.set(x, "layoutType", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageNull: Self = StObject.set(x, "page", null)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
