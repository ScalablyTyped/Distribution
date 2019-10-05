package typings.leadfoot.sessionMod

import typings.leadfoot.leadfoot.Capabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A Session represents a connection to a remote environment that can be driven programmatically.
	 */
@JSImport("leadfoot/Session", JSImport.Namespace)
@js.native
class ^ protected () extends Session {
  /**
  		 * @param sessionId The ID of the session, as provided by the remote.
  		 * @param server The server that the session belongs to.
  		 * @param capabilities A map of bugs and features that the remote environment exposes.
  		 */
  def this(sessionId: String, server: typings.leadfoot.serverMod.^, capabilities: Capabilities) = this()
}

