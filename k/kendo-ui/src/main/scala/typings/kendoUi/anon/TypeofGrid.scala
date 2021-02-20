package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGrid extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Grid = js.native
  
  /* static member */
  var fn: Grid = js.native
}
object TypeofGrid {
  
  @scala.inline
  def apply(extend: js.Object => Grid, fn: Grid): TypeofGrid = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGrid]
  }
  
  @scala.inline
  implicit class TypeofGridMutableBuilder[Self <: TypeofGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Grid): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Grid): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
