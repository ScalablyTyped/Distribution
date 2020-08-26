package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for name of a user in Directory API.
  */
@js.native
trait SchemaUserName extends js.Object {
  /**
    * Last Name
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * Full Name
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * First Name
    */
  var givenName: js.UndefOr[String] = js.native
}

object SchemaUserName {
  @scala.inline
  def apply(): SchemaUserName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserName]
  }
  @scala.inline
  implicit class SchemaUserNameOps[Self <: SchemaUserName] (val x: Self) extends AnyVal {
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
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
  }
  
}

