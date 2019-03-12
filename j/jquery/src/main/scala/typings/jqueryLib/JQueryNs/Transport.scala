package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  def abort(): scala.Unit
  def send(headers: PlainObject[_], completeCallback: jqueryLib.JQueryNs.TransportNs.SuccessCallback): scala.Unit
}

object Transport {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    send: (PlainObject[_], jqueryLib.JQueryNs.TransportNs.SuccessCallback) => scala.Unit
  ): Transport = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), send = js.Any.fromFunction2(send))
  
    __obj.asInstanceOf[Transport]
  }
}

