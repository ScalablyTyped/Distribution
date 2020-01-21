package typings.hapiHapi.mod

import typings.hapiHapi.hapiHapiStrings.http
import typings.hapiHapi.hapiHapiStrings.https
import typings.hapiHapi.hapiHapiStrings.socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInfo extends js.Object {
  /**
    * the active IP address the connection was bound to after starting. Set to undefined until the server has been
    * started or when using a non TCP port (e.g. UNIX domain socket).
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    * server creation timestamp.
    */
  var created: Double
  /**
    * The [host](https://github.com/hapijs/hapi/blob/master/API.md#server.options.host) configuration value.
    */
  var host: String
  /**
    * a unique server identifier (using the format '{hostname}:{pid}:{now base36}').
    */
  var id: String
  /**
    * the connection [port](https://github.com/hapijs/hapi/blob/master/API.md#server.options.port) based on the following rules:
    *  * before the server has been started: the configured port value.
    *  * after the server has been started: the actual port assigned when no port is configured or was set to 0.
    */
  var port: Double | String
  /**
    *  the protocol used:
    * * 'http' - HTTP.
    * * 'https' - HTTPS.
    * * 'socket' - UNIX domain socket or Windows named pipe.
    */
  var protocol: http | https | socket
  /**
    * server start timestamp (0 when stopped).
    */
  var started: Double
  /**
    * a string representing the connection (e.g. 'http://example.com:8080' or 'socket:/unix/domain/socket/path'). Contains
    * the uri value if set, otherwise constructed from the available settings. If no port is configured or is set
    * to 0, the uri will not include a port component until the server is started.
    */
  var uri: String
}

object ServerInfo {
  @scala.inline
  def apply(
    created: Double,
    host: String,
    id: String,
    port: Double | String,
    protocol: http | https | socket,
    started: Double,
    uri: String,
    address: String = null
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
}

