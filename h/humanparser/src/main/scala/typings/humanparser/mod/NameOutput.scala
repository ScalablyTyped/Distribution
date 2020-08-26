package typings.humanparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameOutput extends js.Object {
  var firstName: String = js.native
  var fullName: String = js.native
  var lastName: String = js.native
  var middleName: js.UndefOr[String] = js.native
  var salutation: js.UndefOr[String] = js.native
  var suffix: js.UndefOr[String] = js.native
}

object NameOutput {
  @scala.inline
  def apply(firstName: String, fullName: String, lastName: String): NameOutput = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameOutput]
  }
  @scala.inline
  implicit class NameOutputOps[Self <: NameOutput] (val x: Self) extends AnyVal {
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
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
    @scala.inline
    def setSalutation(value: String): Self = this.set("salutation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalutation: Self = this.set("salutation", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
  
}

