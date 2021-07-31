package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 购买IAP商品对象
  * 描述购买的IAP商品详细信息，如标识、数量等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
trait PlusPaymentIAPProductInfo extends StObject {
  
  /**
    * 商品的标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var productIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * 商品的数量
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var quantity: js.UndefOr[String] = js.undefined
}
object PlusPaymentIAPProductInfo {
  
  @scala.inline
  def apply(): PlusPaymentIAPProductInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPaymentIAPProductInfo]
  }
  
  @scala.inline
  implicit class PlusPaymentIAPProductInfoMutableBuilder[Self <: PlusPaymentIAPProductInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductIdentifier(value: String): Self = StObject.set(x, "productIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdentifierUndefined: Self = StObject.set(x, "productIdentifier", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
