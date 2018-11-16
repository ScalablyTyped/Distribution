package typings
package hjsonLib.hjsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SerializeOptions extends js.Object {
  /**
     * makes braces appear on the same line as the key name. Default false.
     */
  var bracesSameLine: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * output ascii color codes
     */
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * show braces for the root object. Default true.
     */
  var emitRootBraces: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * specifies the EOL sequence (default is set by Hjson.setEndOfLine())
     */
  var eol: js.UndefOr[java.lang.String] = js.undefined
  /**
     * keep white space. See parse.
     */
  var keepWsc: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * controls how multiline strings are displayed. (setting quotes implies "off")
     * "std": strings containing \n are shown in multiline format (default)
     * "no-tabs": like std but disallow tabs
     * "off": show in JSON format
     */
  var multiline: js.UndefOr[
    hjsonLib.hjsonLibStrings.std | hjsonLib.hjsonLibStrings.`no-tabs` | hjsonLib.hjsonLibStrings.off
  ] = js.undefined
  /**
     * controls how strings are displayed. (setting separator implies "strings")
     * "min": no quotes whenever possible (default)
     * "keys": use quotes around keys
     * "strings": use quotes around string values
     * "all": use quotes around keys and string values
     */
  var quotes: js.UndefOr[
    hjsonLib.hjsonLibStrings.min | hjsonLib.hjsonLibStrings.keys | hjsonLib.hjsonLibStrings.strings | hjsonLib.hjsonLibStrings.all
  ] = js.undefined
  /**
     * output a comma separator between elements. Default false
     */
  var separator: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * specifies the indentation of nested structures.
     * If it is a number, it will specify the number of spaces to indent at each level.
     * If it is a string (such as '\t' or ' '), it contains the characters used to indent at each level.
     */
  var space: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

