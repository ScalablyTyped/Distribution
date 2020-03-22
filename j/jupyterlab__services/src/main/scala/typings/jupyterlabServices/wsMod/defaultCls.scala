package typings.jupyterlabServices.wsMod

import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/shim/ws", JSImport.Default)
@js.native
class defaultCls protected () extends WebSocket {
  def this(url: String) = this()
  def this(url: String, protocols: String) = this()
  def this(url: String, protocols: js.Array[String]) = this()
}

