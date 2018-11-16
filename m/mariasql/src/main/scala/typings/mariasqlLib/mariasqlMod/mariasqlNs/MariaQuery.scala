package typings
package mariasqlLib.mariasqlMod.mariasqlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MariaQuery extends js.Object {
  def abort(): scala.Unit = js.native
  def on(signal: java.lang.String, cb: MariaCallBackVoid): MariaQuery = js.native
  @JSName("on")
  def on_abort(signal: mariasqlLib.mariasqlLibStrings.abort, cb: MariaCallBackVoid): MariaQuery = js.native
  @JSName("on")
  def on_end(signal: mariasqlLib.mariasqlLibStrings.end, cb: MariaCallBackVoid): MariaQuery = js.native
  @JSName("on")
  def on_error(signal: mariasqlLib.mariasqlLibStrings.error, cb: MariaCallBackError): MariaQuery = js.native
  @JSName("on")
  def on_result(signal: mariasqlLib.mariasqlLibStrings.result, cb: MariaCallBackResult): MariaQuery = js.native
}

