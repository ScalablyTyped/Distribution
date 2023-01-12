package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Splitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSplitter extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Splitter
  
  /* static member */
  var fn: Splitter
}
object TypeofSplitter {
  
  inline def apply(extend: js.Object => Splitter, fn: Splitter): TypeofSplitter = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSplitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSplitter] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Splitter): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Splitter): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
