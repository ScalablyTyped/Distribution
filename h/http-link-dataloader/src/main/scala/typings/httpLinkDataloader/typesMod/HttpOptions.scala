package typings.httpLinkDataloader.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined http-link-dataloader.http-link-dataloader/dist/src/types.Options & {  uri :string} */
@js.native
trait HttpOptions extends js.Object {
  var cache: js.UndefOr[RequestCache] = js.native
  var credentials: js.UndefOr[RequestCredentials] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var integrity: js.UndefOr[String] = js.native
  var keepalive: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[String] = js.native
  var mode: js.UndefOr[RequestMode] = js.native
  var redirect: js.UndefOr[RequestRedirect] = js.native
  var referrer: js.UndefOr[String] = js.native
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
  var uri: String = js.native
}

object HttpOptions {
  @scala.inline
  def apply(uri: String): HttpOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOptions]
  }
  @scala.inline
  implicit class HttpOptionsOps[Self <: HttpOptions] (val x: Self) extends AnyVal {
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: RequestCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCredentials(value: RequestCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    @scala.inline
    def setKeepalive(value: Boolean): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMode(value: RequestMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setRedirect(value: RequestRedirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setReferrerPolicy(value: ReferrerPolicy): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
  }
  
}

