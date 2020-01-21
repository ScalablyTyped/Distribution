package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsRenderedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference to the combo performing rendering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ItemsRenderedEventUIParam {
  @scala.inline
  def apply(dataSource: js.Any = null, owner: js.Any = null): ItemsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsRenderedEventUIParam]
  }
}

