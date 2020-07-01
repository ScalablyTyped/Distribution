package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The allowed types for [VALUE] in a `[KEY]:[VALUE]` attribute.
  */
@js.native
trait SchemaAttributeValue extends js.Object {
  /**
    * A Boolean value represented by `true` or `false`.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * A 64-bit signed integer.
    */
  var intValue: js.UndefOr[String] = js.native
  /**
    * A string up to 256 bytes long.
    */
  var stringValue: js.UndefOr[SchemaTruncatableString] = js.native
}

object SchemaAttributeValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    intValue: String = null,
    stringValue: SchemaTruncatableString = null
  ): SchemaAttributeValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.get.asInstanceOf[js.Any])
    if (intValue != null) __obj.updateDynamic("intValue")(intValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttributeValue]
  }
}

