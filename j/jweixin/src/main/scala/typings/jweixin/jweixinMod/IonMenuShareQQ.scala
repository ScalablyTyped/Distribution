package typings.jweixin.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenuShareQQ extends BaseParams {
   // 分享标题
  var desc: String
   // 分享链接
  var imgUrl: String
   // 分享描述
  var link: String
  var title: String
  // 用户取消分享后执行的回调函数
  def cancel(): Unit
   // 分享图标
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareQQ(): Unit
}

object IonMenuShareQQ {
  @scala.inline
  def apply(
    cancel: () => Unit,
    desc: String,
    imgUrl: String,
    link: String,
    success: () => Unit,
    title: String,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null
  ): IonMenuShareQQ = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), desc = desc.asInstanceOf[js.Any], imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], success = js.Any.fromFunction0(success), title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IonMenuShareQQ]
  }
}

