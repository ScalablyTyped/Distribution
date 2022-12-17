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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionWithCaret & Double] = js.native
  
  @js.native
  sealed trait ABOVE_CENTER
    extends StObject
       with PositionWithCaret
  /* 2 */ val ABOVE_CENTER: typings.materialTooltip.constantsMod.PositionWithCaret.ABOVE_CENTER & Double = js.native
  
  @js.native
  sealed trait ABOVE_END
    extends StObject
       with PositionWithCaret
  /* 3 */ val ABOVE_END: typings.materialTooltip.constantsMod.PositionWithCaret.ABOVE_END & Double = js.native
  
  @js.native
  sealed trait ABOVE_START
    extends StObject
       with PositionWithCaret
  /* 1 */ val ABOVE_START: typings.materialTooltip.constantsMod.PositionWithCaret.ABOVE_START & Double = js.native
  
  @js.native
  sealed trait BELOW_CENTER
    extends StObject
       with PositionWithCaret
  /* 11 */ val BELOW_CENTER: typings.materialTooltip.constantsMod.PositionWithCaret.BELOW_CENTER & Double = js.native
  
  @js.native
  sealed trait BELOW_END
    extends StObject
       with PositionWithCaret
  /* 12 */ val BELOW_END: typings.materialTooltip.constantsMod.PositionWithCaret.BELOW_END & Double = js.native
  
  @js.native
  sealed trait BELOW_START
    extends StObject
       with PositionWithCaret
  /* 10 */ val BELOW_START: typings.materialTooltip.constantsMod.PositionWithCaret.BELOW_START & Double = js.native
  
  @js.native
  sealed trait BOTTOM_SIDE_END
    extends StObject
       with PositionWithCaret
  /* 9 */ val BOTTOM_SIDE_END: typings.materialTooltip.constantsMod.PositionWithCaret.BOTTOM_SIDE_END & Double = js.native
  
  @js.native
  sealed trait BOTTOM_SIDE_START
    extends StObject
       with PositionWithCaret
  /* 6 */ val BOTTOM_SIDE_START: typings.materialTooltip.constantsMod.PositionWithCaret.BOTTOM_SIDE_START & Double = js.native
  
  @js.native
  sealed trait CENTER_SIDE_END
    extends StObject
       with PositionWithCaret
  /* 8 */ val CENTER_SIDE_END: typings.materialTooltip.constantsMod.PositionWithCaret.CENTER_SIDE_END & Double = js.native
  
  @js.native
  sealed trait CENTER_SIDE_START
    extends StObject
       with PositionWithCaret
  /* 5 */ val CENTER_SIDE_START: typings.materialTooltip.constantsMod.PositionWithCaret.CENTER_SIDE_START & Double = js.native
  
  @js.native
  sealed trait DETECTED
    extends StObject
       with PositionWithCaret
  /* 0 */ val DETECTED: typings.materialTooltip.constantsMod.PositionWithCaret.DETECTED & Double = js.native
  
  @js.native
  sealed trait TOP_SIDE_END
    extends StObject
       with PositionWithCaret
  /* 7 */ val TOP_SIDE_END: typings.materialTooltip.constantsMod.PositionWithCaret.TOP_SIDE_END & Double = js.native
  
  @js.native
  sealed trait TOP_SIDE_START
    extends StObject
       with PositionWithCaret
  /* 4 */ val TOP_SIDE_START: typings.materialTooltip.constantsMod.PositionWithCaret.TOP_SIDE_START & Double = js.native
}
