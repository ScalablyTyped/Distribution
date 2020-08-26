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
  def apply(): SchemaExtendedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedValue]
  }
  @scala.inline
  implicit class SchemaExtendedValueOps[Self <: SchemaExtendedValue] (val x: Self) extends AnyVal {
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    @scala.inline
    def setErrorValue(value: SchemaErrorValue): Self = this.set("errorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorValue: Self = this.set("errorValue", js.undefined)
    @scala.inline
    def setFormulaValue(value: String): Self = this.set("formulaValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulaValue: Self = this.set("formulaValue", js.undefined)
    @scala.inline
    def setNumberValue(value: Double): Self = this.set("numberValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberValue: Self = this.set("numberValue", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}

