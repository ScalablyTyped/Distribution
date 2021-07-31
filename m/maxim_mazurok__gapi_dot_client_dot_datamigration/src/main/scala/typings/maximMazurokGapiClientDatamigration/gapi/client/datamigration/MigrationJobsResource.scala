package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatamigration.anon.AccesstokenAlt
import typings.maximMazurokGapiClientDatamigration.anon.AltCallback
import typings.maximMazurokGapiClientDatamigration.anon.Callback
import typings.maximMazurokGapiClientDatamigration.anon.Fields
import typings.maximMazurokGapiClientDatamigration.anon.Filter
import typings.maximMazurokGapiClientDatamigration.anon.Key
import typings.maximMazurokGapiClientDatamigration.anon.MigrationJobId
import typings.maximMazurokGapiClientDatamigration.anon.Oauthtoken
import typings.maximMazurokGapiClientDatamigration.anon.Parent
import typings.maximMazurokGapiClientDatamigration.anon.PrettyPrint
import typings.maximMazurokGapiClientDatamigration.anon.QuotaUser
import typings.maximMazurokGapiClientDatamigration.anon.RequestId
import typings.maximMazurokGapiClientDatamigration.anon.Resource
import typings.maximMazurokGapiClientDatamigration.anon.UploadType
import typings.maximMazurokGapiClientDatamigration.anon.Uploadprotocol
import typings.maximMazurokGapiClientDatamigration.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationJobsResource extends StObject {
  
  /** Creates a new migration job in a given project and location. */
  def create(request: MigrationJobId): Request[Operation] = js.native
  def create(request: Parent, body: MigrationJob): Request[Operation] = js.native
  
  /** Deletes a single migration job. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Generate a SSH configuration script to configure the reverse SSH connectivity. */
  def generateSshScript(request: typings.maximMazurokGapiClientDatamigration.anon.MigrationJob): Request[SshScript] = js.native
  def generateSshScript(request: QuotaUser, body: GenerateSshScriptRequest): Request[SshScript] = js.native
  
  /** Gets details of a single migration job. */
  def get(): Request[MigrationJob] = js.native
  def get(request: Fields): Request[MigrationJob] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Key): Request[Policy] = js.native
  
  /** Lists migration jobs in a given project and location. */
  def list(): Request[ListMigrationJobsResponse] = js.native
  def list(request: Filter): Request[ListMigrationJobsResponse] = js.native
  
  def patch(request: Oauthtoken, body: MigrationJob): Request[Operation] = js.native
  /** Updates the parameters of a single migration job. */
  def patch(request: RequestId): Request[Operation] = js.native
  
  def promote(request: Fields, body: PromoteMigrationJobRequest): Request[Operation] = js.native
  /** Promote a migration job, stopping replication to the destination and promoting the destination to be a standalone database. */
  def promote(request: Resource): Request[Operation] = js.native
  
  def restart(request: Fields, body: RestartMigrationJobRequest): Request[Operation] = js.native
  /** Restart a stopped or failed migration job, resetting the destination instance to its original state and starting the migration process from scratch. */
  def restart(request: UploadType): Request[Operation] = js.native
  
  def resume(request: Fields, body: ResumeMigrationJobRequest): Request[Operation] = js.native
  /** Resume a migration job that is currently stopped and is resumable (was stopped during CDC phase). */
  def resume(request: Uploadprotocol): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  def start(request: Fields, body: StartMigrationJobRequest): Request[Operation] = js.native
  /** Start an already created migration job. */
  def start(request: Xgafv): Request[Operation] = js.native
  
  /** Stops a running migration job. */
  def stop(request: AccesstokenAlt): Request[Operation] = js.native
  def stop(request: Fields, body: StopMigrationJobRequest): Request[Operation] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  /** Verify a migration job, making sure the destination can reach the source and that all configuration and prerequisites are met. */
  def verify(request: AltCallback): Request[Operation] = js.native
  def verify(request: Fields, body: VerifyMigrationJobRequest): Request[Operation] = js.native
}
