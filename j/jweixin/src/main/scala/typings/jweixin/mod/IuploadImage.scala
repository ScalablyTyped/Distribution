package typings.jweixin.mod

import typings.jweixin.anon.ServerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IuploadImage
  extends StObject
     with BaseParams {
  
  // 需要上传的图片的本地ID，由chooseImage接口获得
  var isShowProgressTips: Double
  
  var localId: String
  
  // 默认为1，显示进度提示
  // 返回图片的服务器端ID
  @JSName("success")
  def success_MIuploadImage(res: ServerId): Unit
}
object IuploadImage {
  
  @scala.inline
  def apply(isShowProgressTips: Double, localId: String, success: ServerId => Unit): IuploadImage = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IuploadImage]
  }
  
  @scala.inline
  implicit class IuploadImageMutableBuilder[Self <: IuploadImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsShowProgressTips(value: Double): Self = StObject.set(x, "isShowProgressTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: ServerId => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
