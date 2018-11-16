package typings
package ircLib.ircMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("irc", "CommandType")
@js.native
object CommandType extends js.Object {
  val error: ircLib.ircMod.NodeIRCNs.CommandType.error with java.lang.String = js.native
  val normal: ircLib.ircMod.NodeIRCNs.CommandType.normal with java.lang.String = js.native
  val reply: ircLib.ircMod.NodeIRCNs.CommandType.reply with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ircLib.ircMod.NodeIRCNs.CommandType with java.lang.String] = js.native
}

