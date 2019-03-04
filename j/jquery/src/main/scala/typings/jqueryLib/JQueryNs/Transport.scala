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
    abort: js.Function0[scala.Unit],
    send: js.Function2[PlainObject[_], jqueryLib.JQueryNs.TransportNs.SuccessCallback, scala.Unit]
  ): Transport = {
    val __obj = js.Dynamic.literal(abort = abort, send = send)
  
    __obj.asInstanceOf[Transport]
  }
}

