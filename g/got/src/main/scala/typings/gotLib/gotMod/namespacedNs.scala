package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("got", JSImport.Namespace)
@js.native
object namespacedNs extends js.Object {
  @js.native
  class CancelError ()
    extends gotLib.gotMod.CancelError {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_CancelError: gotLib.gotLibStrings.CancelError = js.native
  }
  
  @js.native
  class HTTPError ()
    extends gotLib.gotMod.HTTPError {
    /* CompleteClass */
    override var body: nodeLib.Buffer | java.lang.String | js.Object = js.native
    /* CompleteClass */
    override var headers: nodeLib.httpMod.IncomingHttpHeaders = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_HTTPError: gotLib.gotLibStrings.HTTPError = js.native
    /* CompleteClass */
    override var statusCode: scala.Double = js.native
    /* CompleteClass */
    override var statusMessage: java.lang.String = js.native
  }
  
  @js.native
  class MaxRedirectsError ()
    extends gotLib.gotMod.MaxRedirectsError {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_MaxRedirectsError: gotLib.gotLibStrings.MaxRedirectsError = js.native
    /* CompleteClass */
    override var redirectUrls: js.Array[java.lang.String] = js.native
    /* CompleteClass */
    override var statusCode: scala.Double = js.native
    /* CompleteClass */
    override var statusMessage: java.lang.String = js.native
  }
  
  @js.native
  class ParseError ()
    extends gotLib.gotMod.ParseError {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_ParseError: gotLib.gotLibStrings.ParseError = js.native
    /* CompleteClass */
    override var statusCode: scala.Double = js.native
    /* CompleteClass */
    override var statusMessage: java.lang.String = js.native
  }
  
  @js.native
  class ReadError ()
    extends gotLib.gotMod.ReadError {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_ReadError: gotLib.gotLibStrings.ReadError = js.native
  }
  
  @js.native
  class RequestError ()
    extends gotLib.gotMod.RequestError {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_RequestError: gotLib.gotLibStrings.RequestError = js.native
  }
  
  @js.native
  class TimeoutError ()
    extends gotLib.gotMod.TimeoutError {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_TimeoutError: gotLib.gotLibStrings.TimeoutError = js.native
  }
  
  @js.native
  class UnsupportedProtocolError ()
    extends gotLib.gotMod.UnsupportedProtocolError {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override var name_UnsupportedProtocolError: gotLib.gotLibStrings.UnsupportedProtocolError = js.native
  }
  
}

