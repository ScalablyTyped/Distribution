package typings
package js2xmlparserLib.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormatOptions extends js.Object {
  /**
    * Whether double quotes or single quotes should be used in XML attributes.
    * By default, single quotes are used.
    */
  var doubleQuotes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The indent string used for pretty-printing. The default indent string is
    * four spaces.
    */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The newline string used for pretty-printing. The default newline string
    * is "\n".
    */
  var newline: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether pretty-printing is enabled. By default, pretty-printing is
    * enabled.
    */
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
}

object IFormatOptions {
  @scala.inline
  def apply(
    doubleQuotes: js.UndefOr[scala.Boolean] = js.undefined,
    indent: java.lang.String = null,
    newline: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined
  ): IFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doubleQuotes)) __obj.updateDynamic("doubleQuotes")(doubleQuotes)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    __obj.asInstanceOf[IFormatOptions]
  }
}

