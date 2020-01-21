package typings.irc.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandType extends js.Object

@JSImport("irc", "CommandType")
@js.native
object CommandType extends js.Object {
  @js.native
  sealed trait error extends CommandType
  
  @js.native
  sealed trait normal extends CommandType
  
  @js.native
  sealed trait reply extends CommandType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommandType with Double] = js.native
  /* 2 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object reply extends TopLevel[reply with Double]
  
}

