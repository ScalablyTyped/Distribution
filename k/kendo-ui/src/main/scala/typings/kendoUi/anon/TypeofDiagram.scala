package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.Diagram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDiagram extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Diagram = js.native
  
  /* static member */
  var fn: Diagram = js.native
}
object TypeofDiagram {
  
  @scala.inline
  def apply(extend: js.Object => Diagram, fn: Diagram): TypeofDiagram = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDiagram]
  }
  
  @scala.inline
  implicit class TypeofDiagramMutableBuilder[Self <: TypeofDiagram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Diagram): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Diagram): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
