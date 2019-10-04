package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumOptions extends js.Object {
  var enumName: String
  var existingType: js.UndefOr[Boolean] = js.undefined
  var schemaName: js.UndefOr[String] = js.undefined
  var useNative: Boolean
}

object EnumOptions {
  @scala.inline
  def apply(
    enumName: String,
    useNative: Boolean,
    existingType: js.UndefOr[Boolean] = js.undefined,
    schemaName: String = null
  ): EnumOptions = {
    val __obj = js.Dynamic.literal(enumName = enumName, useNative = useNative)
    if (!js.isUndefined(existingType)) __obj.updateDynamic("existingType")(existingType)
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName)
    __obj.asInstanceOf[EnumOptions]
  }
}

