package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    filterable: js.UndefOr[Boolean] = js.undefined,
    longValue: String = null,
    stringValues: SchemaStringValues = null
  ): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable.get.asInstanceOf[js.Any])
    if (longValue != null) __obj.updateDynamic("longValue")(longValue.asInstanceOf[js.Any])
    if (stringValues != null) __obj.updateDynamic("stringValues")(stringValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
}

