package typings.jweixin.jweixinMod

import typings.jweixin.jweixinStrings.link
import typings.jweixin.jweixinStrings.music
import typings.jweixin.jweixinStrings.videoBACKSLASHu6216link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenuShareAppMessage extends BaseParams {
  		// 分享类型,music、video或link，不填默认为link
  var dataUrl: js.UndefOr[String] = js.undefined
  	// 分享标题
  var desc: String
  	// 分享链接
  var imgUrl: String
  	// 分享描述
  var link: String
  var title: String
  	// 分享图标
  var `type`: js.UndefOr[music | videoBACKSLASHu6216link | link] = js.undefined
  // 用户取消分享后执行的回调函数
  def cancel(): Unit
   // 如果type是music或video，则要提供数据链接，默认为空
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareAppMessage(): Unit
}

object IonMenuShareAppMessage {
  @scala.inline
  def apply(
    cancel: () => Unit,
    desc: String,
    imgUrl: String,
    link: String,
    success: () => Unit,
    title: String,
    complete: /* repeated */ js.Any => Unit = null,
    dataUrl: String = null,
    fail: /* repeated */ js.Any => Unit = null,
    `type`: music | videoBACKSLASHu6216link | link = null
  ): IonMenuShareAppMessage = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), desc = desc.asInstanceOf[js.Any], imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], success = js.Any.fromFunction0(success), title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(dataUrl.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenuShareAppMessage]
  }
}

