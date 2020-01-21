package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to modify an existing contact group&#39;s members. Contacts can
  * be removed from any group but they can only be added to a user group or
  * myContacts or starred system groups.
  */
@js.native
trait SchemaModifyContactGroupMembersRequest extends js.Object {
  /**
    * The resource names of the contact people to add in the form of in the
    * form `people/`&lt;var&gt;person_id&lt;/var&gt;.
    */
  var resourceNamesToAdd: js.UndefOr[js.Array[String]] = js.native
  /**
    * The resource names of the contact people to remove in the form of in the
    * form of `people/`&lt;var&gt;person_id&lt;/var&gt;.
    */
  var resourceNamesToRemove: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyContactGroupMembersRequest {
  @scala.inline
  def apply(resourceNamesToAdd: js.Array[String] = null, resourceNamesToRemove: js.Array[String] = null): SchemaModifyContactGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (resourceNamesToAdd != null) __obj.updateDynamic("resourceNamesToAdd")(resourceNamesToAdd.asInstanceOf[js.Any])
    if (resourceNamesToRemove != null) __obj.updateDynamic("resourceNamesToRemove")(resourceNamesToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModifyContactGroupMembersRequest]
  }
}

