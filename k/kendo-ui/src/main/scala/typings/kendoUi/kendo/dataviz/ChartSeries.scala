package typings.kendoUi.kendo.dataviz

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeries
  extends StObject
     with Observable {
  
  def data(): Any = js.native
  def data(data: Any): Unit = js.native
  
  def findPoint(callback: js.Function): ChartPoint = js.native
  
  var options: ChartSeriesOptions = js.native
  
  def points(): Any = js.native
  def points(filter: js.Function): Unit = js.native
  
  def toggleHighlight(show: Boolean, filter: js.Function): Unit = js.native
  def toggleHighlight(show: Boolean, filter: Any): Unit = js.native
  
  def toggleVisibility(show: Boolean, filter: js.Function): Unit = js.native
}
