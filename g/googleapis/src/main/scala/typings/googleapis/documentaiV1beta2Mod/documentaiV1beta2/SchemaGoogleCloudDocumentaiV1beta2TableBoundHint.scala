package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2TableBoundHint extends StObject {
  
  /**
    * Bounding box hint for a table on this page. The coordinates must be normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
    */
  var boundingBox: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2BoundingPoly] = js.undefined
  
  /**
    * Optional. Page number for multi-paged inputs this hint applies to. If not provided, this hint will apply to all pages by default. This value is 1-based.
    */
  var pageNumber: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2TableBoundHint {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2TableBoundHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2TableBoundHint]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2TableBoundHint](x: Self) {
    
    inline def setBoundingBox(value: SchemaGoogleCloudDocumentaiV1beta2BoundingPoly): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberNull: Self = StObject.set(x, "pageNumber", null)
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
  }
}
