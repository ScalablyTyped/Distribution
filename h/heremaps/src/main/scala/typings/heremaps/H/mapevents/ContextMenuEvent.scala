package typings.heremaps.H.mapevents

import typings.heremaps.H.util.ContextItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContextMenuEvent should be fired, when a user right-clicks or longpresses on a map object.
  * @property viewportX {Array<H.util.ContextItem>} - Contains ContextItems, that will be used to create context menu entries. Should be filled by listeners of the "contextmenu" event
  * @property viewportY {number} - Map viewport y position
  * @property target {(H.map.Object | H.Map)} - Target for the event
  * @property originalEvent {Event} - Original event
  * @property currentTarget {(H.map.Object | H.Map)} - Object which has listener attached
  * @property type {string} - Name of the dispatched event
  * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
  */
@js.native
trait ContextMenuEvent
  extends typings.heremaps.H.util.Event {
  
  var originalEvent: Event = js.native
  
  var viewportX: js.Array[ContextItem] = js.native
  
  var viewportY: Double = js.native
}
object ContextMenuEvent {
  
  @scala.inline
  def apply(
    currentTarget: js.Any,
    defaultPrevented: Boolean,
    originalEvent: Event,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: js.Any,
    `type`: String,
    viewportX: js.Array[ContextItem],
    viewportY: Double
  ): ContextMenuEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], viewportX = viewportX.asInstanceOf[js.Any], viewportY = viewportY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuEvent]
  }
  
  @scala.inline
  implicit class ContextMenuEventOps[Self <: ContextMenuEvent] (val x: Self) extends AnyVal {
    
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
    def setOriginalEvent(value: Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportXVarargs(value: ContextItem*): Self = this.set("viewportX", js.Array(value :_*))
    
    @scala.inline
    def setViewportX(value: js.Array[ContextItem]): Self = this.set("viewportX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportY(value: Double): Self = this.set("viewportY", value.asInstanceOf[js.Any])
  }
}
