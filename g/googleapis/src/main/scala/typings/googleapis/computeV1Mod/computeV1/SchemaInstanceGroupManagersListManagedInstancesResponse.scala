package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagersListManagedInstancesResponse extends js.Object {
  /**
    * [Output Only] The list of instances in the managed instance group.
    */
  var managedInstances: js.UndefOr[js.Array[SchemaManagedInstance]] = js.native
}

object SchemaInstanceGroupManagersListManagedInstancesResponse {
  @scala.inline
  def apply(managedInstances: js.Array[SchemaManagedInstance] = null): SchemaInstanceGroupManagersListManagedInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (managedInstances != null) __obj.updateDynamic("managedInstances")(managedInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupManagersListManagedInstancesResponse]
  }
}

