package typings
package atHapiYarLib.atHapiYarMod.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var yar: atHapiYarLib.atHapiYarMod.Yar
}

object Request {
  @scala.inline
  def apply(yar: atHapiYarLib.atHapiYarMod.Yar): Request = {
    val __obj = js.Dynamic.literal(yar = yar)
  
    __obj.asInstanceOf[Request]
  }
}

