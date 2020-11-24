package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapTableViewHeaderCell extends js.Object {
  
  /**
    * Returns the name of the axis this header cell is related to.
    */
  def axisName(): String = js.native
  
  /**
    * Returns the caption for the header cell.
    */
  def caption(): String = js.native
  
  /**
    * Returns the column index for the header cell.
    */
  def columnIndex(): Double = js.native
  
  /**
    * Returns the column span for the header cell.
    */
  def columnSpan(): Double = js.native
  
  /**
    * Indicates whether the header cell can be expanded.
    */
  def isExpanable(): Boolean = js.native
  
  /**
    * Returns the expaned state for the header cell.
    */
  def isExpanded(): Boolean = js.native
  
  /**
    * Returns the index of the axis member in the tuple this header cell is related to.
    */
  def memberIndex(): Double = js.native
  
  /**
    * Returns the row index for the header cell.
    */
  def rowIndex(): Double = js.native
  
  /**
    * Returns the row span for the header cell.
    */
  def rowSpan(): Double = js.native
  
  /**
    * Returns the index of tuple in the axis this header cell is related to.
    */
  def tupleIndex(): Double = js.native
}
object OlapTableViewHeaderCell {
  
  @scala.inline
  def apply(
    axisName: () => String,
    caption: () => String,
    columnIndex: () => Double,
    columnSpan: () => Double,
    isExpanable: () => Boolean,
    isExpanded: () => Boolean,
    memberIndex: () => Double,
    rowIndex: () => Double,
    rowSpan: () => Double,
    tupleIndex: () => Double
  ): OlapTableViewHeaderCell = {
    val __obj = js.Dynamic.literal(axisName = js.Any.fromFunction0(axisName), caption = js.Any.fromFunction0(caption), columnIndex = js.Any.fromFunction0(columnIndex), columnSpan = js.Any.fromFunction0(columnSpan), isExpanable = js.Any.fromFunction0(isExpanable), isExpanded = js.Any.fromFunction0(isExpanded), memberIndex = js.Any.fromFunction0(memberIndex), rowIndex = js.Any.fromFunction0(rowIndex), rowSpan = js.Any.fromFunction0(rowSpan), tupleIndex = js.Any.fromFunction0(tupleIndex))
    __obj.asInstanceOf[OlapTableViewHeaderCell]
  }
  
  @scala.inline
  implicit class OlapTableViewHeaderCellOps[Self <: OlapTableViewHeaderCell] (val x: Self) extends AnyVal {
    
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
    def setAxisName(value: () => String): Self = this.set("axisName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCaption(value: () => String): Self = this.set("caption", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColumnIndex(value: () => Double): Self = this.set("columnIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColumnSpan(value: () => Double): Self = this.set("columnSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExpanable(value: () => Boolean): Self = this.set("isExpanable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExpanded(value: () => Boolean): Self = this.set("isExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMemberIndex(value: () => Double): Self = this.set("memberIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowIndex(value: () => Double): Self = this.set("rowIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowSpan(value: () => Double): Self = this.set("rowSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTupleIndex(value: () => Double): Self = this.set("tupleIndex", js.Any.fromFunction0(value))
  }
}
