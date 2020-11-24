package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveFolderRequest extends js.Object {
  
  /** Required. The resource name of the Folder or Organization to reparent the folder under. Must be of the form `folders/{folder_id}` or `organizations/{org_id}`. */
  var destinationParent: js.UndefOr[String] = js.native
}
object MoveFolderRequest {
  
  @scala.inline
  def apply(): MoveFolderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveFolderRequest]
  }
  
  @scala.inline
  implicit class MoveFolderRequestOps[Self <: MoveFolderRequest] (val x: Self) extends AnyVal {
    
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
  }
}
