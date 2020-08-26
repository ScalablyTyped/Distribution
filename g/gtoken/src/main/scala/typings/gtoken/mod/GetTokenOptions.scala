package typings.gtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTokenOptions extends js.Object {
  var forceRefresh: js.UndefOr[Boolean] = js.native
}

object GetTokenOptions {
  @scala.inline
  def apply(): GetTokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTokenOptions]
  }
  @scala.inline
  implicit class GetTokenOptionsOps[Self <: GetTokenOptions] (val x: Self) extends AnyVal {
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
    def setForceRefresh(value: Boolean): Self = this.set("forceRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceRefresh: Self = this.set("forceRefresh", js.undefined)
  }
  
}

