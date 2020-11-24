package typings.jose.mod.JWS

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneralJWS extends JWSJSON {
  
  var signatures: js.Array[JWSRecipient] = js.native
}
object GeneralJWS {
  
  @scala.inline
  def apply(payload: String | Buffer, signatures: js.Array[JWSRecipient]): GeneralJWS = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralJWS]
  }
  
  @scala.inline
  implicit class GeneralJWSOps[Self <: GeneralJWS] (val x: Self) extends AnyVal {
    
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
    def setSignaturesVarargs(value: JWSRecipient*): Self = this.set("signatures", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[JWSRecipient]): Self = this.set("signatures", value.asInstanceOf[js.Any])
  }
}
