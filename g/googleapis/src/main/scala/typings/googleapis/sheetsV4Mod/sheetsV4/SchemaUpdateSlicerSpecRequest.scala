package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateSlicerSpecRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `SlicerSpec` is implied and should not be specified. A single "*"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The id of the slicer to update.
    */
  var slicerId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The specification to apply to the slicer.
    */
  var spec: js.UndefOr[SchemaSlicerSpec] = js.undefined
}
object SchemaUpdateSlicerSpecRequest {
  
  inline def apply(): SchemaUpdateSlicerSpecRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSlicerSpecRequest]
  }
  
  extension [Self <: SchemaUpdateSlicerSpecRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setSlicerId(value: Double): Self = StObject.set(x, "slicerId", value.asInstanceOf[js.Any])
    
    inline def setSlicerIdNull: Self = StObject.set(x, "slicerId", null)
    
    inline def setSlicerIdUndefined: Self = StObject.set(x, "slicerId", js.undefined)
    
    inline def setSpec(value: SchemaSlicerSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
