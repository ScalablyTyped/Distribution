package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html
	 */
@JSGlobal("AppContentSession")
@js.native
class AppContentSession () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html#method_getAppContent
  		 */
  def getAppContent(): AppContent = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html#method_getAppViewMode
  		 */
  def getAppViewMode(): AppViewMode = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html#method_getUser
  		 */
  def getUser(): User = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html#method_remove
  		 */
  def remove(): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html#method_sendEvent
  		 */
  def sendEvent(`type`: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html#method_sendEvent
  		 */
  def sendEvent(
    `type`: java.lang.String,
    data: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent
  ): scala.Unit = js.native
}

