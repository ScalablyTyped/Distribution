package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTooltip
  extends /**
	 * Option for igTooltip
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var arrowLocation: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object IgTooltip {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTooltip
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    arrowLocation: java.lang.String = null,
    text: java.lang.String = null
  ): IgTooltip = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (arrowLocation != null) __obj.updateDynamic("arrowLocation")(arrowLocation)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[IgTooltip]
  }
}

