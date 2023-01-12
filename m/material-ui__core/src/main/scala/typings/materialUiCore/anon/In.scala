package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait In extends StObject {
  
  var in: Boolean
  
  def onEnter(): js.Object
  
  def onExited(): js.Object
}
object In {
  
  inline def apply(in: Boolean, onEnter: () => js.Object, onExited: () => js.Object): In = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], onEnter = js.Any.fromFunction0(onEnter), onExited = js.Any.fromFunction0(onExited))
    __obj.asInstanceOf[In]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: In] (val x: Self) extends AnyVal {
    
    inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setOnEnter(value: () => js.Object): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
    
    inline def setOnExited(value: () => js.Object): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
  }
}
