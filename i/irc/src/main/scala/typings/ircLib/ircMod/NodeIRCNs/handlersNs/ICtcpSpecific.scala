package typings
package ircLib.ircMod.NodeIRCNs.handlersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICtcpSpecific extends js.Object {
  /**
               * @param from - sender
               * @param to - recievier
               * @param message - raw message
               */
  def apply(
    from: java.lang.String,
    to: java.lang.String,
    text: java.lang.String,
    message: ircLib.ircMod.NodeIRCNs.IMessage
  ): scala.Unit = js.native
  def apply(
    from: java.lang.String,
    to: java.lang.String,
    text: java.lang.String,
    `type`: java.lang.String,
    message: ircLib.ircMod.NodeIRCNs.IMessage
  ): scala.Unit = js.native
}

