package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Caissuer extends js.Object {
  
  var caissuer: js.Array[String] = js.native
  
  var ocsp: js.Array[String] = js.native
}
object Caissuer {
  
  @scala.inline
  def apply(caissuer: js.Array[String], ocsp: js.Array[String]): Caissuer = {
    val __obj = js.Dynamic.literal(caissuer = caissuer.asInstanceOf[js.Any], ocsp = ocsp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caissuer]
  }
  
  @scala.inline
  implicit class CaissuerOps[Self <: Caissuer] (val x: Self) extends AnyVal {
    
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
    def setCaissuerVarargs(value: String*): Self = this.set("caissuer", js.Array(value :_*))
    
    @scala.inline
    def setCaissuer(value: js.Array[String]): Self = this.set("caissuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcspVarargs(value: String*): Self = this.set("ocsp", js.Array(value :_*))
    
    @scala.inline
    def setOcsp(value: js.Array[String]): Self = this.set("ocsp", value.asInstanceOf[js.Any])
  }
}
