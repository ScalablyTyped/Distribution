package typings.igniteUi.global.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Infragistics.OlapTableViewResultCell")
@js.native
class OlapTableViewResultCell ()
  extends StObject
     with typings.igniteUi.Infragistics.OlapTableViewResultCell {
  
  /**
    * Returns the ordinal of this cell used to determine its position into the data cells' grid.
    */
  /* CompleteClass */
  override def cellOrdinal(): Double = js.native
  
  /**
    * Returns the formmated value to be displayed by the data cell.
    */
  /* CompleteClass */
  override def formattedValue(): String = js.native
  
  /**
    * Returns the index of $.ig.Cell object in $.ig.OlapResult object.
    */
  /* CompleteClass */
  override def resultCellIndex(): Double = js.native
  
  /**
    * Returns the value provided by $.ig.Cell object.
    */
  /* CompleteClass */
  override def value(): js.Object = js.native
}
