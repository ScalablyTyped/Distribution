package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to update an existing user contact group. All updated fields will
  * be replaced.
  */
@js.native
trait SchemaUpdateContactGroupRequest extends js.Object {
  /**
    * The contact group to update.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.native
}

object SchemaUpdateContactGroupRequest {
  @scala.inline
  def apply(contactGroup: SchemaContactGroup = null): SchemaUpdateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (contactGroup != null) __obj.updateDynamic("contactGroup")(contactGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateContactGroupRequest]
  }
}

