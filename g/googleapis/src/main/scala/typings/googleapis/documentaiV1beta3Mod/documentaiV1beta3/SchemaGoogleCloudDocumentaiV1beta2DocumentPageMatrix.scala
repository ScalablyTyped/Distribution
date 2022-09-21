package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2DocumentPageMatrix extends StObject {
  
  /**
    * Number of columns in the matrix.
    */
  var cols: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The matrix data.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of rows in the matrix.
    */
  var rows: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * This encodes information about what data type the matrix uses. For example, 0 (CV_8U) is an unsigned 8-bit image. For the full list of OpenCV primitive data types, please refer to https://docs.opencv.org/4.3.0/d1/d1b/group__core__hal__interface.html
    */
  var `type`: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2DocumentPageMatrix {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2DocumentPageMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2DocumentPageMatrix]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2DocumentPageMatrix](x: Self) {
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsNull: Self = StObject.set(x, "cols", null)
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsNull: Self = StObject.set(x, "rows", null)
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
