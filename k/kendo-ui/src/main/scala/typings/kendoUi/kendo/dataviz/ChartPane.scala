package typings.kendoUi.kendo.dataviz

import typings.kendoUi.kendo.Observable
import typings.kendoUi.kendo.drawing.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartPane extends Observable {
  
  var chartsVisual: Group = js.native
  
  def findAxisByName(name: String): ChartAxis = js.native
  
  var options: ChartPaneOptions = js.native
  
  def series(): js.Any = js.native
  
  var visual: Group = js.native
}
