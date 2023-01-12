package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interconnect extends StObject {
  
  /**
    * Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the
    * interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
    */
  var adminEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG. */
  var circuitInfos: js.UndefOr[js.Array[InterconnectCircuitInfo]] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect. */
  var customerName: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Output Only] A list of outages expected for this Interconnect. */
  var expectedOutages: js.UndefOr[js.Array[InterconnectOutageNotification]] = js.undefined
  
  /** [Output Only] IP address configured on the Google side of the Interconnect link. This can be used only for ping tests. */
  var googleIpAddress: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues. */
  var googleReferenceId: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] A list of the URLs of all InterconnectAttachments configured to use this Interconnect. */
  var interconnectAttachments: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated
    * physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
    */
  var interconnectType: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of the resource. Always compute#interconnect for interconnects. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR
    * optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
    */
  var linkType: js.UndefOr[String] = js.undefined
  
  /** URL of the InterconnectLocation object that represents where this connection is to be provisioned. */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to
    * all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
    */
  var nocContactEmail: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The current status of this Interconnect's functionality, which can take one of the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready
    * to use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this
    * Interconnect. - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
    */
  var operationalStatus: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can
    * be used only for ping tests.
    */
  var peerIpAddress: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Number of links actually provisioned in this interconnect. */
  var provisionedLinkCount: js.UndefOr[Double] = js.undefined
  
  /** Target number of physical links in the link bundle, as requested by the customer. */
  var requestedLinkCount: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The current state of Interconnect functionality, which can take one of the following values: - ACTIVE: The Interconnect is valid, turned up and ready to use.
    * Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect. -
    * UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
    */
  var state: js.UndefOr[String] = js.undefined
}
object Interconnect {
  
  inline def apply(): Interconnect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interconnect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interconnect] (val x: Self) extends AnyVal {
    
    inline def setAdminEnabled(value: Boolean): Self = StObject.set(x, "adminEnabled", value.asInstanceOf[js.Any])
    
    inline def setAdminEnabledUndefined: Self = StObject.set(x, "adminEnabled", js.undefined)
    
    inline def setCircuitInfos(value: js.Array[InterconnectCircuitInfo]): Self = StObject.set(x, "circuitInfos", value.asInstanceOf[js.Any])
    
    inline def setCircuitInfosUndefined: Self = StObject.set(x, "circuitInfos", js.undefined)
    
    inline def setCircuitInfosVarargs(value: InterconnectCircuitInfo*): Self = StObject.set(x, "circuitInfos", js.Array(value*))
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
    
    inline def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpectedOutages(value: js.Array[InterconnectOutageNotification]): Self = StObject.set(x, "expectedOutages", value.asInstanceOf[js.Any])
    
    inline def setExpectedOutagesUndefined: Self = StObject.set(x, "expectedOutages", js.undefined)
    
    inline def setExpectedOutagesVarargs(value: InterconnectOutageNotification*): Self = StObject.set(x, "expectedOutages", js.Array(value*))
    
    inline def setGoogleIpAddress(value: String): Self = StObject.set(x, "googleIpAddress", value.asInstanceOf[js.Any])
    
    inline def setGoogleIpAddressUndefined: Self = StObject.set(x, "googleIpAddress", js.undefined)
    
    inline def setGoogleReferenceId(value: String): Self = StObject.set(x, "googleReferenceId", value.asInstanceOf[js.Any])
    
    inline def setGoogleReferenceIdUndefined: Self = StObject.set(x, "googleReferenceId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInterconnectAttachments(value: js.Array[String]): Self = StObject.set(x, "interconnectAttachments", value.asInstanceOf[js.Any])
    
    inline def setInterconnectAttachmentsUndefined: Self = StObject.set(x, "interconnectAttachments", js.undefined)
    
    inline def setInterconnectAttachmentsVarargs(value: String*): Self = StObject.set(x, "interconnectAttachments", js.Array(value*))
    
    inline def setInterconnectType(value: String): Self = StObject.set(x, "interconnectType", value.asInstanceOf[js.Any])
    
    inline def setInterconnectTypeUndefined: Self = StObject.set(x, "interconnectType", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    inline def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNocContactEmail(value: String): Self = StObject.set(x, "nocContactEmail", value.asInstanceOf[js.Any])
    
    inline def setNocContactEmailUndefined: Self = StObject.set(x, "nocContactEmail", js.undefined)
    
    inline def setOperationalStatus(value: String): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    inline def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
    inline def setPeerIpAddress(value: String): Self = StObject.set(x, "peerIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerIpAddressUndefined: Self = StObject.set(x, "peerIpAddress", js.undefined)
    
    inline def setProvisionedLinkCount(value: Double): Self = StObject.set(x, "provisionedLinkCount", value.asInstanceOf[js.Any])
    
    inline def setProvisionedLinkCountUndefined: Self = StObject.set(x, "provisionedLinkCount", js.undefined)
    
    inline def setRequestedLinkCount(value: Double): Self = StObject.set(x, "requestedLinkCount", value.asInstanceOf[js.Any])
    
    inline def setRequestedLinkCountUndefined: Self = StObject.set(x, "requestedLinkCount", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
