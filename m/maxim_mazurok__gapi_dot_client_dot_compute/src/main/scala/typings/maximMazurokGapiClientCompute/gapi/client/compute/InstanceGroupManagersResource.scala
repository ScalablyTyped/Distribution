package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.AltFieldsInstanceGroupManager
import typings.maximMazurokGapiClientCompute.anon.AltFieldsInstanceGroupManagerKey
import typings.maximMazurokGapiClientCompute.anon.Fields
import typings.maximMazurokGapiClientCompute.anon.FieldsInstanceGroupManager
import typings.maximMazurokGapiClientCompute.anon.FieldsInstanceGroupManagerKey
import typings.maximMazurokGapiClientCompute.anon.FieldsInstanceGroupManagerKeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.InstanceGroupManagerKey
import typings.maximMazurokGapiClientCompute.anon.InstanceGroupManagerKeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.InstanceGroupManagerKeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrintProject
import typings.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrintProjectQuotaUser
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRequestId
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserResource
import typings.maximMazurokGapiClientCompute.anon.ResourceUserIpZone
import typings.maximMazurokGapiClientCompute.anon.ReturnPartialSuccess
import typings.maximMazurokGapiClientCompute.anon.Size
import typings.maximMazurokGapiClientCompute.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupManagersResource extends StObject {
  
  def abandonInstances(request: FieldsInstanceGroupManager, body: InstanceGroupManagersAbandonInstancesRequest): Request[Operation] = js.native
  /**
    * Flags the specified instances to be removed from the managed instance group. Abandoning an instance does not delete the instance, but it does remove the instance from any target
    * pools that are applied by the managed instance group. This method reduces the targetSize of the managed instance group by the number of instances that you abandon. This operation is
    * marked as DONE when the action is scheduled even if the instances have not yet been removed from the group. You must separately verify the status of the abandoning action with the
    * listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has elapsed before the VM
    * instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def abandonInstances(request: typings.maximMazurokGapiClientCompute.anon.InstanceGroupManager): Request[Operation] = js.native
  
  /** Retrieves the list of managed instance groups and groups them by zone. */
  def aggregatedList(): Request[InstanceGroupManagerAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[InstanceGroupManagerAggregatedList] = js.native
  
  def applyUpdatesToInstances(request: AltFieldsInstanceGroupManager, body: InstanceGroupManagersApplyUpdatesRequest): Request[Operation] = js.native
  /** Applies changes to selected instances on the managed instance group. This method can be used to apply new overrides and/or new versions. */
  def applyUpdatesToInstances(request: InstanceGroupManagerKey): Request[Operation] = js.native
  
  /**
    * Creates instances with per-instance configs in this managed instance group. Instances are created using the current instance template. The create instances operation is marked DONE
    * if the createInstances request is successful. The underlying actions take additional time. You must separately verify the status of the creating or actions with the
    * listmanagedinstances method.
    */
  def createInstances(request: FieldsInstanceGroupManagerKey): Request[Operation] = js.native
  def createInstances(request: FieldsInstanceGroupManager, body: InstanceGroupManagersCreateInstancesRequest): Request[Operation] = js.native
  
  /**
    * Deletes the specified managed instance group and all of the instances in that group. Note that the instance group must not belong to a backend service. Read  Deleting an instance
    * group for more information.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: FieldsInstanceGroupManager): Request[Operation] = js.native
  
  def deleteInstances(request: FieldsInstanceGroupManager, body: InstanceGroupManagersDeleteInstancesRequest): Request[Operation] = js.native
  /**
    * Flags the specified instances in the managed instance group for immediate deletion. The instances are also removed from any target pools of which they were a member. This method
    * reduces the targetSize of the managed instance group by the number of instances that you delete. This operation is marked as DONE when the action is scheduled even if the instances
    * are still being deleted. You must separately verify the status of the deleting action with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has elapsed before the VM
    * instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def deleteInstances(request: InstanceGroupManagerKeyOauthtoken): Request[Operation] = js.native
  
  def deletePerInstanceConfigs(request: AltFieldsInstanceGroupManager, body: InstanceGroupManagersDeletePerInstanceConfigsReq): Request[Operation] = js.native
  /** Deletes selected per-instance configs for the managed instance group. */
  def deletePerInstanceConfigs(request: ProjectQuotaUserResource): Request[Operation] = js.native
  
  /** Returns all of the details about the specified managed instance group. Gets a list of available managed instance groups by making a list() request. */
  def get(): Request[InstanceGroupManager] = js.native
  def get(request: AltFieldsInstanceGroupManager): Request[InstanceGroupManager] = js.native
  
  /**
    * Creates a managed instance group using the information that you specify in the request. After the group is created, instances in the group are created using the specified instance
    * template. This operation is marked as DONE when the group is created even if the instances in the group have not yet been created. You must separately verify the status of the
    * individual instances with the listmanagedinstances method.
    *
    * A managed instance group can have up to 1000 VM instances per group. Please contact Cloud Support if you need an increase in this limit.
    */
  def insert(request: ResourceUserIpZone): Request[Operation] = js.native
  def insert(request: UserIp, body: InstanceGroupManager): Request[Operation] = js.native
  
  /** Retrieves a list of managed instance groups that are contained within the specified project and zone. */
  def list(): Request[InstanceGroupManagerList] = js.native
  def list(request: Fields): Request[InstanceGroupManagerList] = js.native
  
  /** Lists all errors thrown by actions on instances for a given managed instance group. The filter and orderBy query parameters are not supported. */
  def listErrors(): Request[InstanceGroupManagersListErrorsResponse] = js.native
  def listErrors(request: ReturnPartialSuccess): Request[InstanceGroupManagersListErrorsResponse] = js.native
  
  /**
    * Lists all of the instances in the managed instance group. Each instance in the list has a currentAction, which indicates the action that the managed instance group is performing on
    * the instance. For example, if the group is still creating an instance, the currentAction is CREATING. If a previous action failed, the list displays the errors for that failed
    * action. The orderBy query parameter is not supported.
    */
  def listManagedInstances(): Request[InstanceGroupManagersListManagedInstancesResponse] = js.native
  def listManagedInstances(request: ReturnPartialSuccess): Request[InstanceGroupManagersListManagedInstancesResponse] = js.native
  
  /** Lists all of the per-instance configs defined for the managed instance group. The orderBy query parameter is not supported. */
  def listPerInstanceConfigs(): Request[InstanceGroupManagersListPerInstanceConfigsResp] = js.native
  def listPerInstanceConfigs(request: ReturnPartialSuccess): Request[InstanceGroupManagersListPerInstanceConfigsResp] = js.native
  
  /**
    * Updates a managed instance group using the information that you specify in the request. This operation is marked as DONE when the group is patched even if the instances in the group
    * are still in the process of being patched. You must separately verify the status of the individual instances with the listManagedInstances method. This method supports PATCH
    * semantics and uses the JSON merge patch format and processing rules.
    */
  def patch(request: AltFieldsInstanceGroupManagerKey): Request[Operation] = js.native
  def patch(request: FieldsInstanceGroupManager, body: InstanceGroupManager): Request[Operation] = js.native
  
  /** Inserts or patches per-instance configs for the managed instance group. perInstanceConfig.name serves as a key used to distinguish whether to perform insert or patch. */
  def patchPerInstanceConfigs(request: FieldsInstanceGroupManagerKeyOauthtoken): Request[Operation] = js.native
  def patchPerInstanceConfigs(request: FieldsInstanceGroupManager, body: InstanceGroupManagersPatchPerInstanceConfigsReq): Request[Operation] = js.native
  
  def recreateInstances(request: FieldsInstanceGroupManager, body: InstanceGroupManagersRecreateInstancesRequest): Request[Operation] = js.native
  /**
    * Flags the specified instances in the managed instance group to be immediately recreated. The instances are deleted and recreated using the current instance template for the managed
    * instance group. This operation is marked as DONE when the flag is set even if the instances have not yet been recreated. You must separately verify the status of the recreating
    * action with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has elapsed before the VM
    * instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def recreateInstances(request: InstanceGroupManagerKeyOauthtokenPrettyPrint): Request[Operation] = js.native
  
  /**
    * Resizes the managed instance group. If you increase the size, the group creates new instances using the current instance template. If you decrease the size, the group deletes
    * instances. The resize operation is marked DONE when the resize actions are scheduled even if the group has not yet added or deleted any instances. You must separately verify the
    * status of the creating or deleting actions with the listmanagedinstances method.
    *
    * When resizing down, the instance group arbitrarily chooses the order in which VMs are deleted. The group takes into account some VM attributes when making the selection including:
    *
    * + The status of the VM instance. + The health of the VM instance. + The instance template version the VM is based on. + For regional managed instance groups, the location of the VM
    * instance.
    *
    * This list is subject to change.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has elapsed before the VM
    * instance is removed or deleted.
    */
  def resize(): Request[Operation] = js.native
  def resize(request: Size): Request[Operation] = js.native
  
  def setInstanceTemplate(request: FieldsInstanceGroupManager, body: InstanceGroupManagersSetInstanceTemplateRequest): Request[Operation] = js.native
  /**
    * Specifies the instance template to use when creating new instances in this group. The templates for existing instances in the group do not change unless you run recreateInstances,
    * run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
    */
  def setInstanceTemplate(request: KeyOauthtokenPrettyPrintProject): Request[Operation] = js.native
  
  def setTargetPools(request: FieldsInstanceGroupManager, body: InstanceGroupManagersSetTargetPoolsRequest): Request[Operation] = js.native
  /**
    * Modifies the target pools to which all instances in this managed instance group are assigned. The target pools automatically apply to all of the instances in the managed instance
    * group. This operation is marked DONE when you make the request even if the instances have not yet been added to their target pools. The change might take some time to apply to all
    * of the instances in the group depending on the size of the group.
    */
  def setTargetPools(request: OauthtokenPrettyPrintProjectQuotaUser): Request[Operation] = js.native
  
  def updatePerInstanceConfigs(request: FieldsInstanceGroupManager, body: InstanceGroupManagersUpdatePerInstanceConfigsReq): Request[Operation] = js.native
  /** Inserts or updates per-instance configs for the managed instance group. perInstanceConfig.name serves as a key used to distinguish whether to perform insert or patch. */
  def updatePerInstanceConfigs(request: PrettyPrintProjectQuotaUserRequestId): Request[Operation] = js.native
}
