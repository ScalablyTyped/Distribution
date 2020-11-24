package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectMetadata extends js.Object {
  
  /** Creation time of the project creation workflow. */
  var createTime: js.UndefOr[String] = js.native
  
  /** True if the project can be retrieved using GetProject. No other operations on the project are guaranteed to work until the project creation is complete. */
  var gettable: js.UndefOr[Boolean] = js.native
  
  /** True if the project creation process is complete. */
  var ready: js.UndefOr[Boolean] = js.native
}
object CreateProjectMetadata {
  
  @scala.inline
  def apply(): CreateProjectMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectMetadata]
  }
  
  @scala.inline
  implicit class CreateProjectMetadataOps[Self <: CreateProjectMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setGettable(value: Boolean): Self = this.set("gettable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGettable: Self = this.set("gettable", js.undefined)
    
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
}
