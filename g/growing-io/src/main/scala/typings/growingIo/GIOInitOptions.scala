package typings.growingIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GIOInitOptions extends js.Object {
  /** 配置imp类型的数据关闭发送 */
  var imp: js.UndefOr[Boolean] = js.native
}

object GIOInitOptions {
  @scala.inline
  def apply(): GIOInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GIOInitOptions]
  }
  @scala.inline
  implicit class GIOInitOptionsOps[Self <: GIOInitOptions] (val x: Self) extends AnyVal {
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
    def setImp(value: Boolean): Self = this.set("imp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImp: Self = this.set("imp", js.undefined)
  }
  
}

