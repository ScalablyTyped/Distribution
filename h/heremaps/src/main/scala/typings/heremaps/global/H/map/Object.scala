package typings.heremaps.global.H.map

import typings.heremaps.H.map.Object.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with typings.heremaps.H.map.Object {
  def this(opt_options: Options) = this()
}
object Object {
  
  @JSGlobal("H.map.Object")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The major types of map objects
    */
  @JSGlobal("H.map.Object.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.heremaps.H.map.Object.Type & Double] = js.native
    
    /* 0 */ val ANY: typings.heremaps.H.map.Object.Type.ANY & Double = js.native
    
    /* 4 */ val DOM_MARKER: typings.heremaps.H.map.Object.Type.DOM_MARKER & Double = js.native
    
    /* 5 */ val GROUP: typings.heremaps.H.map.Object.Type.GROUP & Double = js.native
    
    /* 3 */ val MARKER: typings.heremaps.H.map.Object.Type.MARKER & Double = js.native
    
    /* 1 */ val OVERLAY: typings.heremaps.H.map.Object.Type.OVERLAY & Double = js.native
    
    /* 2 */ val SPATIAL: typings.heremaps.H.map.Object.Type.SPATIAL & Double = js.native
  }
  
  /**
    * Compares two objects regarding their z-order, useful to sort a list of objects via Array's sort() method
    * @param first {H.map.Object} - The first object to compare
    * @param second {H.map.Object} - The second object to compare
    * @returns {number} - If less then 0 the first object has a lower z-order. If equal 0 booth objects have the same z-order. If greater then 0 the first object has a higher z-order.
    */
  /* static member */
  @scala.inline
  def compareZOrder(first: typings.heremaps.H.map.Object, second: typings.heremaps.H.map.Object): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareZOrder")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Double]
}
