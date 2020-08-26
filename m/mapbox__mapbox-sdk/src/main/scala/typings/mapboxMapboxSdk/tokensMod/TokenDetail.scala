package typings.mapboxMapboxSdk.tokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenDetail extends js.Object {
  var code: String = js.native
  var token: Token = js.native
}

object TokenDetail {
  @scala.inline
  def apply(code: String, token: Token): TokenDetail = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenDetail]
  }
  @scala.inline
  implicit class TokenDetailOps[Self <: TokenDetail] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: Token): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

