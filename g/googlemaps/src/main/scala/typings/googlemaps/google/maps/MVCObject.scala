package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** MVC *****/
/** Base class implementing KVO. */
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
  def addListener(eventName: String, handler: js.Function1[/* repeated */ js.Any, Unit]): MapsEventListener = js.native
  /** Binds a View to a Model. */
  def bindTo(key: String, target: MVCObject): Unit = js.native
  def bindTo(key: String, target: MVCObject, targetKey: String): Unit = js.native
  def bindTo(key: String, target: MVCObject, targetKey: String, noNotify: Boolean): Unit = js.native
  def changed(key: String): Unit = js.native
  /** Gets a value. */
  def get(key: String): js.Any = js.native
  /**
    * Notify all observers of a change on this property. This notifies both
    * objects that are bound to the object's property as well as the object
    * that it is bound to.
    */
  def notify(key: String): Unit = js.native
  /** Sets a value. */
  def set(key: String, value: js.Any): Unit = js.native
  /** Sets a collection of key-value pairs. */
  def setValues(values: js.Any): Unit = js.native
  /**
    * Removes a binding. Unbinding will set the unbound property to the current
    * value. The object will not be notified, as the value has not changed.
    */
  def unbind(key: String): Unit = js.native
  /** Removes all bindings. */
  def unbindAll(): Unit = js.native
}

