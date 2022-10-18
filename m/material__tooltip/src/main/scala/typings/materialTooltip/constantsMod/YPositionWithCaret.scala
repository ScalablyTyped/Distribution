package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait YPositionWithCaret extends StObject
@JSImport("@material/tooltip/constants", "YPositionWithCaret")
@js.native
object YPositionWithCaret extends StObject {
  
  @js.native
  sealed trait ABOVE
    extends StObject
       with YPositionWithCaret
  
  @js.native
  sealed trait BELOW
    extends StObject
       with YPositionWithCaret
  
  @js.native
  sealed trait SIDE_BOTTOM
    extends StObject
       with YPositionWithCaret
  
  @js.native
  sealed trait SIDE_CENTER
    extends StObject
       with YPositionWithCaret
  
  @js.native
  sealed trait SIDE_TOP
    extends StObject
       with YPositionWithCaret
}
