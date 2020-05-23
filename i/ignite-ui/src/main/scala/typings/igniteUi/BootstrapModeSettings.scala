package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapModeSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  var key: js.UndefOr[String] = js.undefined
  var visibilityTester: js.UndefOr[js.Any] = js.undefined
}

object BootstrapModeSettings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    key: String = null,
    visibilityTester: js.Any = null
  ): BootstrapModeSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (visibilityTester != null) __obj.updateDynamic("visibilityTester")(visibilityTester.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapModeSettings]
  }
}

