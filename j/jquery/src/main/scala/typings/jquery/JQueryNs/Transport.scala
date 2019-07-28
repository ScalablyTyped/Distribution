package typings.jquery.JQueryNs

import typings.jquery.JQueryNs.TransportNs.SuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  def abort(): Unit
  def send(headers: PlainObject[_], completeCallback: SuccessCallback): Unit
}

object Transport {
  @scala.inline
  def apply(abort: () => Unit, send: (PlainObject[_], SuccessCallback) => Unit): Transport = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), send = js.Any.fromFunction2(send))
  
    __obj.asInstanceOf[Transport]
  }
}

