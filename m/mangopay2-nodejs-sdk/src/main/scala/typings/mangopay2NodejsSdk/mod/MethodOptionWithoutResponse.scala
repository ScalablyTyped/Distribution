package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodOptionWithoutResponse extends MethodOptions {
  var resolveWithFullResponse: js.UndefOr[`false`] = js.native
}

object MethodOptionWithoutResponse {
  @scala.inline
  def apply(): MethodOptionWithoutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodOptionWithoutResponse]
  }
  @scala.inline
  implicit class MethodOptionWithoutResponseOps[Self <: MethodOptionWithoutResponse] (val x: Self) extends AnyVal {
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
    def setResolveWithFullResponse(value: `false`): Self = this.set("resolveWithFullResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveWithFullResponse: Self = this.set("resolveWithFullResponse", js.undefined)
  }
  
}

