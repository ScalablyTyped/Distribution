package typings.jose.joseMod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenedJWS
  extends JWSRecipient
     with JWSJSON

object FlattenedJWS {
  @scala.inline
  def apply(payload: String, signature: String, header: js.Object = null, `protected`: String = null): FlattenedJWS = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenedJWS]
  }
}

