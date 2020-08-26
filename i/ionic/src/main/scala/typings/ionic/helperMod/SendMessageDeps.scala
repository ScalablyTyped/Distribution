package typings.ionic.helperMod

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IonicContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageDeps extends js.Object {
  var config: IConfig = js.native
  var ctx: IonicContext = js.native
}

object SendMessageDeps {
  @scala.inline
  def apply(config: IConfig, ctx: IonicContext): SendMessageDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageDeps]
  }
  @scala.inline
  implicit class SendMessageDepsOps[Self <: SendMessageDeps] (val x: Self) extends AnyVal {
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
    def setConfig(value: IConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtx(value: IonicContext): Self = this.set("ctx", value.asInstanceOf[js.Any])
  }
  
}

