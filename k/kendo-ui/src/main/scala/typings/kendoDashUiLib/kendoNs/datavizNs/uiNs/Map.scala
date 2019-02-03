package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.Map")
@js.native
class Map protected ()
  extends kendoDashUiLib.kendoNs.uiNs.Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: MapOptions) = this()
  var layers: js.Any = js.native
  @JSName("options")
  var options_Map: MapOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def center(): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def center(center: js.Any): scala.Unit = js.native
  def center(center: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location): scala.Unit = js.native
  def eventOffset(e: js.Any): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def eventOffset(e: kendoDashUiLib.JQueryEventObject): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def eventToLayer(e: js.Any): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def eventToLayer(e: kendoDashUiLib.JQueryEventObject): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def eventToLocation(e: js.Any): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def eventToLocation(e: kendoDashUiLib.JQueryEventObject): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def eventToView(e: js.Any): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def eventToView(e: kendoDashUiLib.JQueryEventObject): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def extent(): kendoDashUiLib.kendoNs.datavizNs.mapNs.Extent = js.native
  def extent(extent: kendoDashUiLib.kendoNs.datavizNs.mapNs.Extent): scala.Unit = js.native
  def layerToLocation(point: js.Any, zoom: scala.Double): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def layerToLocation(point: kendoDashUiLib.kendoNs.geometryNs.Point, zoom: scala.Double): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def locationToLayer(location: js.Any, zoom: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def locationToLayer(location: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location, zoom: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def locationToView(location: js.Any): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def locationToView(location: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def viewSize(): js.Any = js.native
  def viewToLocation(point: js.Any, zoom: scala.Double): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def viewToLocation(point: kendoDashUiLib.kendoNs.geometryNs.Point, zoom: scala.Double): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def zoom(): scala.Double = js.native
  def zoom(level: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.ui.Map")
@js.native
object Map extends js.Object {
  var fn: kendoDashUiLib.kendoNs.datavizNs.uiNs.Map = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.datavizNs.uiNs.Map = js.native
}

