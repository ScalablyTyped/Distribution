package typings.interactjsTypes.anon

import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.interactjsTypesStrings.end
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[T /* <: ActionName | Null */] extends StObject {
  
  var iEvent: js.UndefOr[InteractEvent[T, end]] = js.undefined
}
object `1` {
  
  inline def apply[T /* <: ActionName | Null */](): `1`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[T]]
  }
  
  extension [Self <: `1`[?], T /* <: ActionName | Null */](x: Self & `1`[T]) {
    
    inline def setIEvent(value: InteractEvent[T, end]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setIEventUndefined: Self = StObject.set(x, "iEvent", js.undefined)
  }
}
