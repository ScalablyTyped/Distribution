package typings.grammarkdown.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawArgument extends js.Object {
  var formattedKey: String
  var option: KnownOption
  var rawKey: String
  var value: js.Any
}

object RawArgument {
  @scala.inline
  def apply(formattedKey: String, option: KnownOption, rawKey: String, value: js.Any): RawArgument = {
    val __obj = js.Dynamic.literal(formattedKey = formattedKey, option = option, rawKey = rawKey, value = value)
  
    __obj.asInstanceOf[RawArgument]
  }
}

