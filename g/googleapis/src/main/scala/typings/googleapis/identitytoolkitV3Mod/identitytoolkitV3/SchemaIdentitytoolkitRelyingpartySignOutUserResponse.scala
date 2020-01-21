package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of signing out user.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySignOutUserResponse extends js.Object {
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartySignOutUserResponse {
  @scala.inline
  def apply(localId: String = null): SchemaIdentitytoolkitRelyingpartySignOutUserResponse = {
    val __obj = js.Dynamic.literal()
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySignOutUserResponse]
  }
}

