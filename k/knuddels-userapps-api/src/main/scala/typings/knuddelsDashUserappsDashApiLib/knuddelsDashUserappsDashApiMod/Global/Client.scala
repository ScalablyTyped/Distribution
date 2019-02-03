package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/Client.html
	 */
@JSGlobal("Client")
@js.native
class Client () extends js.Object

/* static members */
@JSGlobal("Client")
@js.native
object Client extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#property_pageData
  		 */
  var pageData: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.Json = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_addConnectionTypeChangeListener
  		 */
  def addConnectionTypeChangeListener(callback: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_addEventListener
  		 */
  def addEventListener(
    `type`: java.lang.String,
    callback: js.Function1[/* event */ knuddelsDashUserappsDashApiLib.Anon_Data, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_close
  		 */
  def close(): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_dispatchEvent
  		 */
  def dispatchEvent(event: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ClientNs.Event): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_executeSlashCommand
  		 */
  def executeSlashCommand(command: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_freeSound
  		 */
  def freeSound(fileName: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getCacheInvalidationId
  		 */
  def getCacheInvalidationId(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getClientType
  		 */
  def getClientType(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ClientType = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getDirectConnection
  		 */
  def getDirectConnection(): js.Promise[scala.Unit] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getHostFrame
  		 */
  def getHostFrame(): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ClientNs.HostFrame = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getNick
  		 */
  def getNick(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_includeCSS
  		 */
  def includeCSS(files: java.lang.String*): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_includeJS
  		 */
  def includeJS(files: java.lang.String*): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_playSound
  		 */
  def playSound(fileName: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_prefetchSound
  		 */
  def prefetchSound(fileName: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_removeConnectionTypeChangeListener
  		 */
  def removeConnectionTypeChangeListener(callback: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_removeEventListener
  		 */
  def removeEventListener(`type`: java.lang.String): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    callback: js.Function1[/* event */ knuddelsDashUserappsDashApiLib.Anon_Data, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_sendEvent
  		 */
  def sendEvent(
    `type`: java.lang.String,
    data: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent
  ): scala.Unit = js.native
}

