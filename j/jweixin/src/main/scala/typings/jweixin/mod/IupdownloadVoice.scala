package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IupdownloadVoice
  extends StObject
     with BaseParams {
  
  // 需要上传的音频的本地ID，由stopRecord接口获得
  var isShowProgressTips: Double
  
  var localId: String
  
  // 默认为1，显示进度提示
  @JSName("success")
  def success_MIupdownloadVoice(res: Resouce): Unit
}
object IupdownloadVoice {
  
  @scala.inline
  def apply(isShowProgressTips: Double, localId: String, success: Resouce => Unit): IupdownloadVoice = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IupdownloadVoice]
  }
  
  @scala.inline
  implicit class IupdownloadVoiceMutableBuilder[Self <: IupdownloadVoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsShowProgressTips(value: Double): Self = StObject.set(x, "isShowProgressTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Resouce => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
