package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgButton
  extends /**
	 * Option for igButton
	 */
/* optionName */ StringDictionary[js.Any] {
  var centerLabel: js.UndefOr[Boolean] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var height: js.UndefOr[js.Any] = js.undefined
  var icons: js.UndefOr[IgButtonIcons] = js.undefined
  var labelText: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[IgButtonLink] = js.undefined
  var onlyIcons: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[js.Any] = js.undefined
}

object IgButton {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igButton
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    centerLabel: js.UndefOr[Boolean] = js.undefined,
    css: js.Any = null,
    height: js.Any = null,
    icons: IgButtonIcons = null,
    labelText: String = null,
    link: IgButtonLink = null,
    onlyIcons: js.UndefOr[Boolean] = js.undefined,
    title: js.UndefOr[Boolean] = js.undefined,
    width: js.Any = null
  ): IgButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(centerLabel)) __obj.updateDynamic("centerLabel")(centerLabel)
    if (css != null) __obj.updateDynamic("css")(css)
    if (height != null) __obj.updateDynamic("height")(height)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (labelText != null) __obj.updateDynamic("labelText")(labelText)
    if (link != null) __obj.updateDynamic("link")(link)
    if (!js.isUndefined(onlyIcons)) __obj.updateDynamic("onlyIcons")(onlyIcons)
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IgButton]
  }
}

