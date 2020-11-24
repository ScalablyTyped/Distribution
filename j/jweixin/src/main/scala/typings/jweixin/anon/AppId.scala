package typings.jweixin.anon

import typings.jweixin.mod.ApiMethod
import typings.jweixin.mod.jsApiList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppId extends js.Object {
  
   // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
  var appId: String = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
   // 必填，签名，见附录1
  var jsApiList: typings.jweixin.mod.jsApiList = js.native
  
   // 必填，生成签名的时间戳
  var nonceStr: String = js.native
  
   // 必填，生成签名的随机串
  var signature: String = js.native
  
   // 必填，公众号的唯一标识
  var timestamp: Double = js.native
}
object AppId {
  
  @scala.inline
  def apply(appId: String, jsApiList: jsApiList, nonceStr: String, signature: String, timestamp: Double): AppId = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], jsApiList = jsApiList.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppId]
  }
  
  @scala.inline
  implicit class AppIdOps[Self <: AppId] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsApiListVarargs(value: ApiMethod*): Self = this.set("jsApiList", js.Array(value :_*))
    
    @scala.inline
    def setJsApiList(value: jsApiList): Self = this.set("jsApiList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceStr(value: String): Self = this.set("nonceStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
  }
}
