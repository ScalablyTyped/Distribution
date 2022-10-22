package typings.inferno.distCoreTypesMod

import typings.inferno.distCoreTypesMod.Inferno.InfernoNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props[T] extends StObject {
  
  var children: js.UndefOr[InfernoNode] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
  
  var ref: js.UndefOr[Ref[T]] = js.undefined
}
object Props {
  
  inline def apply[T](): Props[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[T]]
  }
  
  extension [Self <: Props[?], T](x: Self & Props[T]) {
    
    inline def setChildren(value: InfernoNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRef(value: /* instance */ T | Null => Any): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
