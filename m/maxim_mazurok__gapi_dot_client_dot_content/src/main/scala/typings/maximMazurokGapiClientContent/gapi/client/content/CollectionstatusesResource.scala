package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.CollectionId
import typings.maximMazurokGapiClientContent.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionstatusesResource extends StObject {
  
  /** Gets the status of a collection from your Merchant Center account. */
  def get(): Request[CollectionStatus] = js.native
  def get(request: CollectionId): Request[CollectionStatus] = js.native
  
  /** Lists the statuses of the collections in your Merchant Center account. */
  def list(): Request[ListCollectionStatusesResponse] = js.native
  def list(request: PageSize): Request[ListCollectionStatusesResponse] = js.native
}
