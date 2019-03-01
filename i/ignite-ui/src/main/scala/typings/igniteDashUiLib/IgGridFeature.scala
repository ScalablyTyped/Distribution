package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFeature
  extends /**
	 * Option for IgGridFeature
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Name of the feature to be enabled.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object IgGridFeature {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridFeature
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    name: java.lang.String = null
  ): IgGridFeature = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IgGridFeature]
  }
}

