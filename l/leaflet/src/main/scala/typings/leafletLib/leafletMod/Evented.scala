package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Evented")
@js.native
abstract class Evented () extends Class {
  /**
    * Alias for on(...)
    *
    * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
    */
  def addEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Alias for on(...)
    *
    * Adds a listener function (fn) to a particular event type of the object.
    * You can optionally specify the context of the listener (object the this
    * keyword will point to). You can also pass several space-separated types
    * (e.g. 'click dblclick').
    */
  def addEventListener(`type`: java.lang.String, fn: LeafletEventHandlerFn): this.type = js.native
  def addEventListener(`type`: java.lang.String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  /**
    * Adds an event parent - an Evented that will receive propagated events
    */
  def addEventParent(obj: Evented): this.type = js.native
  /**
    * Alias for once(...)
    *
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  def addOneTimeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Alias for once(...)
    *
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  def addOneTimeEventListener(`type`: java.lang.String, fn: LeafletEventHandlerFn): this.type = js.native
  def addOneTimeEventListener(`type`: java.lang.String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  /**
    * Alias for off()
    *
    * Removes all listeners to all events on the object.
    */
  def clearAllEventListeners(): this.type = js.native
  /**
    * Fires an event of the specified type. You can optionally provide a data
    * object — the first argument of the listener function will contain its properties.
    * The event might can optionally be propagated to event parents.
    */
  def fire(`type`: java.lang.String): this.type = js.native
  def fire(`type`: java.lang.String, data: js.Any): this.type = js.native
  def fire(`type`: java.lang.String, data: js.Any, propagate: scala.Boolean): this.type = js.native
  /**
    * Alias for fire(...)
    *
    * Fires an event of the specified type. You can optionally provide a data
    * object — the first argument of the listener function will contain its properties.
    * The event might can optionally be propagated to event parents.
    */
  def fireEvent(`type`: java.lang.String): this.type = js.native
  def fireEvent(`type`: java.lang.String, data: js.Any): this.type = js.native
  def fireEvent(`type`: java.lang.String, data: js.Any, propagate: scala.Boolean): this.type = js.native
  /**
    * Alias for listens(...)
    *
    * Returns true if a particular event type has any listeners attached to it.
    */
  def hasEventListeners(`type`: java.lang.String): scala.Boolean = js.native
  /**
    * Returns true if a particular event type has any listeners attached to it.
    */
  def listens(`type`: java.lang.String): scala.Boolean = js.native
  /**
    * Removes all listeners to all events on the object.
    */
  def off(): this.type = js.native
  /**
    * Removes a set of type/listener pairs.
    */
  // With an eventMap there are no additional arguments allowed
  // tslint:disable-next-line:unified-signatures
  def off(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Removes a previously added listener function. If no function is specified,
    * it will remove all the listeners of that particular event from the object.
    * Note that if you passed a custom context to on, you must pass the same context
    * to off in order to remove the listener.
    */
  // With an eventMap there are no additional arguments allowed
  // tslint:disable-next-line:unified-signatures
  def off(`type`: java.lang.String): this.type = js.native
  def off(`type`: java.lang.String, fn: LeafletEventHandlerFn): this.type = js.native
  def off(`type`: java.lang.String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  /**
    * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
    */
  def on(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Adds a listener function (fn) to a particular event type of the object.
    * You can optionally specify the context of the listener (object the this
    * keyword will point to). You can also pass several space-separated types
    * (e.g. 'click dblclick').
    */
  def on(`type`: java.lang.String, fn: LeafletEventHandlerFn): this.type = js.native
  def on(`type`: java.lang.String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  /**
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  def once(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Behaves as on(...), except the listener will only get fired once and then removed.
    */
  def once(`type`: java.lang.String, fn: LeafletEventHandlerFn): this.type = js.native
  def once(`type`: java.lang.String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  /**
    * Alias for off(...)
    *
    * Removes a set of type/listener pairs.
    */
  def removeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
  /**
    * Alias for off(...)
    *
    * Removes a previously added listener function. If no function is specified,
    * it will remove all the listeners of that particular event from the object.
    * Note that if you passed a custom context to on, you must pass the same context
    * to off in order to remove the listener.
    */
  def removeEventListener(`type`: java.lang.String, fn: LeafletEventHandlerFn): this.type = js.native
  def removeEventListener(`type`: java.lang.String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
  /**
    * Removes an event parent, so it will stop receiving propagated events
    */
  def removeEventParent(obj: Evented): this.type = js.native
}

