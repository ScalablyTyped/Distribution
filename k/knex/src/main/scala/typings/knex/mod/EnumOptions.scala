package typings.knex.mod

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
    val __obj = js.Dynamic.literal(enumName = enumName.asInstanceOf[js.Any], useNative = useNative.asInstanceOf[js.Any])
    if (!js.isUndefined(existingType)) __obj.updateDynamic("existingType")(existingType.get.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumOptions]
  }
}

