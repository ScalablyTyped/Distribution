package typings
package ircLib.ircMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandType extends js.Object

@JSImport("irc", "CommandType")
@js.native
object CommandType extends js.Object {
  @js.native
  sealed trait error
    extends ircLib.ircMod.CommandType
  
  @js.native
  sealed trait normal
    extends ircLib.ircMod.CommandType
  
  @js.native
  sealed trait reply
    extends ircLib.ircMod.CommandType
  
  /* 2 */ val error: error with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 1 */ val reply: reply with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ircLib.ircMod.CommandType with scala.Double] = js.native
}

