package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IupdownloadVoice extends BaseParams {
   // 需要上传的音频的本地ID，由stopRecord接口获得
  var isShowProgressTips: scala.Double
  var localId: java.lang.String
   // 默认为1，显示进度提示
  @JSName("success")
  def success_MIupdownloadVoice(res: Resouce): scala.Unit
}

object IupdownloadVoice {
  @scala.inline
  def apply(
    isShowProgressTips: scala.Double,
    localId: java.lang.String,
    success: js.Function1[Resouce, scala.Unit],
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IupdownloadVoice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isShowProgressTips")(isShowProgressTips)
    __obj.updateDynamic("localId")(localId)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IupdownloadVoice]
  }
}

