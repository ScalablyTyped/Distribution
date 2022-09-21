package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomAttribute extends StObject {
  
  /**
    * Optional. If the `filterable` flag is true, custom field values are searchable. If false, values are not searchable. Default is false.
    */
  var filterable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional but at least one of string_values or long_value must be specified. This field is used to perform number range search. (`EQ`, `GT`, `GE`, `LE`, `LT`) over filterable `long_value`. For `long_value`, a value between Long.MIN and Long.MAX is allowed.
    */
  var longValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional but at least one of string_values or long_value must be specified. This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or `CASE_INSENSITIVE_MATCH`) search. For filterable `string_values`, a maximum total number of 200 values is allowed, with each `string_value` has a byte size of no more than 255B. For unfilterable `string_values`, the maximum total byte size of unfilterable `string_values` is 50KB. Empty strings are not allowed.
    */
  var stringValues: js.UndefOr[SchemaStringValues] = js.undefined
}
object SchemaCustomAttribute {
  
  inline def apply(): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
  
  extension [Self <: SchemaCustomAttribute](x: Self) {
    
    inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableNull: Self = StObject.set(x, "filterable", null)
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setLongValue(value: String): Self = StObject.set(x, "longValue", value.asInstanceOf[js.Any])
    
    inline def setLongValueNull: Self = StObject.set(x, "longValue", null)
    
    inline def setLongValueUndefined: Self = StObject.set(x, "longValue", js.undefined)
    
    inline def setStringValues(value: SchemaStringValues): Self = StObject.set(x, "stringValues", value.asInstanceOf[js.Any])
    
    inline def setStringValuesUndefined: Self = StObject.set(x, "stringValues", js.undefined)
  }
}
