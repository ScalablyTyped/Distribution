package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudkms.anon.AccesstokenAlt
import typings.maximMazurokGapiClientCloudkms.anon.AltCallback
import typings.maximMazurokGapiClientCloudkms.anon.Callback
import typings.maximMazurokGapiClientCloudkms.anon.Name
import typings.maximMazurokGapiClientCloudkms.anon.OrderBy
import typings.maximMazurokGapiClientCloudkms.anon.Parent
import typings.maximMazurokGapiClientCloudkms.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudkms.anon.QuotaUser
import typings.maximMazurokGapiClientCloudkms.anon.Resource
import typings.maximMazurokGapiClientCloudkms.anon.UpdateMask
import typings.maximMazurokGapiClientCloudkms.anon.UploadType
import typings.maximMazurokGapiClientCloudkms.anon.Uploadprotocol
import typings.maximMazurokGapiClientCloudkms.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeyVersionsResource extends StObject {
  
  def asymmetricDecrypt(request: Callback, body: AsymmetricDecryptRequest): Request[AsymmetricDecryptResponse] = js.native
  /** Decrypts data that was encrypted with a public key retrieved from GetPublicKey corresponding to a CryptoKeyVersion with CryptoKey.purpose ASYMMETRIC_DECRYPT. */
  def asymmetricDecrypt(request: PrettyPrint): Request[AsymmetricDecryptResponse] = js.native
  
  def asymmetricSign(request: Callback, body: AsymmetricSignRequest): Request[AsymmetricSignResponse] = js.native
  /** Signs data using a CryptoKeyVersion with CryptoKey.purpose ASYMMETRIC_SIGN, producing a signature that can be verified with the public key retrieved from GetPublicKey. */
  def asymmetricSign(request: QuotaUser): Request[AsymmetricSignResponse] = js.native
  
  /** Create a new CryptoKeyVersion in a CryptoKey. The server will assign the next sequential id. If unset, state will be set to ENABLED. */
  def create(request: Parent): Request[CryptoKeyVersion] = js.native
  def create(request: UploadType, body: CryptoKeyVersion): Request[CryptoKeyVersion] = js.native
  
  def destroy(request: Callback, body: DestroyCryptoKeyVersionRequest): Request[CryptoKeyVersion] = js.native
  /**
    * Schedule a CryptoKeyVersion for destruction. Upon calling this method, CryptoKeyVersion.state will be set to DESTROY_SCHEDULED, and destroy_time will be set to the time
    * destroy_scheduled_duration in the future. At that time, the state will automatically change to DESTROYED, and the key material will be irrevocably destroyed. Before the destroy_time
    * is reached, RestoreCryptoKeyVersion may be called to reverse the process.
    */
  def destroy(request: Resource): Request[CryptoKeyVersion] = js.native
  
  /** Returns metadata for a given CryptoKeyVersion. */
  def get(): Request[CryptoKeyVersion] = js.native
  def get(request: Callback): Request[CryptoKeyVersion] = js.native
  
  /** Returns the public key for the given CryptoKeyVersion. The CryptoKey.purpose must be ASYMMETRIC_SIGN or ASYMMETRIC_DECRYPT. */
  def getPublicKey(): Request[PublicKey] = js.native
  def getPublicKey(request: Callback): Request[PublicKey] = js.native
  
  def `import`(request: UploadType, body: ImportCryptoKeyVersionRequest): Request[CryptoKeyVersion] = js.native
  /**
    * Import wrapped key material into a CryptoKeyVersion. All requests must specify a CryptoKey. If a CryptoKeyVersion is additionally specified in the request, key material will be
    * reimported into that version. Otherwise, a new version will be created, and will be assigned the next sequential id within the CryptoKey.
    */
  def `import`(request: Uploadprotocol): Request[CryptoKeyVersion] = js.native
  
  /** Lists CryptoKeyVersions. */
  def list(): Request[ListCryptoKeyVersionsResponse] = js.native
  def list(request: OrderBy): Request[ListCryptoKeyVersionsResponse] = js.native
  
  def macSign(request: Callback, body: MacSignRequest): Request[MacSignResponse] = js.native
  /** Signs data using a CryptoKeyVersion with CryptoKey.purpose MAC, producing a tag that can be verified by another source with the same key. */
  def macSign(request: Xgafv): Request[MacSignResponse] = js.native
  
  /** Verifies MAC tag using a CryptoKeyVersion with CryptoKey.purpose MAC, and returns a response that indicates whether or not the verification was successful. */
  def macVerify(request: AccesstokenAlt): Request[MacVerifyResponse] = js.native
  def macVerify(request: Callback, body: MacVerifyRequest): Request[MacVerifyResponse] = js.native
  
  def patch(request: Name, body: CryptoKeyVersion): Request[CryptoKeyVersion] = js.native
  /**
    * Update a CryptoKeyVersion's metadata. state may be changed between ENABLED and DISABLED using this method. See DestroyCryptoKeyVersion and RestoreCryptoKeyVersion to move between
    * other states.
    */
  def patch(request: UpdateMask): Request[CryptoKeyVersion] = js.native
  
  /** Restore a CryptoKeyVersion in the DESTROY_SCHEDULED state. Upon restoration of the CryptoKeyVersion, state will be set to DISABLED, and destroy_time will be cleared. */
  def restore(request: AltCallback): Request[CryptoKeyVersion] = js.native
  def restore(request: Callback, body: RestoreCryptoKeyVersionRequest): Request[CryptoKeyVersion] = js.native
}
