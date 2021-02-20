package typings.googleapis.computeV1Mod.computeV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compute Engine API
  *
  * Creates and runs virtual machines on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const compute = google.compute('v1');
  *
  * @namespace compute
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Compute
  */
@JSImport("googleapis/build/src/apis/compute/v1", "compute_v1.Compute")
@js.native
class Compute protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var acceleratorTypes: ResourceAcceleratortypes = js.native
  
  var addresses: ResourceAddresses = js.native
  
  var autoscalers: ResourceAutoscalers = js.native
  
  var backendBuckets: ResourceBackendbuckets = js.native
  
  var backendServices: ResourceBackendservices = js.native
  
  var context: APIRequestContext = js.native
  
  var diskTypes: ResourceDisktypes = js.native
  
  var disks: ResourceDisks = js.native
  
  var firewalls: ResourceFirewalls = js.native
  
  var forwardingRules: ResourceForwardingrules = js.native
  
  var globalAddresses: ResourceGlobaladdresses = js.native
  
  var globalForwardingRules: ResourceGlobalforwardingrules = js.native
  
  var globalOperations: ResourceGlobaloperations = js.native
  
  var healthChecks: ResourceHealthchecks = js.native
  
  var httpHealthChecks: ResourceHttphealthchecks = js.native
  
  var httpsHealthChecks: ResourceHttpshealthchecks = js.native
  
  var images: ResourceImages = js.native
  
  var instanceGroupManagers: ResourceInstancegroupmanagers = js.native
  
  var instanceGroups: ResourceInstancegroups = js.native
  
  var instanceTemplates: ResourceInstancetemplates = js.native
  
  var instances: ResourceInstances = js.native
  
  var interconnectAttachments: ResourceInterconnectattachments = js.native
  
  var interconnectLocations: ResourceInterconnectlocations = js.native
  
  var interconnects: ResourceInterconnects = js.native
  
  var licenseCodes: ResourceLicensecodes = js.native
  
  var licenses: ResourceLicenses = js.native
  
  var machineTypes: ResourceMachinetypes = js.native
  
  var networkEndpointGroups: ResourceNetworkendpointgroups = js.native
  
  var networks: ResourceNetworks = js.native
  
  var nodeGroups: ResourceNodegroups = js.native
  
  var nodeTemplates: ResourceNodetemplates = js.native
  
  var nodeTypes: ResourceNodetypes = js.native
  
  var projects: ResourceProjects = js.native
  
  var regionAutoscalers: ResourceRegionautoscalers = js.native
  
  var regionBackendServices: ResourceRegionbackendservices = js.native
  
  var regionCommitments: ResourceRegioncommitments = js.native
  
  var regionDiskTypes: ResourceRegiondisktypes = js.native
  
  var regionDisks: ResourceRegiondisks = js.native
  
  var regionInstanceGroupManagers: ResourceRegioninstancegroupmanagers = js.native
  
  var regionInstanceGroups: ResourceRegioninstancegroups = js.native
  
  var regionOperations: ResourceRegionoperations = js.native
  
  var regions: ResourceRegions = js.native
  
  var routers: ResourceRouters = js.native
  
  var routes: ResourceRoutes = js.native
  
  var securityPolicies: ResourceSecuritypolicies = js.native
  
  var snapshots: ResourceSnapshots = js.native
  
  var sslCertificates: ResourceSslcertificates = js.native
  
  var sslPolicies: ResourceSslpolicies = js.native
  
  var subnetworks: ResourceSubnetworks = js.native
  
  var targetHttpProxies: ResourceTargethttpproxies = js.native
  
  var targetHttpsProxies: ResourceTargethttpsproxies = js.native
  
  var targetInstances: ResourceTargetinstances = js.native
  
  var targetPools: ResourceTargetpools = js.native
  
  var targetSslProxies: ResourceTargetsslproxies = js.native
  
  var targetTcpProxies: ResourceTargettcpproxies = js.native
  
  var targetVpnGateways: ResourceTargetvpngateways = js.native
  
  var urlMaps: ResourceUrlmaps = js.native
  
  var vpnTunnels: ResourceVpntunnels = js.native
  
  var zoneOperations: ResourceZoneoperations = js.native
  
  var zones: ResourceZones = js.native
}
