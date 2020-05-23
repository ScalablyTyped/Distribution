package typings.lgtv2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecializedSocket extends js.Object {
  def close(): Unit
  def send(`type`: String, payload: js.Any): Unit
}

object SpecializedSocket {
  @scala.inline
  def apply(close: () => Unit, send: (String, js.Any) => Unit): SpecializedSocket = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[SpecializedSocket]
  }
}

