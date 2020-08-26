package typings.leafletDraw.mod.Draw

import org.scalablytyped.runtime.StringDictionary
import typings.leafletDraw.leafletDrawStrings.drawColoncreated
import typings.leafletDraw.leafletDrawStrings.drawColondeleted
import typings.leafletDraw.leafletDrawStrings.drawColondeletestart
import typings.leafletDraw.leafletDrawStrings.drawColondeletestop
import typings.leafletDraw.leafletDrawStrings.drawColondrawstart
import typings.leafletDraw.leafletDrawStrings.drawColondrawstop
import typings.leafletDraw.leafletDrawStrings.drawColondrawvertex
import typings.leafletDraw.leafletDrawStrings.drawColonedited
import typings.leafletDraw.leafletDrawStrings.drawColoneditmove
import typings.leafletDraw.leafletDrawStrings.drawColoneditresize
import typings.leafletDraw.leafletDrawStrings.drawColoneditstart
import typings.leafletDraw.leafletDrawStrings.drawColoneditstop
import typings.leafletDraw.leafletDrawStrings.drawColoneditvertex
import typings.leafletDraw.leafletDrawStrings.drawColonmarkercontext
import typings.leafletDraw.leafletDrawStrings.drawColontoolbarclosed
import typings.leafletDraw.leafletDrawStrings.drawColontoolbaropened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventHandlers to be used in looping over all events
  *
  * @example
  * for (const key in eventHandlers) { map.off(eventHandlers[key], LeafletFn); }
  */
@js.native
trait EventHandlers extends // Requires an index signature of type string to be properly useful
/* key */ StringDictionary[String] {
  var onCreated: drawColoncreated = js.native
  var onDeleteStart: drawColondeletestart = js.native
  var onDeleteStop: drawColondeletestop = js.native
  var onDeleted: drawColondeleted = js.native
  var onDrawStart: drawColondrawstart = js.native
  var onDrawStop: drawColondrawstop = js.native
  var onDrawVertex: drawColondrawvertex = js.native
  var onEditMove: drawColoneditmove = js.native
  var onEditResize: drawColoneditresize = js.native
  var onEditStart: drawColoneditstart = js.native
  var onEditStop: drawColoneditstop = js.native
  var onEditVertex: drawColoneditvertex = js.native
  var onEdited: drawColonedited = js.native
  var onMarkerContext: drawColonmarkercontext = js.native
  var onToolbarClosed: drawColontoolbarclosed = js.native
  var onToolbarOpened: drawColontoolbaropened = js.native
}

object EventHandlers {
  @scala.inline
  def apply(
    onCreated: drawColoncreated,
    onDeleteStart: drawColondeletestart,
    onDeleteStop: drawColondeletestop,
    onDeleted: drawColondeleted,
    onDrawStart: drawColondrawstart,
    onDrawStop: drawColondrawstop,
    onDrawVertex: drawColondrawvertex,
    onEditMove: drawColoneditmove,
    onEditResize: drawColoneditresize,
    onEditStart: drawColoneditstart,
    onEditStop: drawColoneditstop,
    onEditVertex: drawColoneditvertex,
    onEdited: drawColonedited,
    onMarkerContext: drawColonmarkercontext,
    onToolbarClosed: drawColontoolbarclosed,
    onToolbarOpened: drawColontoolbaropened
  ): EventHandlers = {
    val __obj = js.Dynamic.literal(onCreated = onCreated.asInstanceOf[js.Any], onDeleteStart = onDeleteStart.asInstanceOf[js.Any], onDeleteStop = onDeleteStop.asInstanceOf[js.Any], onDeleted = onDeleted.asInstanceOf[js.Any], onDrawStart = onDrawStart.asInstanceOf[js.Any], onDrawStop = onDrawStop.asInstanceOf[js.Any], onDrawVertex = onDrawVertex.asInstanceOf[js.Any], onEditMove = onEditMove.asInstanceOf[js.Any], onEditResize = onEditResize.asInstanceOf[js.Any], onEditStart = onEditStart.asInstanceOf[js.Any], onEditStop = onEditStop.asInstanceOf[js.Any], onEditVertex = onEditVertex.asInstanceOf[js.Any], onEdited = onEdited.asInstanceOf[js.Any], onMarkerContext = onMarkerContext.asInstanceOf[js.Any], onToolbarClosed = onToolbarClosed.asInstanceOf[js.Any], onToolbarOpened = onToolbarOpened.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHandlers]
  }
  @scala.inline
  implicit class EventHandlersOps[Self <: EventHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnCreated(value: drawColoncreated): Self = this.set("onCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDeleteStart(value: drawColondeletestart): Self = this.set("onDeleteStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDeleteStop(value: drawColondeletestop): Self = this.set("onDeleteStop", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDeleted(value: drawColondeleted): Self = this.set("onDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDrawStart(value: drawColondrawstart): Self = this.set("onDrawStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDrawStop(value: drawColondrawstop): Self = this.set("onDrawStop", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDrawVertex(value: drawColondrawvertex): Self = this.set("onDrawVertex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEditMove(value: drawColoneditmove): Self = this.set("onEditMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEditResize(value: drawColoneditresize): Self = this.set("onEditResize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEditStart(value: drawColoneditstart): Self = this.set("onEditStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEditStop(value: drawColoneditstop): Self = this.set("onEditStop", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEditVertex(value: drawColoneditvertex): Self = this.set("onEditVertex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEdited(value: drawColonedited): Self = this.set("onEdited", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMarkerContext(value: drawColonmarkercontext): Self = this.set("onMarkerContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnToolbarClosed(value: drawColontoolbarclosed): Self = this.set("onToolbarClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnToolbarOpened(value: drawColontoolbaropened): Self = this.set("onToolbarOpened", value.asInstanceOf[js.Any])
  }
  
}

