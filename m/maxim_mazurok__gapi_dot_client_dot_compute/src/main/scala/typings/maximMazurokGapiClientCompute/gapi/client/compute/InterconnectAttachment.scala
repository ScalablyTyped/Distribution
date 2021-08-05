package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterconnectAttachment extends StObject {
  
  /** Determines whether this Attachment will carry packets. Not present for PARTNER_PROVIDER. */
  var adminEnabled: js.UndefOr[Boolean] = js.undefined
  
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
  var bandwidth: js.UndefOr[String] = js.undefined
  
  /**
    * Up to 16 candidate prefixes that can be used to restrict the allocation of cloudRouterIpAddress and customerRouterIpAddress for this attachment. All prefixes must be within
    * link-local address space (169.254.0.0/16) and must be /29 or shorter (/28, /27, etc). Google will attempt to select an unused /29 from the supplied candidate prefix(es). The request
    * will fail if all possible /29s are in use on Google's edge. If not supplied, Google will randomly select an unused /29 from all of link-local space.
    */
  var candidateSubnets: js.UndefOr[js.Array[String]] = js.undefined
  
  /** [Output Only] IPv4 address + prefix length to be configured on Cloud Router Interface for this interconnect attachment. */
  var cloudRouterIpAddress: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** [Output Only] IPv4 address + prefix length to be configured on the customer router subinterface for this interconnect attachment. */
  var customerRouterIpAddress: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Dataplane version for this InterconnectAttachment. */
  var dataplaneVersion: js.UndefOr[Double] = js.undefined
  
  /** An optional description of this resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Desired availability domain for the attachment. Only available for type PARTNER, at creation time, and can take one of the following values:
    * - AVAILABILITY_DOMAIN_ANY
    * - AVAILABILITY_DOMAIN_1
    * - AVAILABILITY_DOMAIN_2 For improved reliability, customers should configure a pair of attachments, one per availability domain. The selected availability domain will be provided to
    * the Partner via the pairing key, so that the provisioned circuit will lie in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
    */
  var edgeAvailabilityDomain: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Google reference ID, to be used when raising support tickets with Google or otherwise to debug backend connectivity issues. [Deprecated] This field is not used. */
  var googleReferenceId: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** URL of the underlying Interconnect object that this attachment's traffic will traverse through. */
  var interconnect: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of the resource. Always compute#interconnectAttachment for interconnect attachments. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The current status of whether or not this interconnect attachment is functional, which can take one of the following values:
    * - OS_ACTIVE: The attachment has been turned up and is ready to use.
    * - OS_UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete.
    */
  var operationalStatus: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not present for DEDICATED]. The opaque identifier of an PARTNER attachment used to initiate provisioning with a
    * selected partner. Of the form "XXXXX/region/domain"
    */
  var pairingKey: js.UndefOr[String] = js.undefined
  
  /**
    * Optional BGP ASN for the router supplied by a Layer 3 Partner if they configured BGP on behalf of the customer. Output only for PARTNER type, input only for PARTNER_PROVIDER, not
    * available for DEDICATED.
    */
  var partnerAsn: js.UndefOr[String] = js.undefined
  
  /** Informational metadata about Partner attachments from Partners to display to customers. Output only for for PARTNER type, mutable for PARTNER_PROVIDER, not available for DEDICATED. */
  var partnerMetadata: js.UndefOr[InterconnectAttachmentPartnerMetadata] = js.undefined
  
  /** [Output Only] Information specific to an InterconnectAttachment. This property is populated if the interconnect that this is attached to is of type DEDICATED. */
  var privateInterconnectInfo: js.UndefOr[InterconnectAttachmentPrivateInfo] = js.undefined
  
  /**
    * [Output Only] URL of the region where the regional interconnect attachment resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the
    * request body.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the Cloud Router to be used for dynamic routing. This router must be in the same region as this InterconnectAttachment. The InterconnectAttachment will automatically connect
    * the Interconnect to the network & region within which the Cloud Router is configured.
    */
  var router: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
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
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The type of interconnect attachment this is, which can take one of the following values:
    * - DEDICATED: an attachment to a Dedicated Interconnect.
    * - PARTNER: an attachment to a Partner Interconnect, created by the customer.
    * - PARTNER_PROVIDER: an attachment to a Partner Interconnect, created by the partner.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only specified at creation time. */
  var vlanTag8021q: js.UndefOr[Double] = js.undefined
}
object InterconnectAttachment {
  
  inline def apply(): InterconnectAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectAttachment]
  }
  
  extension [Self <: InterconnectAttachment](x: Self) {
    
    inline def setAdminEnabled(value: Boolean): Self = StObject.set(x, "adminEnabled", value.asInstanceOf[js.Any])
    
    inline def setAdminEnabledUndefined: Self = StObject.set(x, "adminEnabled", js.undefined)
    
    inline def setBandwidth(value: String): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setCandidateSubnets(value: js.Array[String]): Self = StObject.set(x, "candidateSubnets", value.asInstanceOf[js.Any])
    
    inline def setCandidateSubnetsUndefined: Self = StObject.set(x, "candidateSubnets", js.undefined)
    
    inline def setCandidateSubnetsVarargs(value: String*): Self = StObject.set(x, "candidateSubnets", js.Array(value :_*))
    
    inline def setCloudRouterIpAddress(value: String): Self = StObject.set(x, "cloudRouterIpAddress", value.asInstanceOf[js.Any])
    
    inline def setCloudRouterIpAddressUndefined: Self = StObject.set(x, "cloudRouterIpAddress", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setCustomerRouterIpAddress(value: String): Self = StObject.set(x, "customerRouterIpAddress", value.asInstanceOf[js.Any])
    
    inline def setCustomerRouterIpAddressUndefined: Self = StObject.set(x, "customerRouterIpAddress", js.undefined)
    
    inline def setDataplaneVersion(value: Double): Self = StObject.set(x, "dataplaneVersion", value.asInstanceOf[js.Any])
    
    inline def setDataplaneVersionUndefined: Self = StObject.set(x, "dataplaneVersion", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEdgeAvailabilityDomain(value: String): Self = StObject.set(x, "edgeAvailabilityDomain", value.asInstanceOf[js.Any])
    
    inline def setEdgeAvailabilityDomainUndefined: Self = StObject.set(x, "edgeAvailabilityDomain", js.undefined)
    
    inline def setGoogleReferenceId(value: String): Self = StObject.set(x, "googleReferenceId", value.asInstanceOf[js.Any])
    
    inline def setGoogleReferenceIdUndefined: Self = StObject.set(x, "googleReferenceId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInterconnect(value: String): Self = StObject.set(x, "interconnect", value.asInstanceOf[js.Any])
    
    inline def setInterconnectUndefined: Self = StObject.set(x, "interconnect", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperationalStatus(value: String): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    inline def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
    inline def setPairingKey(value: String): Self = StObject.set(x, "pairingKey", value.asInstanceOf[js.Any])
    
    inline def setPairingKeyUndefined: Self = StObject.set(x, "pairingKey", js.undefined)
    
    inline def setPartnerAsn(value: String): Self = StObject.set(x, "partnerAsn", value.asInstanceOf[js.Any])
    
    inline def setPartnerAsnUndefined: Self = StObject.set(x, "partnerAsn", js.undefined)
    
    inline def setPartnerMetadata(value: InterconnectAttachmentPartnerMetadata): Self = StObject.set(x, "partnerMetadata", value.asInstanceOf[js.Any])
    
    inline def setPartnerMetadataUndefined: Self = StObject.set(x, "partnerMetadata", js.undefined)
    
    inline def setPrivateInterconnectInfo(value: InterconnectAttachmentPrivateInfo): Self = StObject.set(x, "privateInterconnectInfo", value.asInstanceOf[js.Any])
    
    inline def setPrivateInterconnectInfoUndefined: Self = StObject.set(x, "privateInterconnectInfo", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRouter(value: String): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVlanTag8021q(value: Double): Self = StObject.set(x, "vlanTag8021q", value.asInstanceOf[js.Any])
    
    inline def setVlanTag8021qUndefined: Self = StObject.set(x, "vlanTag8021q", js.undefined)
  }
}
