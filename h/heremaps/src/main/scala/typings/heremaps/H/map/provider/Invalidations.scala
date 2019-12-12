package typings.heremaps.H.map.provider

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.map.provider.Invalidations.Flag
import typings.heremaps.H.map.provider.Invalidations.Flag.ADD
import typings.heremaps.H.map.provider.Invalidations.Flag.NONE
import typings.heremaps.H.map.provider.Invalidations.Flag.REMOVE
import typings.heremaps.H.map.provider.Invalidations.Flag.SPATIAL
import typings.heremaps.H.map.provider.Invalidations.Flag.VISUAL
import typings.heremaps.H.map.provider.Invalidations.Flag.Z_ORDER
import typings.heremaps.H.map.provider.Invalidations.Mark
import typings.heremaps.H.math.BitMask
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
  @js.native
  sealed trait Flag extends js.Object
  
  var MARK_INITIAL: Mark = js.native
  /**
    * This enumeration encapsulates bit flags for different invalidations of map objects.
    */
  @js.native
  object Flag extends js.Object {
    @js.native
    sealed trait ADD extends Flag
    
    @js.native
    sealed trait NONE extends Flag
    
    @js.native
    sealed trait REMOVE extends Flag
    
    @js.native
    sealed trait SPATIAL extends Flag
    
    @js.native
    sealed trait VISUAL extends Flag
    
    @js.native
    sealed trait Z_ORDER extends Flag
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Flag with Double] = js.native
    /* 3 */ @js.native
    object ADD extends TopLevel[ADD with Double]
    
    /* 0 */ @js.native
    object NONE extends TopLevel[NONE with Double]
    
    /* 4 */ @js.native
    object REMOVE extends TopLevel[REMOVE with Double]
    
    /* 2 */ @js.native
    object SPATIAL extends TopLevel[SPATIAL with Double]
    
    /* 1 */ @js.native
    object VISUAL extends TopLevel[VISUAL with Double]
    
    /* 5 */ @js.native
    object Z_ORDER extends TopLevel[Z_ORDER with Double]
    
  }
  
  /**
    * The invalidation mark represents a counter which is increased whenever an invalidation takes place.
    */
  type Mark = js.Any
}

