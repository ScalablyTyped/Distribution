package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapResultCell extends StObject {
  
  /**
    * Returns the position of the cell when cells are iterated row by row.
    *
    * @param value
    */
  def cellOrdinal(value: js.Object): Double = js.native
  
  /**
    * Returns a key value map of the cell's properties. Currently only 'Value' and 'FmtValue' properties are available.
    *
    * @param value
    */
  def properties(value: js.Object): js.Object = js.native
}
object OlapResultCell {
  
  @scala.inline
  def apply(cellOrdinal: js.Object => Double, properties: js.Object => js.Object): OlapResultCell = {
    val __obj = js.Dynamic.literal(cellOrdinal = js.Any.fromFunction1(cellOrdinal), properties = js.Any.fromFunction1(properties))
    __obj.asInstanceOf[OlapResultCell]
  }
  
  @scala.inline
  implicit class OlapResultCellMutableBuilder[Self <: OlapResultCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellOrdinal(value: js.Object => Double): Self = StObject.set(x, "cellOrdinal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProperties(value: js.Object => js.Object): Self = StObject.set(x, "properties", js.Any.fromFunction1(value))
  }
}
