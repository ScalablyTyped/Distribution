package typings.jose.joseMod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralJWS extends JWSJSON {
  var signatures: js.Array[JWSRecipient]
}

object GeneralJWS {
  @scala.inline
  def apply(payload: String, signatures: js.Array[JWSRecipient]): GeneralJWS = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralJWS]
  }
}

