package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule describing a conditional format.
  */
@js.native
trait SchemaConditionalFormatRule extends js.Object {
  /**
    * The formatting is either &quot;on&quot; or &quot;off&quot; according to
    * the rule.
    */
  var booleanRule: js.UndefOr[SchemaBooleanRule] = js.native
  /**
    * The formatting will vary based on the gradients in the rule.
    */
  var gradientRule: js.UndefOr[SchemaGradientRule] = js.native
  /**
    * The ranges that are formatted if the condition is true. All the ranges
    * must be on the same grid.
    */
  var ranges: js.UndefOr[js.Array[SchemaGridRange]] = js.native
}

object SchemaConditionalFormatRule {
  @scala.inline
  def apply(
    booleanRule: SchemaBooleanRule = null,
    gradientRule: SchemaGradientRule = null,
    ranges: js.Array[SchemaGridRange] = null
  ): SchemaConditionalFormatRule = {
    val __obj = js.Dynamic.literal()
    if (booleanRule != null) __obj.updateDynamic("booleanRule")(booleanRule.asInstanceOf[js.Any])
    if (gradientRule != null) __obj.updateDynamic("gradientRule")(gradientRule.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConditionalFormatRule]
  }
}

