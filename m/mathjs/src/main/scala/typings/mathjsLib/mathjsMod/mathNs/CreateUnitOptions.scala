package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUnitOptions extends js.Object {
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var `override`: js.UndefOr[scala.Boolean] = js.undefined
  var prefixes: js.UndefOr[
    mathjsLib.mathjsLibStrings.none | mathjsLib.mathjsLibStrings.short | mathjsLib.mathjsLibStrings.long | mathjsLib.mathjsLibStrings.binary_short | mathjsLib.mathjsLibStrings.binary_long
  ] = js.undefined
}

object CreateUnitOptions {
  @scala.inline
  def apply(
    aliases: js.Array[java.lang.String] = null,
    offset: scala.Int | scala.Double = null,
    `override`: js.UndefOr[scala.Boolean] = js.undefined,
    prefixes: mathjsLib.mathjsLibStrings.none | mathjsLib.mathjsLibStrings.short | mathjsLib.mathjsLibStrings.long | mathjsLib.mathjsLibStrings.binary_short | mathjsLib.mathjsLibStrings.binary_long = null
  ): CreateUnitOptions = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUnitOptions]
  }
}

