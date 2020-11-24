package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoWindowHandlerMap[T /* <: InfoWindow */] extends js.Object {
  
  /**
    * This event is fired when the close button was clicked.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.closeclick Maps JavaScript API}
    * @see {@link InfoWindow#close}
    */
  def closeclick(): Unit = js.native
  
  /**
    * This event is fired when the content property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.content_changed Maps JavaScript API}
    * @see {@link InfoWindowOptions#content}
    * @see {@link InfoWindow#getContent}
    * @see {@link InfoWindow#setContent}
    */
  def content_changed(): Unit = js.native
  
  /**
    * This event is fired when the `<div>` containing the {@link InfoWindow}'s content is attached to the DOM. You
    * may wish to monitor this event if you are building out your info window content dynamically.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.domready Maps JavaScript API}
    */
  def domready(): Unit = js.native
  
  /**
    * This event is fired when the position property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.position_changed Maps JavaScript API}
    * @see {@link InfoWindowOptions#position}
    * @see {@link InfoWindow#getPosition}
    * @see {@link InfoWindow#setPosition}
    */
  def position_changed(): Unit = js.native
  
  /**
    * This event is fired when the InfoWindow's zIndex changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.zindex_changed Maps JavaScript API}
    * @see {@link InfoWindowOptions#zIndex}
    * @see {@link InfoWindow#getZIndex}
    * @see {@link InfoWindow#setZIndex}
    */
  def zindex_changed(): Unit = js.native
}
object InfoWindowHandlerMap {
  
  @scala.inline
  def apply[T /* <: InfoWindow */](
    closeclick: () => Unit,
    content_changed: () => Unit,
    domready: () => Unit,
    position_changed: () => Unit,
    zindex_changed: () => Unit
  ): InfoWindowHandlerMap[T] = {
    val __obj = js.Dynamic.literal(closeclick = js.Any.fromFunction0(closeclick), content_changed = js.Any.fromFunction0(content_changed), domready = js.Any.fromFunction0(domready), position_changed = js.Any.fromFunction0(position_changed), zindex_changed = js.Any.fromFunction0(zindex_changed))
    __obj.asInstanceOf[InfoWindowHandlerMap[T]]
  }
  
  @scala.inline
  implicit class InfoWindowHandlerMapOps[Self <: InfoWindowHandlerMap[_], T /* <: InfoWindow */] (val x: Self with InfoWindowHandlerMap[T]) extends AnyVal {
    
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
    def setCloseclick(value: () => Unit): Self = this.set("closeclick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContent_changed(value: () => Unit): Self = this.set("content_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDomready(value: () => Unit): Self = this.set("domready", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPosition_changed(value: () => Unit): Self = this.set("position_changed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setZindex_changed(value: () => Unit): Self = this.set("zindex_changed", js.Any.fromFunction0(value))
  }
}
