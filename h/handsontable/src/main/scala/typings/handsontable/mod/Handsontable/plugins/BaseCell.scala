package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseCell extends StObject {
  
  var columnAbsolute: Boolean = js.native
  
  var columnOffset: Double = js.native
  
  def isEqual(cell: BaseCell): Boolean = js.native
  
  var rowAbsolute: Boolean = js.native
  
  var rowOffset: Double = js.native
  
  def translateTo(rowOffset: Double, columnOffset: Double): Unit = js.native
}
object BaseCell {
  
  @scala.inline
  def apply(
    columnAbsolute: Boolean,
    columnOffset: Double,
    isEqual: BaseCell => Boolean,
    rowAbsolute: Boolean,
    rowOffset: Double,
    translateTo: (Double, Double) => Unit
  ): BaseCell = {
    val __obj = js.Dynamic.literal(columnAbsolute = columnAbsolute.asInstanceOf[js.Any], columnOffset = columnOffset.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), rowAbsolute = rowAbsolute.asInstanceOf[js.Any], rowOffset = rowOffset.asInstanceOf[js.Any], translateTo = js.Any.fromFunction2(translateTo))
    __obj.asInstanceOf[BaseCell]
  }
  
  @scala.inline
  implicit class BaseCellMutableBuilder[Self <: BaseCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnAbsolute(value: Boolean): Self = StObject.set(x, "columnAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOffset(value: Double): Self = StObject.set(x, "columnOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEqual(value: BaseCell => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowAbsolute(value: Boolean): Self = StObject.set(x, "rowAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowOffset(value: Double): Self = StObject.set(x, "rowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateTo(value: (Double, Double) => Unit): Self = StObject.set(x, "translateTo", js.Any.fromFunction2(value))
  }
}
