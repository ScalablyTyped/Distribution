package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * This class represents a map object which can contain other map objects. It's visibility, zIndex and object-order influences the contained map objects
         */
@JSGlobal("H.map.Group")
@js.native
class Group () extends Object {
  /**
               * Constructor
               * @param opt_options {H.map.Group.Options=} - an optional object containing initialization values
               */
  def this(opt_options: heremapsLib.HNs.mapNs.GroupNs.Options) = this()
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
  def addObjects(objects: js.Array[Object]): scala.Unit = js.native
  /**
               *
               * @param callback {function(!H.map.Object, number, !H.map.Group)}
               * @param opt_recursive {boolean=} - Indicates whether sub groups should be traversed recursively
               * @param opt_context {*=} - The context to use as "this" within the callback
               */
  def forEach(
    callback: js.Function3[/* object */ Object, /* n */ scala.Double, /* group */ this.type, scala.Unit]
  ): scala.Unit = js.native
  /**
               *
               * @param callback {function(!H.map.Object, number, !H.map.Group)}
               * @param opt_recursive {boolean=} - Indicates whether sub groups should be traversed recursively
               * @param opt_context {*=} - The context to use as "this" within the callback
               */
  def forEach(
    callback: js.Function3[/* object */ Object, /* n */ scala.Double, /* group */ this.type, scala.Unit],
    opt_recursive: scala.Boolean
  ): scala.Unit = js.native
  /**
               *
               * @param callback {function(!H.map.Object, number, !H.map.Group)}
               * @param opt_recursive {boolean=} - Indicates whether sub groups should be traversed recursively
               * @param opt_context {*=} - The context to use as "this" within the callback
               */
  def forEach(
    callback: js.Function3[/* object */ Object, /* n */ scala.Double, /* group */ this.type, scala.Unit],
    opt_recursive: scala.Boolean,
    opt_context: js.Any
  ): scala.Unit = js.native
  /**
               * Method returns the bounding rectangle for the group. The rectangle is the smallest rectangle that covers all objects. If group doesn't contains objects method returns null.
               * @returns {H.geo.Rect} - geo ractangle that covers all objects in the group
               */
  def getBounds(): heremapsLib.HNs.geoNs.Rect = js.native
  /**
               * To get a list of all objects of this group. On groups with many chilren this method can cause a higher memory and CPU consumption. Alternatively you case use H.map.Group#forEach
               * @param opt_recursive {boolean=} - Indicates whether objects in sub-groups are also collected .
               * @returns {!Array<!H.map.Object>}
               */
  def getObjects(): js.Array[Object] = js.native
  /**
               * To get a list of all objects of this group. On groups with many chilren this method can cause a higher memory and CPU consumption. Alternatively you case use H.map.Group#forEach
               * @param opt_recursive {boolean=} - Indicates whether objects in sub-groups are also collected .
               * @returns {!Array<!H.map.Object>}
               */
  def getObjects(opt_recursive: scala.Boolean): js.Array[Object] = js.native
  /**
               * Method removes all objects from the group.
               */
  def removeAll(): scala.Unit = js.native
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
  def removeObjects(objects: js.Array[Object]): scala.Unit = js.native
}

