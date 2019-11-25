package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSliderBookmarks
  extends /**
	 * Option for IgSliderBookmarks
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Get or set a custom css class to be applied to the bookmark anchor element.
  	 */
  var css: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set whether the bookmark is disabled or not.
  	 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Get or set the bookmark title. Show in tooltip on hover.
  	 */
  var title: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set the bookmark value. Should be between slider min and max values.
  	 */
  var value: js.UndefOr[Double] = js.undefined
}

object IgSliderBookmarks {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgSliderBookmarks
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    css: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    value: Int | Double = null
  ): IgSliderBookmarks = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSliderBookmarks]
  }
}

