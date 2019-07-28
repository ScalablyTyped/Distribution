package typings.jointjs.jointjsMod.attributesNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAttributeTextWrap
  extends /* key */ StringDictionary[js.Any] {
  var ellipsis: js.UndefOr[Boolean | String] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var hyphen: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object SVGAttributeTextWrap {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    ellipsis: Boolean | String = null,
    height: String | Double = null,
    hyphen: String = null,
    text: String = null,
    width: String | Double = null
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

