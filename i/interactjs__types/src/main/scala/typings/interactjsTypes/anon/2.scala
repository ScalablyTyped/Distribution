package typings.interactjsTypes.anon

import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.interactjsTypesStrings.resume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[T /* <: ActionName | Null */] extends StObject {
  
  var iEvent: js.UndefOr[InteractEvent[T, resume]] = js.undefined
}
object `2` {
  
  inline def apply[T /* <: ActionName | Null */](): `2`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`[?], T /* <: ActionName | Null */] (val x: Self & `2`[T]) extends AnyVal {
    
    inline def setIEvent(value: InteractEvent[T, resume]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setIEventUndefined: Self = StObject.set(x, "iEvent", js.undefined)
  }
}
