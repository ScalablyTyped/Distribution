package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteringEventUIParam extends js.Object {
  /**
  	 * Used to obtain reference to array which contains expressions supported by [$.ig.DataSource](ig.datasource).
  	 */
  var expression: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to igCombo.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FilteringEventUIParam {
  @scala.inline
  def apply(expression: js.Any = null, owner: js.Any = null): FilteringEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteringEventUIParam]
  }
}

