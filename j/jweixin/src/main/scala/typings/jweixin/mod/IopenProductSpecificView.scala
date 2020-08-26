package typings.jweixin.mod

import typings.jweixin.jweixinStrings.`0`
import typings.jweixin.jweixinStrings.`1`
import typings.jweixin.jweixinStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信扫一扫================================*/
/*=============================微信小店================================*/
@js.native
trait IopenProductSpecificView extends BaseParams {
  var productId: String = js.native
   // 商品id
  var viewType: `0` | `1` | `2` = js.native
}

object IopenProductSpecificView {
  @scala.inline
  def apply(productId: String, viewType: `0` | `1` | `2`): IopenProductSpecificView = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], viewType = viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IopenProductSpecificView]
  }
  @scala.inline
  implicit class IopenProductSpecificViewOps[Self <: IopenProductSpecificView] (val x: Self) extends AnyVal {
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
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewType(value: `0` | `1` | `2`): Self = this.set("viewType", value.asInstanceOf[js.Any])
  }
  
}

