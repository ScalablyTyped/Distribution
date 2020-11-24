package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveFolderMetadata extends js.Object {
  
  /** The resource name of the folder or organization to move the folder to. */
  var destinationParent: js.UndefOr[String] = js.native
  
  /** The display name of the folder. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The resource name of the folder's parent. */
  var sourceParent: js.UndefOr[String] = js.native
}
object MoveFolderMetadata {
  
  @scala.inline
  def apply(): MoveFolderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveFolderMetadata]
  }
  
  @scala.inline
  implicit class MoveFolderMetadataOps[Self <: MoveFolderMetadata] (val x: Self) extends AnyVal {
    
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
    def setSourceParent(value: String): Self = this.set("sourceParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceParent: Self = this.set("sourceParent", js.undefined)
  }
}
