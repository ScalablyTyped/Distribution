package typings.leadfoot.serverMod

import org.scalablytyped.runtime.Instantiable3
import typings.dojo.promisePromiseMod.Promise
import typings.leadfoot.leadfoot.Capabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The Server class represents a remote HTTP server implementing the WebDriver wire protocol that can be used to
	 * generate new remote control sessions.
	 */
@js.native
trait Server extends js.Object {
  /**
  		 * Whether or not to perform capabilities testing and correction when creating a new Server.
  		 *
  		 * @default true
  		 */
  var fixSessionCapabilities: Boolean = js.native
  /**
  		 * An alternative session constructor. Defaults to the standard {@link module:leadfoot/Session} constructor if
  		 * one is not provided.
  		 */
  var sessionConstructor: Instantiable3[
    /* sessionId */ String, 
    /* server */ ^, 
    /* capabilities */ Capabilities, 
    typings.leadfoot.sessionMod.^
  ] = js.native
  /**
  		 * A function that performs an HTTP request to a JsonWireProtocol endpoint and normalises response status and
  		 * data.
  		 *
  		 * @param path
  		 * The path-part of the JsonWireProtocol URL. May contain placeholders in the form `/\$\d/` that will be
  		 * replaced by entries in the `pathParts` argument.
  		 *
  		 * @param requestData
  		 * The payload for the request.
  		 *
  		 * @param pathParts Optional placeholder values to inject into the path of the URL.
  		 */
  /* protected */ def _delete(path: String, requestData: js.Object): Promise[js.Object] = js.native
  /* protected */ def _delete(path: String, requestData: js.Object, pathParts: js.Array[String]): Promise[js.Object] = js.native
  /**
  		 * Adds additional capabilities data on the `capabilities` key of the passed session.
  		 */
  /* protected */ def _fillCapabilities(session: typings.leadfoot.sessionMod.^): typings.leadfoot.sessionMod.^ = js.native
  /**
  		 * A function that performs an HTTP request to a JsonWireProtocol endpoint and normalises response status and
  		 * data.
  		 *
  		 * @param path
  		 * The path-part of the JsonWireProtocol URL. May contain placeholders in the form `/\$\d/` that will be
  		 * replaced by entries in the `pathParts` argument.
  		 *
  		 * @param requestData
  		 * The payload for the request.
  		 *
  		 * @param pathParts Optional placeholder values to inject into the path of the URL.
  		 */
  /* protected */ def _get(path: String, requestData: js.Object): Promise[js.Object] = js.native
  /* protected */ def _get(path: String, requestData: js.Object, pathParts: js.Array[String]): Promise[js.Object] = js.native
  /**
  		 * A function that performs an HTTP request to a JsonWireProtocol endpoint and normalises response status and
  		 * data.
  		 *
  		 * @param path
  		 * The path-part of the JsonWireProtocol URL. May contain placeholders in the form `/\$\d/` that will be
  		 * replaced by entries in the `pathParts` argument.
  		 *
  		 * @param requestData
  		 * The payload for the request.
  		 *
  		 * @param pathParts Optional placeholder values to inject into the path of the URL.
  		 */
  /* protected */ def _post(path: String, requestData: js.Object): Promise[js.Object] = js.native
  /* protected */ def _post(path: String, requestData: js.Object, pathParts: js.Array[String]): Promise[js.Object] = js.native
  /**
  		 * Creates a new remote control session on the remote server.
  		 *
  		 * @param desiredCapabilities
  		 * A hash map of desired capabilities of the remote environment. The server may return an environment that does
  		 * not match all the desired capabilities if one is not available.
  		 *
  		 * @param requiredCapabilities
  		 * A hash map of required capabilities of the remote environment. The server will not return an environment that
  		 * does not match all the required capabilities if one is not available.
  		 */
  def createSession(desiredCapabilities: Capabilities): Promise[typings.leadfoot.sessionMod.^] = js.native
  def createSession(desiredCapabilities: Capabilities, requiredCapabilities: Capabilities): Promise[typings.leadfoot.sessionMod.^] = js.native
  /**
  		 * Terminates a session on the server.
  		 *
  		 * @param sessionId
  		 */
  def deleteSession(sessionId: String): Promise[Unit] = js.native
  /**
  		 * Gets information on the capabilities of a given session from the server. The list of capabilities returned
  		 * by this command will not include any of the extra session capabilities detected by Leadfoot and may be
  		 * inaccurate.
  		 *
  		 * @param sessionId
  		 */
  def getSessionCapabilities(sessionId: String): Promise[Capabilities] = js.native
  /**
  		 * Gets a list of all currently active remote control sessions on this server.
  		 *
  		 * @returns {Promise.<Object[]>}
  		 */
  def getSessions(): Promise[js.Array[js.Object]] = js.native
  /**
  		 * Gets the status of the remote server.
  		 *
  		 * @returns An object containing arbitrary properties describing the status of the remote
  		 * server.
  		 */
  def getStatus(): Promise[js.Object] = js.native
}

