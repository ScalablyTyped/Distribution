package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapTableViewResultCell extends js.Object {
  
  /**
    * Returns the ordinal of this cell used to determine its position into the data cells' grid.
    */
  def cellOrdinal(): Double = js.native
  
  /**
    * Returns the formmated value to be displayed by the data cell.
    */
  def formattedValue(): String = js.native
  
  /**
    * Returns the index of $.ig.Cell object in $.ig.OlapResult object.
    */
  def resultCellIndex(): Double = js.native
  
  /**
    * Returns the value provided by $.ig.Cell object.
    */
  def value(): js.Object = js.native
}
object OlapTableViewResultCell {
  
  @scala.inline
  def apply(
    cellOrdinal: () => Double,
    formattedValue: () => String,
    resultCellIndex: () => Double,
    value: () => js.Object
  ): OlapTableViewResultCell = {
    val __obj = js.Dynamic.literal(cellOrdinal = js.Any.fromFunction0(cellOrdinal), formattedValue = js.Any.fromFunction0(formattedValue), resultCellIndex = js.Any.fromFunction0(resultCellIndex), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[OlapTableViewResultCell]
  }
  
  @scala.inline
  implicit class OlapTableViewResultCellOps[Self <: OlapTableViewResultCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellOrdinal(value: () => Double): Self = this.set("cellOrdinal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormattedValue(value: () => String): Self = this.set("formattedValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResultCellIndex(value: () => Double): Self = this.set("resultCellIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: () => js.Object): Self = this.set("value", js.Any.fromFunction0(value))
  }
}
