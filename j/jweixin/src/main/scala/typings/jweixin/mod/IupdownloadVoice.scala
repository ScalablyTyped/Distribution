package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IupdownloadVoice extends BaseParams {
  
   // 需要上传的音频的本地ID，由stopRecord接口获得
  var isShowProgressTips: Double = js.native
  
  var localId: String = js.native
  
   // 默认为1，显示进度提示
  @JSName("success")
  def success_MIupdownloadVoice(res: Resouce): Unit = js.native
}
object IupdownloadVoice {
  
  @scala.inline
  def apply(isShowProgressTips: Double, localId: String, success: Resouce => Unit): IupdownloadVoice = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IupdownloadVoice]
  }
  
  @scala.inline
  implicit class IupdownloadVoiceOps[Self <: IupdownloadVoice] (val x: Self) extends AnyVal {
    
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
    def setIsShowProgressTips(value: Double): Self = this.set("isShowProgressTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Resouce => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
