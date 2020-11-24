package typings.handbrakeJs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandbrakeErrors extends js.Object
@JSImport("handbrake-js", "HandbrakeErrors")
@js.native
object HandbrakeErrors extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HandbrakeErrors with String] = js.native
  
  @js.native
  sealed trait INVALID_INPUT extends HandbrakeErrors
  /* "InvalidInput" */ @js.native
  object INVALID_INPUT extends TopLevel[INVALID_INPUT with String]
  
  @js.native
  sealed trait INVALID_PRESET extends HandbrakeErrors
  /* "InvalidPreset" */ @js.native
  object INVALID_PRESET extends TopLevel[INVALID_PRESET with String]
  
  @js.native
  sealed trait NOT_FOUND extends HandbrakeErrors
  /* "HandbrakeCLINotFound" */ @js.native
  object NOT_FOUND extends TopLevel[NOT_FOUND with String]
  
  @js.native
  sealed trait OTHER extends HandbrakeErrors
  /* "Other" */ @js.native
  object OTHER extends TopLevel[OTHER with String]
  
  @js.native
  sealed trait VALIDATION extends HandbrakeErrors
  /* "ValidationError" */ @js.native
  object VALIDATION extends TopLevel[VALIDATION with String]
}
