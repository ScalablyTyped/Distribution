package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudkms.anon.Callback
import typings.maximMazurokGapiClientCloudkms.anon.CallbackFields
import typings.maximMazurokGapiClientCloudkms.anon.CryptoKeyId
import typings.maximMazurokGapiClientCloudkms.anon.Fields
import typings.maximMazurokGapiClientCloudkms.anon.FieldsKey
import typings.maximMazurokGapiClientCloudkms.anon.KeyName
import typings.maximMazurokGapiClientCloudkms.anon.Name
import typings.maximMazurokGapiClientCloudkms.anon.NameOauthtoken
import typings.maximMazurokGapiClientCloudkms.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudkms.anon.PageSize
import typings.maximMazurokGapiClientCloudkms.anon.SkipInitialVersionCreation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeysResource extends StObject {
  
  /** Create a new CryptoKey within a KeyRing. CryptoKey.purpose and CryptoKey.version_template.algorithm are required. */
  def create(request: CryptoKeyId): Request[CryptoKey] = js.native
  def create(request: SkipInitialVersionCreation, body: CryptoKey): Request[CryptoKey] = js.native
  
  var cryptoKeyVersions: CryptoKeyVersionsResource = js.native
  
  /** Decrypts data that was protected by Encrypt. The CryptoKey.purpose must be ENCRYPT_DECRYPT. */
  def decrypt(request: CallbackFields): Request[DecryptResponse] = js.native
  def decrypt(request: Callback, body: DecryptRequest): Request[DecryptResponse] = js.native
  
  def encrypt(request: Callback, body: EncryptRequest): Request[EncryptResponse] = js.native
  /** Encrypts data, so that it can only be recovered by a call to Decrypt. The CryptoKey.purpose must be ENCRYPT_DECRYPT. */
  def encrypt(request: FieldsKey): Request[EncryptResponse] = js.native
  
  /** Returns metadata for a given CryptoKey, as well as its primary CryptoKeyVersion. */
  def get(): Request[CryptoKey] = js.native
  def get(request: Callback): Request[CryptoKey] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /** Lists CryptoKeys. */
  def list(): Request[ListCryptoKeysResponse] = js.native
  def list(request: PageSize): Request[ListCryptoKeysResponse] = js.native
  
  /** Update a CryptoKey. */
  def patch(request: KeyName): Request[CryptoKey] = js.native
  def patch(request: Name, body: CryptoKey): Request[CryptoKey] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def updatePrimaryVersion(request: Callback, body: UpdateCryptoKeyPrimaryVersionRequest): Request[CryptoKey] = js.native
  /** Update the version of a CryptoKey that will be used in Encrypt. Returns an error if called on a key whose purpose is not ENCRYPT_DECRYPT. */
  def updatePrimaryVersion(request: NameOauthtoken): Request[CryptoKey] = js.native
}
