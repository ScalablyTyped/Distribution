package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.AdId
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.CallbackFieldsId
import typings.maximMazurokGapiClientDfareporting.anon.KeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTagsResource extends js.Object {
  
  /** Deletes an existing event tag. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Gets one event tag by ID. */
  def get(): Request[EventTag] = js.native
  def get(request: Alt): Request[EventTag] = js.native
  
  def insert(request: Callback, body: EventTag): Request[EventTag] = js.native
  /** Inserts a new event tag. */
  def insert(request: KeyOauthtokenPrettyPrint): Request[EventTag] = js.native
  
  /** Retrieves a list of event tags, possibly filtered. */
  def list(): Request[EventTagsListResponse] = js.native
  def list(request: AdId): Request[EventTagsListResponse] = js.native
  
  def patch(request: Alt, body: EventTag): Request[EventTag] = js.native
  /** Updates an existing event tag. This method supports patch semantics. */
  def patch(request: CallbackFieldsId): Request[EventTag] = js.native
  
  def update(request: Callback, body: EventTag): Request[EventTag] = js.native
  /** Updates an existing event tag. */
  def update(request: KeyOauthtokenPrettyPrint): Request[EventTag] = js.native
}
