package typings.libp2pGossipsub.peerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Registrar extends js.Object {
  
  def handle(): Unit = js.native
  
  def register(): Unit = js.native
  
  def unregister(): Unit = js.native
}
object Registrar {
  
  @scala.inline
  def apply(handle: () => Unit, register: () => Unit, unregister: () => Unit): Registrar = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction0(handle), register = js.Any.fromFunction0(register), unregister = js.Any.fromFunction0(unregister))
    __obj.asInstanceOf[Registrar]
  }
  
  @scala.inline
  implicit class RegistrarOps[Self <: Registrar] (val x: Self) extends AnyVal {
    
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
    def setHandle(value: () => Unit): Self = this.set("handle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: () => Unit): Self = this.set("register", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnregister(value: () => Unit): Self = this.set("unregister", js.Any.fromFunction0(value))
  }
}
