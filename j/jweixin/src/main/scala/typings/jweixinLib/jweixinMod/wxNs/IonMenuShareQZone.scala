package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenuShareQZone extends BaseParams {
   // 分享标题
  var desc: java.lang.String
   // 分享链接
  var imgUrl: java.lang.String
   // 分享描述
  var link: java.lang.String
  var title: java.lang.String
  // 用户取消分享后执行的回调函数
  def cancel(): scala.Unit
   // 分享图标
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareQZone(): scala.Unit
}

object IonMenuShareQZone {
  @scala.inline
  def apply(
    cancel: js.Function0[scala.Unit],
    desc: java.lang.String,
    imgUrl: java.lang.String,
    link: java.lang.String,
    success: js.Function0[scala.Unit],
    title: java.lang.String,
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IonMenuShareQZone = {
    val __obj = js.Dynamic.literal(cancel = cancel, desc = desc, imgUrl = imgUrl, link = link, success = success, title = title)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IonMenuShareQZone]
  }
}

