package typings
package keypressDotJsLib.keypressDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerDefaults extends js.Object {
  var is_counting: scala.Boolean
  var is_exclusive: scala.Boolean
  var is_sequence: scala.Boolean
  var is_solitary: scala.Boolean
  var is_unordered: scala.Boolean
  var keys: java.lang.String
  var prevent_default: scala.Boolean
  var prevent_repeat: scala.Boolean
}

object ListenerDefaults {
  @scala.inline
  def apply(
    is_counting: scala.Boolean,
    is_exclusive: scala.Boolean,
    is_sequence: scala.Boolean,
    is_solitary: scala.Boolean,
    is_unordered: scala.Boolean,
    keys: java.lang.String,
    prevent_default: scala.Boolean,
    prevent_repeat: scala.Boolean
  ): ListenerDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("is_counting")(is_counting)
    __obj.updateDynamic("is_exclusive")(is_exclusive)
    __obj.updateDynamic("is_sequence")(is_sequence)
    __obj.updateDynamic("is_solitary")(is_solitary)
    __obj.updateDynamic("is_unordered")(is_unordered)
    __obj.updateDynamic("keys")(keys)
    __obj.updateDynamic("prevent_default")(prevent_default)
    __obj.updateDynamic("prevent_repeat")(prevent_repeat)
    __obj.asInstanceOf[ListenerDefaults]
  }
}

