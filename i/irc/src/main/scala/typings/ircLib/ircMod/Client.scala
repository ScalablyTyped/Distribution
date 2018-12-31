package typings
package ircLib.ircMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("irc", "Client")
@js.native
class Client protected ()
  extends ircLib.ircMod.NodeIRCNs.Client {
  /**
    * Connect to an IRC server
    * @param server - server hostname
    * @param nick - nickname
    * @param opts
    */
  def this(server: java.lang.String, nick: java.lang.String) = this()
  def this(server: java.lang.String, nick: java.lang.String, opts: ircLib.ircMod.NodeIRCNs.IClientOpts) = this()
}

