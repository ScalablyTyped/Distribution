package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTextMarkerTemplateSettings
  extends /**
	 * Option for SimpleTextMarkerTemplateSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderThickness: js.UndefOr[Double] = js.undefined
  var font: js.UndefOr[js.Any] = js.undefined
  var getText: js.UndefOr[js.Any] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object SimpleTextMarkerTemplateSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for SimpleTextMarkerTemplateSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    backgroundColor: String = null,
    borderColor: String = null,
    borderThickness: Int | Double = null,
    font: js.Any = null,
    getText: js.Any = null,
    padding: Int | Double = null,
    textColor: String = null
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

