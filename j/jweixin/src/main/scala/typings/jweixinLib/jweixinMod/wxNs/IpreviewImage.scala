package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpreviewImage extends BaseParams {
  var current: java.lang.String
   // 当前显示图片的http链接
  var urls: js.Array[java.lang.String]
}

object IpreviewImage {
  @scala.inline
  def apply(
    current: java.lang.String,
    urls: js.Array[java.lang.String],
    complete: /* repeated */ js.Any => scala.Unit = null,
    fail: /* repeated */ js.Any => scala.Unit = null,
    success: /* repeated */ js.Any => scala.Unit = null
  ): IpreviewImage = {
    val __obj = js.Dynamic.literal(current = current, urls = urls)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IpreviewImage]
  }
}

