package typings.got.mod

import typings.got.gotStrings.downloadProgress
import typings.got.gotStrings.error
import typings.got.gotStrings.redirect
import typings.got.gotStrings.request
import typings.got.gotStrings.response
import typings.got.gotStrings.uploadProgress
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotEmitter extends js.Object {
  @JSName("addListener")
  def addListener_downloadProgress(event: downloadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[IncomingMessage], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_redirect(
    event: redirect,
    listener: js.Function2[
      /* res */ IncomingMessage, 
      /* nextOptions */ (GotOptions[String | Null]) with Url, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_request(event: request, listener: js.Function1[/* req */ ClientRequest, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_uploadProgress(event: uploadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
  @JSName("on")
  def on_downloadProgress(event: downloadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[IncomingMessage], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_redirect(
    event: redirect,
    listener: js.Function2[
      /* res */ IncomingMessage, 
      /* nextOptions */ (GotOptions[String | Null]) with Url, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_request(event: request, listener: js.Function1[/* req */ ClientRequest, Unit]): this.type = js.native
  @JSName("on")
  def on_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Unit]): this.type = js.native
  @JSName("on")
  def on_uploadProgress(event: uploadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
  @JSName("once")
  def once_downloadProgress(event: downloadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[IncomingMessage], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_redirect(
    event: redirect,
    listener: js.Function2[
      /* res */ IncomingMessage, 
      /* nextOptions */ (GotOptions[String | Null]) with Url, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_request(event: request, listener: js.Function1[/* req */ ClientRequest, Unit]): this.type = js.native
  @JSName("once")
  def once_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Unit]): this.type = js.native
  @JSName("once")
  def once_uploadProgress(event: uploadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_downloadProgress(event: downloadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[IncomingMessage], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_redirect(
    event: redirect,
    listener: js.Function2[
      /* res */ IncomingMessage, 
      /* nextOptions */ (GotOptions[String | Null]) with Url, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_request(event: request, listener: js.Function1[/* req */ ClientRequest, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_uploadProgress(event: uploadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_downloadProgress(event: downloadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[IncomingMessage], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_redirect(
    event: redirect,
    listener: js.Function2[
      /* res */ IncomingMessage, 
      /* nextOptions */ (GotOptions[String | Null]) with Url, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_request(event: request, listener: js.Function1[/* req */ ClientRequest, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_uploadProgress(event: uploadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_downloadProgress(event: downloadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: error,
    listener: js.Function3[
      /* error */ GotError, 
      /* body */ js.UndefOr[js.Any], 
      /* res */ js.UndefOr[IncomingMessage], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_redirect(
    event: redirect,
    listener: js.Function2[
      /* res */ IncomingMessage, 
      /* nextOptions */ (GotOptions[String | Null]) with Url, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_request(event: request, listener: js.Function1[/* req */ ClientRequest, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_response(event: response, listener: js.Function1[/* res */ IncomingMessage, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_uploadProgress(event: uploadProgress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
}

