package typings
package humanparserLib.humanparserMod.humanparserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameOutput extends js.Object {
  var firstName: java.lang.String
  var fullName: java.lang.String
  var lastName: java.lang.String
  var middleName: js.UndefOr[java.lang.String] = js.undefined
  var salutation: js.UndefOr[java.lang.String] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object NameOutput {
  @scala.inline
  def apply(
    firstName: java.lang.String,
    fullName: java.lang.String,
    lastName: java.lang.String,
    middleName: java.lang.String = null,
    salutation: java.lang.String = null,
    suffix: java.lang.String = null
  ): NameOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firstName")(firstName)
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("lastName")(lastName)
    if (middleName != null) __obj.updateDynamic("middleName")(middleName)
    if (salutation != null) __obj.updateDynamic("salutation")(salutation)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[NameOutput]
  }
}

