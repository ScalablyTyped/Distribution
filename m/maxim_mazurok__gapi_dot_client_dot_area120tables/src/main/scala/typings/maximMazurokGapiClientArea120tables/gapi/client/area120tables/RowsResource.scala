package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientArea120tables.anon.Accesstoken
import typings.maximMazurokGapiClientArea120tables.anon.Alt
import typings.maximMazurokGapiClientArea120tables.anon.Callback
import typings.maximMazurokGapiClientArea120tables.anon.Fields
import typings.maximMazurokGapiClientArea120tables.anon.Filter
import typings.maximMazurokGapiClientArea120tables.anon.Key
import typings.maximMazurokGapiClientArea120tables.anon.Name
import typings.maximMazurokGapiClientArea120tables.anon.Oauthtoken
import typings.maximMazurokGapiClientArea120tables.anon.PrettyPrint
import typings.maximMazurokGapiClientArea120tables.anon.QuotaUser
import typings.maximMazurokGapiClientArea120tables.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowsResource extends StObject {
  
  /** Creates multiple rows. */
  def batchCreate(request: Accesstoken): Request[BatchCreateRowsResponse] = js.native
  def batchCreate(request: Alt, body: BatchCreateRowsRequest): Request[BatchCreateRowsResponse] = js.native
  
  def batchDelete(request: Alt, body: BatchDeleteRowsRequest): Request[js.Object] = js.native
  /** Deletes multiple rows. */
  def batchDelete(request: Callback): Request[js.Object] = js.native
  
  def batchUpdate(request: Alt, body: BatchUpdateRowsRequest): Request[BatchUpdateRowsResponse] = js.native
  /** Updates multiple rows. */
  def batchUpdate(request: Fields): Request[BatchUpdateRowsResponse] = js.native
  
  /** Creates a row. */
  def create(request: Key): Request[Row] = js.native
  def create(request: Oauthtoken, body: Row): Request[Row] = js.native
  
  /** Deletes a row. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets a row. Returns NOT_FOUND if the row does not exist in the table. */
  def get(): Request[Row] = js.native
  def get(request: PrettyPrint): Request[Row] = js.native
  
  /** Lists rows in a table. Returns NOT_FOUND if the table does not exist. */
  def list(): Request[ListRowsResponse] = js.native
  def list(request: Filter): Request[ListRowsResponse] = js.native
  
  /** Updates a row. */
  def patch(request: QuotaUser): Request[Row] = js.native
  def patch(request: UpdateMask, body: Row): Request[Row] = js.native
}
