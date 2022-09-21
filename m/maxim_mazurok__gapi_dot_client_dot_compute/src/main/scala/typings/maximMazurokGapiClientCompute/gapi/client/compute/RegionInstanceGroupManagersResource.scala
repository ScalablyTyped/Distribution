package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AccesstokenAltCallbackFieldsInstanceGroupManager
import typings.maximMazurokGapiClientCompute.anon.AltCallbackFieldsInstanceGroupManager
import typings.maximMazurokGapiClientCompute.anon.AltCallbackFieldsInstanceGroupManagerKey
import typings.maximMazurokGapiClientCompute.anon.CallbackFieldsInstanceGroupManagerKey
import typings.maximMazurokGapiClientCompute.anon.CallbackFieldsInstanceGroupManagerKeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.FieldsInstanceGroupManagerKeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.FieldsInstanceGroupManagerKeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.FilterInstanceGroupManager
import typings.maximMazurokGapiClientCompute.anon.InstanceGroupManagerKeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.InstanceGroupManagerKeyOauthtokenPrettyPrintProject
import typings.maximMazurokGapiClientCompute.anon.Oauthtoken
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRegionRequestId
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRegionRequestIdResource
import typings.maximMazurokGapiClientCompute.anon.RegionRequestIdUploadType
import typings.maximMazurokGapiClientCompute.anon.RegionResourceUploadType
import typings.maximMazurokGapiClientCompute.anon.RegionUploadTypeUploadprotocol
import typings.maximMazurokGapiClientCompute.anon.RequestIdSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionInstanceGroupManagersResource extends StObject {
  
  /**
    * Flags the specified instances to be immediately removed from the managed instance group. Abandoning an instance does not delete the instance, but it does remove the instance from
    * any target pools that are applied by the managed instance group. This method reduces the targetSize of the managed instance group by the number of instances that you abandon. This
    * operation is marked as DONE when the action is scheduled even if the instances have not yet been removed from the group. You must separately verify the status of the abandoning
    * action with the listmanagedinstances method. If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection
    * draining duration has elapsed before the VM instance is removed or deleted. You can specify a maximum of 1000 instances with this method per request.
    */
  def abandonInstances(request: AltCallbackFieldsInstanceGroupManager): Request[Operation] = js.native
  def abandonInstances(request: RegionRequestIdUploadType, body: RegionInstanceGroupManagersAbandonInstancesRequest): Request[Operation] = js.native
  
  /** Apply updates to selected instances the managed instance group. */
  def applyUpdatesToInstances(request: RegionResourceUploadType): Request[Operation] = js.native
  def applyUpdatesToInstances(request: RegionUploadTypeUploadprotocol, body: RegionInstanceGroupManagersApplyUpdatesRequest): Request[Operation] = js.native
  
  /**
    * Creates instances with per-instance configs in this regional managed instance group. Instances are created using the current instance template. The create instances operation is
    * marked DONE if the createInstances request is successful. The underlying actions take additional time. You must separately verify the status of the creating or actions with the
    * listmanagedinstances method.
    */
  def createInstances(request: CallbackFieldsInstanceGroupManagerKey): Request[Operation] = js.native
  def createInstances(request: RegionRequestIdUploadType, body: RegionInstanceGroupManagersCreateInstancesRequest): Request[Operation] = js.native
  
  /** Deletes the specified managed instance group and all of the instances in that group. */
  def delete(): Request[Operation] = js.native
  def delete(request: RegionRequestIdUploadType): Request[Operation] = js.native
  
  /**
    * Flags the specified instances in the managed instance group to be immediately deleted. The instances are also removed from any target pools of which they were a member. This method
    * reduces the targetSize of the managed instance group by the number of instances that you delete. The deleteInstances operation is marked DONE if the deleteInstances request is
    * successful. The underlying actions take additional time. You must separately verify the status of the deleting action with the listmanagedinstances method. If the group is part of a
    * backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has elapsed before the VM instance is removed or deleted.
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def deleteInstances(request: FieldsInstanceGroupManagerKeyOauthtoken): Request[Operation] = js.native
  def deleteInstances(request: RegionRequestIdUploadType, body: RegionInstanceGroupManagersDeleteInstancesRequest): Request[Operation] = js.native
  
  /** Deletes selected per-instance configs for the managed instance group. */
  def deletePerInstanceConfigs(request: InstanceGroupManagerKeyOauthtokenPrettyPrint): Request[Operation] = js.native
  def deletePerInstanceConfigs(request: RegionUploadTypeUploadprotocol, body: RegionInstanceGroupManagerDeleteInstanceConfigReq): Request[Operation] = js.native
  
  /** Returns all of the details about the specified managed instance group. */
  def get(): Request[InstanceGroupManager] = js.native
  def get(request: RegionUploadTypeUploadprotocol): Request[InstanceGroupManager] = js.native
  
  def insert(request: Oauthtoken, body: InstanceGroupManager): Request[Operation] = js.native
  /**
    * Creates a managed instance group using the information that you specify in the request. After the group is created, instances in the group are created using the specified instance
    * template. This operation is marked as DONE when the group is created even if the instances in the group have not yet been created. You must separately verify the status of the
    * individual instances with the listmanagedinstances method. A regional managed instance group can contain up to 2000 instances.
    */
  def insert(request: PrettyPrintProjectQuotaUserRegionRequestId): Request[Operation] = js.native
  
  /** Retrieves the list of managed instance groups that are contained within the specified region. */
  def list(): Request[RegionInstanceGroupManagerList] = js.native
  def list(request: Filter): Request[RegionInstanceGroupManagerList] = js.native
  
  /** Lists all errors thrown by actions on instances for a given regional managed instance group. The filter and orderBy query parameters are not supported. */
  def listErrors(): Request[RegionInstanceGroupManagersListErrorsResponse] = js.native
  def listErrors(request: FilterInstanceGroupManager): Request[RegionInstanceGroupManagersListErrorsResponse] = js.native
  
  /**
    * Lists the instances in the managed instance group and instances that are scheduled to be created. The list includes any current actions that the group has scheduled for its
    * instances. The orderBy query parameter is not supported.
    */
  def listManagedInstances(): Request[RegionInstanceGroupManagersListInstancesResponse] = js.native
  def listManagedInstances(request: FilterInstanceGroupManager): Request[RegionInstanceGroupManagersListInstancesResponse] = js.native
  
  /** Lists all of the per-instance configs defined for the managed instance group. The orderBy query parameter is not supported. */
  def listPerInstanceConfigs(): Request[RegionInstanceGroupManagersListInstanceConfigsResp] = js.native
  def listPerInstanceConfigs(request: FilterInstanceGroupManager): Request[RegionInstanceGroupManagersListInstanceConfigsResp] = js.native
  
  /**
    * Updates a managed instance group using the information that you specify in the request. This operation is marked as DONE when the group is patched even if the instances in the group
    * are still in the process of being patched. You must separately verify the status of the individual instances with the listmanagedinstances method. This method supports PATCH
    * semantics and uses the JSON merge patch format and processing rules.
    */
  def patch(request: AccesstokenAltCallbackFieldsInstanceGroupManager): Request[Operation] = js.native
  def patch(request: RegionRequestIdUploadType, body: InstanceGroupManager): Request[Operation] = js.native
  
  /** Inserts or patches per-instance configs for the managed instance group. perInstanceConfig.name serves as a key used to distinguish whether to perform insert or patch. */
  def patchPerInstanceConfigs(request: AltCallbackFieldsInstanceGroupManagerKey): Request[Operation] = js.native
  def patchPerInstanceConfigs(request: RegionRequestIdUploadType, body: RegionInstanceGroupManagerPatchInstanceConfigReq): Request[Operation] = js.native
  
  /**
    * Flags the specified VM instances in the managed instance group to be immediately recreated. Each instance is recreated using the group's current configuration. This operation is
    * marked as DONE when the flag is set even if the instances have not yet been recreated. You must separately verify the status of each instance by checking its currentAction field;
    * for more information, see Checking the status of managed instances. If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds
    * after the connection draining duration has elapsed before the VM instance is removed or deleted. You can specify a maximum of 1000 instances with this method per request.
    */
  def recreateInstances(request: CallbackFieldsInstanceGroupManagerKeyOauthtoken): Request[Operation] = js.native
  def recreateInstances(request: RegionRequestIdUploadType, body: RegionInstanceGroupManagersRecreateRequest): Request[Operation] = js.native
  
  /**
    * Changes the intended size of the managed instance group. If you increase the size, the group creates new instances using the current instance template. If you decrease the size, the
    * group deletes one or more instances. The resize operation is marked DONE if the resize request is successful. The underlying actions take additional time. You must separately verify
    * the status of the creating or deleting actions with the listmanagedinstances method. If the group is part of a backend service that has enabled connection draining, it can take up
    * to 60 seconds after the connection draining duration has elapsed before the VM instance is removed or deleted.
    */
  def resize(): Request[Operation] = js.native
  def resize(request: RequestIdSize): Request[Operation] = js.native
  
  /** Sets the instance template to use when creating new instances or recreating instances in this group. Existing instances are not affected. */
  def setInstanceTemplate(request: FieldsInstanceGroupManagerKeyOauthtokenPrettyPrint): Request[Operation] = js.native
  def setInstanceTemplate(request: RegionRequestIdUploadType, body: RegionInstanceGroupManagersSetTemplateRequest): Request[Operation] = js.native
  
  /** Modifies the target pools to which all new instances in this group are assigned. Existing instances in the group are not affected. */
  def setTargetPools(request: InstanceGroupManagerKeyOauthtokenPrettyPrintProject): Request[Operation] = js.native
  def setTargetPools(request: RegionRequestIdUploadType, body: RegionInstanceGroupManagersSetTargetPoolsRequest): Request[Operation] = js.native
  
  /** Inserts or updates per-instance configs for the managed instance group. perInstanceConfig.name serves as a key used to distinguish whether to perform insert or patch. */
  def updatePerInstanceConfigs(request: ProjectQuotaUserRegionRequestIdResource): Request[Operation] = js.native
  def updatePerInstanceConfigs(request: RegionRequestIdUploadType, body: RegionInstanceGroupManagerUpdateInstanceConfigReq): Request[Operation] = js.native
}
