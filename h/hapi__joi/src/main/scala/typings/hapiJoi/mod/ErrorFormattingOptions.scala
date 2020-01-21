package typings.hapiJoi.mod

import typings.hapiJoi.hapiJoiBooleans.`false`
import typings.hapiJoi.hapiJoiStrings.key
import typings.hapiJoi.hapiJoiStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorFormattingOptions extends js.Object {
  /**
    * when true, error message templates will escape special characters to HTML entities, for security purposes.
    *
    * @default false
    */
  var escapeHtml: js.UndefOr[Boolean] = js.undefined
  /**
    * defines the value used to set the label context variable.
    */
  var label: js.UndefOr[path | key | `false`] = js.undefined
  /**
    * The preferred language code for error messages.
    * The value is matched against keys at the root of the messages object, and then the error code as a child key of that.
    * Can be a reference to the value, global context, or local context which is the root value passed to the validation function.
    *
    * Note that references to the value are usually not what you want as they move around the value structure relative to where the error happens.
    * Instead, either use the global context, or the absolute value (e.g. `Joi.ref('/variable')`)
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * when false, skips rendering error templates. Useful when error messages are generated elsewhere to save processing time.
    *
    * @default true
    */
  var render: js.UndefOr[Boolean] = js.undefined
  /**
    * when true, the main error will possess a stack trace, otherwise it will be disabled.
    * Defaults to false for performances reasons. Has no effect on platforms other than V8/node.js as it uses the Stack trace API.
    *
    * @default false
    */
  var stack: js.UndefOr[Boolean] = js.undefined
  /**
    * if true, array values in error messages are wrapped in [].
    *
    * @default true
    */
  var wrapArrays: js.UndefOr[Boolean] = js.undefined
}

object ErrorFormattingOptions {
  @scala.inline
  def apply(
    escapeHtml: js.UndefOr[Boolean] = js.undefined,
    label: path | key | `false` = null,
    language: String = null,
    render: js.UndefOr[Boolean] = js.undefined,
    stack: js.UndefOr[Boolean] = js.undefined,
    wrapArrays: js.UndefOr[Boolean] = js.undefined
  ): ErrorFormattingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(escapeHtml)) __obj.updateDynamic("escapeHtml")(escapeHtml.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(render)) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapArrays)) __obj.updateDynamic("wrapArrays")(wrapArrays.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorFormattingOptions]
  }
}

