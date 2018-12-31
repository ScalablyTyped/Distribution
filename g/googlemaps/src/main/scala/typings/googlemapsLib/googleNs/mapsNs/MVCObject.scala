package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.MVCObject")
@js.native
/**
  * The MVCObject constructor is guaranteed to be an empty function, and so
  * you may inherit from MVCObject by simply writing MySubclass.prototype =
  * new google.maps.MVCObject();. Unless otherwise noted, this is not true of
  * other classes in the API, and inheriting from other classes in the API is
  * not supported.
  */
class MVCObject () extends js.Object {
  /**
    * Adds the given listener function to the given event name. Returns an
    * identifier for this listener that can be used with
    * google.maps.event.removeListener.
    */
  def addListener(eventName: java.lang.String, handler: js.Function1[/* repeated */ js.Any, scala.Unit]): MapsEventListener = js.native
  /** Binds a View to a Model. */
  def bindTo(key: java.lang.String, target: MVCObject): scala.Unit = js.native
  def bindTo(key: java.lang.String, target: MVCObject, targetKey: java.lang.String): scala.Unit = js.native
  def bindTo(key: java.lang.String, target: MVCObject, targetKey: java.lang.String, noNotify: scala.Boolean): scala.Unit = js.native
  def changed(key: java.lang.String): scala.Unit = js.native
  /** Gets a value. */
  def get(key: java.lang.String): js.Any = js.native
  /**
    * Notify all observers of a change on this property. This notifies both
    * objects that are bound to the object's property as well as the object
    * that it is bound to.
    */
  def notify(key: java.lang.String): scala.Unit = js.native
  /** Sets a value. */
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  /** Sets a collection of key-value pairs. */
  def setValues(values: js.Any): scala.Unit = js.native
  /**
    * Removes a binding. Unbinding will set the unbound property to the current
    * value. The object will not be notified, as the value has not changed.
    */
  def unbind(key: java.lang.String): scala.Unit = js.native
  /** Removes all bindings. */
  def unbindAll(): scala.Unit = js.native
}

