package typings.maximMazurokGapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContainer.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContainer.anon.Alt
import typings.maximMazurokGapiClientContainer.anon.AltCallback
import typings.maximMazurokGapiClientContainer.anon.Callback
import typings.maximMazurokGapiClientContainer.anon.CallbackClusterId
import typings.maximMazurokGapiClientContainer.anon.ClusterId
import typings.maximMazurokGapiClientContainer.anon.ClusterIdFields
import typings.maximMazurokGapiClientContainer.anon.Fields
import typings.maximMazurokGapiClientContainer.anon.Key
import typings.maximMazurokGapiClientContainer.anon.Name
import typings.maximMazurokGapiClientContainer.anon.NodePoolId
import typings.maximMazurokGapiClientContainer.anon.Oauthtoken
import typings.maximMazurokGapiClientContainer.anon.Parent
import typings.maximMazurokGapiClientContainer.anon.PrettyPrint
import typings.maximMazurokGapiClientContainer.anon.ProjectId
import typings.maximMazurokGapiClientContainer.anon.QuotaUser
import typings.maximMazurokGapiClientContainer.anon.Resource
import typings.maximMazurokGapiClientContainer.anon.UploadType
import typings.maximMazurokGapiClientContainer.anon.Uploadprotocol
import typings.maximMazurokGapiClientContainer.anon.Xgafv
import typings.maximMazurokGapiClientContainer.anon.Zone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodePoolsResource extends StObject {
  
  /** Sets the autoscaling settings for the specified node pool. */
  def autoscaling(request: NodePoolId): Request[Operation] = js.native
  def autoscaling(request: ProjectId, body: SetNodePoolAutoscalingRequest): Request[Operation] = js.native
  
  /** CompleteNodePoolUpgrade will signal an on-going node pool upgrade to complete. */
  def completeUpgrade(request: Alt): Request[js.Object] = js.native
  def completeUpgrade(request: Callback, body: CompleteNodePoolUpgradeRequest): Request[js.Object] = js.native
  
  /** Creates a node pool for a cluster. */
  def create(request: Fields): Request[Operation] = js.native
  def create(request: Key, body: CreateNodePoolRequest): Request[Operation] = js.native
  /** Creates a node pool for a cluster. */
  def create(request: Uploadprotocol): Request[Operation] = js.native
  def create(request: Xgafv, body: CreateNodePoolRequest): Request[Operation] = js.native
  
  /** Deletes a node pool from a cluster. */
  def delete(): Request[Operation] = js.native
  def delete(request: ClusterId): Request[Operation] = js.native
  def delete(request: Zone): Request[Operation] = js.native
  
  /** Retrieves the requested node pool. */
  def get(): Request[NodePool] = js.native
  def get(request: ClusterId): Request[NodePool] = js.native
  def get(request: Zone): Request[NodePool] = js.native
  
  /** Lists the node pools for a cluster. */
  def list(): Request[ListNodePoolsResponse] = js.native
  def list(request: Oauthtoken): Request[ListNodePoolsResponse] = js.native
  def list(request: Parent): Request[ListNodePoolsResponse] = js.native
  
  /** Rolls back a previously Aborted or Failed NodePool upgrade. This makes no changes if the last upgrade successfully completed. */
  def rollback(request: AccesstokenAlt): Request[Operation] = js.native
  def rollback(request: Callback, body: RollbackNodePoolUpgradeRequest): Request[Operation] = js.native
  /** Rolls back a previously Aborted or Failed NodePool upgrade. This makes no changes if the last upgrade successfully completed. */
  def rollback(request: Name): Request[Operation] = js.native
  def rollback(request: ProjectId, body: RollbackNodePoolUpgradeRequest): Request[Operation] = js.native
  
  def setAutoscaling(request: Callback, body: SetNodePoolAutoscalingRequest): Request[Operation] = js.native
  /** Sets the autoscaling settings for the specified node pool. */
  def setAutoscaling(request: PrettyPrint): Request[Operation] = js.native
  
  /** Sets the NodeManagement options for a node pool. */
  def setManagement(request: AltCallback): Request[Operation] = js.native
  def setManagement(request: Callback, body: SetNodePoolManagementRequest): Request[Operation] = js.native
  def setManagement(request: ProjectId, body: SetNodePoolManagementRequest): Request[Operation] = js.native
  /** Sets the NodeManagement options for a node pool. */
  def setManagement(request: QuotaUser): Request[Operation] = js.native
  
  /** Sets the size for a specific node pool. The new size will be used for all replicas, including future replicas created by modifying NodePool.locations. */
  def setSize(request: CallbackClusterId): Request[Operation] = js.native
  def setSize(request: Callback, body: SetNodePoolSizeRequest): Request[Operation] = js.native
  def setSize(request: ProjectId, body: SetNodePoolSizeRequest): Request[Operation] = js.native
  /** Sets the size for a specific node pool. The new size will be used for all replicas, including future replicas created by modifying NodePool.locations. */
  def setSize(request: Resource): Request[Operation] = js.native
  
  def update(request: Callback, body: UpdateNodePoolRequest): Request[Operation] = js.native
  /** Updates the version and/or image type for the specified node pool. */
  def update(request: ClusterIdFields): Request[Operation] = js.native
  def update(request: ProjectId, body: UpdateNodePoolRequest): Request[Operation] = js.native
  /** Updates the version and/or image type for the specified node pool. */
  def update(request: UploadType): Request[Operation] = js.native
}
