package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceManagedByIgmErrorInstanceActionDetails extends js.Object {
  
  /** [Output Only] Action that managed instance group was executing on the instance when the error occurred. Possible values: */
  var action: js.UndefOr[String] = js.native
  
  /** [Output Only] The URL of the instance. The URL can be set even if the instance has not yet been created. */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Version this instance was created from, or was being created from, but the creation failed. Corresponds to one of the versions that were set on the Instance Group
    * Manager resource at the time this instance was being created.
    */
  var version: js.UndefOr[ManagedInstanceVersion] = js.native
}
object InstanceManagedByIgmErrorInstanceActionDetails {
  
  @scala.inline
  def apply(): InstanceManagedByIgmErrorInstanceActionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceManagedByIgmErrorInstanceActionDetails]
  }
  
  @scala.inline
  implicit class InstanceManagedByIgmErrorInstanceActionDetailsOps[Self <: InstanceManagedByIgmErrorInstanceActionDetails] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setVersion(value: ManagedInstanceVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
