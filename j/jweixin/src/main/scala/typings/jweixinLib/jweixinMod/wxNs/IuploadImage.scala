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
    success: js.Function1[jweixinLib.Anon_ServerId, scala.Unit],
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IuploadImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isShowProgressTips")(isShowProgressTips)
    __obj.updateDynamic("localId")(localId)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IuploadImage]
  }
}

