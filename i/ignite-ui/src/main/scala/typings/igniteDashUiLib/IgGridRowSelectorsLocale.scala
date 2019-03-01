package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridRowSelectorsLocale
  extends /**
	 * Option for IgGridRowSelectorsLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Deselect all text for the select/deselect all overlay.
  	 *
  	 */
  var deselectAllText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Deselected records text for the select/deselect all overlay.
  	 *
  	 */
  var deselectedRecordsText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Select all text for the select/deselect all overlay.
  	 *
  	 */
  var selectAllText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Selected records text for the select/deselect all overlay.
  	 *
  	 */
  var selectedRecordsText: js.UndefOr[java.lang.String] = js.undefined
}

object IgGridRowSelectorsLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridRowSelectorsLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    deselectAllText: java.lang.String = null,
    deselectedRecordsText: java.lang.String = null,
    selectAllText: java.lang.String = null,
    selectedRecordsText: java.lang.String = null
  ): IgGridRowSelectorsLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (deselectAllText != null) __obj.updateDynamic("deselectAllText")(deselectAllText)
    if (deselectedRecordsText != null) __obj.updateDynamic("deselectedRecordsText")(deselectedRecordsText)
    if (selectAllText != null) __obj.updateDynamic("selectAllText")(selectAllText)
    if (selectedRecordsText != null) __obj.updateDynamic("selectedRecordsText")(selectedRecordsText)
    __obj.asInstanceOf[IgGridRowSelectorsLocale]
  }
}

