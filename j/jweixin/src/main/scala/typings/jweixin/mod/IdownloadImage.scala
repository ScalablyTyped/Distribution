package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdownloadImage extends BaseParams {
   // 需要下载的图片的服务器端ID，由uploadImage接口获得
  var isShowProgressTips: Double = js.native
  var serverId: String = js.native
   // 默认为1，显示进度提示
  // 返回图片下载后的本地ID
  @JSName("success")
  def success_MIdownloadImage(res: Resouce): Unit = js.native
}

object IdownloadImage {
  @scala.inline
  def apply(isShowProgressTips: Double, serverId: String, success: Resouce => Unit): IdownloadImage = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IdownloadImage]
  }
  @scala.inline
  implicit class IdownloadImageOps[Self <: IdownloadImage] (val x: Self) extends AnyVal {
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
    def setIsShowProgressTips(value: Double): Self = this.set("isShowProgressTips", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerId(value: String): Self = this.set("serverId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Resouce => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

