package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridRowSelectorsLocale
  extends /**
	 * Option for IgGridRowSelectorsLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Deselect all text for the select/deselect all overlay.
  	 *
  	 */
  var deselectAllText: js.UndefOr[String] = js.undefined
  /**
  	 * Deselected records text for the select/deselect all overlay.
  	 *
  	 */
  var deselectedRecordsText: js.UndefOr[String] = js.undefined
  /**
  	 * Select all text for the select/deselect all overlay.
  	 *
  	 */
  var selectAllText: js.UndefOr[String] = js.undefined
  /**
  	 * Selected records text for the select/deselect all overlay.
  	 *
  	 */
  var selectedRecordsText: js.UndefOr[String] = js.undefined
}

object IgGridRowSelectorsLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridRowSelectorsLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    deselectAllText: String = null,
    deselectedRecordsText: String = null,
    selectAllText: String = null,
    selectedRecordsText: String = null
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

