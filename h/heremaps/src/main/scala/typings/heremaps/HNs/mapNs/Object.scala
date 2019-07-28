package typings.heremaps.HNs.mapNs

import typings.heremaps.HNs.mapNs.ObjectNs.Options
import typings.heremaps.HNs.mapNs.providerNs.Invalidations
import typings.heremaps.HNs.mapNs.providerNs.ObjectProvider
import typings.heremaps.HNs.mathNs.BitMask
import typings.heremaps.HNs.utilNs.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents the abstract base class for map objects such as polylines, polygons, markers, groups etc.
  */
@JSGlobal("H.map.Object")
@js.native
/**
  * Constructor
  * @param opt_options {H.map.Object.Options=} - The values to initialize this object
  */
class Object () extends EventTarget {
  def this(opt_options: Options) = this()
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  /**
    * Checks whether the given object is an inclusive descendant of this object
    * @param object {*} - The object that's being compared against.
    * @returns {boolean}
    */
  def contains(`object`: js.Any): Boolean = js.native
  /**
    * This method returns previously stored arbitrary data from this object.
    * @returns {*} - the previously stored data or undefined if not data was stored.
    */
  def getData(): js.Any = js.native
  /**
    * Returns the ID of this object.
    * @returns {*}
    */
  def getId(): js.Any = js.native
  /**
    * Returns the invalidations of this object
    * @returns {H.map.provider.Invalidations} - an invalidation object
    */
  def getInvalidations(): Invalidations = js.native
  /**
    * Returns the parent group which contains this object or null if the object is not contained by any group.
    * @returns {?H.map.Group}
    */
  def getParentGroup(): Group = js.native
  /**
    * The current provider of this object
    * @returns {?H.map.provider.ObjectProvider} - the current provider
    */
  def getProvider(): ObjectProvider = js.native
  /**
    * The root object in which this object is attached or the object itself.
    * @returns {!H.map.Object}
    */
  def getRootGroup(): Object = js.native
  /**
    * Returns the visibility of this object.
    * @param opt_effective {boolean=} - Indicates that the effective visibility is requested. In this case the visibility of all possible ancestor groups is also taken into account
    * @returns {boolean}
    */
  def getVisibility(): Boolean = js.native
  def getVisibility(opt_effective: Boolean): Boolean = js.native
  /**
    * Returns the z-index of this object.
    * @returns {(number | undefined)}
    */
  def getZIndex(): Double | Unit = js.native
  /**
    * This method invalidates this map object.
    * @param flags {H.math.BitMask} - The flags indicating the types of occurred changes
    * @returns {boolean} - indicates whether a validtion was executed (only if the object has a provider)
    */
  def invalidate(flags: BitMask): Boolean = js.native
  /**
    * This method stores arbitrary data with this map object
    * @param data {*} - the data to be stored
    * @returns {H.map.Object} - returns this map object instance
    */
  def setData(data: js.Any): Object = js.native
  /**
    * Sets the visibility of this object.
    * @param opt_visibility {boolean=} - Indicates whether this map object should be visible.
    * @returns {H.map.Object} - returns this object
    */
  def setVisibility(): Object = js.native
  def setVisibility(opt_visibility: Boolean): Object = js.native
  /**
    * To set the-index of this object.
    * @param zIndex {(number | undefined)}
    * @returns {H.map.Object} - returns this object
    */
  def setZIndex(): Object = js.native
  def setZIndex(zIndex: Double): Object = js.native
}

/* static members */
@JSGlobal("H.map.Object")
@js.native
object Object extends js.Object {
  /**
    * Compares two objects regarding their z-order, useful to sort a list of objects via Array's sort() method
    * @param first {H.map.Object} - The first object to compare
    * @param second {H.map.Object} - The second object to compare
    * @returns {number} - If less then 0 the first object has a lower z-order. If equal 0 booth objects have the same z-order. If greater then 0 the first object has a higher z-order.
    */
  def compareZOrder(first: Object, second: Object): Double = js.native
}

