package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidenterprise.anon.CallbackClusterId
import typings.maximMazurokGapiClientAndroidenterprise.anon.ClusterId
import typings.maximMazurokGapiClientAndroidenterprise.anon.FieldsKey
import typings.maximMazurokGapiClientAndroidenterprise.anon.PageId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorelayoutclustersResource extends StObject {
  
  /** Deletes a cluster. */
  def delete(): Request[Unit] = js.native
  def delete(request: ClusterId): Request[Unit] = js.native
  
  /** Retrieves details of a cluster. */
  def get(): Request[StoreCluster] = js.native
  def get(request: ClusterId): Request[StoreCluster] = js.native
  
  def insert(request: FieldsKey, body: StoreCluster): Request[StoreCluster] = js.native
  /** Inserts a new cluster in a page. */
  def insert(request: PageId): Request[StoreCluster] = js.native
  
  /** Retrieves the details of all clusters on the specified page. */
  def list(): Request[StoreLayoutClustersListResponse] = js.native
  def list(request: FieldsKey): Request[StoreLayoutClustersListResponse] = js.native
  
  /** Updates a cluster. */
  def update(request: CallbackClusterId): Request[StoreCluster] = js.native
  def update(request: ClusterId, body: StoreCluster): Request[StoreCluster] = js.native
}
