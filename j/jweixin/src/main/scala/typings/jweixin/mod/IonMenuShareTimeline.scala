package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonMenuShareTimeline
  extends StObject
     with BaseParams {
  
  // 用户取消分享后执行的回调函数
  def cancel(): Unit
  
  // 分享链接
  var imgUrl: String
  
  // 分享标题
  var link: String
  
  // 分享图标
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareTimeline(): Unit
  
  var title: String
}
object IonMenuShareTimeline {
  
  inline def apply(cancel: () => Unit, imgUrl: String, link: String, success: () => Unit, title: String): IonMenuShareTimeline = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], success = js.Any.fromFunction0(success), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenuShareTimeline]
  }
  
  extension [Self <: IonMenuShareTimeline](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setImgUrl(value: String): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
