package typings.launchpad.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  var id: String = js.native
  def addListener(event: String, listener: js.Function): this.type = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  def once(event: String, listener: js.Function): this.type = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeListener(event: String, listener: js.Function): this.type = js.native
  def setMaxListeners(n: Double): Unit = js.native
  def status(cb: js.Function2[/* err */ js.Any, /* status */ js.Any, Unit]): Unit = js.native
  def stop(cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

