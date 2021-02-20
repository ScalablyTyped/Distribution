package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskType extends StObject {
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined default disk size in GB. */
  var defaultDiskSizeGb: js.UndefOr[String] = js.native
  
  /** [Output Only] The deprecation status associated with this disk type. */
  var deprecated: js.UndefOr[DeprecationStatus] = js.native
  
  /** [Output Only] An optional description of this resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of the resource. Always compute#diskType for disk types. */
  var kind: js.UndefOr[String] = js.native
  
  /** [Output Only] Name of the resource. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] URL of the region where the disk type resides. Only applicable for regional resources. You must specify this field as part of the HTTP request URL. It is not settable
    * as a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** [Output Only] An optional textual description of the valid disk size, such as "10GB-10TB". */
  var validDiskSize: js.UndefOr[String] = js.native
  
  /** [Output Only] URL of the zone where the disk type resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body. */
  var zone: js.UndefOr[String] = js.native
}
object DiskType {
  
  @scala.inline
  def apply(): DiskType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskType]
  }
  
  @scala.inline
  implicit class DiskTypeMutableBuilder[Self <: DiskType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDefaultDiskSizeGb(value: String): Self = StObject.set(x, "defaultDiskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDiskSizeGbUndefined: Self = StObject.set(x, "defaultDiskSizeGb", js.undefined)
    
    @scala.inline
    def setDeprecated(value: DeprecationStatus): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setValidDiskSize(value: String): Self = StObject.set(x, "validDiskSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidDiskSizeUndefined: Self = StObject.set(x, "validDiskSize", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
