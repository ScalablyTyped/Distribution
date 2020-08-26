package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google contact group membership.
  */
@js.native
trait SchemaContactGroupMembership extends js.Object {
  /**
    * The contact group ID for the contact group membership. The contact group
    * ID can be custom or one of these predefined values:  *  `myContacts` *
    * `starred` *  A numerical ID for user-created groups.
    */
  var contactGroupId: js.UndefOr[String] = js.native
}

object SchemaContactGroupMembership {
  @scala.inline
  def apply(): SchemaContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactGroupMembership]
  }
  @scala.inline
  implicit class SchemaContactGroupMembershipOps[Self <: SchemaContactGroupMembership] (val x: Self) extends AnyVal {
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
    def setContactGroupId(value: String): Self = this.set("contactGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactGroupId: Self = this.set("contactGroupId", js.undefined)
  }
  
}

