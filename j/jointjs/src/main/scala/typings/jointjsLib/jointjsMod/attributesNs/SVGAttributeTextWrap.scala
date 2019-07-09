package typings
package jointjsLib.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAttributeTextWrap
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var ellipsis: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var hyphen: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object SVGAttributeTextWrap {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ellipsis: scala.Boolean | java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    hyphen: java.lang.String = null,
    text: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): SVGAttributeTextWrap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hyphen != null) __obj.updateDynamic("hyphen")(hyphen)
    if (text != null) __obj.updateDynamic("text")(text)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAttributeTextWrap]
  }
}

