package typings.heremaps.H.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents an area that objects, like a marker, occupies in the screen space, meaning that object can be probed and returned by H.Map@getObjectsAt method.
  */
@js.native
trait HitArea extends js.Object

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
    
  }
  
}

