package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a modify contact group members request.
  */
@js.native
trait SchemaModifyContactGroupMembersResponse extends js.Object {
  /**
    * The contact people resource names that were not found.
    */
  var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyContactGroupMembersResponse {
  @scala.inline
  def apply(notFoundResourceNames: js.Array[String] = null): SchemaModifyContactGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (notFoundResourceNames != null) __obj.updateDynamic("notFoundResourceNames")(notFoundResourceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModifyContactGroupMembersResponse]
  }
}

