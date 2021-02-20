package typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudshell.anon.Alt
import typings.maximMazurokGapiClientCloudshell.anon.Fields
import typings.maximMazurokGapiClientCloudshell.anon.Key
import typings.maximMazurokGapiClientCloudshell.anon.Name
import typings.maximMazurokGapiClientCloudshell.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentsResource extends StObject {
  
  /**
    * Adds a public SSH key to an environment, allowing clients with the corresponding private key to connect to that environment via SSH. If a key with the same content already exists,
    * this will error with ALREADY_EXISTS.
    */
  def addPublicKey(request: typings.maximMazurokGapiClientCloudshell.anon.Environment): Request[Operation] = js.native
  def addPublicKey(request: Fields, body: AddPublicKeyRequest): Request[Operation] = js.native
  
  def authorize(request: Alt, body: AuthorizeEnvironmentRequest): Request[Operation] = js.native
  /**
    * Sends OAuth credentials to a running environment on behalf of a user. When this completes, the environment will be authorized to run various Google Cloud command line tools without
    * requiring the user to manually authenticate.
    */
  def authorize(request: Key): Request[Operation] = js.native
  
  /** Gets an environment. Returns NOT_FOUND if the environment does not exist. */
  def get(): Request[Environment] = js.native
  def get(request: Alt): Request[Environment] = js.native
  
  def removePublicKey(request: Fields, body: RemovePublicKeyRequest): Request[Operation] = js.native
  /**
    * Removes a public SSH key from an environment. Clients will no longer be able to connect to the environment using the corresponding private key. If a key with the same content is not
    * present, this will error with NOT_FOUND.
    */
  def removePublicKey(request: Oauthtoken): Request[Operation] = js.native
  
  def start(request: Alt, body: StartEnvironmentRequest): Request[Operation] = js.native
  /**
    * Starts an existing environment, allowing clients to connect to it. The returned operation will contain an instance of StartEnvironmentMetadata in its metadata field. Users can wait
    * for the environment to start by polling this operation via GetOperation. Once the environment has finished starting and is ready to accept connections, the operation will contain a
    * StartEnvironmentResponse in its response field.
    */
  def start(request: Name): Request[Operation] = js.native
}
