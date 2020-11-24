package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryEventObject
import typings.kendoUi.kendo.dataviz.map.Extent
import typings.kendoUi.kendo.dataviz.map.Location
import typings.kendoUi.kendo.geometry.Point
import typings.kendoUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map extends Widget {
  
  def center(): Location = js.native
  def center(center: js.Any): Unit = js.native
  def center(center: Location): Unit = js.native
  
  def eventOffset(e: js.Any): Point = js.native
  def eventOffset(e: JQueryEventObject): Point = js.native
  
  def eventToLayer(e: js.Any): Point = js.native
  def eventToLayer(e: JQueryEventObject): Point = js.native
  
  def eventToLocation(e: js.Any): Point = js.native
  def eventToLocation(e: JQueryEventObject): Point = js.native
  
  def eventToView(e: js.Any): Point = js.native
  def eventToView(e: JQueryEventObject): Point = js.native
  
  def extent(): Extent = js.native
  def extent(extent: Extent): Unit = js.native
  
  def layerToLocation(point: js.Any, zoom: Double): Location = js.native
  def layerToLocation(point: Point, zoom: Double): Location = js.native
  
  var layers: js.Any = js.native
  
  def locationToLayer(location: js.Any, zoom: Double): Point = js.native
  def locationToLayer(location: Location, zoom: Double): Point = js.native
  
  def locationToView(location: js.Any): Point = js.native
  def locationToView(location: Location): Point = js.native
  
  @JSName("options")
  var options_Map: MapOptions = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  def viewSize(): js.Any = js.native
  
  def viewToLocation(point: js.Any, zoom: Double): Location = js.native
  def viewToLocation(point: Point, zoom: Double): Location = js.native
  
  var wrapper: JQuery = js.native
  
  def zoom(): Double = js.native
  def zoom(level: Double): Unit = js.native
}
