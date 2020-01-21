package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The kinds of value that a cell in a spreadsheet can have.
  */
@js.native
trait SchemaExtendedValue extends js.Object {
  /**
    * Represents a boolean value.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * Represents an error. This field is read-only.
    */
  var errorValue: js.UndefOr[SchemaErrorValue] = js.native
  /**
    * Represents a formula.
    */
  var formulaValue: js.UndefOr[String] = js.native
  /**
    * Represents a double value. Note: Dates, Times and DateTimes are
    * represented as doubles in &quot;serial number&quot; format.
    */
  var numberValue: js.UndefOr[Double] = js.native
  /**
    * Represents a string value. Leading single quotes are not included. For
    * example, if the user typed `&#39;123` into the UI, this would be
    * represented as a `stringValue` of `&quot;123&quot;`.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object SchemaExtendedValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    errorValue: SchemaErrorValue = null,
    formulaValue: String = null,
    numberValue: Int | Double = null,
    stringValue: String = null
  ): SchemaExtendedValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (errorValue != null) __obj.updateDynamic("errorValue")(errorValue.asInstanceOf[js.Any])
    if (formulaValue != null) __obj.updateDynamic("formulaValue")(formulaValue.asInstanceOf[js.Any])
    if (numberValue != null) __obj.updateDynamic("numberValue")(numberValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtendedValue]
  }
}

