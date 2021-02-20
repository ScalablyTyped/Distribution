package typings.jweixin.mod

import typings.jweixin.jweixinStrings.`0`
import typings.jweixin.jweixinStrings.`1`
import typings.jweixin.jweixinStrings.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IopenProductSpecificViewMutableBuilder[Self <: IopenProductSpecificView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: `0` | `1` | `2`): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
  }
}
