package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  def close(): scala.Double
  def close_conid(status: scala.Double, reason: java.lang.String, con: scala.Double): scala.Double
  def close_reason(status: scala.Double, reason: java.lang.String): scala.Double
  def handle_handshake(): scala.Double
}

object Anon_Close {
  @scala.inline
  def apply(
    close: () => scala.Double,
    close_conid: (scala.Double, java.lang.String, scala.Double) => scala.Double,
    close_reason: (scala.Double, java.lang.String) => scala.Double,
    handle_handshake: () => scala.Double
  ): Anon_Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), close_conid = js.Any.fromFunction3(close_conid), close_reason = js.Any.fromFunction2(close_reason), handle_handshake = js.Any.fromFunction0(handle_handshake))
  
    __obj.asInstanceOf[Anon_Close]
  }
}

