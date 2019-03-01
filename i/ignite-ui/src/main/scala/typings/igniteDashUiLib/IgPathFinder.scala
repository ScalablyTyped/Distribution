package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPathFinder
  extends /**
	 * Option for igPathFinder
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var items: js.UndefOr[js.Any] = js.undefined
}

object IgPathFinder {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igPathFinder
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    items: js.Any = null
  ): IgPathFinder = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[IgPathFinder]
  }
}

