package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredEventUIParam extends js.Object {
  /**
  	 * Used to obtain a jquery reference to the rendered filtered elements.
  	 */
  var elements: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to igCombo.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FilteredEventUIParam {
  @scala.inline
  def apply(elements: js.Any = null, owner: js.Any = null): FilteredEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[FilteredEventUIParam]
  }
}

