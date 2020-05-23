package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionCollectionSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  var multipleSelection: js.UndefOr[Boolean] = js.undefined
  var owner: js.UndefOr[js.Any] = js.undefined
  var subscribers: js.UndefOr[SelectionCollectionSettingsSubscribers] = js.undefined
}

object SelectionCollectionSettings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    multipleSelection: js.UndefOr[Boolean] = js.undefined,
    owner: js.Any = null,
    subscribers: SelectionCollectionSettingsSubscribers = null
  ): SelectionCollectionSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(multipleSelection)) __obj.updateDynamic("multipleSelection")(multipleSelection.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (subscribers != null) __obj.updateDynamic("subscribers")(subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionCollectionSettings]
  }
}

