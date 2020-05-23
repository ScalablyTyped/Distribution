package typings.heremaps.global.H.map

import typings.heremaps.H.map.Object.Options
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
class Object ()
  extends typings.heremaps.H.map.Object {
  def this(opt_options: Options) = this()
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
  def compareZOrder(first: typings.heremaps.H.map.Object, second: typings.heremaps.H.map.Object): Double = js.native
  /**
    * The major types of map objects
    */
  @js.native
  object Type extends js.Object {
    /* 0 */ val ANY: typings.heremaps.H.map.Object.Type.ANY with Double = js.native
    /* 4 */ val DOM_MARKER: typings.heremaps.H.map.Object.Type.DOM_MARKER with Double = js.native
    /* 5 */ val GROUP: typings.heremaps.H.map.Object.Type.GROUP with Double = js.native
    /* 3 */ val MARKER: typings.heremaps.H.map.Object.Type.MARKER with Double = js.native
    /* 1 */ val OVERLAY: typings.heremaps.H.map.Object.Type.OVERLAY with Double = js.native
    /* 2 */ val SPATIAL: typings.heremaps.H.map.Object.Type.SPATIAL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.heremaps.H.map.Object.Type with Double] = js.native
  }
  
}

