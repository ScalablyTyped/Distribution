package typings.ky.kyMod

import typings.std.Headers
import typings.std.RequestCredentials
import typings.std.RequestInit
import typings.std.URL
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
Normalized options passed to the `fetch` call and the `beforeRequest` hooks.
*/
@js.native
trait NormalizedOptions extends RequestInit {
  @JSName("credentials")
  var credentials_NormalizedOptions: js.UndefOr[RequestCredentials] = js.native
  // New type.
  @JSName("headers")
  var headers_NormalizedOptions: Headers = js.native
  // Extended from `RequestInit`, but ensured to be set (not optional).
  @JSName("method")
  var method_NormalizedOptions: js.UndefOr[String] = js.native
  @JSName("onDownloadProgress")
  var onDownloadProgress_Original: js.Function2[/* progress */ DownloadProgress, /* chunk */ Uint8Array, Unit] = js.native
  var prefixUrl: js.UndefOr[URL | String] = js.native
  // Extended from custom `KyOptions`, but ensured to be set (not optional).
  var retry: js.UndefOr[RetryOptions | Double] = js.native
  def onDownloadProgress(progress: DownloadProgress, chunk: Uint8Array): Unit = js.native
}

