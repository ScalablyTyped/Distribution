package typings.httpServer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.HandleFunction
import typings.httpServer.httpServerBooleans.`true`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.httpsMod.ServerOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var autoIndex: js.UndefOr[Boolean] = js.native
  var before: js.UndefOr[js.Array[HandleFunction]] = js.native
  var cache: js.UndefOr[Double] = js.native
  var contentType: js.UndefOr[String] = js.native
  var cors: js.UndefOr[Boolean] = js.native
  var corsHeaders: js.UndefOr[String] = js.native
  var ext: js.UndefOr[Boolean] = js.native
  var gzip: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var https: js.UndefOr[ServerOptions] = js.native
  // tslint:disable-next-line prefer-method-signature
  var logFn: js.UndefOr[
    js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* err */ Error, Unit]
  ] = js.native
  var proxy: js.UndefOr[String] = js.native
  var robots: js.UndefOr[String | `true`] = js.native
  var root: js.UndefOr[String] = js.native
  var showDir: js.UndefOr[Boolean] = js.native
  var showDotfiles: js.UndefOr[Boolean] = js.native
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
    def setAutoIndex(value: Boolean): Self = this.set("autoIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoIndex: Self = this.set("autoIndex", js.undefined)
    @scala.inline
    def setBeforeVarargs(value: HandleFunction*): Self = this.set("before", js.Array(value :_*))
    @scala.inline
    def setBefore(value: js.Array[HandleFunction]): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setCache(value: Double): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setCors(value: Boolean): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setCorsHeaders(value: String): Self = this.set("corsHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorsHeaders: Self = this.set("corsHeaders", js.undefined)
    @scala.inline
    def setExt(value: Boolean): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHttps(value: ServerOptions): Self = this.set("https", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    @scala.inline
    def setLogFn(value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* err */ Error) => Unit): Self = this.set("logFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLogFn: Self = this.set("logFn", js.undefined)
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setRobots(value: String | `true`): Self = this.set("robots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRobots: Self = this.set("robots", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setShowDir(value: Boolean): Self = this.set("showDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDir: Self = this.set("showDir", js.undefined)
    @scala.inline
    def setShowDotfiles(value: Boolean): Self = this.set("showDotfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDotfiles: Self = this.set("showDotfiles", js.undefined)
  }
  
}

