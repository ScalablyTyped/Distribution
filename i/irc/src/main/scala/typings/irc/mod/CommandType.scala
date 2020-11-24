package typings.irc.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommandType extends js.Object
@JSImport("irc", "CommandType")
@js.native
object CommandType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommandType with Double] = js.native
  
  @js.native
  sealed trait error extends CommandType
  /* 2 */ @js.native
  object error extends TopLevel[error with Double]
  
  @js.native
  sealed trait normal extends CommandType
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  @js.native
  sealed trait reply extends CommandType
  /* 1 */ @js.native
  object reply extends TopLevel[reply with Double]
}
