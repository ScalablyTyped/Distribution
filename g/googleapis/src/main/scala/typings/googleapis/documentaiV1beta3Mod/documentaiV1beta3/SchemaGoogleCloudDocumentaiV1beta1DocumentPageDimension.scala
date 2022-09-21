package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1DocumentPageDimension extends StObject {
  
  /**
    * Page height.
    */
  var height: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Dimension unit.
    */
  var unit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Page width.
    */
  var width: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1DocumentPageDimension {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1DocumentPageDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1DocumentPageDimension]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1DocumentPageDimension](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
