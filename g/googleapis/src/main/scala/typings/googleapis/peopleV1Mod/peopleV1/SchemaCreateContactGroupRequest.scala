package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to create a new contact group.
  */
@js.native
trait SchemaCreateContactGroupRequest extends js.Object {
  /**
    * The contact group to create.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.native
}

object SchemaCreateContactGroupRequest {
  @scala.inline
  def apply(contactGroup: SchemaContactGroup = null): SchemaCreateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (contactGroup != null) __obj.updateDynamic("contactGroup")(contactGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateContactGroupRequest]
  }
}

