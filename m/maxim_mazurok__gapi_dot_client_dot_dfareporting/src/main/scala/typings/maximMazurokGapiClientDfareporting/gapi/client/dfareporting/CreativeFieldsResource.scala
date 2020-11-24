package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.PrettyPrintProfileId
import typings.maximMazurokGapiClientDfareporting.anon.ProfileIdQuotaUser
import typings.maximMazurokGapiClientDfareporting.anon.SearchString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeFieldsResource extends js.Object {
  
  /** Deletes an existing creative field. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Gets one creative field by ID. */
  def get(): Request[CreativeField] = js.native
  def get(request: Alt): Request[CreativeField] = js.native
  
  def insert(request: Callback, body: CreativeField): Request[CreativeField] = js.native
  /** Inserts a new creative field. */
  def insert(request: PrettyPrintProfileId): Request[CreativeField] = js.native
  
  /** Retrieves a list of creative fields, possibly filtered. This method supports paging. */
  def list(): Request[CreativeFieldsListResponse] = js.native
  def list(request: SearchString): Request[CreativeFieldsListResponse] = js.native
  
  def patch(request: Alt, body: CreativeField): Request[CreativeField] = js.native
  /** Updates an existing creative field. This method supports patch semantics. */
  def patch(request: ProfileIdQuotaUser): Request[CreativeField] = js.native
  
  def update(request: Callback, body: CreativeField): Request[CreativeField] = js.native
  /** Updates an existing creative field. */
  def update(request: PrettyPrintProfileId): Request[CreativeField] = js.native
}
