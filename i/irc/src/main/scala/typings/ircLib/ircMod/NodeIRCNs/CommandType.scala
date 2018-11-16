package typings
package ircLib.ircMod.NodeIRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandType extends js.Object

@JSImport("irc/NodeIRC", "CommandType")
@js.native
object CommandType extends js.Object {
  @js.native
  sealed trait error
    extends ircLib.ircMod.NodeIRCNs.CommandType
  
  @js.native
  sealed trait normal
    extends ircLib.ircMod.NodeIRCNs.CommandType
  
  @js.native
  sealed trait reply
    extends ircLib.ircMod.NodeIRCNs.CommandType
  
}

