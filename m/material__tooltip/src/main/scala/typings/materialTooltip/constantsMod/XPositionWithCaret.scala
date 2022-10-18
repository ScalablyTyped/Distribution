package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XPositionWithCaret extends StObject
@JSImport("@material/tooltip/constants", "XPositionWithCaret")
@js.native
object XPositionWithCaret extends StObject {
  
  @js.native
  sealed trait CENTER
    extends StObject
       with XPositionWithCaret
  
  @js.native
  sealed trait END
    extends StObject
       with XPositionWithCaret
  
  @js.native
  sealed trait SIDE_END
    extends StObject
       with XPositionWithCaret
  
  @js.native
  sealed trait SIDE_START
    extends StObject
       with XPositionWithCaret
  
  @js.native
  sealed trait START
    extends StObject
       with XPositionWithCaret
}
