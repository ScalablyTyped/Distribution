package typings.jwtClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWTObject extends js.Object {
  
  var claim: js.Any = js.native
  
  var header: JWTHeader = js.native
  
  var signature: String = js.native
}
object JWTObject {
  
  @scala.inline
  def apply(claim: js.Any, header: JWTHeader, signature: String): JWTObject = {
    val __obj = js.Dynamic.literal(claim = claim.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTObject]
  }
  
  @scala.inline
  implicit class JWTObjectOps[Self <: JWTObject] (val x: Self) extends AnyVal {
    
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
    def setClaim(value: js.Any): Self = this.set("claim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: JWTHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
}
