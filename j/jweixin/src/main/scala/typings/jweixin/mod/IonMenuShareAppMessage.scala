package typings.jweixin.mod

import typings.jweixin.jweixinStrings.link
import typings.jweixin.jweixinStrings.music
import typings.jweixin.jweixinStrings.video或link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonMenuShareAppMessage extends BaseParams {
          // 分享类型,music、video或link，不填默认为link
  var dataUrl: js.UndefOr[String] = js.native
      // 分享标题
  var desc: String = js.native
      // 分享链接
  var imgUrl: String = js.native
      // 分享描述
  var link: String = js.native
  var title: String = js.native
      // 分享图标
  var `type`: js.UndefOr[music | video或link | link] = js.native
  // 用户取消分享后执行的回调函数
  def cancel(): Unit = js.native
   // 如果type是music或video，则要提供数据链接，默认为空
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareAppMessage(): Unit = js.native
}

object IonMenuShareAppMessage {
  @scala.inline
  def apply(cancel: () => Unit, desc: String, imgUrl: String, link: String, success: () => Unit, title: String): IonMenuShareAppMessage = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), desc = desc.asInstanceOf[js.Any], imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], success = js.Any.fromFunction0(success), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenuShareAppMessage]
  }
  @scala.inline
  implicit class IonMenuShareAppMessageOps[Self <: IonMenuShareAppMessage] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def setImgUrl(value: String): Self = this.set("imgUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataUrl(value: String): Self = this.set("dataUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataUrl: Self = this.set("dataUrl", js.undefined)
    @scala.inline
    def setType(value: music | video或link | link): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

