package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudresourcemanagerGoogleCloudResourcemanagerV2alpha1FolderOperation extends js.Object {
  
  /** The resource name of the folder or organization we are either creating the folder under or moving the folder to. */
  var destinationParent: js.UndefOr[String] = js.native
  
  /** The display name of the folder. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The type of this operation. */
  var operationType: js.UndefOr[String] = js.native
  
  /** The resource name of the folder's parent. Only applicable when the operation_type is MOVE. */
  var sourceParent: js.UndefOr[String] = js.native
}
object CloudresourcemanagerGoogleCloudResourcemanagerV2alpha1FolderOperation {
  
  @scala.inline
  def apply(): CloudresourcemanagerGoogleCloudResourcemanagerV2alpha1FolderOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudresourcemanagerGoogleCloudResourcemanagerV2alpha1FolderOperation]
  }
  
  @scala.inline
  implicit class CloudresourcemanagerGoogleCloudResourcemanagerV2alpha1FolderOperationOps[Self <: CloudresourcemanagerGoogleCloudResourcemanagerV2alpha1FolderOperation] (val x: Self) extends AnyVal {
    
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
    def setDestinationParent(value: String): Self = this.set("destinationParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationParent: Self = this.set("destinationParent", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setSourceParent(value: String): Self = this.set("sourceParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceParent: Self = this.set("sourceParent", js.undefined)
  }
}
