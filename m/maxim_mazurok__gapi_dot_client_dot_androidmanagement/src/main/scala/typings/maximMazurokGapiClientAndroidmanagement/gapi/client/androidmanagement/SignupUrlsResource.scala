package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidmanagement.anon.CallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignupUrlsResource extends js.Object {
  
  /** Creates an enterprise signup URL. */
  def create(): Request[SignupUrl] = js.native
  def create(request: CallbackUrl): Request[SignupUrl] = js.native
}
