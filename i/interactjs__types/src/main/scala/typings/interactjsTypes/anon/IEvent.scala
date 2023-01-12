package typings.interactjsTypes.anon

import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.interactjsTypesStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvent[T /* <: ActionName | Null */] extends StObject {
  
  var iEvent: js.UndefOr[InteractEvent[T, start]] = js.undefined
}
object IEvent {
  
  inline def apply[T /* <: ActionName | Null */](): IEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEvent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEvent[?], T /* <: ActionName | Null */] (val x: Self & IEvent[T]) extends AnyVal {
    
    inline def setIEvent(value: InteractEvent[T, start]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setIEventUndefined: Self = StObject.set(x, "iEvent", js.undefined)
  }
}
