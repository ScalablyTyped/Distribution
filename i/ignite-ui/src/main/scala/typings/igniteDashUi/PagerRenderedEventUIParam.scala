package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerRenderedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to grid's data source.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to GridPaging.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object PagerRenderedEventUIParam {
  @scala.inline
  def apply(dataSource: js.Any = null, owner: js.Any = null): PagerRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[PagerRenderedEventUIParam]
  }
}

