package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaGeneratedEventUIParam extends js.Object {
  /**
  	 * Gets reference to data source.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to data source schema.
  	 */
  var schema: js.UndefOr[js.Any] = js.undefined
}

object SchemaGeneratedEventUIParam {
  @scala.inline
  def apply(dataSource: js.Any = null, owner: js.Any = null, schema: js.Any = null): SchemaGeneratedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGeneratedEventUIParam]
  }
}

