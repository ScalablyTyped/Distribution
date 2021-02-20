package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUser
import typings.maximMazurokGapiClientCompute.anon.FieldsKey
import typings.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtokenPrettyPrintProjectQuotaUser
import typings.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestId
import typings.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrintProjectQuotaUserRequestId
import typings.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrintProjectQuotaUserRequestIdResource
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.MaxResultsOauthtoken
import typings.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrintProjectQuotaUserRequestIdResource
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRequestIdResourceUserIp
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserUserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  /** Disable this project as a shared VPC host project. */
  def disableXpnHost(): Request[Operation] = js.native
  def disableXpnHost(request: FieldsKey): Request[Operation] = js.native
  
  /** Disable a service resource (also known as service project) associated with this host project. */
  def disableXpnResource(request: FieldsKeyOauthtokenPrettyPrintProjectQuotaUser): Request[Operation] = js.native
  def disableXpnResource(request: FieldsKey, body: ProjectsDisableXpnResourceRequest): Request[Operation] = js.native
  
  /** Enable this project as a shared VPC host project. */
  def enableXpnHost(): Request[Operation] = js.native
  def enableXpnHost(request: FieldsKey): Request[Operation] = js.native
  
  def enableXpnResource(request: FieldsKey, body: ProjectsEnableXpnResourceRequest): Request[Operation] = js.native
  /** Enable service resource (a.k.a service project) for a host project, so that subnets in the host project can be used by instances in the service project. */
  def enableXpnResource(request: KeyOauthtokenPrettyPrintProjectQuotaUserRequestId): Request[Operation] = js.native
  
  /** Returns the specified Project resource. */
  def get(): Request[Project] = js.native
  def get(request: PrettyPrintProjectQuotaUserUserIp): Request[Project] = js.native
  
  /** Gets the shared VPC host project that this project links to. May be empty if no link exists. */
  def getXpnHost(): Request[Project] = js.native
  def getXpnHost(request: PrettyPrintProjectQuotaUserUserIp): Request[Project] = js.native
  
  /** Gets service resources (a.k.a service project) associated with this host project. */
  def getXpnResources(): Request[ProjectsGetXpnResources] = js.native
  def getXpnResources(request: MaxResults): Request[ProjectsGetXpnResources] = js.native
  
  /** Lists all shared VPC host projects visible to the user in an organization. */
  def listXpnHosts(request: MaxResultsOauthtoken): Request[XpnHostList] = js.native
  def listXpnHosts(request: MaxResults, body: ProjectsListXpnHostsRequest): Request[XpnHostList] = js.native
  
  def moveDisk(request: FieldsKey, body: DiskMoveRequest): Request[Operation] = js.native
  /** Moves a persistent disk from one zone to another. */
  def moveDisk(request: OauthtokenPrettyPrintProjectQuotaUserRequestIdResource): Request[Operation] = js.native
  
  def moveInstance(request: FieldsKey, body: InstanceMoveRequest): Request[Operation] = js.native
  /** Moves an instance and its attached persistent disks from one zone to another. */
  def moveInstance(request: PrettyPrintProjectQuotaUserRequestIdResourceUserIp): Request[Operation] = js.native
  
  /** Sets metadata common to all instances within the specified project using the data included in the request. */
  def setCommonInstanceMetadata(request: AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUser): Request[Operation] = js.native
  def setCommonInstanceMetadata(request: FieldsKey, body: Metadata): Request[Operation] = js.native
  
  /** Sets the default network tier of the project. The default network tier is used when an address/forwardingRule/instance is created without specifying the network tier field. */
  def setDefaultNetworkTier(request: FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestId): Request[Operation] = js.native
  def setDefaultNetworkTier(request: FieldsKey, body: ProjectsSetDefaultNetworkTierRequest): Request[Operation] = js.native
  
  def setUsageExportBucket(request: FieldsKey, body: UsageExportLocation): Request[Operation] = js.native
  /**
    * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the usage export feature will be
    * disabled.
    */
  def setUsageExportBucket(request: KeyOauthtokenPrettyPrintProjectQuotaUserRequestIdResource): Request[Operation] = js.native
}
