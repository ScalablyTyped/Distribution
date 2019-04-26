package typings
package atHapiYarLib.atHapiYarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerYar extends js.Object {
  def revoke(id: atHapiCatboxLib.atHapiCatboxMod.Id): js.Promise[scala.Unit]
}

object ServerYar {
  @scala.inline
  def apply(revoke: atHapiCatboxLib.atHapiCatboxMod.Id => js.Promise[scala.Unit]): ServerYar = {
    val __obj = js.Dynamic.literal(revoke = js.Any.fromFunction1(revoke))
  
    __obj.asInstanceOf[ServerYar]
  }
}

