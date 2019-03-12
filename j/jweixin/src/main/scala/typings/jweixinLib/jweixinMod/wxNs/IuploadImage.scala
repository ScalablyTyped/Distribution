package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IuploadImage extends BaseParams {
   // 需要上传的图片的本地ID，由chooseImage接口获得
  var isShowProgressTips: scala.Double
  var localId: java.lang.String
   // 默认为1，显示进度提示
  // 返回图片的服务器端ID
  @JSName("success")
  def success_MIuploadImage(res: jweixinLib.Anon_ServerId): scala.Unit
}

object IuploadImage {
  @scala.inline
  def apply(
    isShowProgressTips: scala.Double,
    localId: java.lang.String,
    success: jweixinLib.Anon_ServerId => scala.Unit,
    complete: /* repeated */ js.Any => scala.Unit = null,
    fail: /* repeated */ js.Any => scala.Unit = null
  ): IuploadImage = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips, localId = localId, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IuploadImage]
  }
}

