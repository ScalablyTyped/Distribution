package typings.inboxsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadScriptOptions extends js.Object {
  var nowrap: js.UndefOr[Boolean] = js.native
}

object LoadScriptOptions {
  @scala.inline
  def apply(): LoadScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadScriptOptions]
  }
  @scala.inline
  implicit class LoadScriptOptionsOps[Self <: LoadScriptOptions] (val x: Self) extends AnyVal {
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
    def setNowrap(value: Boolean): Self = this.set("nowrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNowrap: Self = this.set("nowrap", js.undefined)
  }
  
}

