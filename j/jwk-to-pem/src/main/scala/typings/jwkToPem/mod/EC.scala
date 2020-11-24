package typings.jwkToPem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC extends JWK {
  
  var crv: String = js.native
  
  var kty: typings.jwkToPem.jwkToPemStrings.EC = js.native
  
  var x: String = js.native
  
  var y: String = js.native
}
object EC {
  
  @scala.inline
  def apply(crv: String, kty: typings.jwkToPem.jwkToPemStrings.EC, x: String, y: String): EC = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC]
  }
  
  @scala.inline
  implicit class ECOps[Self <: EC] (val x: Self) extends AnyVal {
    
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
    def setKty(value: typings.jwkToPem.jwkToPemStrings.EC): Self = this.set("kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
