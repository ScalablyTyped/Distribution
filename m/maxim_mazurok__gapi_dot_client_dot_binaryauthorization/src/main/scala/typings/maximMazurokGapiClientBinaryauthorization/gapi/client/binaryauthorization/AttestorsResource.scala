package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBinaryauthorization.anon.Accesstoken
import typings.maximMazurokGapiClientBinaryauthorization.anon.Alt
import typings.maximMazurokGapiClientBinaryauthorization.anon.Callback
import typings.maximMazurokGapiClientBinaryauthorization.anon.Fields
import typings.maximMazurokGapiClientBinaryauthorization.anon.Key
import typings.maximMazurokGapiClientBinaryauthorization.anon.Name
import typings.maximMazurokGapiClientBinaryauthorization.anon.Oauthtoken
import typings.maximMazurokGapiClientBinaryauthorization.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttestorsResource extends js.Object {
  
  /**
    * Creates an attestor, and returns a copy of the new attestor. Returns NOT_FOUND if the project does not exist, INVALID_ARGUMENT if the request is malformed, ALREADY_EXISTS if the
    * attestor already exists.
    */
  def create(request: Accesstoken): Request[Attestor] = js.native
  def create(request: Alt, body: Attestor): Request[Attestor] = js.native
  
  /** Deletes an attestor. Returns NOT_FOUND if the attestor does not exist. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets an attestor. Returns NOT_FOUND if the attestor does not exist. */
  def get(): Request[Attestor] = js.native
  def get(request: Callback): Request[Attestor] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[IamPolicy] = js.native
  def getIamPolicy(request: Fields): Request[IamPolicy] = js.native
  
  /** Lists attestors. Returns INVALID_ARGUMENT if the project does not exist. */
  def list(): Request[ListAttestorsResponse] = js.native
  def list(request: Key): Request[ListAttestorsResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[IamPolicy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def update(request: Callback, body: Attestor): Request[Attestor] = js.native
  /** Updates an attestor. Returns NOT_FOUND if the attestor does not exist. */
  def update(request: Name): Request[Attestor] = js.native
  
  /** Returns whether the given Attestation for the given image URI was signed by the given Attestor */
  def validateAttestationOccurrence(request: typings.maximMazurokGapiClientBinaryauthorization.anon.Attestor): Request[ValidateAttestationOccurrenceResponse] = js.native
  def validateAttestationOccurrence(request: PrettyPrint, body: ValidateAttestationOccurrenceRequest): Request[ValidateAttestationOccurrenceResponse] = js.native
}
