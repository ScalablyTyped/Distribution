package typings.kendoUi.kendo.dataviz

import typings.kendoUi.kendo.Observable
import typings.kendoUi.kendo.drawing.Element
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartPoint extends Observable {
  
  var category: String | Date | Double = js.native
  
  var dataItem: js.Any = js.native
  
  var options: ChartPointOptions = js.native
  
  var percentage: Double = js.native
  
  var runningTotal: Double = js.native
  
  var total: Double = js.native
  
  var value: Double = js.native
  
  var visual: Element = js.native
}
