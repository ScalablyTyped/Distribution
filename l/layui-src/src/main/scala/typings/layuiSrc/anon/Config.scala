package typings.layuiSrc.anon

import typings.layuiSrc.layui.DateOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var config: DateOption = js.native
  def hint(): Unit = js.native
}

object Config {
  @scala.inline
  def apply(config: DateOption, hint: () => Unit): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], hint = js.Any.fromFunction0(hint))
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setConfig(value: DateOption): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setHint(value: () => Unit): Self = this.set("hint", js.Any.fromFunction0(value))
  }
  
}

