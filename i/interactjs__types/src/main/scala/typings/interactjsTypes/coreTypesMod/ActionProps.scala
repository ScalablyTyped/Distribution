package typings.interactjsTypes.coreTypesMod

import typings.interactjsTypes.interactjsTypesStrings.x
import typings.interactjsTypes.interactjsTypesStrings.xy
import typings.interactjsTypes.interactjsTypesStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionProps[T /* <: ActionName | Null */] extends StObject {
  
  var axis: js.UndefOr[x | y | xy | Null] = js.undefined
  
  var edges: js.UndefOr[EdgeOptions | Null] = js.undefined
  
  var name: T
}
object ActionProps {
  
  inline def apply[T /* <: ActionName | Null */](name: T): ActionProps[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionProps[?], T /* <: ActionName | Null */] (val x: Self & ActionProps[T]) extends AnyVal {
    
    inline def setAxis(value: typings.interactjsTypes.interactjsTypesStrings.x | y | xy): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisNull: Self = StObject.set(x, "axis", null)
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setEdges(value: EdgeOptions): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesNull: Self = StObject.set(x, "edges", null)
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
