package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Accesstoken
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.AltCallbackFieldsInstance
import typings.maximMazurokGapiClientCompute.anon.AutoDelete
import typings.maximMazurokGapiClientCompute.anon.CallbackFieldsInstance
import typings.maximMazurokGapiClientCompute.anon.CallbackFieldsInstanceKey
import typings.maximMazurokGapiClientCompute.anon.CallbackFieldsKeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.DeletionProtection
import typings.maximMazurokGapiClientCompute.anon.DeviceName
import typings.maximMazurokGapiClientCompute.anon.FieldsForceAttach
import typings.maximMazurokGapiClientCompute.anon.FieldsInstance
import typings.maximMazurokGapiClientCompute.anon.FieldsInstanceKey
import typings.maximMazurokGapiClientCompute.anon.FieldsInstanceKeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.FilterInstance
import typings.maximMazurokGapiClientCompute.anon.ForceAttach
import typings.maximMazurokGapiClientCompute.anon.InstanceKey
import typings.maximMazurokGapiClientCompute.anon.InstanceKeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.InstanceKeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.KeyNetworkInterface
import typings.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrintProject
import typings.maximMazurokGapiClientCompute.anon.MinimalAction
import typings.maximMazurokGapiClientCompute.anon.MostDisruptiveAllowedAction
import typings.maximMazurokGapiClientCompute.anon.NetworkInterfaceOauthtoken
import typings.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrintProjectQuotaUser
import typings.maximMazurokGapiClientCompute.anon.OptionsRequestedPolicyVersion
import typings.maximMazurokGapiClientCompute.anon.Port
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRequestId
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRequestIdResource
import typings.maximMazurokGapiClientCompute.anon.QueryPath
import typings.maximMazurokGapiClientCompute.anon.QuotaUser
import typings.maximMazurokGapiClientCompute.anon.QuotaUserRequestIdResourceUploadType
import typings.maximMazurokGapiClientCompute.anon.QuotaUserResource
import typings.maximMazurokGapiClientCompute.anon.RequestIdResourceUploadTypeUploadprotocol
import typings.maximMazurokGapiClientCompute.anon.RequestIdSourceInstanceTemplate
import typings.maximMazurokGapiClientCompute.anon.ResourceUploadTypeUploadprotocolUserIp
import typings.maximMazurokGapiClientCompute.anon.SourceInstanceTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends StObject {
  
  /** Adds an access config to an instance's network interface. */
  def addAccessConfig(request: typings.maximMazurokGapiClientCompute.anon.Instance): Request[Operation] = js.native
  def addAccessConfig(request: typings.maximMazurokGapiClientCompute.anon.NetworkInterface, body: AccessConfig): Request[Operation] = js.native
  
  /** Adds existing resource policies to an instance. You can only add one policy right now which will be applied to this instance for scheduling live migrations. */
  def addResourcePolicies(request: FieldsInstance): Request[Operation] = js.native
  def addResourcePolicies(request: InstanceKey, body: InstancesAddResourcePoliciesRequest): Request[Operation] = js.native
  
  /** Retrieves aggregated list of all of the instances in your project across all regions and zones. */
  def aggregatedList(): Request[InstanceAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[InstanceAggregatedList] = js.native
  
  def attachDisk(request: FieldsForceAttach, body: AttachedDisk): Request[Operation] = js.native
  /**
    * Attaches an existing Disk resource to an instance. You must first create the disk before you can attach it. It is not possible to create and attach a disk at the same time. For more
    * information, read Adding a persistent disk to your instance.
    */
  def attachDisk(request: ForceAttach): Request[Operation] = js.native
  
  /** Creates multiple instances. Count specifies the number of instances to create. */
  def bulkInsert(request: CallbackFieldsKeyOauthtoken): Request[Operation] = js.native
  def bulkInsert(request: QuotaUser, body: BulkInsertInstanceResource): Request[Operation] = js.native
  
  /** Deletes the specified Instance resource. For more information, see Deleting an instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: InstanceKey): Request[Operation] = js.native
  
  /** Deletes an access config from an instance's network interface. */
  def deleteAccessConfig(): Request[Operation] = js.native
  def deleteAccessConfig(request: typings.maximMazurokGapiClientCompute.anon.AccessConfig): Request[Operation] = js.native
  
  /** Detaches a disk from an instance. */
  def detachDisk(): Request[Operation] = js.native
  def detachDisk(request: DeviceName): Request[Operation] = js.native
  
  /** Returns the specified Instance resource. Gets a list of available instances by making a list() request. */
  def get(): Request[Instance] = js.native
  def get(request: CallbackFieldsInstance): Request[Instance] = js.native
  
  /** Returns effective firewalls applied to an interface of the instance. */
  def getEffectiveFirewalls(): Request[InstancesGetEffectiveFirewallsResponse] = js.native
  def getEffectiveFirewalls(request: KeyNetworkInterface): Request[InstancesGetEffectiveFirewallsResponse] = js.native
  
  /** Returns the specified guest attributes entry. */
  def getGuestAttributes(): Request[GuestAttributes] = js.native
  def getGuestAttributes(request: QueryPath): Request[GuestAttributes] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsRequestedPolicyVersion): Request[Policy] = js.native
  
  /** Returns the screenshot from the specified instance. */
  def getScreenshot(): Request[Screenshot] = js.native
  def getScreenshot(request: CallbackFieldsInstance): Request[Screenshot] = js.native
  
  /** Returns the last 1 MB of serial port output from the specified instance. */
  def getSerialPortOutput(): Request[SerialPortOutput] = js.native
  def getSerialPortOutput(request: Port): Request[SerialPortOutput] = js.native
  
  /** Returns the Shielded Instance Identity of an instance */
  def getShieldedInstanceIdentity(): Request[ShieldedInstanceIdentity] = js.native
  def getShieldedInstanceIdentity(request: CallbackFieldsInstance): Request[ShieldedInstanceIdentity] = js.native
  
  def insert(request: RequestIdSourceInstanceTemplate, body: Instance): Request[Operation] = js.native
  /** Creates an instance resource in the specified project using the data included in the request. */
  def insert(request: SourceInstanceTemplate): Request[Operation] = js.native
  
  /** Retrieves the list of instances contained within the specified zone. */
  def list(): Request[InstanceList] = js.native
  def list(request: Alt): Request[InstanceList] = js.native
  
  /**
    * Retrieves a list of resources that refer to the VM instance specified in the request. For example, if the VM instance is part of a managed or unmanaged instance group, the referrers
    * list includes the instance group. For more information, read Viewing referrers to VM instances.
    */
  def listReferrers(): Request[InstanceListReferrers] = js.native
  def listReferrers(request: FilterInstance): Request[InstanceListReferrers] = js.native
  
  /** Removes resource policies from an instance. */
  def removeResourcePolicies(request: FieldsInstanceKey): Request[Operation] = js.native
  def removeResourcePolicies(request: InstanceKey, body: InstancesRemoveResourcePoliciesRequest): Request[Operation] = js.native
  
  /** Performs a reset on the instance. This is a hard reset the VM does not do a graceful shutdown. For more information, see Resetting an instance. */
  def reset(): Request[Operation] = js.native
  def reset(request: InstanceKey): Request[Operation] = js.native
  
  /** Sets deletion protection on the instance. */
  def setDeletionProtection(): Request[Operation] = js.native
  def setDeletionProtection(request: DeletionProtection): Request[Operation] = js.native
  
  /** Sets the auto-delete flag for a disk attached to an instance. */
  def setDiskAutoDelete(): Request[Operation] = js.native
  def setDiskAutoDelete(request: AutoDelete): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: QuotaUserResource, body: ZoneSetPolicyRequest): Request[Policy] = js.native
  
  /** Sets labels on an instance. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: InstanceKeyOauthtoken): Request[Operation] = js.native
  def setLabels(request: InstanceKey, body: InstancesSetLabelsRequest): Request[Operation] = js.native
  
  /** Changes the number and/or type of accelerator for a stopped instance to the values specified in the request. */
  def setMachineResources(request: AltCallbackFieldsInstance): Request[Operation] = js.native
  def setMachineResources(request: InstanceKey, body: InstancesSetMachineResourcesRequest): Request[Operation] = js.native
  
  /** Changes the machine type for a stopped instance to the machine type specified in the request. */
  def setMachineType(request: CallbackFieldsInstanceKey): Request[Operation] = js.native
  def setMachineType(request: InstanceKey, body: InstancesSetMachineTypeRequest): Request[Operation] = js.native
  
  /** Sets metadata for the specified instance to the data included in the request. */
  def setMetadata(request: FieldsInstanceKeyOauthtoken): Request[Operation] = js.native
  def setMetadata(request: InstanceKey, body: Metadata): Request[Operation] = js.native
  
  /** Changes the minimum CPU platform that this instance should use. This method can only be called on a stopped instance. For more information, read Specifying a Minimum CPU Platform. */
  def setMinCpuPlatform(request: InstanceKeyOauthtokenPrettyPrint): Request[Operation] = js.native
  def setMinCpuPlatform(request: InstanceKey, body: InstancesSetMinCpuPlatformRequest): Request[Operation] = js.native
  
  def setScheduling(request: InstanceKey, body: Scheduling): Request[Operation] = js.native
  /**
    * Sets an instance's scheduling options. You can only call this method on a stopped instance, that is, a VM instance that is in a `TERMINATED` state. See Instance Life Cycle for more
    * information on the possible instance states.
    */
  def setScheduling(request: KeyOauthtokenPrettyPrintProject): Request[Operation] = js.native
  
  def setServiceAccount(request: InstanceKey, body: InstancesSetServiceAccountRequest): Request[Operation] = js.native
  /** Sets the service account on the instance. For more information, read Changing the service account and access scopes for an instance. */
  def setServiceAccount(request: OauthtokenPrettyPrintProjectQuotaUser): Request[Operation] = js.native
  
  def setShieldedInstanceIntegrityPolicy(request: InstanceKey, body: ShieldedInstanceIntegrityPolicy): Request[Operation] = js.native
  /**
    * Sets the Shielded Instance integrity policy for an instance. You can only use this method on a running instance. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def setShieldedInstanceIntegrityPolicy(request: PrettyPrintProjectQuotaUserRequestId): Request[Operation] = js.native
  
  def setTags(request: InstanceKey, body: Tags): Request[Operation] = js.native
  /** Sets network tags for the specified instance to the data included in the request. */
  def setTags(request: ProjectQuotaUserRequestIdResource): Request[Operation] = js.native
  
  /** Simulates a maintenance event on the instance. */
  def simulateMaintenanceEvent(): Request[Operation] = js.native
  def simulateMaintenanceEvent(request: CallbackFieldsInstance): Request[Operation] = js.native
  
  /** Starts an instance that was stopped using the instances().stop method. For more information, see Restart an instance. */
  def start(): Request[Operation] = js.native
  def start(request: InstanceKey): Request[Operation] = js.native
  
  def startWithEncryptionKey(request: InstanceKey, body: InstancesStartWithEncryptionKeyRequest): Request[Operation] = js.native
  /** Starts an instance that was stopped using the instances().stop method. For more information, see Restart an instance. */
  def startWithEncryptionKey(request: QuotaUserRequestIdResourceUploadType): Request[Operation] = js.native
  
  /**
    * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a later time. Stopped instances do not incur VM usage charges while they are stopped.
    * However, resources that the VM is using, such as persistent disks and static IP addresses, will continue to be charged until they are deleted. For more information, see Stopping an
    * instance.
    */
  def stop(): Request[Operation] = js.native
  def stop(request: InstanceKey): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: QuotaUserResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
  
  /**
    * Updates an instance only if the necessary resources are available. This method can update only a specific set of instance properties. See Updating a running instance for a list of
    * updatable instance properties.
    */
  def update(request: MinimalAction): Request[Operation] = js.native
  def update(request: MostDisruptiveAllowedAction, body: Instance): Request[Operation] = js.native
  
  /**
    * Updates the specified access config from an instance's network interface with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def updateAccessConfig(request: typings.maximMazurokGapiClientCompute.anon.Instance): Request[Operation] = js.native
  def updateAccessConfig(request: typings.maximMazurokGapiClientCompute.anon.NetworkInterface, body: AccessConfig): Request[Operation] = js.native
  
  def updateDisplayDevice(request: InstanceKey, body: DisplayDevice): Request[Operation] = js.native
  /**
    * Updates the Display config for a VM instance. You can only use this method on a stopped VM instance. This method supports PATCH semantics and uses the JSON merge patch format and
    * processing rules.
    */
  def updateDisplayDevice(request: RequestIdResourceUploadTypeUploadprotocol): Request[Operation] = js.native
  
  /**
    * Updates an instance's network interface. This method can only update an interface's alias IP range and attached network. See Modifying alias IP ranges for an existing instance for
    * instructions on changing alias IP ranges. See Migrating a VM between networks for instructions on migrating an interface. This method follows PATCH semantics.
    */
  def updateNetworkInterface(request: NetworkInterfaceOauthtoken): Request[Operation] = js.native
  def updateNetworkInterface(request: typings.maximMazurokGapiClientCompute.anon.NetworkInterface, body: NetworkInterface): Request[Operation] = js.native
  
  def updateShieldedInstanceConfig(request: InstanceKey, body: ShieldedInstanceConfig): Request[Operation] = js.native
  /**
    * Updates the Shielded Instance config for an instance. You can only use this method on a stopped instance. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def updateShieldedInstanceConfig(request: ResourceUploadTypeUploadprotocolUserIp): Request[Operation] = js.native
}
