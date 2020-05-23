package typings.layuiLayer.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotosDataItem extends js.Object {
  /** 图片名 */
  var alt: String
  /** 图片id */
  var pid: js.UndefOr[Double] = js.undefined
  /** 原图地址 */
  var src: String
  /** 缩略图地址 */
  var thumb: String
}

object PhotosDataItem {
  @scala.inline
  def apply(alt: String, src: String, thumb: String, pid: js.UndefOr[Double] = js.undefined): PhotosDataItem = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(pid)) __obj.updateDynamic("pid")(pid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotosDataItem]
  }
}

