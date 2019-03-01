package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionCollectionSettings
  extends /**
	 * Option for SelectionCollectionSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var multipleSelection: js.UndefOr[scala.Boolean] = js.undefined
  var owner: js.UndefOr[js.Any] = js.undefined
  var subscribers: js.UndefOr[SelectionCollectionSettingsSubscribers] = js.undefined
}

object SelectionCollectionSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for SelectionCollectionSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    multipleSelection: js.UndefOr[scala.Boolean] = js.undefined,
    owner: js.Any = null,
    subscribers: SelectionCollectionSettingsSubscribers = null
  ): SelectionCollectionSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(multipleSelection)) __obj.updateDynamic("multipleSelection")(multipleSelection)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (subscribers != null) __obj.updateDynamic("subscribers")(subscribers)
    __obj.asInstanceOf[SelectionCollectionSettings]
  }
}

