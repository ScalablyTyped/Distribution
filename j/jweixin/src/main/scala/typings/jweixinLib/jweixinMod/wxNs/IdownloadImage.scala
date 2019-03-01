package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdownloadImage extends BaseParams {
   // 需要下载的图片的服务器端ID，由uploadImage接口获得
  var isShowProgressTips: scala.Double
  var serverId: java.lang.String
   // 默认为1，显示进度提示
  // 返回图片下载后的本地ID
  @JSName("success")
  def success_MIdownloadImage(res: Resouce): scala.Unit
}

object IdownloadImage {
  @scala.inline
  def apply(
    isShowProgressTips: scala.Double,
    serverId: java.lang.String,
    success: js.Function1[Resouce, scala.Unit],
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IdownloadImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isShowProgressTips")(isShowProgressTips)
    __obj.updateDynamic("serverId")(serverId)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IdownloadImage]
  }
}

