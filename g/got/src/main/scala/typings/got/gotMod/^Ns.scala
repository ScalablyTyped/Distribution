package typings.got.gotMod

import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("got", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  @js.native
  class CancelError ()
    extends typings.got.gotMod.CancelError {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_CancelError: typings.got.gotStrings.CancelError = js.native
  }
  
  @js.native
  class HTTPError ()
    extends typings.got.gotMod.HTTPError {
    /* CompleteClass */
    override var body: Buffer | String | js.Object = js.native
    /* CompleteClass */
    override var headers: IncomingHttpHeaders = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_HTTPError: typings.got.gotStrings.HTTPError = js.native
    /* CompleteClass */
    override var statusCode: Double = js.native
    /* CompleteClass */
    override var statusMessage: String = js.native
  }
  
  @js.native
  class MaxRedirectsError ()
    extends typings.got.gotMod.MaxRedirectsError {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_MaxRedirectsError: typings.got.gotStrings.MaxRedirectsError = js.native
    /* CompleteClass */
    override var redirectUrls: js.Array[String] = js.native
    /* CompleteClass */
    override var statusCode: Double = js.native
    /* CompleteClass */
    override var statusMessage: String = js.native
  }
  
  @js.native
  class ParseError ()
    extends typings.got.gotMod.ParseError {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_ParseError: typings.got.gotStrings.ParseError = js.native
    /* CompleteClass */
    override var statusCode: Double = js.native
    /* CompleteClass */
    override var statusMessage: String = js.native
  }
  
  @js.native
  class ReadError ()
    extends typings.got.gotMod.ReadError {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_ReadError: typings.got.gotStrings.ReadError = js.native
  }
  
  @js.native
  class RequestError ()
    extends typings.got.gotMod.RequestError {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_RequestError: typings.got.gotStrings.RequestError = js.native
  }
  
  @js.native
  class TimeoutError ()
    extends typings.got.gotMod.TimeoutError {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_TimeoutError: typings.got.gotStrings.TimeoutError = js.native
  }
  
  @js.native
  class UnsupportedProtocolError ()
    extends typings.got.gotMod.UnsupportedProtocolError {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_UnsupportedProtocolError: typings.got.gotStrings.UnsupportedProtocolError = js.native
  }
  
}

