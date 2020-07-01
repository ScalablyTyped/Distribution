package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum value definition.
  */
@js.native
trait SchemaEnumValue extends js.Object {
  /**
    * Enum value name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Enum value number.
    */
  var number: js.UndefOr[Double] = js.native
  /**
    * Protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.native
}

object SchemaEnumValue {
  @scala.inline
  def apply(
    name: String = null,
    number: js.UndefOr[Double] = js.undefined,
    options: js.Array[SchemaOption] = null
  ): SchemaEnumValue = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnumValue]
  }
}

