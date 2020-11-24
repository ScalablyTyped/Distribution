package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudkms.anon.Accesstoken
import typings.maximMazurokGapiClientCloudkms.anon.Alt
import typings.maximMazurokGapiClientCloudkms.anon.Callback
import typings.maximMazurokGapiClientCloudkms.anon.Fields
import typings.maximMazurokGapiClientCloudkms.anon.Filter
import typings.maximMazurokGapiClientCloudkms.anon.Key
import typings.maximMazurokGapiClientCloudkms.anon.Name
import typings.maximMazurokGapiClientCloudkms.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudkms.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudkms.anon.QuotaUser
import typings.maximMazurokGapiClientCloudkms.anon.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeyVersionsResource extends js.Object {
  
  /** Decrypts data that was encrypted with a public key retrieved from GetPublicKey corresponding to a CryptoKeyVersion with CryptoKey.purpose ASYMMETRIC_DECRYPT. */
  def asymmetricDecrypt(request: Accesstoken): Request[AsymmetricDecryptResponse] = js.native
  def asymmetricDecrypt(request: Alt, body: AsymmetricDecryptRequest): Request[AsymmetricDecryptResponse] = js.native
  
  def asymmetricSign(request: Alt, body: AsymmetricSignRequest): Request[AsymmetricSignResponse] = js.native
  /** Signs data using a CryptoKeyVersion with CryptoKey.purpose ASYMMETRIC_SIGN, producing a signature that can be verified with the public key retrieved from GetPublicKey. */
  def asymmetricSign(request: Callback): Request[AsymmetricSignResponse] = js.native
  
  /** Create a new CryptoKeyVersion in a CryptoKey. The server will assign the next sequential id. If unset, state will be set to ENABLED. */
  def create(request: Fields): Request[CryptoKeyVersion] = js.native
  def create(request: Key, body: CryptoKeyVersion): Request[CryptoKeyVersion] = js.native
  
  def destroy(request: Alt, body: DestroyCryptoKeyVersionRequest): Request[CryptoKeyVersion] = js.native
  /**
    * Schedule a CryptoKeyVersion for destruction. Upon calling this method, CryptoKeyVersion.state will be set to DESTROY_SCHEDULED and destroy_time will be set to a time 24 hours in the
    * future, at which point the state will be changed to DESTROYED, and the key material will be irrevocably destroyed. Before the destroy_time is reached, RestoreCryptoKeyVersion may be
    * called to reverse the process.
    */
  def destroy(request: Name): Request[CryptoKeyVersion] = js.native
  
  /** Returns metadata for a given CryptoKeyVersion. */
  def get(): Request[CryptoKeyVersion] = js.native
  def get(request: Alt): Request[CryptoKeyVersion] = js.native
  
  /** Returns the public key for the given CryptoKeyVersion. The CryptoKey.purpose must be ASYMMETRIC_SIGN or ASYMMETRIC_DECRYPT. */
  def getPublicKey(): Request[PublicKey] = js.native
  def getPublicKey(request: Alt): Request[PublicKey] = js.native
  
  def `import`(request: Key, body: ImportCryptoKeyVersionRequest): Request[CryptoKeyVersion] = js.native
  /**
    * Imports a new CryptoKeyVersion into an existing CryptoKey using the wrapped key material provided in the request. The version ID will be assigned the next sequential id within the
    * CryptoKey.
    */
  def `import`(request: Oauthtoken): Request[CryptoKeyVersion] = js.native
  
  /** Lists CryptoKeyVersions. */
  def list(): Request[ListCryptoKeyVersionsResponse] = js.native
  def list(request: Filter): Request[ListCryptoKeyVersionsResponse] = js.native
  
  /**
    * Update a CryptoKeyVersion's metadata. state may be changed between ENABLED and DISABLED using this method. See DestroyCryptoKeyVersion and RestoreCryptoKeyVersion to move between
    * other states.
    */
  def patch(request: PrettyPrint): Request[CryptoKeyVersion] = js.native
  def patch(request: QuotaUser, body: CryptoKeyVersion): Request[CryptoKeyVersion] = js.native
  
  def restore(request: Alt, body: RestoreCryptoKeyVersionRequest): Request[CryptoKeyVersion] = js.native
  /** Restore a CryptoKeyVersion in the DESTROY_SCHEDULED state. Upon restoration of the CryptoKeyVersion, state will be set to DISABLED, and destroy_time will be cleared. */
  def restore(request: Resource): Request[CryptoKeyVersion] = js.native
}
