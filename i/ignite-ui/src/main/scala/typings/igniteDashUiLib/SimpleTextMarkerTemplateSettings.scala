package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTextMarkerTemplateSettings
  extends /**
	 * Option for SimpleTextMarkerTemplateSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderThickness: js.UndefOr[scala.Double] = js.undefined
  var font: js.UndefOr[js.Any] = js.undefined
  var getText: js.UndefOr[js.Any] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object SimpleTextMarkerTemplateSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for SimpleTextMarkerTemplateSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    borderThickness: scala.Int | scala.Double = null,
    font: js.Any = null,
    getText: js.Any = null,
    padding: scala.Int | scala.Double = null,
    textColor: java.lang.String = null
  ): SimpleTextMarkerTemplateSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderThickness != null) __obj.updateDynamic("borderThickness")(borderThickness.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (getText != null) __obj.updateDynamic("getText")(getText)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[SimpleTextMarkerTemplateSettings]
  }
}

