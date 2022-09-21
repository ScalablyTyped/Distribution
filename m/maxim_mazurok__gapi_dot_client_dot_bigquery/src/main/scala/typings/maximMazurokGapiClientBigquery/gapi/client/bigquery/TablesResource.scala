package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigquery.anon.AltAutodetectschema
import typings.maximMazurokGapiClientBigquery.anon.AltDatasetId
import typings.maximMazurokGapiClientBigquery.anon.AltFields
import typings.maximMazurokGapiClientBigquery.anon.Autodetectschema
import typings.maximMazurokGapiClientBigquery.anon.DatasetId
import typings.maximMazurokGapiClientBigquery.anon.DatasetIdFields
import typings.maximMazurokGapiClientBigquery.anon.MaxResults
import typings.maximMazurokGapiClientBigquery.anon.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablesResource extends StObject {
  
  /** Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted. */
  def delete(): Request[Unit] = js.native
  def delete(request: AltDatasetId): Request[Unit] = js.native
  
  /** Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes the structure of this table. */
  def get(): Request[Table] = js.native
  def get(request: View): Request[Table] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: AltFields, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Creates a new, empty table in the dataset. */
  def insert(request: DatasetIdFields): Request[Table] = js.native
  def insert(request: DatasetId, body: Table): Request[Table] = js.native
  
  /** Lists all tables in the specified dataset. Requires the READER dataset role. */
  def list(): Request[TableList] = js.native
  def list(request: MaxResults): Request[TableList] = js.native
  
  def patch(request: AltAutodetectschema, body: Table): Request[Table] = js.native
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are provided in the submitted
    * table resource. This method supports patch semantics.
    */
  def patch(request: Autodetectschema): Request[Table] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: AltFields, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: AltFields, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def update(request: AltAutodetectschema, body: Table): Request[Table] = js.native
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are provided in the submitted
    * table resource.
    */
  def update(request: Autodetectschema): Request[Table] = js.native
}
