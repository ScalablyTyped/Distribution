package typings.jweixin.mod

import typings.jweixin.anon.Accuracy
import typings.jweixin.jweixinStrings.gcj02
import typings.jweixin.jweixinStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgetLocation extends BaseParams {
  var `type`: wgs84 | gcj02
   // 默认为wgs84的gps坐标，如果要返回直接给openLocation用的火星坐标，可传入'gcj02'
  @JSName("success")
  def success_MIgetLocation(res: Accuracy): Unit
}

object IgetLocation {
  @scala.inline
  def apply(
    success: Accuracy => Unit,
    `type`: wgs84 | gcj02,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null
  ): IgetLocation = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IgetLocation]
  }
}

