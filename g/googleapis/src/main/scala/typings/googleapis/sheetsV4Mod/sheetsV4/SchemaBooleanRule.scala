package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule that may or may not match, depending on the condition.
  */
@js.native
trait SchemaBooleanRule extends js.Object {
  /**
    * The condition of the rule. If the condition evaluates to true, the format
    * is applied.
    */
  var condition: js.UndefOr[SchemaBooleanCondition] = js.native
  /**
    * The format to apply. Conditional formatting can only apply a subset of
    * formatting: bold, italic, strikethrough, foreground color &amp;
    * background color.
    */
  var format: js.UndefOr[SchemaCellFormat] = js.native
}

object SchemaBooleanRule {
  @scala.inline
  def apply(condition: SchemaBooleanCondition = null, format: SchemaCellFormat = null): SchemaBooleanRule = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBooleanRule]
  }
}

