package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait YPositionWithCaret extends StObject
@JSImport("@material/tooltip/constants", "YPositionWithCaret")
@js.native
object YPositionWithCaret extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[YPositionWithCaret & Double] = js.native
  
  @js.native
  sealed trait ABOVE
    extends StObject
       with YPositionWithCaret
  /* 1 */ val ABOVE: typings.materialTooltip.constantsMod.YPositionWithCaret.ABOVE & Double = js.native
  
  @js.native
  sealed trait BELOW
    extends StObject
       with YPositionWithCaret
  /* 2 */ val BELOW: typings.materialTooltip.constantsMod.YPositionWithCaret.BELOW & Double = js.native
  
  @js.native
  sealed trait SIDE_BOTTOM
    extends StObject
       with YPositionWithCaret
  /* 5 */ val SIDE_BOTTOM: typings.materialTooltip.constantsMod.YPositionWithCaret.SIDE_BOTTOM & Double = js.native
  
  @js.native
  sealed trait SIDE_CENTER
    extends StObject
       with YPositionWithCaret
  /* 4 */ val SIDE_CENTER: typings.materialTooltip.constantsMod.YPositionWithCaret.SIDE_CENTER & Double = js.native
  
  @js.native
  sealed trait SIDE_TOP
    extends StObject
       with YPositionWithCaret
  /* 3 */ val SIDE_TOP: typings.materialTooltip.constantsMod.YPositionWithCaret.SIDE_TOP & Double = js.native
}
