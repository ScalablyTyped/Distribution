package typings.maximMazurokGapiClientCloudprofiler.gapi.client.cloudprofiler

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudprofiler.anon.Accesstoken
import typings.maximMazurokGapiClientCloudprofiler.anon.Alt
import typings.maximMazurokGapiClientCloudprofiler.anon.Callback
import typings.maximMazurokGapiClientCloudprofiler.anon.Fields
import typings.maximMazurokGapiClientCloudprofiler.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilesResource extends js.Object {
  
  /**
    * CreateProfile creates a new profile resource in the online mode. The server ensures that the new profiles are created at a constant rate per deployment, so the creation request may
    * hang for some time until the next profile session is available. The request may fail with ABORTED error if the creation is not available within ~1m, the response will indicate the
    * duration of the backoff the client should take before attempting creating a profile again. The backoff duration is returned in google.rpc.RetryInfo extension on the response status.
    * To a gRPC client, the extension will be return as a binary-serialized proto in the trailing metadata item named "google.rpc.retryinfo-bin".
    */
  def create(request: Accesstoken): Request[Profile] = js.native
  def create(request: Alt, body: CreateProfileRequest): Request[Profile] = js.native
  
  def createOffline(request: Alt, body: Profile): Request[Profile] = js.native
  /** CreateOfflineProfile creates a new profile resource in the offline mode. The client provides the profile to create along with the profile bytes, the server records it. */
  def createOffline(request: Callback): Request[Profile] = js.native
  
  /**
    * UpdateProfile updates the profile bytes and labels on the profile resource created in the online mode. Updating the bytes for profiles created in the offline mode is currently not
    * supported: the profile content must be provided at the time of the profile creation.
    */
  def patch(request: Fields): Request[Profile] = js.native
  def patch(request: Key, body: Profile): Request[Profile] = js.native
}
