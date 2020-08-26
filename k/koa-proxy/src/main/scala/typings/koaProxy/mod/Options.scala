package typings.koaProxy.mod

import typings.koa.mod.Request
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var followRedirect: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var jar: js.UndefOr[Boolean] = js.native
  var map: js.UndefOr[IndexedObject | MapFunction] = js.native
  var `match`: js.UndefOr[RegExp] = js.native
   // case-insensitive
  var overrideResponseHeaders: js.UndefOr[js.Any] = js.native
  var requestOptions: js.UndefOr[RequestOptionFunc | IndexedObject] = js.native
  var suppressRequestHeaders: js.UndefOr[js.Array[String]] = js.native
   // case-insensitive
  var suppressResponseHeaders: js.UndefOr[js.Array[String]] = js.native
  var url: js.UndefOr[String] = js.native
  var yieldNext: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFollowRedirect(value: Boolean): Self = this.set("followRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowRedirect: Self = this.set("followRedirect", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setJar(value: Boolean): Self = this.set("jar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJar: Self = this.set("jar", js.undefined)
    @scala.inline
    def setMapFunction1(value: /* path */ String => String): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def setMap(value: IndexedObject | MapFunction): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMatch(value: RegExp): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setOverrideResponseHeaders(value: js.Any): Self = this.set("overrideResponseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideResponseHeaders: Self = this.set("overrideResponseHeaders", js.undefined)
    @scala.inline
    def setRequestOptionsFunction2(value: (/* request */ Request, /* opts */ js.Any) => js.Any): Self = this.set("requestOptions", js.Any.fromFunction2(value))
    @scala.inline
    def setRequestOptions(value: RequestOptionFunc | IndexedObject): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
    @scala.inline
    def setSuppressRequestHeadersVarargs(value: String*): Self = this.set("suppressRequestHeaders", js.Array(value :_*))
    @scala.inline
    def setSuppressRequestHeaders(value: js.Array[String]): Self = this.set("suppressRequestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressRequestHeaders: Self = this.set("suppressRequestHeaders", js.undefined)
    @scala.inline
    def setSuppressResponseHeadersVarargs(value: String*): Self = this.set("suppressResponseHeaders", js.Array(value :_*))
    @scala.inline
    def setSuppressResponseHeaders(value: js.Array[String]): Self = this.set("suppressResponseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressResponseHeaders: Self = this.set("suppressResponseHeaders", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setYieldNext(value: Boolean): Self = this.set("yieldNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYieldNext: Self = this.set("yieldNext", js.undefined)
  }
  
}

