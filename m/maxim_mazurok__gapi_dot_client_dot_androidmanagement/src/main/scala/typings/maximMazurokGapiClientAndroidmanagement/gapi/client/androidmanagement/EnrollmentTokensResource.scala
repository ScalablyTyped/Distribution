package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidmanagement.anon.Alt
import typings.maximMazurokGapiClientAndroidmanagement.anon.Oauthtoken
import typings.maximMazurokGapiClientAndroidmanagement.anon.Parent
import typings.maximMazurokGapiClientAndroidmanagement.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnrollmentTokensResource extends StObject {
  
  /**
    * Creates an enrollment token for a given enterprise. It's up to the caller's responsibility to manage the lifecycle of newly created tokens and deleting them when they're not
    * intended to be used anymore. Once an enrollment token has been created, it's not possible to retrieve the token's content anymore using AM API. It is recommended for EMMs to
    * securely store the token if it's intended to be reused.
    */
  def create(request: Parent): Request[EnrollmentToken] = js.native
  def create(request: QuotaUser, body: EnrollmentToken): Request[EnrollmentToken] = js.native
  
  /** Deletes an enrollment token. This operation invalidates the token, preventing its future use. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /**
    * Gets an active, unexpired enrollment token. Only a partial view of EnrollmentToken is returned: all the fields but name and expiration_timestamp are empty. This method is meant to
    * help manage active enrollment tokens lifecycle. For security reasons, it's recommended to delete active enrollment tokens as soon as they're not intended to be used anymore.
    */
  def get(): Request[EnrollmentToken] = js.native
  def get(request: Alt): Request[EnrollmentToken] = js.native
  
  /**
    * Lists active, unexpired enrollment tokens for a given enterprise. The list items contain only a partial view of EnrollmentToken: all the fields but name and expiration_timestamp are
    * empty. This method is meant to help manage active enrollment tokens lifecycle. For security reasons, it's recommended to delete active enrollment tokens as soon as they're not
    * intended to be used anymore.
    */
  def list(): Request[ListEnrollmentTokensResponse] = js.native
  def list(request: Oauthtoken): Request[ListEnrollmentTokensResponse] = js.native
}
