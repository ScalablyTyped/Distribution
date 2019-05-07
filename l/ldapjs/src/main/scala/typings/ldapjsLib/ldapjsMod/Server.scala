package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends nodeLib.eventsMod.EventEmitter {
  /**
  	 * Set this property to reject connections when the server's connection count gets high.
  	 */
  var maxConnections: scala.Double = js.native
  /**
  	 * Returns the fully qualified URL this server is listening on. For example: ldaps://10.1.2.3:1636. If you haven't yet called listen, it will always return ldap://localhost:389.
  	 */
  var url: java.lang.String = js.native
  def add(mount: java.lang.String, cbHandlers: js.Any*): scala.Unit = js.native
  def bind(mount: java.lang.String, cbHandlers: js.Any*): scala.Unit = js.native
  def compare(ditHook: java.lang.String, cbHandlers: js.Any*): scala.Unit = js.native
  /**
  	 * The number of concurrent connections on the server. (getter only)
  	 */
  def connections(): scala.Double = js.native
  def del(ditHook: java.lang.String, cbHandlers: js.Any*): scala.Unit = js.native
  def exop(arbitraryHook: java.lang.String, cbHandlers: js.Any*): scala.Unit = js.native
  /**
  	 * Unix Domain Socket
  	 * Start a UNIX socket server listening for connections on the given path.
  	 * This function is asynchronous. The last parameter callback will be called when the server has been bound. 
  	 */
  def listen(path: java.lang.String): scala.Unit = js.native
  def listen(path: java.lang.String, callback: js.Any): scala.Unit = js.native
  /**
  	 * Port and Host
  	 * Begin accepting connections on the specified port and host. If the host is omitted, the server will accept connections directed to any IPv4 address (INADDR_ANY).
  	 * This function is asynchronous. The last parameter callback will be called when the server has been bound.
  	 */
  def listen(port: scala.Double): scala.Unit = js.native
  def listen(port: scala.Double, callback: js.Any): scala.Unit = js.native
  def listen(port: scala.Double, host: java.lang.String): scala.Unit = js.native
  def listen(port: scala.Double, host: java.lang.String, callback: js.Any): scala.Unit = js.native
  /**
  	 * File descriptor
  	 * Start a server listening for connections on the given file descriptor.
  	 * This file descriptor must have already had the bind(2) and listen(2) system calls invoked on it. Additionally, it must be set non-blocking; try fcntl(fd, F_SETFL, O_NONBLOCK).
  	 */
  def listenFD(fileDescriptor: js.Any): scala.Unit = js.native
  def modify(ditHook: java.lang.String, cbHandlers: js.Any*): scala.Unit = js.native
  def modifyDN(ditHook: java.lang.String, cbHandlers: js.Any*): scala.Unit = js.native
  def search(ditHook: java.lang.String, cbHandlers: js.Any*): scala.Unit = js.native
  def unbind(cbHandlers: js.Any*): scala.Unit = js.native
}

