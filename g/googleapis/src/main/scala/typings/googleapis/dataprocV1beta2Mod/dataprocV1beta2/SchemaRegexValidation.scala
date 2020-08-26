package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Validation based on regular expressions.
  */
@js.native
trait SchemaRegexValidation extends js.Object {
  /**
    * Required. RE2 regular expressions used to validate the parameter&#39;s
    * value. The value must match the regex in its entirety (substring matches
    * are not sufficient).
    */
  var regexes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRegexValidation {
  @scala.inline
  def apply(): SchemaRegexValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegexValidation]
  }
  @scala.inline
  implicit class SchemaRegexValidationOps[Self <: SchemaRegexValidation] (val x: Self) extends AnyVal {
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
    def setRegexesVarargs(value: String*): Self = this.set("regexes", js.Array(value :_*))
    @scala.inline
    def setRegexes(value: js.Array[String]): Self = this.set("regexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexes: Self = this.set("regexes", js.undefined)
  }
  
}

