package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonVoicePlayEnd extends BaseParams {
  
  @JSName("success")
  def success_MIonVoicePlayEnd(res: Resouce): Unit = js.native
}
object IonVoicePlayEnd {
  
  @scala.inline
  def apply(success: Resouce => Unit): IonVoicePlayEnd = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IonVoicePlayEnd]
  }
  
  @scala.inline
  implicit class IonVoicePlayEndOps[Self <: IonVoicePlayEnd] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: Resouce => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
