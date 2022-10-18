package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PositionWithCaret extends StObject
/**
  * Enum for possible positions of a tooltip with caret (this specifies the
  * positioning of the tooltip relative to the anchor -- the position of the
  * caret will follow that of the tooltip). This can NOT be combined with the
  * above X/YPosition options. Naming for the enums follows: (vertical
  * placement)_(horizontal placement).
  */
@JSImport("@material/tooltip/constants", "PositionWithCaret")
@js.native
object PositionWithCaret extends StObject {
  
  @js.native
  sealed trait ABOVE_CENTER
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait ABOVE_END
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait ABOVE_START
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait BELOW_CENTER
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait BELOW_END
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait BELOW_START
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait BOTTOM_SIDE_END
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait BOTTOM_SIDE_START
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait CENTER_SIDE_END
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait CENTER_SIDE_START
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait DETECTED
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait TOP_SIDE_END
    extends StObject
       with PositionWithCaret
  
  @js.native
  sealed trait TOP_SIDE_START
    extends StObject
       with PositionWithCaret
}
