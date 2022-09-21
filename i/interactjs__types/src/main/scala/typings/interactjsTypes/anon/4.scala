package typings.interactjsTypes.anon

import typings.interactjsTypes.interactEventMod.InteractEvent
import typings.interactjsTypes.interactjsTypesStrings.reflow
import typings.interactjsTypes.typesMod.ActionName
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
  
  extension [Self <: `4`[?], T /* <: ActionName | Null */](x: Self & `4`[T]) {
    
    inline def setIEvent(value: InteractEvent[T, reflow]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setIEventUndefined: Self = StObject.set(x, "iEvent", js.undefined)
  }
}
