package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait YPosition extends StObject
@JSImport("@material/tooltip/constants", "YPosition")
@js.native
object YPosition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[YPosition & Double] = js.native
  
  @js.native
  sealed trait ABOVE
    extends StObject
       with YPosition
  /* 1 */ val ABOVE: typings.materialTooltip.constantsMod.YPosition.ABOVE & Double = js.native
  
  @js.native
  sealed trait BELOW
    extends StObject
       with YPosition
  /* 2 */ val BELOW: typings.materialTooltip.constantsMod.YPosition.BELOW & Double = js.native
  
  @js.native
  sealed trait DETECTED
    extends StObject
       with YPosition
  /* 0 */ val DETECTED: typings.materialTooltip.constantsMod.YPosition.DETECTED & Double = js.native
}
