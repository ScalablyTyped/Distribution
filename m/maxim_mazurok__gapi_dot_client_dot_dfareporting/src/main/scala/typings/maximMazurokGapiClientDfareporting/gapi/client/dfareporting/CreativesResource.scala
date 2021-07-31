package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.AccesstokenAltCallback
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.CompanionCreativeIds
import typings.maximMazurokGapiClientDfareporting.anon.UploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesResource extends StObject {
  
  /** Gets one creative by ID. */
  def get(): Request[Creative] = js.native
  def get(request: Alt): Request[Creative] = js.native
  
  def insert(request: Callback, body: Creative): Request[Creative] = js.native
  /** Inserts a new creative. */
  def insert(request: UploadprotocolXgafv): Request[Creative] = js.native
  
  /** Retrieves a list of creatives, possibly filtered. This method supports paging. */
  def list(): Request[CreativesListResponse] = js.native
  def list(request: CompanionCreativeIds): Request[CreativesListResponse] = js.native
  
  /** Updates an existing creative. This method supports patch semantics. */
  def patch(request: AccesstokenAltCallback): Request[Creative] = js.native
  def patch(request: Alt, body: Creative): Request[Creative] = js.native
  
  def update(request: Callback, body: Creative): Request[Creative] = js.native
  /** Updates an existing creative. */
  def update(request: UploadprotocolXgafv): Request[Creative] = js.native
}
