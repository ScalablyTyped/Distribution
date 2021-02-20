package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom attribute values that are either filterable or non-filterable.
  */
@js.native
trait SchemaCustomAttribute extends StObject {
  
  /**
    * Optional.  If the `filterable` flag is true, custom field values are
    * searchable. If false, values are not searchable.  Default is false.
    */
  var filterable: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional but exactly one of string_values or long_values must be
    * specified.  This field is used to perform number range search. (`EQ`,
    * `GT`, `GE`, `LE`, `LT`) over filterable `long_value`.  Currently at most
    * 1 long_values is supported.
    */
  var longValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional but exactly one of string_values or long_values must be
    * specified.  This field is used to perform a string match
    * (`CASE_SENSITIVE_MATCH` or `CASE_INSENSITIVE_MATCH`) search. For
    * filterable `string_value`s, a maximum total number of 200 values is
    * allowed, with each `string_value` has a byte size of no more than 255B.
    * For unfilterable `string_values`, the maximum total byte size of
    * unfilterable `string_values` is 50KB.  Empty string is not allowed.
    */
  var stringValues: js.UndefOr[js.Array[String]] = js.native
}
object SchemaCustomAttribute {
  
  @scala.inline
  def apply(): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
  
  @scala.inline
  implicit class SchemaCustomAttributeMutableBuilder[Self <: SchemaCustomAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setLongValues(value: js.Array[String]): Self = StObject.set(x, "longValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValuesUndefined: Self = StObject.set(x, "longValues", js.undefined)
    
    @scala.inline
    def setLongValuesVarargs(value: String*): Self = StObject.set(x, "longValues", js.Array(value :_*))
    
    @scala.inline
    def setStringValues(value: js.Array[String]): Self = StObject.set(x, "stringValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValuesUndefined: Self = StObject.set(x, "stringValues", js.undefined)
    
    @scala.inline
    def setStringValuesVarargs(value: String*): Self = StObject.set(x, "stringValues", js.Array(value :_*))
  }
}
