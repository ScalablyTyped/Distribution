package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridColumnFixingLocale
  extends /**
	 * Option for IgGridColumnFixingLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Text of the feature chooser button for fixing a currently unfixed column.
  	 *
  	 */
  var featureChooserTextFixedColumn: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text of the feature chooser button for unfixing a currently fixed column.
  	 *
  	 */
  var featureChooserTextUnfixedColumn: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the tooltip text on the column fixing header icon when column is not fixed.
  	 *
  	 */
  var headerFixButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the tooltip text on the column fixing header icon when column is not fixed.
  	 *
  	 */
  var headerUnfixButtonText: js.UndefOr[java.lang.String] = js.undefined
}

object IgGridColumnFixingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridColumnFixingLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    featureChooserTextFixedColumn: java.lang.String = null,
    featureChooserTextUnfixedColumn: java.lang.String = null,
    headerFixButtonText: java.lang.String = null,
    headerUnfixButtonText: java.lang.String = null
  ): IgGridColumnFixingLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (featureChooserTextFixedColumn != null) __obj.updateDynamic("featureChooserTextFixedColumn")(featureChooserTextFixedColumn)
    if (featureChooserTextUnfixedColumn != null) __obj.updateDynamic("featureChooserTextUnfixedColumn")(featureChooserTextUnfixedColumn)
    if (headerFixButtonText != null) __obj.updateDynamic("headerFixButtonText")(headerFixButtonText)
    if (headerUnfixButtonText != null) __obj.updateDynamic("headerUnfixButtonText")(headerUnfixButtonText)
    __obj.asInstanceOf[IgGridColumnFixingLocale]
  }
}

