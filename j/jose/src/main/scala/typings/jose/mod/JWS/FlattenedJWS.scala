package typings.jose.mod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlattenedJWS
  extends JWSRecipient
     with JWSJSON

object FlattenedJWS {
  @scala.inline
  def apply(payload: String, signature: String): FlattenedJWS = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenedJWS]
  }
}

