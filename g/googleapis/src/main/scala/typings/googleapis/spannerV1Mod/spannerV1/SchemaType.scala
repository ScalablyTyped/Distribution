package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `Type` indicates the type of a Cloud Spanner value, as might be stored in a
  * table cell or returned from an SQL query.
  */
trait SchemaType extends StObject {
  
  /**
    * If code == ARRAY, then `array_element_type` is the type of the array
    * elements.
    */
  var arrayElementType: js.UndefOr[SchemaType] = js.undefined
  
  /**
    * Required. The TypeCode for this type.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * If code == STRUCT, then `struct_type` provides type information for the
    * struct&#39;s fields.
    */
  var structType: js.UndefOr[SchemaStructType] = js.undefined
}
object SchemaType {
  
  @scala.inline
  def apply(): SchemaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaType]
  }
  
  @scala.inline
  implicit class SchemaTypeMutableBuilder[Self <: SchemaType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayElementType(value: SchemaType): Self = StObject.set(x, "arrayElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayElementTypeUndefined: Self = StObject.set(x, "arrayElementType", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setStructType(value: SchemaStructType): Self = StObject.set(x, "structType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructTypeUndefined: Self = StObject.set(x, "structType", js.undefined)
  }
}
