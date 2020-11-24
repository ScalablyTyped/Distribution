package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Region resource. (== resource_for beta.regions ==) (== resource_for
  * v1.regions ==)
  */
@js.native
trait SchemaRegion extends js.Object {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The deprecation status associated with this region.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.native
  
  /**
    * [Output Only] Textual description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of the resource. Always compute#region for regions.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Quotas assigned to this region.
    */
  var quotas: js.UndefOr[js.Array[SchemaQuota]] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Status of the region, either UP or DOWN.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] A list of zones available in this region, in the form of
    * resource URLs.
    */
  var zones: js.UndefOr[js.Array[String]] = js.native
}
object SchemaRegion {
  
  @scala.inline
  def apply(): SchemaRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegion]
  }
  
  @scala.inline
  implicit class SchemaRegionOps[Self <: SchemaRegion] (val x: Self) extends AnyVal {
    
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDeprecated(value: SchemaDeprecationStatus): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setQuotasVarargs(value: SchemaQuota*): Self = this.set("quotas", js.Array(value :_*))
    
    @scala.inline
    def setQuotas(value: js.Array[SchemaQuota]): Self = this.set("quotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotas: Self = this.set("quotas", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: String*): Self = this.set("zones", js.Array(value :_*))
    
    @scala.inline
    def setZones(value: js.Array[String]): Self = this.set("zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZones: Self = this.set("zones", js.undefined)
  }
}
