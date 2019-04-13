package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotEmitter extends js.Object {
  @JSName("addListener")
  def addListener_downloadProgress(
    event: gotLib.gotLibStrings.downloadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: gotLib.gotLibStrings.error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[nodeLib.httpMod.IncomingMessage], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_redirect(
    event: gotLib.gotLibStrings.redirect,
    listener: js.Function2[
      /* res */ nodeLib.httpMod.IncomingMessage, 
      /* nextOptions */ (GotOptions[java.lang.String | scala.Null]) with nodeLib.urlMod.Url, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_request(
    event: gotLib.gotLibStrings.request,
    listener: js.Function1[/* req */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_response(
    event: gotLib.gotLibStrings.response,
    listener: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_uploadProgress(
    event: gotLib.gotLibStrings.uploadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_downloadProgress(
    event: gotLib.gotLibStrings.downloadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: gotLib.gotLibStrings.error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[nodeLib.httpMod.IncomingMessage], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_redirect(
    event: gotLib.gotLibStrings.redirect,
    listener: js.Function2[
      /* res */ nodeLib.httpMod.IncomingMessage, 
      /* nextOptions */ (GotOptions[java.lang.String | scala.Null]) with nodeLib.urlMod.Url, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_request(
    event: gotLib.gotLibStrings.request,
    listener: js.Function1[/* req */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_response(
    event: gotLib.gotLibStrings.response,
    listener: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_uploadProgress(
    event: gotLib.gotLibStrings.uploadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_downloadProgress(
    event: gotLib.gotLibStrings.downloadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: gotLib.gotLibStrings.error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[nodeLib.httpMod.IncomingMessage], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_redirect(
    event: gotLib.gotLibStrings.redirect,
    listener: js.Function2[
      /* res */ nodeLib.httpMod.IncomingMessage, 
      /* nextOptions */ (GotOptions[java.lang.String | scala.Null]) with nodeLib.urlMod.Url, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_request(
    event: gotLib.gotLibStrings.request,
    listener: js.Function1[/* req */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_response(
    event: gotLib.gotLibStrings.response,
    listener: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_uploadProgress(
    event: gotLib.gotLibStrings.uploadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_downloadProgress(
    event: gotLib.gotLibStrings.downloadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: gotLib.gotLibStrings.error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[nodeLib.httpMod.IncomingMessage], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_redirect(
    event: gotLib.gotLibStrings.redirect,
    listener: js.Function2[
      /* res */ nodeLib.httpMod.IncomingMessage, 
      /* nextOptions */ (GotOptions[java.lang.String | scala.Null]) with nodeLib.urlMod.Url, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_request(
    event: gotLib.gotLibStrings.request,
    listener: js.Function1[/* req */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_response(
    event: gotLib.gotLibStrings.response,
    listener: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_uploadProgress(
    event: gotLib.gotLibStrings.uploadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_downloadProgress(
    event: gotLib.gotLibStrings.downloadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: gotLib.gotLibStrings.error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[nodeLib.httpMod.IncomingMessage], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_redirect(
    event: gotLib.gotLibStrings.redirect,
    listener: js.Function2[
      /* res */ nodeLib.httpMod.IncomingMessage, 
      /* nextOptions */ (GotOptions[java.lang.String | scala.Null]) with nodeLib.urlMod.Url, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_request(
    event: gotLib.gotLibStrings.request,
    listener: js.Function1[/* req */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_response(
    event: gotLib.gotLibStrings.response,
    listener: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_uploadProgress(
    event: gotLib.gotLibStrings.uploadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_downloadProgress(
    event: gotLib.gotLibStrings.downloadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: gotLib.gotLibStrings.error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[nodeLib.httpMod.IncomingMessage], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_redirect(
    event: gotLib.gotLibStrings.redirect,
    listener: js.Function2[
      /* res */ nodeLib.httpMod.IncomingMessage, 
      /* nextOptions */ (GotOptions[java.lang.String | scala.Null]) with nodeLib.urlMod.Url, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_request(
    event: gotLib.gotLibStrings.request,
    listener: js.Function1[/* req */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_response(
    event: gotLib.gotLibStrings.response,
    listener: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_uploadProgress(
    event: gotLib.gotLibStrings.uploadProgress,
    listener: js.Function1[/* progress */ Progress, scala.Unit]
  ): this.type = js.native
}

