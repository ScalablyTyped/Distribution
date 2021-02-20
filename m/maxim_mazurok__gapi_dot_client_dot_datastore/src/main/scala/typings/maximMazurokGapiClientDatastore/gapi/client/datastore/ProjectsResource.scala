package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatastore.anon.AccesstokenAlt
import typings.maximMazurokGapiClientDatastore.anon.Alt
import typings.maximMazurokGapiClientDatastore.anon.Oauthtoken
import typings.maximMazurokGapiClientDatastore.anon.PrettyPrint
import typings.maximMazurokGapiClientDatastore.anon.ProjectId
import typings.maximMazurokGapiClientDatastore.anon.QuotaUser
import typings.maximMazurokGapiClientDatastore.anon.Resource
import typings.maximMazurokGapiClientDatastore.anon.UploadType
import typings.maximMazurokGapiClientDatastore.anon.Uploadprotocol
import typings.maximMazurokGapiClientDatastore.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  def allocateIds(request: Alt, body: AllocateIdsRequest): Request[AllocateIdsResponse] = js.native
  /** Allocates IDs for the given keys, which is useful for referencing an entity before it is inserted. */
  def allocateIds(request: Oauthtoken): Request[AllocateIdsResponse] = js.native
  
  def beginTransaction(request: Alt, body: BeginTransactionRequest): Request[BeginTransactionResponse] = js.native
  /** Begins a new transaction. */
  def beginTransaction(request: PrettyPrint): Request[BeginTransactionResponse] = js.native
  
  def commit(request: Alt, body: CommitRequest): Request[CommitResponse] = js.native
  /** Commits a transaction, optionally creating, deleting or modifying some entities. */
  def commit(request: ProjectId): Request[CommitResponse] = js.native
  
  def export(request: Alt, body: GoogleDatastoreAdminV1ExportEntitiesRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Exports a copy of all or a subset of entities from Google Cloud Datastore to another storage system, such as Google Cloud Storage. Recent updates to entities may not be reflected in
    * the export. The export occurs in the background and its progress can be monitored and managed via the Operation resource that is created. The output of an export may only be used
    * once the associated operation is done. If an export operation is cancelled before completion it may leave partial data behind in Google Cloud Storage.
    */
  def export(request: QuotaUser): Request[GoogleLongrunningOperation] = js.native
  
  def `import`(request: Alt, body: GoogleDatastoreAdminV1ImportEntitiesRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Imports entities into Google Cloud Datastore. Existing entities with the same key are overwritten. The import occurs in the background and its progress can be monitored and managed
    * via the Operation resource that is created. If an ImportEntities operation is cancelled, it is possible that a subset of the data has already been imported to Cloud Datastore.
    */
  def `import`(request: Resource): Request[GoogleLongrunningOperation] = js.native
  
  var indexes: IndexesResource = js.native
  
  def lookup(request: Alt, body: LookupRequest): Request[LookupResponse] = js.native
  /** Looks up entities by key. */
  def lookup(request: UploadType): Request[LookupResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  def reserveIds(request: Alt, body: ReserveIdsRequest): Request[js.Object] = js.native
  /** Prevents the supplied keys' IDs from being auto-allocated by Cloud Datastore. */
  def reserveIds(request: Uploadprotocol): Request[js.Object] = js.native
  
  def rollback(request: Alt, body: RollbackRequest): Request[js.Object] = js.native
  /** Rolls back a transaction. */
  def rollback(request: Xgafv): Request[js.Object] = js.native
  
  /** Queries for entities. */
  def runQuery(request: AccesstokenAlt): Request[RunQueryResponse] = js.native
  def runQuery(request: Alt, body: RunQueryRequest): Request[RunQueryResponse] = js.native
}
