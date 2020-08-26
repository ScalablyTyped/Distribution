package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVariableFormatValue extends js.Object {
  /**
    * The option to convert a string-type variable value to either lowercase or
    * uppercase.
    */
  var caseConversionType: js.UndefOr[String] = js.native
  /**
    * The value to convert if a variable value is false.
    */
  var convertFalseToValue: js.UndefOr[SchemaParameter] = js.native
  /**
    * The value to convert if a variable value is null.
    */
  var convertNullToValue: js.UndefOr[SchemaParameter] = js.native
  /**
    * The value to convert if a variable value is true.
    */
  var convertTrueToValue: js.UndefOr[SchemaParameter] = js.native
  /**
    * The value to convert if a variable value is undefined.
    */
  var convertUndefinedToValue: js.UndefOr[SchemaParameter] = js.native
}

object SchemaVariableFormatValue {
  @scala.inline
  def apply(): SchemaVariableFormatValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVariableFormatValue]
  }
  @scala.inline
  implicit class SchemaVariableFormatValueOps[Self <: SchemaVariableFormatValue] (val x: Self) extends AnyVal {
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
    def setCaseConversionType(value: String): Self = this.set("caseConversionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseConversionType: Self = this.set("caseConversionType", js.undefined)
    @scala.inline
    def setConvertFalseToValue(value: SchemaParameter): Self = this.set("convertFalseToValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvertFalseToValue: Self = this.set("convertFalseToValue", js.undefined)
    @scala.inline
    def setConvertNullToValue(value: SchemaParameter): Self = this.set("convertNullToValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvertNullToValue: Self = this.set("convertNullToValue", js.undefined)
    @scala.inline
    def setConvertTrueToValue(value: SchemaParameter): Self = this.set("convertTrueToValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvertTrueToValue: Self = this.set("convertTrueToValue", js.undefined)
    @scala.inline
    def setConvertUndefinedToValue(value: SchemaParameter): Self = this.set("convertUndefinedToValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvertUndefinedToValue: Self = this.set("convertUndefinedToValue", js.undefined)
  }
  
}

