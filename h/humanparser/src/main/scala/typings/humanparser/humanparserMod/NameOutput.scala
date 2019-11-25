package typings.humanparser.humanparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameOutput extends js.Object {
  var firstName: String
  var fullName: String
  var lastName: String
  var middleName: js.UndefOr[String] = js.undefined
  var salutation: js.UndefOr[String] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object NameOutput {
  @scala.inline
  def apply(
    firstName: String,
    fullName: String,
    lastName: String,
    middleName: String = null,
    salutation: String = null,
    suffix: String = null
  ): NameOutput = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    if (salutation != null) __obj.updateDynamic("salutation")(salutation.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameOutput]
  }
}

