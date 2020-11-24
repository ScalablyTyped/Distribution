package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.AltFieldsInstanceGroup
import typings.maximMazurokGapiClientCompute.anon.Fields
import typings.maximMazurokGapiClientCompute.anon.FieldsFilter
import typings.maximMazurokGapiClientCompute.anon.FieldsInstanceGroup
import typings.maximMazurokGapiClientCompute.anon.FieldsInstanceGroupKey
import typings.maximMazurokGapiClientCompute.anon.FilterInstanceGroup
import typings.maximMazurokGapiClientCompute.anon.InstanceGroupKey
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRequestIdResource
import typings.maximMazurokGapiClientCompute.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupsResource extends js.Object {
  
  def addInstances(request: FieldsInstanceGroup, body: InstanceGroupsAddInstancesRequest): Request[Operation] = js.native
  /**
    * Adds a list of instances to the specified instance group. All of the instances in the instance group must be in the same network/subnetwork. Read  Adding instances for more
    * information.
    */
  def addInstances(request: typings.maximMazurokGapiClientCompute.anon.InstanceGroup): Request[Operation] = js.native
  
  /** Retrieves the list of instance groups and sorts them by zone. */
  def aggregatedList(): Request[InstanceGroupAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[InstanceGroupAggregatedList] = js.native
  
  /**
    * Deletes the specified instance group. The instances in the group are not deleted. Note that instance group must not belong to a backend service. Read  Deleting an instance group for
    * more information.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: FieldsInstanceGroup): Request[Operation] = js.native
  
  /**
    * Returns the specified zonal instance group. Get a list of available zonal instance groups by making a list() request.
    *
    * For managed instance groups, use the instanceGroupManagers or regionInstanceGroupManagers methods instead.
    */
  def get(): Request[InstanceGroup] = js.native
  def get(request: InstanceGroupKey): Request[InstanceGroup] = js.native
  
  /** Creates an instance group in the specified project using the parameters that are included in the request. */
  def insert(request: ProjectQuotaUserRequestIdResource): Request[Operation] = js.native
  def insert(request: UserIp, body: InstanceGroup): Request[Operation] = js.native
  
  /**
    * Retrieves the list of zonal instance group resources contained within the specified zone.
    *
    * For managed instance groups, use the instanceGroupManagers or regionInstanceGroupManagers methods instead.
    */
  def list(): Request[InstanceGroupList] = js.native
  def list(request: Fields): Request[InstanceGroupList] = js.native
  
  /** Lists the instances in the specified instance group. The orderBy query parameter is not supported. */
  def listInstances(request: FieldsFilter): Request[InstanceGroupsListInstances] = js.native
  def listInstances(request: FilterInstanceGroup, body: InstanceGroupsListInstancesRequest): Request[InstanceGroupsListInstances] = js.native
  
  /**
    * Removes one or more instances from the specified instance group, but does not delete those instances.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration before the VM instance is removed
    * or deleted.
    */
  def removeInstances(request: AltFieldsInstanceGroup): Request[Operation] = js.native
  def removeInstances(request: FieldsInstanceGroup, body: InstanceGroupsRemoveInstancesRequest): Request[Operation] = js.native
  
  /** Sets the named ports for the specified instance group. */
  def setNamedPorts(request: FieldsInstanceGroupKey): Request[Operation] = js.native
  def setNamedPorts(request: FieldsInstanceGroup, body: InstanceGroupsSetNamedPortsRequest): Request[Operation] = js.native
}
