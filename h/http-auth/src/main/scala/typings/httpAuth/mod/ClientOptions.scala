package typings.httpAuth.mod

import typings.httpAuth.httpAuthStrings.auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
  var algorithm: Algorithm = js.native
  
  var cnonce: js.UndefOr[String] = js.native
  
  var nc: js.UndefOr[String] = js.native
  
  var nonce: String = js.native
  
  var qop: js.UndefOr[auth] = js.native
  
  var realm: String = js.native
  
  var response: String = js.native
  
  var uri: String = js.native
  
  var username: String = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(
    algorithm: Algorithm,
    nonce: String,
    realm: String,
    response: String,
    uri: String,
    username: String
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: Algorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCnonce(value: String): Self = this.set("cnonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCnonce: Self = this.set("cnonce", js.undefined)
    
    @scala.inline
    def setNc(value: String): Self = this.set("nc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNc: Self = this.set("nc", js.undefined)
    
    @scala.inline
    def setQop(value: auth): Self = this.set("qop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQop: Self = this.set("qop", js.undefined)
  }
}
