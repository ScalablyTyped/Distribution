package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom attribute values that are either filterable or non-filterable.
  */
@js.native
trait SchemaCustomAttribute extends js.Object {
  
  /**
    * Optional.  If the `filterable` flag is true, custom field values are
    * searchable. If false, values are not searchable.  Default is false.
    */
  var filterable: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional but at least one of string_values or long_value must be
    * specified.  This field is used to perform number range search. (`EQ`,
    * `GT`, `GE`, `LE`, `LT`) over filterable `long_value`. For `long_value`, a
    * value between Long.MIN and Long.MAX is allowed.
    */
  var longValue: js.UndefOr[String] = js.native
  
  /**
    * Optional but at least one of string_values or long_value must be
    * specified.  This field is used to perform a string match
    * (`CASE_SENSITIVE_MATCH` or `CASE_INSENSITIVE_MATCH`) search. For
    * filterable `string_values`, a maximum total number of 200 values is
    * allowed, with each `string_value` has a byte size of no more than 255B.
    * For unfilterable `string_values`, the maximum total byte size of
    * unfilterable `string_values` is 50KB.  Empty strings are not allowed.
    */
  var stringValues: js.UndefOr[SchemaStringValues] = js.native
}
object SchemaCustomAttribute {
  
  @scala.inline
  def apply(): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
  
  @scala.inline
  implicit class SchemaCustomAttributeOps[Self <: SchemaCustomAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    
    @scala.inline
    def setLongValue(value: String): Self = this.set("longValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongValue: Self = this.set("longValue", js.undefined)
    
    @scala.inline
    def setStringValues(value: SchemaStringValues): Self = this.set("stringValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValues: Self = this.set("stringValues", js.undefined)
  }
}
