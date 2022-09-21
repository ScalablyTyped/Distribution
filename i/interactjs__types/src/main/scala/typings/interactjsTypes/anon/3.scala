package typings.interactjsTypes.anon

import typings.interactjsTypes.interactEventMod.InteractEvent
import typings.interactjsTypes.interactjsTypesStrings.inertiastart
import typings.interactjsTypes.typesMod.ActionName
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
  
  extension [Self <: `3`[?], T /* <: ActionName | Null */](x: Self & `3`[T]) {
    
    inline def setIEvent(value: InteractEvent[T, inertiastart]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setIEventUndefined: Self = StObject.set(x, "iEvent", js.undefined)
  }
}
