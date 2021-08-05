package typings.jweixin.mod

import typings.jweixin.jweixinStrings.`0`
import typings.jweixin.jweixinStrings.`1`
import typings.jweixin.jweixinStrings.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*=============================微信扫一扫================================*/
/*=============================微信小店================================*/
trait IopenProductSpecificView
  extends StObject
     with BaseParams {
  
  var productId: String
  
  // 商品id
  var viewType: `0` | `1` | `2`
}
object IopenProductSpecificView {
  
  inline def apply(productId: String, viewType: `0` | `1` | `2`): IopenProductSpecificView = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], viewType = viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IopenProductSpecificView]
  }
  
  extension [Self <: IopenProductSpecificView](x: Self) {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: `0` | `1` | `2`): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
  }
}
