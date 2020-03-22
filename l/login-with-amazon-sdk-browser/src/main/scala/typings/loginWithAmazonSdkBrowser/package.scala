package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loginWithAmazonSdkBrowser {
  type AuthorizeScope = typings.loginWithAmazonSdkBrowser.AuthorizationScopeOptions | js.Array[typings.loginWithAmazonSdkBrowser.AuthorizationScopeOptions]
  /**
    * Type of callback invoked after `authorize` completes.
    */
  type NextCallback[T /* <: typings.loginWithAmazonSdkBrowser.AuthorizeRequest */] = js.Function1[/* response */ T, scala.Unit]
  type RetrieveProfileCallback = js.Function1[
    /* response */ typings.loginWithAmazonSdkBrowser.RetrieveProfileResponse, 
    scala.Unit
  ]
}
