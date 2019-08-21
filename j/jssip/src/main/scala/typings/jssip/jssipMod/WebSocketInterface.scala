package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jssip", "WebSocketInterface")
@js.native
class WebSocketInterface protected () extends Socket {
  def this(url: String) = this()
  def isConnected(): js.Any = js.native
  def isConnecting(): js.Any = js.native
}

