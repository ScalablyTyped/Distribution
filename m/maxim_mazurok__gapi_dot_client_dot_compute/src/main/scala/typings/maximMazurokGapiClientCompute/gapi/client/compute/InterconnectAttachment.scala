package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectAttachment extends js.Object {
  
  /** Determines whether this Attachment will carry packets. Not present for PARTNER_PROVIDER. */
  var adminEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Provisioned bandwidth capacity for the interconnect attachment. For attachments of type DEDICATED, the user can set the bandwidth. For attachments of type PARTNER, the Google
    * Partner that is operating the interconnect must set the bandwidth. Output only for PARTNER type, mutable for PARTNER_PROVIDER and DEDICATED, and can take one of the following
    * values:
    * - BPS_50M: 50 Mbit/s
    * - BPS_100M: 100 Mbit/s
    * - BPS_200M: 200 Mbit/s
    * - BPS_300M: 300 Mbit/s
    * - BPS_400M: 400 Mbit/s
    * - BPS_500M: 500 Mbit/s
    * - BPS_1G: 1 Gbit/s
    * - BPS_2G: 2 Gbit/s
    * - BPS_5G: 5 Gbit/s
    * - BPS_10G: 10 Gbit/s
    * - BPS_20G: 20 Gbit/s
    * - BPS_50G: 50 Gbit/s
    */
  var bandwidth: js.UndefOr[String] = js.native
  
  /**
    * Up to 16 candidate prefixes that can be used to restrict the allocation of cloudRouterIpAddress and customerRouterIpAddress for this attachment. All prefixes must be within
    * link-local address space (169.254.0.0/16) and must be /29 or shorter (/28, /27, etc). Google will attempt to select an unused /29 from the supplied candidate prefix(es). The request
    * will fail if all possible /29s are in use on Google's edge. If not supplied, Google will randomly select an unused /29 from all of link-local space.
    */
  var candidateSubnets: js.UndefOr[js.Array[String]] = js.native
  
  /** [Output Only] IPv4 address + prefix length to be configured on Cloud Router Interface for this interconnect attachment. */
  var cloudRouterIpAddress: js.UndefOr[String] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** [Output Only] IPv4 address + prefix length to be configured on the customer router subinterface for this interconnect attachment. */
  var customerRouterIpAddress: js.UndefOr[String] = js.native
  
  /** [Output Only] Dataplane version for this InterconnectAttachment. */
  var dataplaneVersion: js.UndefOr[Double] = js.native
  
  /** An optional description of this resource. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Desired availability domain for the attachment. Only available for type PARTNER, at creation time, and can take one of the following values:
    * - AVAILABILITY_DOMAIN_ANY
    * - AVAILABILITY_DOMAIN_1
    * - AVAILABILITY_DOMAIN_2 For improved reliability, customers should configure a pair of attachments, one per availability domain. The selected availability domain will be provided to
    * the Partner via the pairing key, so that the provisioned circuit will lie in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
    */
  var edgeAvailabilityDomain: js.UndefOr[String] = js.native
  
  /** [Output Only] Google reference ID, to be used when raising support tickets with Google or otherwise to debug backend connectivity issues. [Deprecated] This field is not used. */
  var googleReferenceId: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** URL of the underlying Interconnect object that this attachment's traffic will traverse through. */
  var interconnect: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of the resource. Always compute#interconnectAttachment for interconnect attachments. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The current status of whether or not this interconnect attachment is functional, which can take one of the following values:
    * - OS_ACTIVE: The attachment has been turned up and is ready to use.
    * - OS_UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete.
    */
  var operationalStatus: js.UndefOr[String] = js.native
  
  /**
    * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not present for DEDICATED]. The opaque identifier of an PARTNER attachment used to initiate provisioning with a
    * selected partner. Of the form "XXXXX/region/domain"
    */
  var pairingKey: js.UndefOr[String] = js.native
  
  /**
    * Optional BGP ASN for the router supplied by a Layer 3 Partner if they configured BGP on behalf of the customer. Output only for PARTNER type, input only for PARTNER_PROVIDER, not
    * available for DEDICATED.
    */
  var partnerAsn: js.UndefOr[String] = js.native
  
  /** Informational metadata about Partner attachments from Partners to display to customers. Output only for for PARTNER type, mutable for PARTNER_PROVIDER, not available for DEDICATED. */
  var partnerMetadata: js.UndefOr[InterconnectAttachmentPartnerMetadata] = js.native
  
  /** [Output Only] Information specific to an InterconnectAttachment. This property is populated if the interconnect that this is attached to is of type DEDICATED. */
  var privateInterconnectInfo: js.UndefOr[InterconnectAttachmentPrivateInfo] = js.native
  
  /**
    * [Output Only] URL of the region where the regional interconnect attachment resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the
    * request body.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * URL of the Cloud Router to be used for dynamic routing. This router must be in the same region as this InterconnectAttachment. The InterconnectAttachment will automatically connect
    * the Interconnect to the network & region within which the Cloud Router is configured.
    */
  var router: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The current state of this attachment's functionality. Enum values ACTIVE and UNPROVISIONED are shared by DEDICATED/PRIVATE, PARTNER, and PARTNER_PROVIDER interconnect
    * attachments, while enum values PENDING_PARTNER, PARTNER_REQUEST_RECEIVED, and PENDING_CUSTOMER are used for only PARTNER and PARTNER_PROVIDER interconnect attachments. This state
    * can take one of the following values:
    * - ACTIVE: The attachment has been turned up and is ready to use.
    * - UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete.
    * - PENDING_PARTNER: A newly-created PARTNER attachment that has not yet been configured on the Partner side.
    * - PARTNER_REQUEST_RECEIVED: A PARTNER attachment is in the process of provisioning after a PARTNER_PROVIDER attachment was created that references it.
    * - PENDING_CUSTOMER: A PARTNER or PARTNER_PROVIDER attachment that is waiting for a customer to activate it.
    * - DEFUNCT: The attachment was deleted externally and is no longer functional. This could be because the associated Interconnect was removed, or because the other side of a Partner
    * attachment was deleted.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * The type of interconnect attachment this is, which can take one of the following values:
    * - DEDICATED: an attachment to a Dedicated Interconnect.
    * - PARTNER: an attachment to a Partner Interconnect, created by the customer.
    * - PARTNER_PROVIDER: an attachment to a Partner Interconnect, created by the partner.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /** The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only specified at creation time. */
  var vlanTag8021q: js.UndefOr[Double] = js.native
}
object InterconnectAttachment {
  
  @scala.inline
  def apply(): InterconnectAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectAttachment]
  }
  
  @scala.inline
  implicit class InterconnectAttachmentOps[Self <: InterconnectAttachment] (val x: Self) extends AnyVal {
    
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
    def setAdminEnabled(value: Boolean): Self = this.set("adminEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminEnabled: Self = this.set("adminEnabled", js.undefined)
    
    @scala.inline
    def setBandwidth(value: String): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setCandidateSubnetsVarargs(value: String*): Self = this.set("candidateSubnets", js.Array(value :_*))
    
    @scala.inline
    def setCandidateSubnets(value: js.Array[String]): Self = this.set("candidateSubnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandidateSubnets: Self = this.set("candidateSubnets", js.undefined)
    
    @scala.inline
    def setCloudRouterIpAddress(value: String): Self = this.set("cloudRouterIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudRouterIpAddress: Self = this.set("cloudRouterIpAddress", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setCustomerRouterIpAddress(value: String): Self = this.set("customerRouterIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerRouterIpAddress: Self = this.set("customerRouterIpAddress", js.undefined)
    
    @scala.inline
    def setDataplaneVersion(value: Double): Self = this.set("dataplaneVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataplaneVersion: Self = this.set("dataplaneVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEdgeAvailabilityDomain(value: String): Self = this.set("edgeAvailabilityDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeAvailabilityDomain: Self = this.set("edgeAvailabilityDomain", js.undefined)
    
    @scala.inline
    def setGoogleReferenceId(value: String): Self = this.set("googleReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleReferenceId: Self = this.set("googleReferenceId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInterconnect(value: String): Self = this.set("interconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterconnect: Self = this.set("interconnect", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOperationalStatus(value: String): Self = this.set("operationalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationalStatus: Self = this.set("operationalStatus", js.undefined)
    
    @scala.inline
    def setPairingKey(value: String): Self = this.set("pairingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePairingKey: Self = this.set("pairingKey", js.undefined)
    
    @scala.inline
    def setPartnerAsn(value: String): Self = this.set("partnerAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerAsn: Self = this.set("partnerAsn", js.undefined)
    
    @scala.inline
    def setPartnerMetadata(value: InterconnectAttachmentPartnerMetadata): Self = this.set("partnerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerMetadata: Self = this.set("partnerMetadata", js.undefined)
    
    @scala.inline
    def setPrivateInterconnectInfo(value: InterconnectAttachmentPrivateInfo): Self = this.set("privateInterconnectInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateInterconnectInfo: Self = this.set("privateInterconnectInfo", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRouter(value: String): Self = this.set("router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouter: Self = this.set("router", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVlanTag8021q(value: Double): Self = this.set("vlanTag8021q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVlanTag8021q: Self = this.set("vlanTag8021q", js.undefined)
  }
}
