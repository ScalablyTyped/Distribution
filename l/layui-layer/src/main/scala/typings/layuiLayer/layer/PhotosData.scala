package typings.layuiLayer.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotosData extends js.Object {
  /** 相册包含的图片 */
  var data: js.Array[PhotosDataItem]
  /** 相册id */
  var id: Double
  /**
    * 初始显示的图片序号
    * @default 0
    */
  var start: js.UndefOr[Double] = js.undefined
  /** 相册标题 */
  var title: String
}

object PhotosData {
  @scala.inline
  def apply(
    data: js.Array[PhotosDataItem],
    id: Double,
    title: String,
    start: js.UndefOr[Double] = js.undefined
  ): PhotosData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotosData]
  }
}

