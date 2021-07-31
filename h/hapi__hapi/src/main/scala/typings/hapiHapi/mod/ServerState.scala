package typings.hapiHapi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hapiHapi.mod.Util.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerState extends StObject {
  
  /**
    * Same as calling [server.state()](https://github.com/hapijs/hapi/blob/master/API.md#server.state()).
    */
  def add(name: String): Unit = js.native
  def add(name: String, options: ServerStateCookieOptions): Unit = js.native
  
  /**
    * An object containing the configuration of each cookie added via [server.state()](https://github.com/hapijs/hapi/blob/master/API.md#server.state()) where each key is the
    * cookie name and value is the configuration object.
    */
  val cookies: StringDictionary[ServerStateCookieOptions] = js.native
  
  def format(cookies: js.Array[ServerStateFormat]): js.Promise[String] = js.native
  /**
    * Formats an HTTP 'Set-Cookie' header based on the server.options.state where:
    * @param cookies - a single object or an array of object where each contains:
    * * name - the cookie name.
    * * value - the cookie value.
    * * options - cookie configuration to override the server settings.
    * @return Return value: a header string.
    * Note that this utility uses the server configuration but does not change the server state. It is provided for manual cookie formating (e.g. when headers are set manually).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-async-serverstatesformatcookies)
    */
  def format(cookies: ServerStateFormat): js.Promise[String] = js.native
  
  /**
    * An array containing the names of all configued cookies.
    */
  val names: js.Array[String] = js.native
  
  /**
    * Parses an HTTP 'Cookies' header based on the server.options.state where:
    * @param header - the HTTP header.
    * @return Return value: an object where each key is a cookie name and value is the parsed cookie.
    * Note that this utility uses the server configuration but does not change the server state. It is provided for manual cookie parsing (e.g. when server parsing is disabled).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-async-serverstatesparseheader)
    */
  def parse(header: String): js.Promise[Dictionary[String]] = js.native
  
  /**
    * The server cookies manager settings. The settings are based on the values configured in [server.options.state](https://github.com/hapijs/hapi/blob/master/API.md#server.options.state).
    */
  val settings: ServerStateCookieOptions = js.native
  
  /**
    * The server cookies manager.
    * Access: read only and statehood public interface.
    */
  val states: js.Object = js.native
}
