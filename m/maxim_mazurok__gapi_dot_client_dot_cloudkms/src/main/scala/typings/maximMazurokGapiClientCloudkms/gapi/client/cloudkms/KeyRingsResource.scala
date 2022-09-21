package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudkms.anon.Callback
import typings.maximMazurokGapiClientCloudkms.anon.Fields
import typings.maximMazurokGapiClientCloudkms.anon.Filter
import typings.maximMazurokGapiClientCloudkms.anon.KeyKeyRingId
import typings.maximMazurokGapiClientCloudkms.anon.KeyRingId
import typings.maximMazurokGapiClientCloudkms.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyRingsResource extends StObject {
  
  def create(request: KeyKeyRingId, body: KeyRing): Request[KeyRing] = js.native
  /** Create a new KeyRing in a given Project and Location. */
  def create(request: KeyRingId): Request[KeyRing] = js.native
  
  var cryptoKeys: CryptoKeysResource = js.native
  
  /** Returns metadata for a given KeyRing. */
  def get(): Request[KeyRing] = js.native
  def get(request: Callback): Request[KeyRing] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  var importJobs: ImportJobsResource = js.native
  
  /** Lists KeyRings. */
  def list(): Request[ListKeyRingsResponse] = js.native
  def list(request: Filter): Request[ListKeyRingsResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
