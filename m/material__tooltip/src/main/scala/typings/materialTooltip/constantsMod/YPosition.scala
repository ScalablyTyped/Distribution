package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait YPosition extends StObject
@JSImport("@material/tooltip/constants", "YPosition")
@js.native
object YPosition extends StObject {
  
  @js.native
  sealed trait ABOVE
    extends StObject
       with YPosition
  
  @js.native
  sealed trait BELOW
    extends StObject
       with YPosition
  
  @js.native
  sealed trait DETECTED
    extends StObject
       with YPosition
}
