package typings
package json5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Quote extends js.Object {
  var quote: js.UndefOr[java.lang.String] = js.undefined
  var replacer: js.UndefOr[json5Lib.json5Mod.JSONReplacer] = js.undefined
  var space: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_Quote {
  @scala.inline
  def apply(
    quote: java.lang.String = null,
    replacer: json5Lib.json5Mod.JSONReplacer = null,
    space: scala.Double | java.lang.String = null
  ): Anon_Quote = {
    val __obj = js.Dynamic.literal()
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (replacer != null) __obj.updateDynamic("replacer")(replacer)
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Quote]
  }
}

