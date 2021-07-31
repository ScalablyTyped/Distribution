package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IAP商品对象
  * 描述IAP商品详细信息，如标识、价格、标题、描述信息等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
trait PlusPaymentIAPProduct extends StObject {
  
  /**
    * 商品的描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * 商品的价格
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var price: js.UndefOr[String] = js.undefined
  
  /**
    * 商品的标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var productid: js.UndefOr[String] = js.undefined
  
  /**
    * 商品标题
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var title: js.UndefOr[String] = js.undefined
}
object PlusPaymentIAPProduct {
  
  @scala.inline
  def apply(): PlusPaymentIAPProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPaymentIAPProduct]
  }
  
  @scala.inline
  implicit class PlusPaymentIAPProductMutableBuilder[Self <: PlusPaymentIAPProduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setProductid(value: String): Self = StObject.set(x, "productid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductidUndefined: Self = StObject.set(x, "productid", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
