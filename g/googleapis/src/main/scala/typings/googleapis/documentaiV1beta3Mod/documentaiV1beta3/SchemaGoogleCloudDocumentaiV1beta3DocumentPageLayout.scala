package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentPageLayout extends StObject {
  
  /**
    * The bounding polygon for the Layout.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3BoundingPoly] = js.undefined
  
  /**
    * Confidence of the current Layout within context of the object this layout is for. e.g. confidence can be for a single token, a table, a visual element, etc. depending on context. Range [0, 1].
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Detected orientation for the Layout.
    */
  var orientation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Text anchor indexing into the Document.text.
    */
  var textAnchor: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3DocumentTextAnchor] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentPageLayout {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentPageLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentPageLayout]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentPageLayout](x: Self) {
    
    inline def setBoundingPoly(value: SchemaGoogleCloudDocumentaiV1beta3BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setTextAnchor(value: SchemaGoogleCloudDocumentaiV1beta3DocumentTextAnchor): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
  }
}
