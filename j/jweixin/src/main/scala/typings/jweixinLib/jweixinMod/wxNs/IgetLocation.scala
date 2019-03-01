package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgetLocation extends BaseParams {
  var `type`: jweixinLib.jweixinLibStrings.wgs84 | jweixinLib.jweixinLibStrings.gcj02
   // 默认为wgs84的gps坐标，如果要返回直接给openLocation用的火星坐标，可传入'gcj02'
  @JSName("success")
  def success_MIgetLocation(res: jweixinLib.Anon_Accuracy): scala.Unit
}

object IgetLocation {
  @scala.inline
  def apply(
    success: js.Function1[jweixinLib.Anon_Accuracy, scala.Unit],
    `type`: jweixinLib.jweixinLibStrings.wgs84 | jweixinLib.jweixinLibStrings.gcj02,
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IgetLocation = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IgetLocation]
  }
}

