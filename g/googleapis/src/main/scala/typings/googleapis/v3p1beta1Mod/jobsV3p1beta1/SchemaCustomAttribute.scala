package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

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
  def apply(
    filterable: js.UndefOr[Boolean] = js.undefined,
    longValues: js.Array[String] = null,
    stringValues: js.Array[String] = null
  ): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (longValues != null) __obj.updateDynamic("longValues")(longValues.asInstanceOf[js.Any])
    if (stringValues != null) __obj.updateDynamic("stringValues")(stringValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
}

