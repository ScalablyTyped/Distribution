package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionInstanceGroupManagersListInstancesResponse extends js.Object {
  /**
    * A list of managed instances.
    */
  var managedInstances: js.UndefOr[js.Array[SchemaManagedInstance]] = js.native
}

object SchemaRegionInstanceGroupManagersListInstancesResponse {
  @scala.inline
  def apply(managedInstances: js.Array[SchemaManagedInstance] = null): SchemaRegionInstanceGroupManagersListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (managedInstances != null) __obj.updateDynamic("managedInstances")(managedInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersListInstancesResponse]
  }
}

