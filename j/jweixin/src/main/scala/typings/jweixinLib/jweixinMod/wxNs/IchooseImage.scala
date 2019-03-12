package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================基础接口================================*/
/*=============================图像接口================================*/
trait IchooseImage extends BaseParams {
  /** 最多可以选择的图片张数，默认9 */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** original 原图，compressed 压缩图，默认二者都有 */
  var sizeType: js.UndefOr[js.Array[ImageSizeType]] = js.undefined
  /** album 从相册选图，camera 使用相机，默认二者都有 */
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.undefined
  def cancel(): scala.Unit
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  @JSName("success")
  def success_MIchooseImage(res: jweixinLib.Anon_ErrMsgLocalIds): scala.Unit
}

object IchooseImage {
  @scala.inline
  def apply(
    cancel: () => scala.Unit,
    success: jweixinLib.Anon_ErrMsgLocalIds => scala.Unit,
    complete: /* repeated */ js.Any => scala.Unit = null,
    count: scala.Int | scala.Double = null,
    fail: /* repeated */ js.Any => scala.Unit = null,
    sizeType: js.Array[ImageSizeType] = null,
    sourceType: js.Array[ImageSourceType] = null
  ): IchooseImage = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    __obj.asInstanceOf[IchooseImage]
  }
}

