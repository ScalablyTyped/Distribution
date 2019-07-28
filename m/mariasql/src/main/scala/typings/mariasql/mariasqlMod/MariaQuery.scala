package typings.mariasql.mariasqlMod

import typings.mariasql.mariasqlStrings.abort
import typings.mariasql.mariasqlStrings.end
import typings.mariasql.mariasqlStrings.error
import typings.mariasql.mariasqlStrings.result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MariaQuery extends js.Object {
  def abort(): Unit = js.native
  def on(signal: String, cb: MariaCallBackVoid): MariaQuery = js.native
  @JSName("on")
  def on_abort(signal: abort, cb: MariaCallBackVoid): MariaQuery = js.native
  @JSName("on")
  def on_end(signal: end, cb: MariaCallBackVoid): MariaQuery = js.native
  @JSName("on")
  def on_error(signal: error, cb: MariaCallBackError): MariaQuery = js.native
  @JSName("on")
  def on_result(signal: result, cb: MariaCallBackResult): MariaQuery = js.native
}

