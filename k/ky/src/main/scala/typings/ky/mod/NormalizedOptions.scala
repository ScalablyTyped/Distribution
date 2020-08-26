package typings.ky.mod

import typings.std.Headers
import typings.std.RequestInit
import typings.std.URL
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizedOptions extends RequestInit {
  // New type.
  @JSName("headers")
  var headers_NormalizedOptions: Headers = js.native
  var onDownloadProgress: js.UndefOr[js.Function2[/* progress */ DownloadProgress, /* chunk */ Uint8Array, Unit]] = js.native
  var prefixUrl: js.UndefOr[URL | String] = js.native
  // Extended from custom `KyOptions`, but ensured to be set (not optional).
  var retry: js.UndefOr[RetryOptions | Double] = js.native
}

object NormalizedOptions {
  @scala.inline
  def apply(headers: Headers): NormalizedOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOptions]
  }
  @scala.inline
  implicit class NormalizedOptionsOps[Self <: NormalizedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDownloadProgress(value: (/* progress */ DownloadProgress, /* chunk */ Uint8Array) => Unit): Self = this.set("onDownloadProgress", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDownloadProgress: Self = this.set("onDownloadProgress", js.undefined)
    @scala.inline
    def setPrefixUrl(value: URL | String): Self = this.set("prefixUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixUrl: Self = this.set("prefixUrl", js.undefined)
    @scala.inline
    def setRetry(value: RetryOptions | Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
  }
  
}

