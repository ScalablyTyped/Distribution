package typings.layuiSrc.layui

import typings.layuiSrc.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerTabOptions extends LayerOptions {
  var tab: js.Array[Content] = js.native
}

object LayerTabOptions {
  @scala.inline
  def apply(tab: js.Array[Content]): LayerTabOptions = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerTabOptions]
  }
  @scala.inline
  implicit class LayerTabOptionsOps[Self <: LayerTabOptions] (val x: Self) extends AnyVal {
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
    def setTabVarargs(value: Content*): Self = this.set("tab", js.Array(value :_*))
    @scala.inline
    def setTab(value: js.Array[Content]): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
  
}

