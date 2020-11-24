package typings.jose.mod.JWKS

import typings.jose.mod.BasicParameters
import typings.jose.mod.keyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyQuery extends BasicParameters {
  
  var crv: js.UndefOr[String] = js.native
  
  var kty: js.UndefOr[keyType] = js.native
  
  var thumbprint: js.UndefOr[String] = js.native
  
  var x5t: js.UndefOr[String] = js.native
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
}
object KeyQuery {
  
  @scala.inline
  def apply(): KeyQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyQuery]
  }
  
  @scala.inline
  implicit class KeyQueryOps[Self <: KeyQuery] (val x: Self) extends AnyVal {
    
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
    def setCrv(value: String): Self = this.set("crv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrv: Self = this.set("crv", js.undefined)
    
    @scala.inline
    def setKty(value: keyType): Self = this.set("kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKty: Self = this.set("kty", js.undefined)
    
    @scala.inline
    def setThumbprint(value: String): Self = this.set("thumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbprint: Self = this.set("thumbprint", js.undefined)
    
    @scala.inline
    def setX5t(value: String): Self = this.set("x5t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX5t: Self = this.set("x5t", js.undefined)
    
    @scala.inline
    def setX5tNumbersignS256(value: String): Self = this.set("x5t#S256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX5tNumbersignS256: Self = this.set("x5t#S256", js.undefined)
  }
}
