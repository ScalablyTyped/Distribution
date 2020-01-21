package typings.jju.mod

import typings.jju.jjuStrings.Apostrophe
import typings.jju.jjuStrings.Quotationmark
import typings.jju.jjuStrings.cjson
import typings.jju.jjuStrings.json
import typings.jju.jjuStrings.json5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  /**
    * Output ascii only (default false).
    * If this option is enabled, output will not have any characters except 0x20-0x7f.
    */
  var ascii: js.UndefOr[Boolean] = js.undefined
  /**
    * This option follows JSON specification.
    * @default '\t'
    */
  var indent: js.UndefOr[String | Double | Boolean] = js.undefined
  /**
    * Operation mode. Set it to 'json' if you want correct json in the output.
    * If it is 'json', following options are implied:
    * - options.quote = '"'
    * - options.no_trailing_comma = true
    * - options.quote_keys = true
    * - '\x' literals are not used
    */
  var mode: js.UndefOr[json | json5 | cjson] = js.undefined
  /**
    * Don't output trailing comma. If this option is set, arrays like `[1,2,3,]` will never be generated.
    * Otherwise they may be generated for pretty printing.
    * - If `mode` is JSON, default is true
    * - Otherwise, default is false
    */
  var no_trailing_comma: js.UndefOr[Boolean] = js.undefined
  /**
    * Enquoting char.
    * - If `mode` is 'json', default is "
    * - Otherwise, default is '
    */
  var quote: js.UndefOr[Quotationmark | Apostrophe] = js.undefined
  /**
    * Whether keys quoting in objects is required or not.
    * If you want `{"q": 1}` instead of `{q: 1}`, set it to true.
    * - If `mode` is 'json', default is true
    * - Otherwise, default is false
    */
  var quote_keys: js.UndefOr[Boolean] = js.undefined
  /**
    * Replacer function or array. This option follows JSON specification.
    * If a function, used to transform the results.
    * If an array, acts as a approved list for selecting the object properties that will be stringified.
    */
  var replacer: js.UndefOr[
    (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String])
  ] = js.undefined
  /**
    * Sort all keys while stringifying.
    * By default sort order will depend on implementation--with v8 it's insertion order.
    * If set to true, all keys (but not arrays) will be sorted alphabetically.
    * You can provide your own sorting function as well.
    * @default false
    */
  var sort_keys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(
    ascii: js.UndefOr[Boolean] = js.undefined,
    indent: String | Double | Boolean = null,
    mode: json | json5 | cjson = null,
    no_trailing_comma: js.UndefOr[Boolean] = js.undefined,
    quote: Quotationmark | Apostrophe = null,
    quote_keys: js.UndefOr[Boolean] = js.undefined,
    replacer: (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String]) = null,
    sort_keys: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) = null
  ): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascii)) __obj.updateDynamic("ascii")(ascii.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(no_trailing_comma)) __obj.updateDynamic("no_trailing_comma")(no_trailing_comma.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (!js.isUndefined(quote_keys)) __obj.updateDynamic("quote_keys")(quote_keys.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (sort_keys != null) __obj.updateDynamic("sort_keys")(sort_keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringifyOptions]
  }
}

