package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jwk extends js.Object {
  
  /** Algorithm. */
  var alg: js.UndefOr[String] = js.native
  
  /** Used for ECDSA keys. */
  var crv: js.UndefOr[String] = js.native
  
  /** Used for RSA keys. */
  var e: js.UndefOr[String] = js.native
  
  /** Key ID. */
  var kid: js.UndefOr[String] = js.native
  
  /** Key Type. */
  var kty: js.UndefOr[String] = js.native
  
  /** Used for RSA keys. */
  var n: js.UndefOr[String] = js.native
  
  /** Permitted uses for the public keys. */
  var use: js.UndefOr[String] = js.native
  
  /** Used for ECDSA keys. */
  var x: js.UndefOr[String] = js.native
  
  /** Used for ECDSA keys. */
  var y: js.UndefOr[String] = js.native
}
object Jwk {
  
  @scala.inline
  def apply(): Jwk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jwk]
  }
  
  @scala.inline
  implicit class JwkOps[Self <: Jwk] (val x: Self) extends AnyVal {
    
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
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
    
    @scala.inline
    def setCrv(value: String): Self = this.set("crv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrv: Self = this.set("crv", js.undefined)
    
    @scala.inline
    def setE(value: String): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    
    @scala.inline
    def setKid(value: String): Self = this.set("kid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKid: Self = this.set("kid", js.undefined)
    
    @scala.inline
    def setKty(value: String): Self = this.set("kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKty: Self = this.set("kty", js.undefined)
    
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    
    @scala.inline
    def setUse(value: String): Self = this.set("use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
    
    @scala.inline
    def setX(value: String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
