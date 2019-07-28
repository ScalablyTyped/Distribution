package typings.irc.ircMod

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
  
  /* 2 */ val error: typings.irc.ircMod.CommandType.error with Double = js.native
  /* 0 */ val normal: typings.irc.ircMod.CommandType.normal with Double = js.native
  /* 1 */ val reply: typings.irc.ircMod.CommandType.reply with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommandType with Double] = js.native
}

