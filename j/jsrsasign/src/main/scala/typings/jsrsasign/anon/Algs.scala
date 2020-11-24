package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algs extends js.Object {
  
  var algs: String = js.native
  
  var certs: String = js.native
  
  var obj: SignedData = js.native
  
  var revs: String = js.native
  
  var si: js.Array[SignerInfo] = js.native
  
  var version: String = js.native
}
object Algs {
  
  @scala.inline
  def apply(
    algs: String,
    certs: String,
    obj: SignedData,
    revs: String,
    si: js.Array[SignerInfo],
    version: String
  ): Algs = {
    val __obj = js.Dynamic.literal(algs = algs.asInstanceOf[js.Any], certs = certs.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], revs = revs.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algs]
  }
  
  @scala.inline
  implicit class AlgsOps[Self <: Algs] (val x: Self) extends AnyVal {
    
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
    def setAlgs(value: String): Self = this.set("algs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCerts(value: String): Self = this.set("certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObj(value: SignedData): Self = this.set("obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevs(value: String): Self = this.set("revs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiVarargs(value: SignerInfo*): Self = this.set("si", js.Array(value :_*))
    
    @scala.inline
    def setSi(value: js.Array[SignerInfo]): Self = this.set("si", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
