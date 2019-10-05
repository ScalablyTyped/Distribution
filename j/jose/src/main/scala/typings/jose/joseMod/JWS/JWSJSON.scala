package typings.jose.joseMod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWSJSON extends js.Object {
  var payload: String
}

object JWSJSON {
  @scala.inline
  def apply(payload: String): JWSJSON = {
    val __obj = js.Dynamic.literal(payload = payload)
  
    __obj.asInstanceOf[JWSJSON]
  }
}

