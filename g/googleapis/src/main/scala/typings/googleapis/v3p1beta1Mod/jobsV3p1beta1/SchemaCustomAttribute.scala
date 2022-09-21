package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomAttribute extends StObject {
  
  /**
    * Optional. If the `filterable` flag is true, the custom field values may be used for custom attribute filters JobQuery.custom_attribute_filter. If false, these values may not be used for custom attribute filters. Default is false.
    */
  var filterable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional but exactly one of string_values or long_values must be specified. This field is used to perform number range search. (`EQ`, `GT`, `GE`, `LE`, `LT`) over filterable `long_value`. Currently at most 1 long_values is supported.
    */
  var longValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional but exactly one of string_values or long_values must be specified. This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or `CASE_INSENSITIVE_MATCH`) search. For filterable `string_value`s, a maximum total number of 200 values is allowed, with each `string_value` has a byte size of no more than 500B. For unfilterable `string_values`, the maximum total byte size of unfilterable `string_values` is 50KB. Empty string is not allowed.
    */
  var stringValues: js.UndefOr[js.Array[String] | Null] = js.undefined
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
    
    inline def setLongValues(value: js.Array[String]): Self = StObject.set(x, "longValues", value.asInstanceOf[js.Any])
    
    inline def setLongValuesNull: Self = StObject.set(x, "longValues", null)
    
    inline def setLongValuesUndefined: Self = StObject.set(x, "longValues", js.undefined)
    
    inline def setLongValuesVarargs(value: String*): Self = StObject.set(x, "longValues", js.Array(value*))
    
    inline def setStringValues(value: js.Array[String]): Self = StObject.set(x, "stringValues", value.asInstanceOf[js.Any])
    
    inline def setStringValuesNull: Self = StObject.set(x, "stringValues", null)
    
    inline def setStringValuesUndefined: Self = StObject.set(x, "stringValues", js.undefined)
    
    inline def setStringValuesVarargs(value: String*): Self = StObject.set(x, "stringValues", js.Array(value*))
  }
}
