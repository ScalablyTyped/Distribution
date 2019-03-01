package typings
package heremapsLib.HNs.mapNs.ImprintNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to style an imprint
  * @property invert {boolean=} - Indicates whether the logo is inverted. If omitted the current value remains, default is false.
  * @property font {string=} - The font of the text. If omitted the current value remains, default is &quot;11px Arial,sans-serif&quot;.
  * @property href {string=} - The URL of the &quot;Terms of use&quot; link. If omitted the current value remains, default is &quot;http://here.com/terms&quot;.
  */
trait Options extends js.Object {
  var font: js.UndefOr[java.lang.String] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var invert: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    font: java.lang.String = null,
    href: java.lang.String = null,
    invert: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert)
    __obj.asInstanceOf[Options]
  }
}

