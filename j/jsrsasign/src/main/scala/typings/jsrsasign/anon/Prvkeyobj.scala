package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertificate
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prvkeyobj extends js.Object {
  
  var prvkeyobj: js.UndefOr[RSAKey | ECDSA | DSA] = js.native
  
  var tbscertobj: js.UndefOr[TBSCertificate] = js.native
}
object Prvkeyobj {
  
  @scala.inline
  def apply(): Prvkeyobj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prvkeyobj]
  }
  
  @scala.inline
  implicit class PrvkeyobjOps[Self <: Prvkeyobj] (val x: Self) extends AnyVal {
    
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
    def setPrvkeyobj(value: RSAKey | ECDSA | DSA): Self = this.set("prvkeyobj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrvkeyobj: Self = this.set("prvkeyobj", js.undefined)
    
    @scala.inline
    def setTbscertobj(value: TBSCertificate): Self = this.set("tbscertobj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTbscertobj: Self = this.set("tbscertobj", js.undefined)
  }
}
