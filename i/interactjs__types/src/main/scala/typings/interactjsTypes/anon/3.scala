package typings.interactjsTypes.anon

import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.interactjsTypesStrings.inertiastart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[T /* <: ActionName | Null */] extends StObject {
  
  var iEvent: js.UndefOr[InteractEvent[T, inertiastart]] = js.undefined
}
object `3` {
  
  inline def apply[T /* <: ActionName | Null */](): `3`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`[?], T /* <: ActionName | Null */] (val x: Self & `3`[T]) extends AnyVal {
    
    inline def setIEvent(value: InteractEvent[T, inertiastart]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setIEventUndefined: Self = StObject.set(x, "iEvent", js.undefined)
  }
}
