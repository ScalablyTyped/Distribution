package typings.grpc.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  /**
    * If set, this callback will be invoked after the usual hostname verification
    * has been performed on the peer certificate.
    */
  var checkServerIdentity: js.UndefOr[CheckServerIdentityCallback] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply(checkServerIdentity: (/* hostname */ String, /* cert */ Certificate) => js.UndefOr[Error] = null): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    __obj.asInstanceOf[VerifyOptions]
  }
}

