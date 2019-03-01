package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdValue extends js.Object {
  var id: java.lang.String
  var value: iobrokerLib.iobrokerMod.Global.ioBrokerNs.Object
}

object Anon_IdValue {
  @scala.inline
  def apply(id: java.lang.String, value: iobrokerLib.iobrokerMod.Global.ioBrokerNs.Object): Anon_IdValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_IdValue]
  }
}

