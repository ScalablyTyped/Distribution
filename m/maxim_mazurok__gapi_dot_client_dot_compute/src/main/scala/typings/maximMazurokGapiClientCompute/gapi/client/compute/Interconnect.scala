package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interconnect extends js.Object {
  
  /**
    * Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the
    * interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
    */
  var adminEnabled: js.UndefOr[Boolean] = js.native
  
  /** [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG. */
  var circuitInfos: js.UndefOr[js.Array[InterconnectCircuitInfo]] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect. */
  var customerName: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output Only] A list of outages expected for this Interconnect. */
  var expectedOutages: js.UndefOr[js.Array[InterconnectOutageNotification]] = js.native
  
  /** [Output Only] IP address configured on the Google side of the Interconnect link. This can be used only for ping tests. */
  var googleIpAddress: js.UndefOr[String] = js.native
  
  /** [Output Only] Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues. */
  var googleReferenceId: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] A list of the URLs of all InterconnectAttachments configured to use this Interconnect. */
  var interconnectAttachments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Type of interconnect, which can take one of the following values:
    * - PARTNER: A partner-managed interconnection shared between customers though a partner.
    * - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
    */
  var interconnectType: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of the resource. Always compute#interconnect for interconnects. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Type of link requested, which can take one of the following values:
    * - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics
    * - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
    */
  var linkType: js.UndefOr[String] = js.native
  
  /** URL of the InterconnectLocation object that represents where this connection is to be provisioned. */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to
    * all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
    */
  var nocContactEmail: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The current status of this Interconnect's functionality, which can take one of the following values:
    * - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect.
    * - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect.
    * - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
    */
  var operationalStatus: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can
    * be used only for ping tests.
    */
  var peerIpAddress: js.UndefOr[String] = js.native
  
  /** [Output Only] Number of links actually provisioned in this interconnect. */
  var provisionedLinkCount: js.UndefOr[Double] = js.native
  
  /** Target number of physical links in the link bundle, as requested by the customer. */
  var requestedLinkCount: js.UndefOr[Double] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The current state of Interconnect functionality, which can take one of the following values:
    * - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect.
    * - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect.
    * - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
    */
  var state: js.UndefOr[String] = js.native
}
object Interconnect {
  
  @scala.inline
  def apply(): Interconnect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interconnect]
  }
  
  @scala.inline
  implicit class InterconnectOps[Self <: Interconnect] (val x: Self) extends AnyVal {
    
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
    def setCircuitInfosVarargs(value: InterconnectCircuitInfo*): Self = this.set("circuitInfos", js.Array(value :_*))
    
    @scala.inline
    def setCircuitInfos(value: js.Array[InterconnectCircuitInfo]): Self = this.set("circuitInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircuitInfos: Self = this.set("circuitInfos", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setCustomerName(value: String): Self = this.set("customerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerName: Self = this.set("customerName", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExpectedOutagesVarargs(value: InterconnectOutageNotification*): Self = this.set("expectedOutages", js.Array(value :_*))
    
    @scala.inline
    def setExpectedOutages(value: js.Array[InterconnectOutageNotification]): Self = this.set("expectedOutages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedOutages: Self = this.set("expectedOutages", js.undefined)
    
    @scala.inline
    def setGoogleIpAddress(value: String): Self = this.set("googleIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleIpAddress: Self = this.set("googleIpAddress", js.undefined)
    
    @scala.inline
    def setGoogleReferenceId(value: String): Self = this.set("googleReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleReferenceId: Self = this.set("googleReferenceId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInterconnectAttachmentsVarargs(value: String*): Self = this.set("interconnectAttachments", js.Array(value :_*))
    
    @scala.inline
    def setInterconnectAttachments(value: js.Array[String]): Self = this.set("interconnectAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterconnectAttachments: Self = this.set("interconnectAttachments", js.undefined)
    
    @scala.inline
    def setInterconnectType(value: String): Self = this.set("interconnectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterconnectType: Self = this.set("interconnectType", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLinkType(value: String): Self = this.set("linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkType: Self = this.set("linkType", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNocContactEmail(value: String): Self = this.set("nocContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNocContactEmail: Self = this.set("nocContactEmail", js.undefined)
    
    @scala.inline
    def setOperationalStatus(value: String): Self = this.set("operationalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationalStatus: Self = this.set("operationalStatus", js.undefined)
    
    @scala.inline
    def setPeerIpAddress(value: String): Self = this.set("peerIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerIpAddress: Self = this.set("peerIpAddress", js.undefined)
    
    @scala.inline
    def setProvisionedLinkCount(value: Double): Self = this.set("provisionedLinkCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedLinkCount: Self = this.set("provisionedLinkCount", js.undefined)
    
    @scala.inline
    def setRequestedLinkCount(value: Double): Self = this.set("requestedLinkCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedLinkCount: Self = this.set("requestedLinkCount", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
