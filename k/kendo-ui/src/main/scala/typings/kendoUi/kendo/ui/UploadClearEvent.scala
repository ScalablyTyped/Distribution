package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadClearEvent
  extends StObject
     with UploadEvent {
  
  var e: js.UndefOr[js.Any] = js.undefined
}
object UploadClearEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Upload): UploadClearEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadClearEvent]
  }
  
  @scala.inline
  implicit class UploadClearEventMutableBuilder[Self <: UploadClearEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEUndefined: Self = StObject.set(x, "e", js.undefined)
  }
}
