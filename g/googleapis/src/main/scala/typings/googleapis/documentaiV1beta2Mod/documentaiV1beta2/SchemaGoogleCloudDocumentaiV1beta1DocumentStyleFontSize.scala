package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1DocumentStyleFontSize extends StObject {
  
  /**
    * Font size for the text.
    */
  var size: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Unit for the font size. Follows CSS naming (in, px, pt, etc.).
    */
  var unit: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1DocumentStyleFontSize {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1DocumentStyleFontSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1DocumentStyleFontSize]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1DocumentStyleFontSize](x: Self) {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
