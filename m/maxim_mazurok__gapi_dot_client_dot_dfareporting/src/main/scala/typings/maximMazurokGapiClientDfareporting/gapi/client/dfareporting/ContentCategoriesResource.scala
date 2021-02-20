package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.FieldsKey
import typings.maximMazurokGapiClientDfareporting.anon.IdKey
import typings.maximMazurokGapiClientDfareporting.anon.MaxResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentCategoriesResource extends StObject {
  
  /** Deletes an existing content category. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Gets one content category by ID. */
  def get(): Request[ContentCategory] = js.native
  def get(request: Alt): Request[ContentCategory] = js.native
  
  def insert(request: Callback, body: ContentCategory): Request[ContentCategory] = js.native
  /** Inserts a new content category. */
  def insert(request: FieldsKey): Request[ContentCategory] = js.native
  
  /** Retrieves a list of content categories, possibly filtered. This method supports paging. */
  def list(): Request[ContentCategoriesListResponse] = js.native
  def list(request: MaxResults): Request[ContentCategoriesListResponse] = js.native
  
  def patch(request: Alt, body: ContentCategory): Request[ContentCategory] = js.native
  /** Updates an existing content category. This method supports patch semantics. */
  def patch(request: IdKey): Request[ContentCategory] = js.native
  
  def update(request: Callback, body: ContentCategory): Request[ContentCategory] = js.native
  /** Updates an existing content category. */
  def update(request: FieldsKey): Request[ContentCategory] = js.native
}
