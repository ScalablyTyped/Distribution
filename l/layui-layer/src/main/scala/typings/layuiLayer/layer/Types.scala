package typings.layuiLayer.layer

import typings.layuiLayer.layuiLayerNumbers.`0`
import typings.layuiLayer.layuiLayerNumbers.`1`
import typings.layuiLayer.layuiLayerNumbers.`2`
import typings.layuiLayer.layuiLayerNumbers.`3`
import typings.layuiLayer.layuiLayerNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  /** 信息框 */
  var dialog: `0`
  /** iframe层 */
  var iframe: `2`
  /** 加载层 */
  var loading: `3`
  /** 页面层 */
  var page: `1`
  /** tips层 */
  var tips: `4`
}

object Types {
  @scala.inline
  def apply(dialog: `0`, iframe: `2`, loading: `3`, page: `1`, tips: `4`): Types = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Types]
  }
}

