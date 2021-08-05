package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapTableViewResultCell extends StObject {
  
  /**
    * Returns the ordinal of this cell used to determine its position into the data cells' grid.
    */
  def cellOrdinal(): Double
  
  /**
    * Returns the formmated value to be displayed by the data cell.
    */
  def formattedValue(): String
  
  /**
    * Returns the index of $.ig.Cell object in $.ig.OlapResult object.
    */
  def resultCellIndex(): Double
  
  /**
    * Returns the value provided by $.ig.Cell object.
    */
  def value(): js.Object
}
object OlapTableViewResultCell {
  
  inline def apply(
    cellOrdinal: () => Double,
    formattedValue: () => String,
    resultCellIndex: () => Double,
    value: () => js.Object
  ): OlapTableViewResultCell = {
    val __obj = js.Dynamic.literal(cellOrdinal = js.Any.fromFunction0(cellOrdinal), formattedValue = js.Any.fromFunction0(formattedValue), resultCellIndex = js.Any.fromFunction0(resultCellIndex), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[OlapTableViewResultCell]
  }
  
  extension [Self <: OlapTableViewResultCell](x: Self) {
    
    inline def setCellOrdinal(value: () => Double): Self = StObject.set(x, "cellOrdinal", js.Any.fromFunction0(value))
    
    inline def setFormattedValue(value: () => String): Self = StObject.set(x, "formattedValue", js.Any.fromFunction0(value))
    
    inline def setResultCellIndex(value: () => Double): Self = StObject.set(x, "resultCellIndex", js.Any.fromFunction0(value))
    
    inline def setValue(value: () => js.Object): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
