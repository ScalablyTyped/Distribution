package typings
package grammarkdownLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawArgument extends js.Object {
  var formattedKey: java.lang.String
  var option: KnownOption
  var rawKey: java.lang.String
  var value: js.Any
}

object RawArgument {
  @scala.inline
  def apply(formattedKey: java.lang.String, option: KnownOption, rawKey: java.lang.String, value: js.Any): RawArgument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formattedKey")(formattedKey)
    __obj.updateDynamic("option")(option)
    __obj.updateDynamic("rawKey")(rawKey)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RawArgument]
  }
}

