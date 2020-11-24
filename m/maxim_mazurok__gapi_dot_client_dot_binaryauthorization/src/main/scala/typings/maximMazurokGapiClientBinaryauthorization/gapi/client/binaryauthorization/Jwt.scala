package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jwt extends js.Object {
  
  /** The compact encoding of a JWS, which is always three base64 encoded strings joined by periods. For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1 */
  var compactJwt: js.UndefOr[String] = js.native
}
object Jwt {
  
  @scala.inline
  def apply(): Jwt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jwt]
  }
  
  @scala.inline
  implicit class JwtOps[Self <: Jwt] (val x: Self) extends AnyVal {
    
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
    def setCompactJwt(value: String): Self = this.set("compactJwt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompactJwt: Self = this.set("compactJwt", js.undefined)
  }
}
