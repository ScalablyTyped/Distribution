package typings.libp2pGossipsub.interfacesMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeClass extends js.Object {
  
  def openAndCertify(data: Uint8Array, domain: String): js.Promise[Envelope] = js.native
}
object EnvelopeClass {
  
  @scala.inline
  def apply(openAndCertify: (Uint8Array, String) => js.Promise[Envelope]): EnvelopeClass = {
    val __obj = js.Dynamic.literal(openAndCertify = js.Any.fromFunction2(openAndCertify))
    __obj.asInstanceOf[EnvelopeClass]
  }
  
  @scala.inline
  implicit class EnvelopeClassOps[Self <: EnvelopeClass] (val x: Self) extends AnyVal {
    
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
    def setOpenAndCertify(value: (Uint8Array, String) => js.Promise[Envelope]): Self = this.set("openAndCertify", js.Any.fromFunction2(value))
  }
}
