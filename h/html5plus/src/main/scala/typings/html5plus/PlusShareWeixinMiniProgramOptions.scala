package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，微信小程序信息
  * 用于配置分享小程序的参数，如小程序标识、页面路径等。
  *     注意：分享的小程序需要在微信开放平台关联的开发者账号下，否则会分享失败。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
@js.native
trait PlusShareWeixinMiniProgramOptions extends js.Object {
  
  /**
    * 微信小程序ID
    * 注意：是微信小程序的原始ID（"g_"开头的字符串）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 微信小程序打开的页面路径
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * 微信小程序版本类型
    * 可取值：
    *     0-正式版；
    *     1-测试版；
    *     2-体验版。
    *     默认值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var `type`: js.UndefOr[Double] = js.native
  
  /**
    * 兼容低版本的网页链接
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var webUrl: js.UndefOr[String] = js.native
}
object PlusShareWeixinMiniProgramOptions {
  
  @scala.inline
  def apply(): PlusShareWeixinMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusShareWeixinMiniProgramOptions]
  }
  
  @scala.inline
  implicit class PlusShareWeixinMiniProgramOptionsOps[Self <: PlusShareWeixinMiniProgramOptions] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWebUrl(value: String): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
}
