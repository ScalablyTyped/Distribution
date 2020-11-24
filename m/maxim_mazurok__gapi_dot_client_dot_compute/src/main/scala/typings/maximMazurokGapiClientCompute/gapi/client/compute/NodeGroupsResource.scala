package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.Fields
import typings.maximMazurokGapiClientCompute.anon.FieldsInitialNodeCount
import typings.maximMazurokGapiClientCompute.anon.FieldsKeyNodeGroup
import typings.maximMazurokGapiClientCompute.anon.InitialNodeCount
import typings.maximMazurokGapiClientCompute.anon.KeyNodeGroup
import typings.maximMazurokGapiClientCompute.anon.KeyNodeGroupOauthtoken
import typings.maximMazurokGapiClientCompute.anon.MaxResultsNodeGroup
import typings.maximMazurokGapiClientCompute.anon.NodeGroupOauthtoken
import typings.maximMazurokGapiClientCompute.anon.NodeGroupOauthtokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.OptionsRequestedPolicyVersion
import typings.maximMazurokGapiClientCompute.anon.QuotaUserResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupsResource extends js.Object {
  
  def addNodes(request: KeyNodeGroup, body: NodeGroupsAddNodesRequest): Request[Operation] = js.native
  /** Adds specified number of nodes to the node group. */
  def addNodes(request: typings.maximMazurokGapiClientCompute.anon.NodeGroup): Request[Operation] = js.native
  
  /** Retrieves an aggregated list of node groups. Note: use nodeGroups.listNodes for more details about each group. */
  def aggregatedList(): Request[NodeGroupAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[NodeGroupAggregatedList] = js.native
  
  /** Deletes the specified NodeGroup resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: KeyNodeGroup): Request[Operation] = js.native
  
  def deleteNodes(request: KeyNodeGroup, body: NodeGroupsDeleteNodesRequest): Request[Operation] = js.native
  /** Deletes specified nodes from the node group. */
  def deleteNodes(request: NodeGroupOauthtoken): Request[Operation] = js.native
  
  /** Returns the specified NodeGroup. Get a list of available NodeGroups by making a list() request. Note: the "nodes" field should not be used. Use nodeGroups.listNodes instead. */
  def get(): Request[NodeGroup] = js.native
  def get(request: FieldsKeyNodeGroup): Request[NodeGroup] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsRequestedPolicyVersion): Request[Policy] = js.native
  
  def insert(request: FieldsInitialNodeCount, body: NodeGroup): Request[Operation] = js.native
  /** Creates a NodeGroup resource in the specified project using the data included in the request. */
  def insert(request: InitialNodeCount): Request[Operation] = js.native
  
  /** Retrieves a list of node groups available to the specified project. Note: use nodeGroups.listNodes for more details about each group. */
  def list(): Request[NodeGroupList] = js.native
  def list(request: Fields): Request[NodeGroupList] = js.native
  
  /** Lists nodes in the node group. */
  def listNodes(): Request[NodeGroupsListNodes] = js.native
  def listNodes(request: MaxResultsNodeGroup): Request[NodeGroupsListNodes] = js.native
  
  /** Updates the specified node group. */
  def patch(request: KeyNodeGroupOauthtoken): Request[Operation] = js.native
  def patch(request: KeyNodeGroup, body: NodeGroup): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: QuotaUserResource, body: ZoneSetPolicyRequest): Request[Policy] = js.native
  
  def setNodeTemplate(request: KeyNodeGroup, body: NodeGroupsSetNodeTemplateRequest): Request[Operation] = js.native
  /** Updates the node template of the node group. */
  def setNodeTemplate(request: NodeGroupOauthtokenPrettyPrint): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: QuotaUserResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
