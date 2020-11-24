package typings.jose.mod.JWS

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlattenedJWS
  extends JWSRecipient
     with JWSJSON
object FlattenedJWS {
  
  @scala.inline
  def apply(payload: String | Buffer, signature: String): FlattenedJWS = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenedJWS]
  }
}
