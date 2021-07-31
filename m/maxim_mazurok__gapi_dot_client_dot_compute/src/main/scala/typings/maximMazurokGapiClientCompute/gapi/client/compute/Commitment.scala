package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commitment extends StObject {
  
  /**
    * The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies
    * commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
    */
  var category: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Commitment end time in RFC3339 text format. */
  var endTimestamp: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of the resource. Always compute#commitment for commitments. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The license specification required as part of a license commitment. */
  var licenseResource: js.UndefOr[LicenseResourceCommitment] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years). */
  var plan: js.UndefOr[String] = js.undefined
  
  /** [Output Only] URL of the region where this commitment may be used. */
  var region: js.UndefOr[String] = js.undefined
  
  /** List of reservations in this commitment. */
  var reservations: js.UndefOr[js.Array[Reservation]] = js.undefined
  
  /** A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together. */
  var resources: js.UndefOr[js.Array[ResourceCommitment]] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Commitment start time in RFC3339 text format. */
  var startTimestamp: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Status of the commitment with regards to eventual expiration (each commitment has an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED. */
  var status: js.UndefOr[String] = js.undefined
  
  /** [Output Only] An optional, human-readable explanation of the status. */
  var statusMessage: js.UndefOr[String] = js.undefined
}
object Commitment {
  
  @scala.inline
  def apply(): Commitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Commitment]
  }
  
  @scala.inline
  implicit class CommitmentMutableBuilder[Self <: Commitment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEndTimestamp(value: String): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLicenseResource(value: LicenseResourceCommitment): Self = StObject.set(x, "licenseResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseResourceUndefined: Self = StObject.set(x, "licenseResource", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setReservations(value: js.Array[Reservation]): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    
    @scala.inline
    def setReservationsVarargs(value: Reservation*): Self = StObject.set(x, "reservations", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[ResourceCommitment]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: ResourceCommitment*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStartTimestamp(value: String): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
