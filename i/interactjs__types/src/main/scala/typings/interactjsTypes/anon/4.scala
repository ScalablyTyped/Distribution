package typings.interactjsTypes.anon

import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.interactjsTypesStrings.reflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[T /* <: ActionName | Null */] extends StObject {
  
  var iEvent: js.UndefOr[InteractEvent[T, reflow]] = js.undefined
}
object `4` {
  
  inline def apply[T /* <: ActionName | Null */](): `4`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`[?], T /* <: ActionName | Null */] (val x: Self & `4`[T]) extends AnyVal {
    
    inline def setIEvent(value: InteractEvent[T, reflow]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setIEventUndefined: Self = StObject.set(x, "iEvent", js.undefined)
  }
}
