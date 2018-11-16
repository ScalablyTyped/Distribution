package typings
package launchpadLib.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  var id: java.lang.String = js.native
  def addListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def once(event: java.lang.String, listener: js.Function): this.type = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: java.lang.String): this.type = js.native
  def removeListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def setMaxListeners(n: scala.Double): scala.Unit = js.native
  def status(cb: js.Function2[/* err */ js.Any, /* status */ js.Any, scala.Unit]): scala.Unit = js.native
  def stop(cb: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
}

