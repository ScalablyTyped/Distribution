package typings.jweixin.mod

import typings.jweixin.jweixinStrings.link
import typings.jweixin.jweixinStrings.music
import typings.jweixin.jweixinStrings.video或link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonMenuShareAppMessage
  extends StObject
     with BaseParams {
  
  // 用户取消分享后执行的回调函数
  def cancel(): Unit
  
  // 分享类型,music、video或link，不填默认为link
  var dataUrl: js.UndefOr[String] = js.undefined
  
  // 分享标题
  var desc: String
  
  // 分享链接
  var imgUrl: String
  
  // 分享描述
  var link: String
  
  // 如果type是music或video，则要提供数据链接，默认为空
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareAppMessage(): Unit
  
  var title: String
  
  // 分享图标
  var `type`: js.UndefOr[music | video或link | link] = js.undefined
}
object IonMenuShareAppMessage {
  
  @scala.inline
  def apply(cancel: () => Unit, desc: String, imgUrl: String, link: String, success: () => Unit, title: String): IonMenuShareAppMessage = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), desc = desc.asInstanceOf[js.Any], imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], success = js.Any.fromFunction0(success), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenuShareAppMessage]
  }
  
  @scala.inline
  implicit class IonMenuShareAppMessageMutableBuilder[Self <: IonMenuShareAppMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUrlUndefined: Self = StObject.set(x, "dataUrl", js.undefined)
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgUrl(value: String): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: music | video或link | link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
