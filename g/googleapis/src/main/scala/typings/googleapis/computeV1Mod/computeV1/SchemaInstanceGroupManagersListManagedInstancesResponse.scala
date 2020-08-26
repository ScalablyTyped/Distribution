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
  def apply(): SchemaInstanceGroupManagersListManagedInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersListManagedInstancesResponse]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagersListManagedInstancesResponseOps[Self <: SchemaInstanceGroupManagersListManagedInstancesResponse] (val x: Self) extends AnyVal {
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
    def setManagedInstancesVarargs(value: SchemaManagedInstance*): Self = this.set("managedInstances", js.Array(value :_*))
    @scala.inline
    def setManagedInstances(value: js.Array[SchemaManagedInstance]): Self = this.set("managedInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedInstances: Self = this.set("managedInstances", js.undefined)
  }
  
}

