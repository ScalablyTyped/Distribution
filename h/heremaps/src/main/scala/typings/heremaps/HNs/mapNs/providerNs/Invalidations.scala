package typings.heremaps.HNs.mapNs.providerNs

import typings.heremaps.HNs.mapNs.providerNs.InvalidationsNs.Mark
import typings.heremaps.HNs.mathNs.BitMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents invalidation states of a renderable object. A renderer can optimize its rendering strategies based on the information in this object.
  * @property MARK_INITIAL {H.map.provider.Invalidations.Mark} - This constant represents the initial invalidation mark an invalidations object has.
  */
@JSGlobal("H.map.provider.Invalidations")
@js.native
class Invalidations () extends js.Object {
  /**
    * This method returns the current invalidation mark of this invalidations object.
    * @returns {H.map.provider.Invalidations.Mark} - the current invalidation mark
    */
  def getMark(): Mark = js.native
  /**
    * Checks whether an add-operation occurred after the specified since mark
    * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
    * @returns {boolean}
    */
  def isAdd(since: Mark): Boolean = js.native
  /**
    * Checks whether any change occurred after the specified since mark
    * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
    * @returns {boolean}
    */
  def isAny(since: Mark): Boolean = js.native
  /**
    * Checks whether a remove operation occurred after the specified since mark
    * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
    * @returns {boolean}
    */
  def isRemove(since: Mark): Boolean = js.native
  /**
    * Checks whether a spatial change occurred after the specified since mark
    * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
    * @returns {boolean}
    */
  def isSpatial(since: Mark): Boolean = js.native
  /**
    * Checks whether a visual change occurred after the specified since mark
    * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
    * @returns {boolean}
    */
  def isVisual(since: Mark): Boolean = js.native
  /**
    * Checks whether a z-order change occurred after the specified since mark
    * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
    * @returns {boolean}
    */
  def isZOrder(since: Mark): Boolean = js.native
  /**
    * To update invalidation marks accordingly to the given the invalidation types.
    * @param mark {H.map.provider.Invalidations.Mark} - The invalidation mark to set
    * @param types {H.math.BitMask} - The descrete invalidation types to update
    */
  def update(mark: Mark, types: BitMask): Unit = js.native
}

/* static members */
@JSGlobal("H.map.provider.Invalidations")
@js.native
object Invalidations extends js.Object {
  var MARK_INITIAL: Mark = js.native
}

