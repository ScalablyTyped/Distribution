package typings.layuiLayer.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabOptions extends Options {
  /**
    * 监听选项卡的切换事件
    * @param this 传入的选项
    * @param tabIndex 选项卡索引
    */
  var change: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* tabIndex */ Double, Unit]] = js.native
  var tab: js.Array[TabItem] = js.native
}

object TabOptions {
  @scala.inline
  def apply(tab: js.Array[TabItem]): TabOptions = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabOptions]
  }
  @scala.inline
  implicit class TabOptionsOps[Self <: TabOptions] (val x: Self) extends AnyVal {
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
    def setTabVarargs(value: TabItem*): Self = this.set("tab", js.Array(value :_*))
    @scala.inline
    def setTab(value: js.Array[TabItem]): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def setChange(value: js.ThisFunction1[TabOptions, /* tabIndex */ Double, Unit]): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
  }
  
}

