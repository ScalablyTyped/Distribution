package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudkms.anon.Alt
import typings.maximMazurokGapiClientCloudkms.anon.AltCallback
import typings.maximMazurokGapiClientCloudkms.anon.ImportJobId
import typings.maximMazurokGapiClientCloudkms.anon.OptionsrequestedPolicyVersion
import typings.maximMazurokGapiClientCloudkms.anon.PageSize
import typings.maximMazurokGapiClientCloudkms.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportJobsResource extends js.Object {
  
  def create(request: AltCallback, body: ImportJob): Request[ImportJob] = js.native
  /** Create a new ImportJob within a KeyRing. ImportJob.import_method is required. */
  def create(request: ImportJobId): Request[ImportJob] = js.native
  
  /** Returns metadata for a given ImportJob. */
  def get(): Request[ImportJob] = js.native
  def get(request: Alt): Request[ImportJob] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /** Lists ImportJobs. */
  def list(): Request[ListImportJobsResponse] = js.native
  def list(request: PageSize): Request[ListImportJobsResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Xgafv, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Xgafv, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
