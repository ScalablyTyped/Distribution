package typings.hjson.hjsonMod

import typings.hjson.hjsonStrings.`no-tabs`
import typings.hjson.hjsonStrings.all
import typings.hjson.hjsonStrings.keys
import typings.hjson.hjsonStrings.min
import typings.hjson.hjsonStrings.off
import typings.hjson.hjsonStrings.std
import typings.hjson.hjsonStrings.strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeOptions extends js.Object {
  /**
    * makes braces appear on the same line as the key name. Default false.
    */
  var bracesSameLine: js.UndefOr[Boolean] = js.undefined
  /**
    * output ascii color codes
    */
  var colors: js.UndefOr[Boolean] = js.undefined
  /**
    * show braces for the root object. Default true.
    */
  var emitRootBraces: js.UndefOr[Boolean] = js.undefined
  /**
    * specifies the EOL sequence (default is set by Hjson.setEndOfLine())
    */
  var eol: js.UndefOr[String] = js.undefined
  /**
    * keep white space. See parse.
    */
  var keepWsc: js.UndefOr[Boolean] = js.undefined
  /**
    * controls how multiline strings are displayed. (setting quotes implies "off")
    * "std": strings containing \n are shown in multiline format (default)
    * "no-tabs": like std but disallow tabs
    * "off": show in JSON format
    */
  var multiline: js.UndefOr[std | `no-tabs` | off] = js.undefined
  /**
    * controls how strings are displayed. (setting separator implies "strings")
    * "min": no quotes whenever possible (default)
    * "keys": use quotes around keys
    * "strings": use quotes around string values
    * "all": use quotes around keys and string values
    */
  var quotes: js.UndefOr[min | keys | strings | all] = js.undefined
  /**
    * output a comma separator between elements. Default false
    */
  var separator: js.UndefOr[Boolean] = js.undefined
  /**
    * specifies the indentation of nested structures.
    * If it is a number, it will specify the number of spaces to indent at each level.
    * If it is a string (such as '\t' or ' '), it contains the characters used to indent at each level.
    */
  var space: js.UndefOr[Double | String] = js.undefined
}

object SerializeOptions {
  @scala.inline
  def apply(
    bracesSameLine: js.UndefOr[Boolean] = js.undefined,
    colors: js.UndefOr[Boolean] = js.undefined,
    emitRootBraces: js.UndefOr[Boolean] = js.undefined,
    eol: String = null,
    keepWsc: js.UndefOr[Boolean] = js.undefined,
    multiline: std | `no-tabs` | off = null,
    quotes: min | keys | strings | all = null,
    separator: js.UndefOr[Boolean] = js.undefined,
    space: Double | String = null
  ): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bracesSameLine)) __obj.updateDynamic("bracesSameLine")(bracesSameLine.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(emitRootBraces)) __obj.updateDynamic("emitRootBraces")(emitRootBraces.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (!js.isUndefined(keepWsc)) __obj.updateDynamic("keepWsc")(keepWsc.asInstanceOf[js.Any])
    if (multiline != null) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (!js.isUndefined(separator)) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeOptions]
  }
}

