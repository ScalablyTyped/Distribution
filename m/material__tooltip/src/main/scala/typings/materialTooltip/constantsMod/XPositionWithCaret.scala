package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XPositionWithCaret extends StObject
@JSImport("@material/tooltip/constants", "XPositionWithCaret")
@js.native
object XPositionWithCaret extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XPositionWithCaret & Double] = js.native
  
  @js.native
  sealed trait CENTER
    extends StObject
       with XPositionWithCaret
  /* 2 */ val CENTER: typings.materialTooltip.constantsMod.XPositionWithCaret.CENTER & Double = js.native
  
  @js.native
  sealed trait END
    extends StObject
       with XPositionWithCaret
  /* 3 */ val END: typings.materialTooltip.constantsMod.XPositionWithCaret.END & Double = js.native
  
  @js.native
  sealed trait SIDE_END
    extends StObject
       with XPositionWithCaret
  /* 5 */ val SIDE_END: typings.materialTooltip.constantsMod.XPositionWithCaret.SIDE_END & Double = js.native
  
  @js.native
  sealed trait SIDE_START
    extends StObject
       with XPositionWithCaret
  /* 4 */ val SIDE_START: typings.materialTooltip.constantsMod.XPositionWithCaret.SIDE_START & Double = js.native
  
  @js.native
  sealed trait START
    extends StObject
       with XPositionWithCaret
  /* 1 */ val START: typings.materialTooltip.constantsMod.XPositionWithCaret.START & Double = js.native
}
