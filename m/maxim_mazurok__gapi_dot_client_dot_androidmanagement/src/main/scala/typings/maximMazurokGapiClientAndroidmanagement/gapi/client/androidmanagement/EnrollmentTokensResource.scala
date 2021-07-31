package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidmanagement.anon.Alt
import typings.maximMazurokGapiClientAndroidmanagement.anon.Parent
import typings.maximMazurokGapiClientAndroidmanagement.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnrollmentTokensResource extends StObject {
  
  /** Creates an enrollment token for a given enterprise. */
  def create(request: Parent): Request[EnrollmentToken] = js.native
  def create(request: QuotaUser, body: EnrollmentToken): Request[EnrollmentToken] = js.native
  
  /** Deletes an enrollment token. This operation invalidates the token, preventing its future use. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
}
