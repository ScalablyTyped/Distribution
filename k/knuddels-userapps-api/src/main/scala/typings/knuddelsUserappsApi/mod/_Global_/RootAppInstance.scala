package typings.knuddelsUserappsApi.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/RootAppInstance.html
	 */
@JSGlobal("RootAppInstance")
@js.native
class RootAppInstance () extends AppInstance {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RootAppInstance.html#method_cancelUpdateApp
  		 * @since AppServer 98117
  		 */
  def cancelUpdateApp(): Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RootAppInstance.html#method_stopApp
  		 */
  def stopApp(message: java.lang.String): Unit = js.native
  def stopApp(message: java.lang.String, logMessage: java.lang.String): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RootAppInstance.html#method_updateApp
  		 */
  def updateApp(message: java.lang.String): Double = js.native
  def updateApp(message: java.lang.String, logMessage: java.lang.String): Double = js.native
}

