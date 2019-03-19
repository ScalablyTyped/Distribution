package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispatchrpc extends js.Object {
  def dispatch_rpc(): scala.Double
  def xmlrpc_reply(rcode: scala.Double, reason: java.lang.String): scala.Double
}

object Anon_Dispatchrpc {
  @scala.inline
  def apply(dispatch_rpc: () => scala.Double, xmlrpc_reply: (scala.Double, java.lang.String) => scala.Double): Anon_Dispatchrpc = {
    val __obj = js.Dynamic.literal(dispatch_rpc = js.Any.fromFunction0(dispatch_rpc), xmlrpc_reply = js.Any.fromFunction2(xmlrpc_reply))
  
    __obj.asInstanceOf[Anon_Dispatchrpc]
  }
}

