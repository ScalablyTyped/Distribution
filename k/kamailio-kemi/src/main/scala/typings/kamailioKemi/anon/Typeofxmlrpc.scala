package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofxmlrpc extends js.Object {
  
  def dispatch_rpc(): Double = js.native
  
  def xmlrpc_reply(rcode: Double, reason: String): Double = js.native
}
object Typeofxmlrpc {
  
  @scala.inline
  def apply(dispatch_rpc: () => Double, xmlrpc_reply: (Double, String) => Double): Typeofxmlrpc = {
    val __obj = js.Dynamic.literal(dispatch_rpc = js.Any.fromFunction0(dispatch_rpc), xmlrpc_reply = js.Any.fromFunction2(xmlrpc_reply))
    __obj.asInstanceOf[Typeofxmlrpc]
  }
  
  @scala.inline
  implicit class TypeofxmlrpcOps[Self <: Typeofxmlrpc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDispatch_rpc(value: () => Double): Self = this.set("dispatch_rpc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setXmlrpc_reply(value: (Double, String) => Double): Self = this.set("xmlrpc_reply", js.Any.fromFunction2(value))
  }
}
