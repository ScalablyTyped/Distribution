package typings.guacamoleClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "HTTPTunnel")
@js.native
open class HTTPTunnel protected ()
  extends typings.guacamoleClient.libHttptunnelMod.HTTPTunnel {
  /**
    * @param tunnelURL The URL of the HTTP tunneling service.
    * @param [crossDomain=false] Whether tunnel requests will be cross-domain, and thus must use CORS
    * mechanisms and headers. By default, it is assumed that tunnel requests
    * will be made to the same domain.
    * @param [extraTunnelHeaders={}] Key value pairs containing the header names and values of any additional
    * headers to be sent in tunnel requests. By default, no extra headers will be added.
    */
  def this(tunnelURL: String) = this()
  def this(tunnelURL: String, crossDomain: Boolean) = this()
  def this(tunnelURL: String, crossDomain: Boolean, extraTunnelHeaders: Boolean) = this()
  def this(tunnelURL: String, crossDomain: Unit, extraTunnelHeaders: Boolean) = this()
}
