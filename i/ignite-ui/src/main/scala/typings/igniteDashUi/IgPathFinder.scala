package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPathFinder
  extends /**
	 * Option for igPathFinder
	 */
/* optionName */ StringDictionary[js.Any] {
  var items: js.UndefOr[js.Any] = js.undefined
}

object IgPathFinder {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igPathFinder
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    items: js.Any = null
  ): IgPathFinder = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPathFinder]
  }
}

