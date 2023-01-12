package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.Diagram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDiagram extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Diagram
  
  /* static member */
  var fn: Diagram
}
object TypeofDiagram {
  
  inline def apply(extend: js.Object => Diagram, fn: Diagram): TypeofDiagram = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDiagram]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDiagram] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Diagram): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Diagram): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
