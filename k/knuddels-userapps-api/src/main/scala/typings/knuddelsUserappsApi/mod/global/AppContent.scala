package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.mod.KnuddelsEvent
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
  def addCloseListener(callback: typings.knuddelsUserappsApi.anon.AppContent): Unit = js.native
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
  def getHeight(): Double = js.native
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
  def getWidth(): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_isAllowJFXBrowser
    */
  def isAllowJFXBrowser(): Boolean = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_remove
    */
  def remove(): Unit = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_replaceWithAppContent
    */
  def replaceWithAppContent(newAppContent: AppContent): Unit = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_sendEvent
    */
  def sendEvent(`type`: java.lang.String): Unit = js.native
  def sendEvent(`type`: java.lang.String, data: KnuddelsEvent): Unit = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_setAllowJFXBrowser
    */
  def setAllowJFXBrowser(allowJFXBrowser: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("AppContent")
@js.native
object AppContent extends js.Object {
  /**
    * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_headerbarContent
    */
  def headerbarContent(htmlFile: HTMLFile, height: Double): AppContent = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_overlayContent
    */
  def overlayContent(htmlFile: HTMLFile): AppContent = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_overlayContent
    */
  def overlayContent(htmlFile: HTMLFile, width: Double, height: Double): AppContent = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_popupContent
    */
  def popupContent(htmlFile: HTMLFile): AppContent = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_popupContent
    */
  def popupContent(htmlFile: HTMLFile, width: Double, height: Double): AppContent = js.native
}

