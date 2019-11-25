package typings.atHapiYar.atHapiYarMod.atHapiHapiMod

import typings.atHapiYar.atHapiYarMod.ServerYar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var yar: ServerYar
}

object Server {
  @scala.inline
  def apply(yar: ServerYar): Server = {
    val __obj = js.Dynamic.literal(yar = yar.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Server]
  }
}

