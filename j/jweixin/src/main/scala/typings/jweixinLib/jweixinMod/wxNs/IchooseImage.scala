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

