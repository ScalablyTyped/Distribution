package typings.leadfoot.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The Server class represents a remote HTTP server implementing the WebDriver wire protocol that can be used to
	 * generate new remote control sessions.
	 */
@JSImport("leadfoot/Server", JSImport.Namespace)
@js.native
class ^ protected () extends Server {
  def this(url: String) = this()
  /**
  		 * @param url
  		 * The fully qualified URL to the JsonWireProtocol endpoint on the server. The default endpoint for a
  		 * JsonWireProtocol HTTP server is http://localhost:4444/wd/hub. You may also pass a parsed URL object which will
  		 * be converted to a string.
  		 */
  def this(url: js.Object) = this()
}

