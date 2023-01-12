package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskBoardDeleteCardEvent
  extends StObject
     with TaskBoardEvent {
  
  var card: js.UndefOr[Model] = js.undefined
}
object TaskBoardDeleteCardEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TaskBoard_): TaskBoardDeleteCardEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskBoardDeleteCardEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskBoardDeleteCardEvent] (val x: Self) extends AnyVal {
    
    inline def setCard(value: Model): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}
