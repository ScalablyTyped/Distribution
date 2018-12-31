package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapEventType extends js.Object {
  var boxzoomcancel: MapBoxZoomEvent
  var boxzoomend: MapBoxZoomEvent
  var boxzoomstart: MapBoxZoomEvent
  var click: MapMouseEvent
  var contextmenu: MapMouseEvent
  var data: MapDataEvent
  var dataloading: MapDataEvent
  var dblclick: MapMouseEvent
  var drag: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var dragend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var dragstart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var error: ErrorEvent
  var load: MapboxEvent[js.UndefOr[scala.Nothing]]
  var mousedown: MapMouseEvent
  var mousemove: MapMouseEvent
  var mouseout: MapMouseEvent
  var mouseover: MapMouseEvent
  var mouseup: MapMouseEvent
  var move: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
  var moveend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
  var movestart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
  var pitch: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var pitchend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var pitchstart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var remove: MapboxEvent[js.UndefOr[scala.Nothing]]
  var render: MapboxEvent[js.UndefOr[scala.Nothing]]
  var resize: MapboxEvent[js.UndefOr[scala.Nothing]]
  var rotate: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var rotateend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var rotatestart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]
  var sourcedata: MapSourceDataEvent
  var sourcedataloading: MapSourceDataEvent
  var styledata: MapStyleDataEvent
  var styledataloading: MapStyleDataEvent
  var tiledataloading: MapDataEvent
  var touchcancel: MapTouchEvent
  var touchend: MapTouchEvent
  var touchmove: MapTouchEvent
  var touchstart: MapTouchEvent
  var webglcontextlost: MapContextEvent
  var webglcontextrestored: MapContextEvent
  var wheel: MapWheelEvent
  var zoom: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
  var zoomend: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
  var zoomstart: MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]
}

