package typings.jose.mod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlattenedJWE
  extends JWERecipient
     with JWEJSON
object FlattenedJWE {
  
  @scala.inline
  def apply(ciphertext: String, encrypted_key: String, iv: String, tag: String): FlattenedJWE = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], encrypted_key = encrypted_key.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenedJWE]
  }
}
