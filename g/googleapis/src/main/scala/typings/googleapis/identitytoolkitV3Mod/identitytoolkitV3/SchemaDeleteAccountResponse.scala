package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Respone of deleting account.
  */
@js.native
trait SchemaDeleteAccountResponse extends js.Object {
  /**
    * The fixed string &quot;identitytoolkit#DeleteAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDeleteAccountResponse {
  @scala.inline
  def apply(kind: String = null): SchemaDeleteAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteAccountResponse]
  }
}

