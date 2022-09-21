package typings.httpBasic

import typings.httpBasic.callbackMod.Callback
import typings.httpBasic.httpVerbMod.HttpVerb
import typings.httpBasic.optionsMod.Options
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.urlMod.URL_
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-basic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(method: HttpVerb, url: String, callback: Callback): Unit | WritableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit | WritableStream[Any]]
  inline def default(method: HttpVerb, url: String, options: Null, callback: Callback): Unit | WritableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit | WritableStream[Any]]
  inline def default(method: HttpVerb, url: String, options: Unit, callback: Callback): Unit | WritableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit | WritableStream[Any]]
  inline def default(method: HttpVerb, url: String, options: Options, callback: Callback): Unit | WritableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit | WritableStream[Any]]
  inline def default(method: HttpVerb, url: URL_, callback: Callback): Unit | WritableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit | WritableStream[Any]]
  inline def default(method: HttpVerb, url: URL_, options: Null, callback: Callback): Unit | WritableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit | WritableStream[Any]]
  inline def default(method: HttpVerb, url: URL_, options: Unit, callback: Callback): Unit | WritableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit | WritableStream[Any]]
  inline def default(method: HttpVerb, url: URL_, options: Options, callback: Callback): Unit | WritableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit | WritableStream[Any]]
  
  /**
    * A response from a web request
    */
  @JSImport("http-basic", "Response")
  @js.native
  open class Response[TBody] protected ()
    extends typings.httpResponseObject.mod.^[TBody] {
    def this(statusCode: Double, headers: IncomingHttpHeaders, body: TBody, url: String) = this()
  }
}
