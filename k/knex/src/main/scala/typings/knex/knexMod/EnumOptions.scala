package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumOptions extends js.Object {
  var enumName: String
  var existingType: Boolean
  var useNative: Boolean
}

object EnumOptions {
  @scala.inline
  def apply(enumName: String, existingType: Boolean, useNative: Boolean): EnumOptions = {
    val __obj = js.Dynamic.literal(enumName = enumName, existingType = existingType, useNative = useNative)
  
    __obj.asInstanceOf[EnumOptions]
  }
}

