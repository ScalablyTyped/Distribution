package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClipType extends StObject
@JSGlobal("ClipperLib.ClipType")
@js.native
object ClipType extends StObject {
  
  @js.native
  sealed trait ctDifference
    extends StObject
       with ClipType
  
  @js.native
  sealed trait ctIntersection
    extends StObject
       with ClipType
  
  @js.native
  sealed trait ctUnion
    extends StObject
       with ClipType
  
  @js.native
  sealed trait ctXor
    extends StObject
       with ClipType
}
