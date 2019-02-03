package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/AppContent.html
	 */
@JSGlobal("AppContent")
@js.native
class AppContent () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_addCloseListener
  		 */
  def addCloseListener(callback: knuddelsDashUserappsDashApiLib.Anon_AppContent): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_getAppViewMode
  		 */
  def getAppViewMode(): AppViewMode = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_getHTMLFile
  		 */
  def getHTMLFile(): HTMLFile = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_getHeight
  		 */
  def getHeight(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_getLoadConfiguration
  		 */
  def getLoadConfiguration(): LoadConfiguration = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_getSessions
  		 */
  def getSessions(): js.Array[AppContentSession] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_getUsers
  		 */
  def getUsers(): js.Array[User] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_getWidth
  		 */
  def getWidth(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_isAllowJFXBrowser
  		 */
  def isAllowJFXBrowser(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_remove
  		 */
  def remove(): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_replaceWithAppContent
  		 */
  def replaceWithAppContent(newAppContent: AppContent): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_sendEvent
  		 */
  def sendEvent(`type`: java.lang.String): scala.Unit = js.native
  def sendEvent(
    `type`: java.lang.String,
    data: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent
  ): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_setAllowJFXBrowser
  		 */
  def setAllowJFXBrowser(allowJFXBrowser: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("AppContent")
@js.native
object AppContent extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_headerbarContent
  		 */
  def headerbarContent(
    htmlFile: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.HTMLFile,
    height: scala.Double
  ): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.AppContent = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_overlayContent
  		 */
  def overlayContent(htmlFile: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.HTMLFile): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.AppContent = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_overlayContent
  		 */
  def overlayContent(
    htmlFile: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.HTMLFile,
    width: scala.Double,
    height: scala.Double
  ): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.AppContent = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_popupContent
  		 */
  def popupContent(htmlFile: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.HTMLFile): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.AppContent = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_popupContent
  		 */
  def popupContent(
    htmlFile: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.HTMLFile,
    width: scala.Double,
    height: scala.Double
  ): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.AppContent = js.native
}

