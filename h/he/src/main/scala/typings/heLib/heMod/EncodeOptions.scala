package typings
package heLib.heMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeOptions extends js.Object {
  /**
    * The default value for the allowUnsafeSymbols option is false. This means
    * that characters that are unsafe for use in HTML content (&, <, >, ", ',
    * and `) will be encoded. When set to true, only non-ASCII characters will
    * be encoded. If the encodeEverything option is set to true, this option
    * will be ignored.
    */
  var allowUnsafeSymbols: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default value for the decimal option is false. If the option is
    * enabled, encode will generally use decimal escapes (e.g. &#169;)
    * rather than hexadecimal escapes (e.g. &#xA9;). Beside of this
    * replacement, the basic behavior remains the same when combined with
    * other options. For example: if both options useNamedReferences and
    * decimal are enabled, named references (e.g. &copy;) are used over
    * decimal escapes. HTML entities without a named reference are encoded
    * using decimal escapes.
    */
  var decimal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default value for the encodeEverything option is false. This means
    * that encode() will not use any character references for printable ASCII
    * symbols that don’t need escaping. Set it to true to encode every symbol
    * in the input string. When set to true, this option takes precedence over
    * allowUnsafeSymbols (i.e. setting the latter to true in such a case has
    * no effect).
    */
  var encodeEverything: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default value for the strict option is false. This means that
    * encode() will encode any HTML text content you feed it, even if it
    * contains any symbols that cause parse errors. To throw an error when such
    * invalid HTML is encountered, set the strict option to true. This option
    * makes it possible to use he as part of HTML parsers and HTML validators.
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default value for the useNamedReferences option is false. This
    * means that encode() will not use any named character references
    * (e.g. &copy;) in the output — hexadecimal escapes (e.g. &#xA9;) will
    * be used instead. Set it to true to enable the use of named references.
    */
  var useNamedReferences: js.UndefOr[scala.Boolean] = js.undefined
}

object EncodeOptions {
  @scala.inline
  def apply(
    allowUnsafeSymbols: js.UndefOr[scala.Boolean] = js.undefined,
    decimal: js.UndefOr[scala.Boolean] = js.undefined,
    encodeEverything: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    useNamedReferences: js.UndefOr[scala.Boolean] = js.undefined
  ): EncodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsafeSymbols)) __obj.updateDynamic("allowUnsafeSymbols")(allowUnsafeSymbols)
    if (!js.isUndefined(decimal)) __obj.updateDynamic("decimal")(decimal)
    if (!js.isUndefined(encodeEverything)) __obj.updateDynamic("encodeEverything")(encodeEverything)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(useNamedReferences)) __obj.updateDynamic("useNamedReferences")(useNamedReferences)
    __obj.asInstanceOf[EncodeOptions]
  }
}

