package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

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
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponseOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstancesVarargs(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
  }
  
}

