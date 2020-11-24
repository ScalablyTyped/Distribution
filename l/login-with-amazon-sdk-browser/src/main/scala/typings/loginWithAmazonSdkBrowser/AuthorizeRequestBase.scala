package typings.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base interface that contains common members to an `authorize` request (whether for token or code).
  * Contains optional error-related members; these will be defined if there was an error.
  */
@js.native
trait AuthorizeRequestBase[T /* <: AuthorizeRequest */] extends js.Object {
  
  /**
    * A short error code indicating why the authorization failed.
    */
  var error: js.UndefOr[AuthorizeRequestErrorType] = js.native
  
  /**
    * A human-readable description of the error.
    */
  var error_description: js.UndefOr[String] = js.native
  
  /**
    * A URI for a web page with more information on the error.
    */
  var error_uri: js.UndefOr[String] = js.native
  
  /**
    * Registers a callback function or sets a redirect URI to call when the
    * authorization request is complete. If this function is called after the
    * request is complete, the function or redirect will happen immediately.
    * If a callback function is used, the `AuthorizeRequest` will be the first
    * parameter. If a redirect URI is used, the browser will redirect to that
    * URI with the OAuth 2 response parameters included in the query string.
    * @param next A URI to redirect the browser response,or a JavaScript
    * function to call with the authorization response.
    */
  def onComplete(next: String): Unit = js.native
  def onComplete(next: NextCallback[T]): Unit = js.native
  
  /**
    * The current status of the request.
    */
  var status: AuthorizeRequestStatus = js.native
}
