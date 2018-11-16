package typings
package mariasqlLib.mariasqlMod.mariasqlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MariaResult extends js.Object {
  def abort(): scala.Unit = js.native
  def on(signal: java.lang.String, cb: MariaCallBackVoid): MariaResult = js.native
  @JSName("on")
  def on_abort(signal: mariasqlLib.mariasqlLibStrings.abort, cb: MariaCallBackVoid): MariaResult = js.native
  @JSName("on")
  def on_end(signal: mariasqlLib.mariasqlLibStrings.end, cb: MariaCallBackInfo): MariaResult = js.native
  @JSName("on")
  def on_error(signal: mariasqlLib.mariasqlLibStrings.error, cb: MariaCallBackError): MariaResult = js.native
  @JSName("on")
  def on_row(signal: mariasqlLib.mariasqlLibStrings.row, cb: MariaCallBackRow): MariaResult = js.native
}

