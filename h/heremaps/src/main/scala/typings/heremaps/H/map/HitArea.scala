package typings.heremaps.H.map

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.map.HitArea.ShapeType
import typings.heremaps.H.map.HitArea.ShapeType.CIRCLE
import typings.heremaps.H.map.HitArea.ShapeType.NONE
import typings.heremaps.H.map.HitArea.ShapeType.POLYGON
import typings.heremaps.H.map.HitArea.ShapeType.RECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents an area that objects, like a marker, occupies in the screen space, meaning that object can be probed and returned by H.Map@getObjectsAt method.
  */
@JSGlobal("H.map.HitArea")
@js.native
class HitArea protected () extends js.Object {
  /**
    * Constructor
    * @param shapeType {H.map.HitArea.ShapeType} - The shape type of the HitArea
    * @param opt_values {Array<number>=} - The type-dependent values to define the shape of the hit area. The format for the different types are:
    */
  def this(shapeType: ShapeType) = this()
  def this(shapeType: ShapeType, opt_values: js.Array[Double]) = this()
}

@JSGlobal("H.map.HitArea")
@js.native
object HitArea extends js.Object {
  @js.native
  sealed trait ShapeType extends js.Object
  
  /**
    * Enumeration represents possible shape types that HitArea can have.
    */
  @js.native
  object ShapeType extends js.Object {
    @js.native
    sealed trait CIRCLE extends ShapeType
    
    @js.native
    sealed trait NONE extends ShapeType
    
    @js.native
    sealed trait POLYGON extends ShapeType
    
    @js.native
    sealed trait RECT extends ShapeType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ShapeType with Double] = js.native
    /* 2 */ @js.native
    object CIRCLE extends TopLevel[CIRCLE with Double]
    
    /* 0 */ @js.native
    object NONE extends TopLevel[NONE with Double]
    
    /* 3 */ @js.native
    object POLYGON extends TopLevel[POLYGON with Double]
    
    /* 1 */ @js.native
    object RECT extends TopLevel[RECT with Double]
    
  }
  
}

