package typings.jws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWK extends CertificateProperties {
  
  var alg: js.UndefOr[Algorithm] = js.native
  
  var key_ops: js.UndefOr[js.Array[String]] = js.native
  
  var kty: String = js.native
  
  var use: js.UndefOr[String] = js.native
}
object JWK {
  
  @scala.inline
  def apply(kty: String): JWK = {
    val __obj = js.Dynamic.literal(kty = kty.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWK]
  }
  
  @scala.inline
  implicit class JWKOps[Self <: JWK] (val x: Self) extends AnyVal {
    
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
    def setKty(value: String): Self = this.set("kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlg(value: Algorithm): Self = this.set("alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
    
    @scala.inline
    def setKey_opsVarargs(value: String*): Self = this.set("key_ops", js.Array(value :_*))
    
    @scala.inline
    def setKey_ops(value: js.Array[String]): Self = this.set("key_ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey_ops: Self = this.set("key_ops", js.undefined)
    
    @scala.inline
    def setUse(value: String): Self = this.set("use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
}
