package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonVoicePlayEnd
  extends StObject
     with BaseParams {
  
  @JSName("success")
  def success_MIonVoicePlayEnd(res: Resouce): Unit
}
object IonVoicePlayEnd {
  
  inline def apply(success: Resouce => Unit): IonVoicePlayEnd = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IonVoicePlayEnd]
  }
  
  extension [Self <: IonVoicePlayEnd](x: Self) {
    
    inline def setSuccess(value: Resouce => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
