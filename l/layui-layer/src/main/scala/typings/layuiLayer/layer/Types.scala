package typings.layuiLayer.layer

import typings.layuiLayer.layuiLayerNumbers.`0`
import typings.layuiLayer.layuiLayerNumbers.`1`
import typings.layuiLayer.layuiLayerNumbers.`2`
import typings.layuiLayer.layuiLayerNumbers.`3`
import typings.layuiLayer.layuiLayerNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Types extends js.Object {
  
  /** 信息框 */
  var dialog: `0` = js.native
  
  /** iframe层 */
  var iframe: `2` = js.native
  
  /** 加载层 */
  var loading: `3` = js.native
  
  /** 页面层 */
  var page: `1` = js.native
  
  /** tips层 */
  var tips: `4` = js.native
}
object Types {
  
  @scala.inline
  def apply(dialog: `0`, iframe: `2`, loading: `3`, page: `1`, tips: `4`): Types = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  
  @scala.inline
  implicit class TypesOps[Self <: Types] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDialog(value: `0`): Self = this.set("dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframe(value: `2`): Self = this.set("iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: `3`): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: `1`): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTips(value: `4`): Self = this.set("tips", value.asInstanceOf[js.Any])
  }
}
