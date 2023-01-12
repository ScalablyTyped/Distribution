package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofGrid extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Grid
  
  /* static member */
  var fn: Grid
}
object TypeofGrid {
  
  inline def apply(extend: js.Object => Grid, fn: Grid): TypeofGrid = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGrid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofGrid] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Grid): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Grid): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
