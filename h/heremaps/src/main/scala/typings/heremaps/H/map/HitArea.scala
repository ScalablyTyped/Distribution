package typings.heremaps.H.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents an area that objects, like a marker, occupies in the screen space, meaning that object can be probed and returned by H.Map@getObjectsAt method.
  */
trait HitArea extends StObject
object HitArea {
  
  @js.native
  sealed trait ShapeType extends StObject
  /**
    * Enumeration represents possible shape types that HitArea can have.
    */
  @JSGlobal("H.map.HitArea.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @js.native
    sealed trait CIRCLE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait NONE
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait POLYGON
      extends StObject
         with ShapeType
    
    @js.native
    sealed trait RECT
      extends StObject
         with ShapeType
  }
}
