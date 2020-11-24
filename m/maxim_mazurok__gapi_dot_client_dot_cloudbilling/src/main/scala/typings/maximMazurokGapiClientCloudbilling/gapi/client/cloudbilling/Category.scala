package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Category extends js.Object {
  
  /** The type of product the SKU refers to. Example: "Compute", "Storage", "Network", "ApplicationServices" etc. */
  var resourceFamily: js.UndefOr[String] = js.native
  
  /** A group classification for related SKUs. Example: "RAM", "GPU", "Prediction", "Ops", "GoogleEgress" etc. */
  var resourceGroup: js.UndefOr[String] = js.native
  
  /** The display name of the service this SKU belongs to. */
  var serviceDisplayName: js.UndefOr[String] = js.native
  
  /** Represents how the SKU is consumed. Example: "OnDemand", "Preemptible", "Commit1Mo", "Commit1Yr" etc. */
  var usageType: js.UndefOr[String] = js.native
}
object Category {
  
  @scala.inline
  def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
    
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
    def setResourceFamily(value: String): Self = this.set("resourceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceFamily: Self = this.set("resourceFamily", js.undefined)
    
    @scala.inline
    def setResourceGroup(value: String): Self = this.set("resourceGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceGroup: Self = this.set("resourceGroup", js.undefined)
    
    @scala.inline
    def setServiceDisplayName(value: String): Self = this.set("serviceDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceDisplayName: Self = this.set("serviceDisplayName", js.undefined)
    
    @scala.inline
    def setUsageType(value: String): Self = this.set("usageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageType: Self = this.set("usageType", js.undefined)
  }
}
