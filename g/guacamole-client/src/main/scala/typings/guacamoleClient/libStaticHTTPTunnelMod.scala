package typings.guacamoleClient

import typings.guacamoleClient.libTunnelMod.Tunnel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStaticHTTPTunnelMod {
  
  @JSImport("guacamole-client/lib/StaticHTTPTunnel", "StaticHTTPTunnel")
  @js.native
  open class StaticHTTPTunnel protected () extends Tunnel {
    /**
      * @param url The URL of a Guacamole protocol dump.
      * @param [crossDomain=false] Whether tunnel requests will be cross-domain, and thus must use CORS
      * mechanisms and headers. By default, it is assumed that tunnel requests will be made to the same domain.
      * @param [extraTunnelHeaders={}] Key value pairs containing the header names and values of any additional
      * headers to be sent in tunnel requests. By default, no extra headers will be added.
      */
    def this(url: String) = this()
    def this(url: String, crossDomain: Boolean) = this()
    def this(url: String, crossDomain: Boolean, extraTunnelHeaders: Record[String, String]) = this()
    def this(url: String, crossDomain: Unit, extraTunnelHeaders: Record[String, String]) = this()
  }
}
