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
  
  val error: error with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val reply: reply with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ircLib.ircMod.CommandType with java.lang.String] = js.native
}

