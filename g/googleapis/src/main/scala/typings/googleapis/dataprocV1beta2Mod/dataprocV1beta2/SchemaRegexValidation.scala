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
  def apply(regexes: js.Array[String] = null): SchemaRegexValidation = {
    val __obj = js.Dynamic.literal()
    if (regexes != null) __obj.updateDynamic("regexes")(regexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegexValidation]
  }
}

