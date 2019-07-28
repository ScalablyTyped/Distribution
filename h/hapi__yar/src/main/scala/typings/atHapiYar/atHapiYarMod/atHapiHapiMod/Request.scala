package typings.atHapiYar.atHapiYarMod.atHapiHapiMod

import typings.atHapiYar.atHapiYarMod.Yar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var yar: Yar
}

object Request {
  @scala.inline
  def apply(yar: Yar): Request = {
    val __obj = js.Dynamic.literal(yar = yar)
  
    __obj.asInstanceOf[Request]
  }
}

