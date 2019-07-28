package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFeature
  extends /**
	 * Option for IgGridFeature
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Name of the feature to be enabled.
  	 */
  var name: js.UndefOr[String] = js.undefined
}

object IgGridFeature {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridFeature
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    name: String = null
  ): IgGridFeature = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IgGridFeature]
  }
}

