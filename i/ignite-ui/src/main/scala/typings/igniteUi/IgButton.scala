package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgButton
  extends /**
  * Option for JSONPDataSourceSettings
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(centerLabel)) __obj.updateDynamic("centerLabel")(centerLabel.get.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (labelText != null) __obj.updateDynamic("labelText")(labelText.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyIcons)) __obj.updateDynamic("onlyIcons")(onlyIcons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgButton]
  }
}

