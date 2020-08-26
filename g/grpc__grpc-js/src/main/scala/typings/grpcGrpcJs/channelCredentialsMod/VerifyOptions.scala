package typings.grpcGrpcJs.channelCredentialsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyOptions extends js.Object {
  /**
    * If set, this callback will be invoked after the usual hostname verification
    * has been performed on the peer certificate.
    */
  var checkServerIdentity: js.UndefOr[CheckServerIdentityCallback] = js.native
}

object VerifyOptions {
  @scala.inline
  def apply(): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions]
  }
  @scala.inline
  implicit class VerifyOptionsOps[Self <: VerifyOptions] (val x: Self) extends AnyVal {
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
    def setCheckServerIdentity(value: (/* hostname */ String, /* cert */ Certificate) => js.UndefOr[Error]): Self = this.set("checkServerIdentity", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCheckServerIdentity: Self = this.set("checkServerIdentity", js.undefined)
  }
  
}

