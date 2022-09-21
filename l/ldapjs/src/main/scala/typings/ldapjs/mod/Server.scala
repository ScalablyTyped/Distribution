package typings.ldapjs.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends EventEmitter {
  
  def add(mount: String, cbHandlers: Any*): Unit = js.native
  
  def bind(mount: String, cbHandlers: Any*): Unit = js.native
  
  def close(callback: js.Function0[Unit]): this.type = js.native
  
  def compare(ditHook: String, cbHandlers: Any*): Unit = js.native
  
  /**
    * The number of concurrent connections on the server. (getter only)
    */
  def connections(): Double = js.native
  
  def del(ditHook: String, cbHandlers: Any*): Unit = js.native
  
  def exop(arbitraryHook: String, cbHandlers: Any*): Unit = js.native
  
  /**
    * Unix Domain Socket
    * Start a UNIX socket server listening for connections on the given path.
    * This function is asynchronous. The last parameter callback will be called when the server has been bound.
    */
  def listen(path: String): Unit = js.native
  def listen(path: String, callback: Any): Unit = js.native
  /**
    * Port and Host
    * Begin accepting connections on the specified port and host. If the host is omitted, the server will accept connections directed to any IPv4 address (INADDR_ANY).
    * This function is asynchronous. The last parameter callback will be called when the server has been bound.
    */
  def listen(port: Double): Unit = js.native
  def listen(port: Double, callback: Any): Unit = js.native
  def listen(port: Double, host: String): Unit = js.native
  def listen(port: Double, host: String, callback: Any): Unit = js.native
  
  /**
    * File descriptor
    * Start a server listening for connections on the given file descriptor.
    * This file descriptor must have already had the bind(2) and listen(2) system calls invoked on it. Additionally, it must be set non-blocking; try fcntl(fd, F_SETFL, O_NONBLOCK).
    */
  def listenFD(fileDescriptor: Any): Unit = js.native
  
  /**
    * Set this property to reject connections when the server's connection count gets high.
    */
  var maxConnections: Double = js.native
  
  def modify(ditHook: String, cbHandlers: Any*): Unit = js.native
  
  def modifyDN(ditHook: String, cbHandlers: Any*): Unit = js.native
  
  def search(ditHook: String, cbHandlers: Any*): Unit = js.native
  
  def unbind(cbHandlers: Any*): Unit = js.native
  
  /**
    * Returns the fully qualified URL this server is listening on. For example: ldaps://10.1.2.3:1636. If you haven't yet called listen, it will always return ldap://localhost:389.
    */
  var url: String = js.native
}
