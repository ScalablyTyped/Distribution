package typings.gulpTsd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  var command: js.UndefOr[String] = js.native
  var config: js.UndefOr[String] = js.native
  var latest: js.UndefOr[Boolean] = js.native
  var opts: js.UndefOr[js.Object] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setLatest(value: Boolean): Self = this.set("latest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatest: Self = this.set("latest", js.undefined)
    @scala.inline
    def setOpts(value: js.Object): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpts: Self = this.set("opts", js.undefined)
  }
  
}

