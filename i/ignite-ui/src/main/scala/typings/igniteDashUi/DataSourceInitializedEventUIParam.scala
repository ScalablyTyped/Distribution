package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceInitializedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the data source.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * See if an error has occured during initialization.
  	 */
  var error: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the root of the data source metatadata root item.
  	 */
  var metadataTreeRoot: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the data selector.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DataSourceInitializedEventUIParam {
  @scala.inline
  def apply(
    dataSource: js.Any = null,
    error: String = null,
    metadataTreeRoot: js.Any = null,
    owner: js.Any = null
  ): DataSourceInitializedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (error != null) __obj.updateDynamic("error")(error)
    if (metadataTreeRoot != null) __obj.updateDynamic("metadataTreeRoot")(metadataTreeRoot)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[DataSourceInitializedEventUIParam]
  }
}

