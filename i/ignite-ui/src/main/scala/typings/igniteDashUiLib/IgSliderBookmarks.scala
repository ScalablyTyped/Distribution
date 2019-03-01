package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSliderBookmarks
  extends /**
	 * Option for IgSliderBookmarks
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Get or set a custom css class to be applied to the bookmark anchor element.
  	 */
  var css: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set whether the bookmark is disabled or not.
  	 */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Get or set the bookmark title. Show in tooltip on hover.
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set the bookmark value. Should be between slider min and max values.
  	 */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object IgSliderBookmarks {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgSliderBookmarks
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    css: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): IgSliderBookmarks = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (css != null) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSliderBookmarks]
  }
}

