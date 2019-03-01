package typings
package inquirerLib.inquirerMod.inquirerNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var ctrl: scala.Boolean
  var meta: scala.Boolean
  var name: java.lang.String
  var sequence: java.lang.String
  var shift: scala.Boolean
}

object Key {
  @scala.inline
  def apply(
    ctrl: scala.Boolean,
    meta: scala.Boolean,
    name: java.lang.String,
    sequence: java.lang.String,
    shift: scala.Boolean
  ): Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ctrl")(ctrl)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("sequence")(sequence)
    __obj.updateDynamic("shift")(shift)
    __obj.asInstanceOf[Key]
  }
}

