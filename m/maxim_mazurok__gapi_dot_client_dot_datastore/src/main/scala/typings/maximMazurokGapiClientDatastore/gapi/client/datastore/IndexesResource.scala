package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatastore.anon.Accesstoken
import typings.maximMazurokGapiClientDatastore.anon.Alt
import typings.maximMazurokGapiClientDatastore.anon.Callback
import typings.maximMazurokGapiClientDatastore.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexesResource extends StObject {
  
  /**
    * Creates the specified index. A newly created index's initial state is `CREATING`. On completion of the returned google.longrunning.Operation, the state will be `READY`. If the index
    * already exists, the call will return an `ALREADY_EXISTS` status. During index creation, the process could result in an error, in which case the index will move to the `ERROR` state.
    * The process can be recovered by fixing the data that caused the error, removing the index with delete, then re-creating the index with create. Indexes with a single property cannot
    * be created.
    */
  def create(request: Accesstoken): Request[GoogleLongrunningOperation] = js.native
  def create(request: Alt, body: GoogleDatastoreAdminV1Index): Request[GoogleLongrunningOperation] = js.native
  
  /**
    * Deletes an existing index. An index can only be deleted if it is in a `READY` or `ERROR` state. On successful execution of the request, the index will be in a `DELETING` state. And
    * on completion of the returned google.longrunning.Operation, the index will be removed. During index deletion, the process could result in an error, in which case the index will move
    * to the `ERROR` state. The process can be recovered by fixing the data that caused the error, followed by calling delete again.
    */
  def delete(): Request[GoogleLongrunningOperation] = js.native
  def delete(request: Callback): Request[GoogleLongrunningOperation] = js.native
  
  /** Gets an index. */
  def get(): Request[GoogleDatastoreAdminV1Index] = js.native
  def get(request: Callback): Request[GoogleDatastoreAdminV1Index] = js.native
  
  /** Lists the indexes that match the specified filters. Datastore uses an eventually consistent query to fetch the list of indexes and may occasionally return stale results. */
  def list(): Request[GoogleDatastoreAdminV1ListIndexesResponse] = js.native
  def list(request: Fields): Request[GoogleDatastoreAdminV1ListIndexesResponse] = js.native
}
