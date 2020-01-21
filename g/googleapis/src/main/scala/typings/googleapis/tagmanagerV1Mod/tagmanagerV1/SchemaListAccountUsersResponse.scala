package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List AccountUsers Response.
  */
@js.native
trait SchemaListAccountUsersResponse extends js.Object {
  /**
    * All GTM AccountUsers of a GTM Account.
    */
  var userAccess: js.UndefOr[js.Array[SchemaUserAccess]] = js.native
}

object SchemaListAccountUsersResponse {
  @scala.inline
  def apply(userAccess: js.Array[SchemaUserAccess] = null): SchemaListAccountUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (userAccess != null) __obj.updateDynamic("userAccess")(userAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAccountUsersResponse]
  }
}

