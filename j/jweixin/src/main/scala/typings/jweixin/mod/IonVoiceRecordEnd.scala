package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonVoiceRecordEnd
  extends StObject
     with BaseParams {
  
  // 录音时间超过一分钟没有停止的时候会执行 complete 回调
  @JSName("complete")
  def complete_MIonVoiceRecordEnd(res: Resouce): Unit
}
object IonVoiceRecordEnd {
  
  @scala.inline
  def apply(complete: Resouce => Unit): IonVoiceRecordEnd = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[IonVoiceRecordEnd]
  }
  
  @scala.inline
  implicit class IonVoiceRecordEndMutableBuilder[Self <: IonVoiceRecordEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: Resouce => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
