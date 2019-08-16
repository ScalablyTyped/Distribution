package typings.leafletDashDraw.leafletMod.DrawNs

import org.scalablytyped.runtime.StringDictionary
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:created`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:deleted`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:deletestart`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:deletestop`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:drawstart`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:drawstop`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:drawvertex`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:edited`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:editmove`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:editresize`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:editstart`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:editstop`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:editvertex`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:markercontext`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:toolbarclosed`
import typings.leafletDashDraw.leafletDashDrawStrings.`draw:toolbaropened`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventHandlers to be used in looping over all events
  *
  * @example
  * for (const key in eventHandlers) { map.off(eventHandlers[key], LeafletFn); }
  */
trait EventHandlers extends // Requires an index signature of type string to be properly useful
/* key */ StringDictionary[String] {
  var onCreated: `draw:created`
  var onDeleteStart: `draw:deletestart`
  var onDeleteStop: `draw:deletestop`
  var onDeleted: `draw:deleted`
  var onDrawStart: `draw:drawstart`
  var onDrawStop: `draw:drawstop`
  var onDrawVertex: `draw:drawvertex`
  var onEditMove: `draw:editmove`
  var onEditResize: `draw:editresize`
  var onEditStart: `draw:editstart`
  var onEditStop: `draw:editstop`
  var onEditVertex: `draw:editvertex`
  var onEdited: `draw:edited`
  var onMarkerContext: `draw:markercontext`
  var onToolbarClosed: `draw:toolbarclosed`
  var onToolbarOpened: `draw:toolbaropened`
}

object EventHandlers {
  @scala.inline
  def apply(
    onCreated: `draw:created`,
    onDeleteStart: `draw:deletestart`,
    onDeleteStop: `draw:deletestop`,
    onDeleted: `draw:deleted`,
    onDrawStart: `draw:drawstart`,
    onDrawStop: `draw:drawstop`,
    onDrawVertex: `draw:drawvertex`,
    onEditMove: `draw:editmove`,
    onEditResize: `draw:editresize`,
    onEditStart: `draw:editstart`,
    onEditStop: `draw:editstop`,
    onEditVertex: `draw:editvertex`,
    onEdited: `draw:edited`,
    onMarkerContext: `draw:markercontext`,
    onToolbarClosed: `draw:toolbarclosed`,
    onToolbarOpened: `draw:toolbaropened`,
    StringDictionary: // Requires an index signature of type string to be properly useful
  /* key */ StringDictionary[String] = null
  ): EventHandlers = {
    val __obj = js.Dynamic.literal(onCreated = onCreated, onDeleteStart = onDeleteStart, onDeleteStop = onDeleteStop, onDeleted = onDeleted, onDrawStart = onDrawStart, onDrawStop = onDrawStop, onDrawVertex = onDrawVertex, onEditMove = onEditMove, onEditResize = onEditResize, onEditStart = onEditStart, onEditStop = onEditStop, onEditVertex = onEditVertex, onEdited = onEdited, onMarkerContext = onMarkerContext, onToolbarClosed = onToolbarClosed, onToolbarOpened = onToolbarOpened)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EventHandlers]
  }
}

