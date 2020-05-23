package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBoundEventUIParam extends js.Object {
  /**
    * Used to obtain reference to array actual data which is displayed by chart.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to obtain reference to instance of $.ig.DataSource.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DataBoundEventUIParam {
  @scala.inline
  def apply(data: js.Any = null, dataSource: js.Any = null, owner: js.Any = null): DataBoundEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBoundEventUIParam]
  }
}

