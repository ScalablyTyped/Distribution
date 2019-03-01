package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerEventType extends js.Object {
  var click: MapLayerMouseEvent
  var contextmenu: MapLayerMouseEvent
  var dblclick: MapLayerMouseEvent
  var mousedown: MapLayerMouseEvent
  var mouseenter: MapLayerMouseEvent
  var mouseleave: MapLayerMouseEvent
  var mousemove: MapLayerMouseEvent
  var mouseout: MapLayerMouseEvent
  var mouseover: MapLayerMouseEvent
  var mouseup: MapLayerMouseEvent
  var touchcancel: MapLayerTouchEvent
  var touchend: MapLayerTouchEvent
  var touchstart: MapLayerTouchEvent
}

object MapLayerEventType {
  @scala.inline
  def apply(
    click: MapLayerMouseEvent,
    contextmenu: MapLayerMouseEvent,
    dblclick: MapLayerMouseEvent,
    mousedown: MapLayerMouseEvent,
    mouseenter: MapLayerMouseEvent,
    mouseleave: MapLayerMouseEvent,
    mousemove: MapLayerMouseEvent,
    mouseout: MapLayerMouseEvent,
    mouseover: MapLayerMouseEvent,
    mouseup: MapLayerMouseEvent,
    touchcancel: MapLayerTouchEvent,
    touchend: MapLayerTouchEvent,
    touchstart: MapLayerTouchEvent
  ): MapLayerEventType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("contextmenu")(contextmenu)
    __obj.updateDynamic("dblclick")(dblclick)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mouseenter")(mouseenter)
    __obj.updateDynamic("mouseleave")(mouseleave)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("mouseout")(mouseout)
    __obj.updateDynamic("mouseover")(mouseover)
    __obj.updateDynamic("mouseup")(mouseup)
    __obj.updateDynamic("touchcancel")(touchcancel)
    __obj.updateDynamic("touchend")(touchend)
    __obj.updateDynamic("touchstart")(touchstart)
    __obj.asInstanceOf[MapLayerEventType]
  }
}

