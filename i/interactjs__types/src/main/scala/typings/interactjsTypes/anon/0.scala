package typings.interactjsTypes.anon

import typings.interactjsTypes.interactEventMod.InteractEvent
import typings.interactjsTypes.interactjsTypesStrings.move
import typings.interactjsTypes.typesMod.ActionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[T /* <: ActionName | Null */] extends StObject {
  
  var iEvent: js.UndefOr[InteractEvent[T, move]] = js.undefined
}
object `0` {
  
  inline def apply[T /* <: ActionName | Null */](): `0`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[T]]
  }
  
  extension [Self <: `0`[?], T /* <: ActionName | Null */](x: Self & `0`[T]) {
    
    inline def setIEvent(value: InteractEvent[T, move]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setIEventUndefined: Self = StObject.set(x, "iEvent", js.undefined)
  }
}
