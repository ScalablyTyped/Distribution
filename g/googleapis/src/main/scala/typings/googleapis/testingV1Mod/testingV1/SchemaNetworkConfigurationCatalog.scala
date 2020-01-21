package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkConfigurationCatalog extends js.Object {
  var configurations: js.UndefOr[js.Array[SchemaNetworkConfiguration]] = js.native
}

object SchemaNetworkConfigurationCatalog {
  @scala.inline
  def apply(configurations: js.Array[SchemaNetworkConfiguration] = null): SchemaNetworkConfigurationCatalog = {
    val __obj = js.Dynamic.literal()
    if (configurations != null) __obj.updateDynamic("configurations")(configurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkConfigurationCatalog]
  }
}

