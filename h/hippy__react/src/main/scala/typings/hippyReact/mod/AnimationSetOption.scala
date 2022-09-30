package typings.hippyReact.mod

import typings.hippyReact.hippyReactStrings.loop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationSetOption extends StObject {
  
  var children: js.Array[AnimationChild]
  
  var repeatCount: Double | loop
  
  var virtual: js.UndefOr[Any] = js.undefined
}
object AnimationSetOption {
  
  inline def apply(children: js.Array[AnimationChild], repeatCount: Double | loop): AnimationSetOption = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], repeatCount = repeatCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationSetOption]
  }
  
  extension [Self <: AnimationSetOption](x: Self) {
    
    inline def setChildren(value: js.Array[AnimationChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: AnimationChild*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setRepeatCount(value: Double | loop): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    inline def setVirtual(value: Any): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
