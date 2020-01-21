package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListDataSourcesResponse extends js.Object {
  /**
    * A previously created data source.
    */
  var dataSource: js.UndefOr[js.Array[SchemaDataSource]] = js.native
}

object SchemaListDataSourcesResponse {
  @scala.inline
  def apply(dataSource: js.Array[SchemaDataSource] = null): SchemaListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDataSourcesResponse]
  }
}

