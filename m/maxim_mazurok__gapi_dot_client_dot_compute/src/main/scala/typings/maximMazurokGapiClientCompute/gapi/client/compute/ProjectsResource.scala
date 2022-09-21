package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.CallbackFieldsKeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtokenPrettyPrintProject
import typings.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrintProjectQuotaUser
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.MaxResultsOauthtoken
import typings.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrintProjectQuotaUserRequestId
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRequestIdResource
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRequestIdResourceUploadType
import typings.maximMazurokGapiClientCompute.anon.QuotaUserRequestIdResourceUploadTypeUploadprotocol
import typings.maximMazurokGapiClientCompute.anon.QuotaUserUploadTypeUploadprotocol
import typings.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  /** Disable this project as a shared VPC host project. */
  def disableXpnHost(): Request[Operation] = js.native
  def disableXpnHost(request: Xgafv): Request[Operation] = js.native
  
  /** Disable a service resource (also known as service project) associated with this host project. */
  def disableXpnResource(request: CallbackFieldsKeyOauthtokenPrettyPrint): Request[Operation] = js.native
  def disableXpnResource(request: Xgafv, body: ProjectsDisableXpnResourceRequest): Request[Operation] = js.native
  
  /** Enable this project as a shared VPC host project. */
  def enableXpnHost(): Request[Operation] = js.native
  def enableXpnHost(request: Xgafv): Request[Operation] = js.native
  
  /** Enable service resource (a.k.a service project) for a host project, so that subnets in the host project can be used by instances in the service project. */
  def enableXpnResource(request: FieldsKeyOauthtokenPrettyPrintProject): Request[Operation] = js.native
  def enableXpnResource(request: Xgafv, body: ProjectsEnableXpnResourceRequest): Request[Operation] = js.native
  
  /** Returns the specified Project resource. */
  def get(): Request[Project] = js.native
  def get(request: QuotaUserUploadTypeUploadprotocol): Request[Project] = js.native
  
  /** Gets the shared VPC host project that this project links to. May be empty if no link exists. */
  def getXpnHost(): Request[Project] = js.native
  def getXpnHost(request: QuotaUserUploadTypeUploadprotocol): Request[Project] = js.native
  
  /** Gets service resources (a.k.a service project) associated with this host project. */
  def getXpnResources(): Request[ProjectsGetXpnResources] = js.native
  def getXpnResources(request: MaxResults): Request[ProjectsGetXpnResources] = js.native
  
  /** Lists all shared VPC host projects visible to the user in an organization. */
  def listXpnHosts(request: MaxResultsOauthtoken): Request[XpnHostList] = js.native
  def listXpnHosts(request: MaxResults, body: ProjectsListXpnHostsRequest): Request[XpnHostList] = js.native
  
  /** Moves a persistent disk from one zone to another. */
  def moveDisk(request: KeyOauthtokenPrettyPrintProjectQuotaUser): Request[Operation] = js.native
  def moveDisk(request: Xgafv, body: DiskMoveRequest): Request[Operation] = js.native
  
  /** Moves an instance and its attached persistent disks from one zone to another. */
  def moveInstance(request: OauthtokenPrettyPrintProjectQuotaUserRequestId): Request[Operation] = js.native
  def moveInstance(request: Xgafv, body: InstanceMoveRequest): Request[Operation] = js.native
  
  /** Sets metadata common to all instances within the specified project using the data included in the request. */
  def setCommonInstanceMetadata(request: PrettyPrintProjectQuotaUserRequestIdResource): Request[Operation] = js.native
  def setCommonInstanceMetadata(request: Xgafv, body: Metadata): Request[Operation] = js.native
  
  /** Sets the default network tier of the project. The default network tier is used when an address/forwardingRule/instance is created without specifying the network tier field. */
  def setDefaultNetworkTier(request: ProjectQuotaUserRequestIdResourceUploadType): Request[Operation] = js.native
  def setDefaultNetworkTier(request: Xgafv, body: ProjectsSetDefaultNetworkTierRequest): Request[Operation] = js.native
  
  /**
    * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the usage export feature will be
    * disabled.
    */
  def setUsageExportBucket(request: QuotaUserRequestIdResourceUploadTypeUploadprotocol): Request[Operation] = js.native
  def setUsageExportBucket(request: Xgafv, body: UsageExportLocation): Request[Operation] = js.native
}
