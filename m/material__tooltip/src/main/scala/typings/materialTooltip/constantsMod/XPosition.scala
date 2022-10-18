package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XPosition extends StObject
/** Enum for possible tooltip positioning relative to its anchor element. */
@JSImport("@material/tooltip/constants", "XPosition")
@js.native
object XPosition extends StObject {
  
  @js.native
  sealed trait CENTER
    extends StObject
       with XPosition
  
  @js.native
  sealed trait DETECTED
    extends StObject
       with XPosition
  
  @js.native
  sealed trait END
    extends StObject
       with XPosition
  
  @js.native
  sealed trait START
    extends StObject
       with XPosition
}
