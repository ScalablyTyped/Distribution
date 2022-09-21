package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2DocumentStyleFontSize extends StObject {
  
  /**
    * Font size for the text.
    */
  var size: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Unit for the font size. Follows CSS naming (in, px, pt, etc.).
    */
  var unit: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2DocumentStyleFontSize {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2DocumentStyleFontSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2DocumentStyleFontSize]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2DocumentStyleFontSize](x: Self) {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
