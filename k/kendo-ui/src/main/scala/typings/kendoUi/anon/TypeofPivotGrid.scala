package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.PivotGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotGrid extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PivotGrid
  
  /* static member */
  var fn: PivotGrid
}
object TypeofPivotGrid {
  
  @scala.inline
  def apply(extend: js.Object => PivotGrid, fn: PivotGrid): TypeofPivotGrid = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotGrid]
  }
  
  @scala.inline
  implicit class TypeofPivotGridMutableBuilder[Self <: TypeofPivotGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => PivotGrid): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: PivotGrid): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
