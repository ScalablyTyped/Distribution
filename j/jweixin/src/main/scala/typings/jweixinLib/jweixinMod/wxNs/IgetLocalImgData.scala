package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgetLocalImgData extends BaseParams {
  var localId: java.lang.String
   // 图片的localID
  // localData是图片的base64数据，可以用img标签显示
  @JSName("success")
  def success_MIgetLocalImgData(res: jweixinLib.Anon_LocalData): scala.Unit
}

object IgetLocalImgData {
  @scala.inline
  def apply(
    localId: java.lang.String,
    success: js.Function1[jweixinLib.Anon_LocalData, scala.Unit],
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IgetLocalImgData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("localId")(localId)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IgetLocalImgData]
  }
}

