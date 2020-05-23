package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBindingEventUIParam extends js.Object {
  /**
    * Used to obtain reference to instance of $.ig.DataSource.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DataBindingEventUIParam {
  @scala.inline
  def apply(dataSource: js.Any = null, owner: js.Any = null): DataBindingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBindingEventUIParam]
  }
}

