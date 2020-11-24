package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigtableadmin.anon.AccesstokenAlt
import typings.maximMazurokGapiClientBigtableadmin.anon.Alt
import typings.maximMazurokGapiClientBigtableadmin.anon.AltCallback
import typings.maximMazurokGapiClientBigtableadmin.anon.CallbackFields
import typings.maximMazurokGapiClientBigtableadmin.anon.FieldsKey
import typings.maximMazurokGapiClientBigtableadmin.anon.PageSize
import typings.maximMazurokGapiClientBigtableadmin.anon.PrettyPrint
import typings.maximMazurokGapiClientBigtableadmin.anon.UploadType
import typings.maximMazurokGapiClientBigtableadmin.anon.Uploadprotocol
import typings.maximMazurokGapiClientBigtableadmin.anon.View
import typings.maximMazurokGapiClientBigtableadmin.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablesResource extends js.Object {
  
  def checkConsistency(request: Alt, body: CheckConsistencyRequest): Request[CheckConsistencyResponse] = js.native
  /** Checks replication consistency based on a consistency token, that is, if replication has caught up based on the conditions specified in the token and the check request. */
  def checkConsistency(request: UploadType): Request[CheckConsistencyResponse] = js.native
  
  /** Creates a new table in the specified instance. The table can be created with a full set of initial column families, specified in the request. */
  def create(request: Uploadprotocol): Request[Table] = js.native
  def create(request: Xgafv, body: CreateTableRequest): Request[Table] = js.native
  
  /** Permanently deletes a specified table and all of its data. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Permanently drop/delete a row range from a specified table. The request can specify whether to delete all rows in a table, or only those that match a particular prefix. */
  def dropRowRange(request: AccesstokenAlt): Request[js.Object] = js.native
  def dropRowRange(request: Alt, body: DropRowRangeRequest): Request[js.Object] = js.native
  
  /**
    * Generates a consistency token for a Table, which can be used in CheckConsistency to check whether mutations to the table that finished before this call started have been replicated.
    * The tokens will be available for 90 days.
    */
  def generateConsistencyToken(request: AltCallback): Request[GenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(request: Alt, body: GenerateConsistencyTokenRequest): Request[GenerateConsistencyTokenResponse] = js.native
  
  /** Gets metadata information about the specified table. */
  def get(): Request[Table] = js.native
  def get(request: View): Request[Table] = js.native
  
  /** Gets the access control policy for a Table resource. Returns an empty policy if the resource exists but does not have a policy set. */
  def getIamPolicy(request: PrettyPrint, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all tables served from a specified instance. */
  def list(): Request[ListTablesResponse] = js.native
  def list(request: PageSize): Request[ListTablesResponse] = js.native
  
  def modifyColumnFamilies(request: Alt, body: ModifyColumnFamiliesRequest): Request[Table] = js.native
  /**
    * Performs a series of column family modifications on the specified table. Either all or none of the modifications will occur before this method returns, but data requests received
    * prior to that point may see a table where only some modifications have taken effect.
    */
  def modifyColumnFamilies(request: CallbackFields): Request[Table] = js.native
  
  /**
    * Create a new table by restoring from a completed backup. The new table must be in the same instance as the instance containing the backup. The returned table long-running operation
    * can be used to track the progress of the operation, and to cancel it. The metadata field type is RestoreTableMetadata. The response type is Table, if successful.
    */
  def restore(request: FieldsKey): Request[Operation] = js.native
  def restore(request: Xgafv, body: RestoreTableRequest): Request[Operation] = js.native
  
  /** Sets the access control policy on a Table resource. Replaces any existing policy. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that the caller has on the specified table resource. */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
