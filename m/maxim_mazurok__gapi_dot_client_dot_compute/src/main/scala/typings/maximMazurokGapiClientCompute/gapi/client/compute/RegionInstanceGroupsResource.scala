package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AltFieldsInstanceGroupKey
import typings.maximMazurokGapiClientCompute.anon.FieldsInstanceGroupKeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.InstanceGroupKeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.OauthtokenOrderBy
import typings.maximMazurokGapiClientCompute.anon.OrderByPageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionInstanceGroupsResource extends StObject {
  
  /** Returns the specified instance group resource. */
  def get(): Request[InstanceGroup] = js.native
  def get(request: InstanceGroupKeyOauthtoken): Request[InstanceGroup] = js.native
  
  /** Retrieves the list of instance group resources contained within the specified region. */
  def list(): Request[RegionInstanceGroupList] = js.native
  def list(request: Filter): Request[RegionInstanceGroupList] = js.native
  
  /**
    * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can list all instances or only
    * the instances that are running. The orderBy query parameter is not supported.
    */
  def listInstances(request: OauthtokenOrderBy): Request[RegionInstanceGroupsListInstances] = js.native
  def listInstances(request: OrderByPageToken, body: RegionInstanceGroupsListInstancesRequest): Request[RegionInstanceGroupsListInstances] = js.native
  
  /** Sets the named ports for the specified regional instance group. */
  def setNamedPorts(request: AltFieldsInstanceGroupKey): Request[Operation] = js.native
  def setNamedPorts(request: FieldsInstanceGroupKeyOauthtoken, body: RegionInstanceGroupsSetNamedPortsRequest): Request[Operation] = js.native
}
