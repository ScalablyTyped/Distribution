package typings.irc.ircMod.handlersNs

import typings.irc.ircMod.IMessage
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
  def apply(from: String, to: String, text: String, message: IMessage): Unit = js.native
  def apply(from: String, to: String, text: String, `type`: String, message: IMessage): Unit = js.native
}

