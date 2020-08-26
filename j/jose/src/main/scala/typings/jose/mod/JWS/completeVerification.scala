package typings.jose.mod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait completeVerification[T, T2] extends js.Object {
  var header: js.UndefOr[js.Object] = js.native
  var key: T2 = js.native
  var payload: T = js.native
  var `protected`: js.UndefOr[js.Object] = js.native
}

object completeVerification {
  @scala.inline
  def apply[T, T2](key: T2, payload: T): completeVerification[T, T2] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[completeVerification[T, T2]]
  }
  @scala.inline
  implicit class completeVerificationOps[Self <: completeVerification[_, _], T, T2] (val x: Self with (completeVerification[T, T2])) extends AnyVal {
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
    def setKey(value: T2): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: T): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setProtected(value: js.Object): Self = this.set("protected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtected: Self = this.set("protected", js.undefined)
  }
  
}

