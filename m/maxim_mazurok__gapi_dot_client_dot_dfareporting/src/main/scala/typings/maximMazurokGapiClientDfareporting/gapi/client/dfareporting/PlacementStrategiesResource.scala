package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.AltCallbackFieldsKey
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.CallbackFieldsIdKey
import typings.maximMazurokGapiClientDfareporting.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementStrategiesResource extends js.Object {
  
  /** Deletes an existing placement strategy. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Gets one placement strategy by ID. */
  def get(): Request[PlacementStrategy] = js.native
  def get(request: Alt): Request[PlacementStrategy] = js.native
  
  /** Inserts a new placement strategy. */
  def insert(request: AltCallbackFieldsKey): Request[PlacementStrategy] = js.native
  def insert(request: Callback, body: PlacementStrategy): Request[PlacementStrategy] = js.native
  
  /** Retrieves a list of placement strategies, possibly filtered. This method supports paging. */
  def list(): Request[PlacementStrategiesListResponse] = js.native
  def list(request: MaxResults): Request[PlacementStrategiesListResponse] = js.native
  
  def patch(request: Alt, body: PlacementStrategy): Request[PlacementStrategy] = js.native
  /** Updates an existing placement strategy. This method supports patch semantics. */
  def patch(request: CallbackFieldsIdKey): Request[PlacementStrategy] = js.native
  
  /** Updates an existing placement strategy. */
  def update(request: AltCallbackFieldsKey): Request[PlacementStrategy] = js.native
  def update(request: Callback, body: PlacementStrategy): Request[PlacementStrategy] = js.native
}
