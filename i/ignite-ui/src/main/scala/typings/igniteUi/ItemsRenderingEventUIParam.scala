package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsRenderingEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference to the combo performing rendering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ItemsRenderingEventUIParam {
  @scala.inline
  def apply(dataSource: js.Any = null, owner: js.Any = null): ItemsRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsRenderingEventUIParam]
  }
}

