package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
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
  implicit class IonVoicePlayEndMutableBuilder[Self <: IonVoicePlayEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Resouce => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
