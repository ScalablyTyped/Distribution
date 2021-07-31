package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapTableViewHeaderCell extends StObject {
  
  /**
    * Returns the name of the axis this header cell is related to.
    */
  def axisName(): String
  
  /**
    * Returns the caption for the header cell.
    */
  def caption(): String
  
  /**
    * Returns the column index for the header cell.
    */
  def columnIndex(): Double
  
  /**
    * Returns the column span for the header cell.
    */
  def columnSpan(): Double
  
  /**
    * Indicates whether the header cell can be expanded.
    */
  def isExpanable(): Boolean
  
  /**
    * Returns the expaned state for the header cell.
    */
  def isExpanded(): Boolean
  
  /**
    * Returns the index of the axis member in the tuple this header cell is related to.
    */
  def memberIndex(): Double
  
  /**
    * Returns the row index for the header cell.
    */
  def rowIndex(): Double
  
  /**
    * Returns the row span for the header cell.
    */
  def rowSpan(): Double
  
  /**
    * Returns the index of tuple in the axis this header cell is related to.
    */
  def tupleIndex(): Double
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
  implicit class OlapTableViewHeaderCellMutableBuilder[Self <: OlapTableViewHeaderCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisName(value: () => String): Self = StObject.set(x, "axisName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCaption(value: () => String): Self = StObject.set(x, "caption", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColumnIndex(value: () => Double): Self = StObject.set(x, "columnIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColumnSpan(value: () => Double): Self = StObject.set(x, "columnSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExpanable(value: () => Boolean): Self = StObject.set(x, "isExpanable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExpanded(value: () => Boolean): Self = StObject.set(x, "isExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMemberIndex(value: () => Double): Self = StObject.set(x, "memberIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowIndex(value: () => Double): Self = StObject.set(x, "rowIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowSpan(value: () => Double): Self = StObject.set(x, "rowSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTupleIndex(value: () => Double): Self = StObject.set(x, "tupleIndex", js.Any.fromFunction0(value))
  }
}
