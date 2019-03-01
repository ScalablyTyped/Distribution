package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceUpdatedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the data source.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * See if an error has occured during update.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the data selector.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the result of the update operation.
  	 */
  var result: js.UndefOr[js.Any] = js.undefined
}

object DataSourceUpdatedEventUIParam {
  @scala.inline
  def apply(
    dataSource: js.Any = null,
    error: java.lang.String = null,
    owner: js.Any = null,
    result: js.Any = null
  ): DataSourceUpdatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (error != null) __obj.updateDynamic("error")(error)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[DataSourceUpdatedEventUIParam]
  }
}

