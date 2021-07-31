package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdownloadImage
  extends StObject
     with BaseParams {
  
  // 需要下载的图片的服务器端ID，由uploadImage接口获得
  var isShowProgressTips: Double
  
  var serverId: String
  
  // 默认为1，显示进度提示
  // 返回图片下载后的本地ID
  @JSName("success")
  def success_MIdownloadImage(res: Resouce): Unit
}
object IdownloadImage {
  
  @scala.inline
  def apply(isShowProgressTips: Double, serverId: String, success: Resouce => Unit): IdownloadImage = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IdownloadImage]
  }
  
  @scala.inline
  implicit class IdownloadImageMutableBuilder[Self <: IdownloadImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsShowProgressTips(value: Double): Self = StObject.set(x, "isShowProgressTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Resouce => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
