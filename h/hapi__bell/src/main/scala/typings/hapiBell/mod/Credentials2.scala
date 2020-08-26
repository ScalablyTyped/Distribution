package typings.hapiBell.mod

import typings.hapiBell.hapiBellStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials2 extends Credentials {
  var expiresIn: js.UndefOr[Double] = js.native
  var refreshToken: js.UndefOr[String] = js.native
}

object Credentials2 {
  @scala.inline
  def apply(provider: Provider | custom, query: StringLikeMap, token: String): Credentials2 = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials2]
  }
  @scala.inline
  implicit class Credentials2Ops[Self <: Credentials2] (val x: Self) extends AnyVal {
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
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
  }
  
}

