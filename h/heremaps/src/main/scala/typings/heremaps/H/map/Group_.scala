package typings.heremaps.H.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a map object which can contain other map objects. It's visibility, zIndex and object-order influences the contained map objects
  */
@js.native
trait Group_ extends Object {
  /**
    * To add an object to this group.
    * @param object {!H.map.Object}
    * @returns {!H.map.Object} - a reference to the appended object
    */
  def addObject(`object`: Object): Object = js.native
  /**
    * Appends a list of objects to this group
    * @param objects {Array<!H.map.Object>}
    */
  def addObjects(objects: js.Array[Object]): Unit = js.native
  /**
    *
    * @param callback {function(!H.map.Object, number, !H.map.Group)}
    * @param opt_recursive {boolean=} - Indicates whether sub groups should be traversed recursively
    * @param opt_context {*=} - The context to use as "this" within the callback
    */
  def forEach(callback: js.Function3[/* object */ Object, /* n */ Double, /* group */ this.type, Unit]): Unit = js.native
  def forEach(
    callback: js.Function3[/* object */ Object, /* n */ Double, /* group */ this.type, Unit],
    opt_recursive: js.UndefOr[scala.Nothing],
    opt_context: js.Any
  ): Unit = js.native
  def forEach(
    callback: js.Function3[/* object */ Object, /* n */ Double, /* group */ this.type, Unit],
    opt_recursive: Boolean
  ): Unit = js.native
  def forEach(
    callback: js.Function3[/* object */ Object, /* n */ Double, /* group */ this.type, Unit],
    opt_recursive: Boolean,
    opt_context: js.Any
  ): Unit = js.native
  /**
    * Method returns the bounding rectangle for the group. The rectangle is the smallest rectangle that covers all objects. If group doesn't contains objects method returns null.
    * @returns {H.geo.Rect} - geo ractangle that covers all objects in the group
    */
  def getBounds(): typings.heremaps.H.geo.Rect = js.native
  /**
    * To get a list of all objects of this group. On groups with many chilren this method can cause a higher memory and CPU consumption. Alternatively you case use H.map.Group#forEach
    * @param opt_recursive {boolean=} - Indicates whether objects in sub-groups are also collected .
    * @returns {!Array<!H.map.Object>}
    */
  def getObjects(): js.Array[Object] = js.native
  def getObjects(opt_recursive: Boolean): js.Array[Object] = js.native
  /**
    * Method removes all objects from the group.
    */
  def removeAll(): Unit = js.native
  /**
    * Removes an object from this group.
    * @param object {!H.map.Object} - The object to remove
    * @returns {!H.map.Object} - a reference to the removed object
    */
  def removeObject(`object`: Object): Object = js.native
  /**
    * Removes objects from this group.
    * @param objects {!Array<!H.map.Object>} - The list of objects to remove
    */
  def removeObjects(objects: js.Array[Object]): Unit = js.native
}

