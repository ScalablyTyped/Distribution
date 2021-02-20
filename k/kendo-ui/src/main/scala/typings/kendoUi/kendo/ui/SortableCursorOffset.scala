package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableCursorOffset extends StObject {
  
  var left: js.UndefOr[Double] = js.native
  
  var top: js.UndefOr[Double] = js.native
}
object SortableCursorOffset {
  
  @scala.inline
  def apply(): SortableCursorOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableCursorOffset]
  }
  
  @scala.inline
  implicit class SortableCursorOffsetMutableBuilder[Self <: SortableCursorOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
