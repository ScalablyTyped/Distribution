package typings.jweixin.jweixinMod

import typings.jweixin.Anon_LocalData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgetLocalImgData extends BaseParams {
  var localId: String
   // 图片的localID
  // localData是图片的base64数据，可以用img标签显示
  @JSName("success")
  def success_MIgetLocalImgData(res: Anon_LocalData): Unit
}

object IgetLocalImgData {
  @scala.inline
  def apply(
    localId: String,
    success: Anon_LocalData => Unit,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null
  ): IgetLocalImgData = {
    val __obj = js.Dynamic.literal(localId = localId, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IgetLocalImgData]
  }
}

