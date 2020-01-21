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
  def apply(contactGroupId: String = null): SchemaContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (contactGroupId != null) __obj.updateDynamic("contactGroupId")(contactGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContactGroupMembership]
  }
}

