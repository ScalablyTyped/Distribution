package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 分享服务标识
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
trait PlusShareShareServerIdentity extends StObject {
  
  /**
    * 新浪微博
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var sinaweibo: js.UndefOr[String] = js.undefined
  
  /**
    * 腾讯微博
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var tencentweibo: js.UndefOr[String] = js.undefined
  
  /**
    * 微信
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var weixin: js.UndefOr[String] = js.undefined
}
object PlusShareShareServerIdentity {
  
  @scala.inline
  def apply(): PlusShareShareServerIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusShareShareServerIdentity]
  }
  
  @scala.inline
  implicit class PlusShareShareServerIdentityMutableBuilder[Self <: PlusShareShareServerIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSinaweibo(value: String): Self = StObject.set(x, "sinaweibo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinaweiboUndefined: Self = StObject.set(x, "sinaweibo", js.undefined)
    
    @scala.inline
    def setTencentweibo(value: String): Self = StObject.set(x, "tencentweibo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTencentweiboUndefined: Self = StObject.set(x, "tencentweibo", js.undefined)
    
    @scala.inline
    def setWeixin(value: String): Self = StObject.set(x, "weixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeixinUndefined: Self = StObject.set(x, "weixin", js.undefined)
  }
}
