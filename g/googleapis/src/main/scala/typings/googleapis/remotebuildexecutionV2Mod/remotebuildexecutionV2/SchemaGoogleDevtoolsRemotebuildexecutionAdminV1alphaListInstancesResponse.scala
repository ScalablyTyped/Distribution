package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse extends js.Object {
  /**
    * The list of instances in a given project.
    */
  var instances: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse {
  @scala.inline
  def apply(instances: js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = null): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  }
}

