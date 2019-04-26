package typings
package atHapiYarLib.atHapiYarMod.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var yar: atHapiYarLib.atHapiYarMod.ServerYar
}

object Server {
  @scala.inline
  def apply(yar: atHapiYarLib.atHapiYarMod.ServerYar): Server = {
    val __obj = js.Dynamic.literal(yar = yar)
  
    __obj.asInstanceOf[Server]
  }
}

