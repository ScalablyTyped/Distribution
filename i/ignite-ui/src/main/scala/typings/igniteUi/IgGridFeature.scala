package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFeature
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Name of the feature to be enabled.
    */
  var name: js.UndefOr[String] = js.undefined
}

object IgGridFeature {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, name: String = null): IgGridFeature = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridFeature]
  }
}

