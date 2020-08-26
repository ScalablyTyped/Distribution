package typings.hardSourceWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hardSourceWebpackPlugin extends js.Object {
  @JSName("apply")
  def apply(args: js.Any*): Unit = js.native
}

object hardSourceWebpackPlugin {
  @scala.inline
  def apply(apply: /* repeated */ js.Any => Unit): hardSourceWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[hardSourceWebpackPlugin]
  }
  @scala.inline
  implicit class hardSourceWebpackPluginOps[Self <: hardSourceWebpackPlugin] (val x: Self) extends AnyVal {
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
    def setApply(value: /* repeated */ js.Any => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
  }
  
}

