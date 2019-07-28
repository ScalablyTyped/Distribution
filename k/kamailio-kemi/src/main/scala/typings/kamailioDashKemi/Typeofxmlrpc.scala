package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxmlrpc extends js.Object {
  def dispatch_rpc(): Double
  def xmlrpc_reply(rcode: Double, reason: String): Double
}

object Typeofxmlrpc {
  @scala.inline
  def apply(dispatch_rpc: () => Double, xmlrpc_reply: (Double, String) => Double): Typeofxmlrpc = {
    val __obj = js.Dynamic.literal(dispatch_rpc = js.Any.fromFunction0(dispatch_rpc), xmlrpc_reply = js.Any.fromFunction2(xmlrpc_reply))
  
    __obj.asInstanceOf[Typeofxmlrpc]
  }
}

