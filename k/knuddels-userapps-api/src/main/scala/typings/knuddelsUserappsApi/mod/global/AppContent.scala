package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.mod.KnuddelsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/AppContent.html
	 */
@JSGlobal("AppContent")
@js.native
class AppContent () extends StObject {
  
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
object AppContent {
  
  @JSGlobal("AppContent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_headerbarContent
  		 */
  /* static member */
  inline def headerbarContent(htmlFile: HTMLFile, height: Double): AppContent = (^.asInstanceOf[js.Dynamic].applyDynamic("headerbarContent")(htmlFile.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AppContent]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_overlayContent
  		 */
  /* static member */
  inline def overlayContent(htmlFile: HTMLFile): AppContent = ^.asInstanceOf[js.Dynamic].applyDynamic("overlayContent")(htmlFile.asInstanceOf[js.Any]).asInstanceOf[AppContent]
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_overlayContent
  		 */
  /* static member */
  inline def overlayContent(htmlFile: HTMLFile, width: Double, height: Double): AppContent = (^.asInstanceOf[js.Dynamic].applyDynamic("overlayContent")(htmlFile.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AppContent]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_popupContent
  		 */
  /* static member */
  inline def popupContent(htmlFile: HTMLFile): AppContent = ^.asInstanceOf[js.Dynamic].applyDynamic("popupContent")(htmlFile.asInstanceOf[js.Any]).asInstanceOf[AppContent]
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContent.html#method_popupContent
  		 */
  /* static member */
  inline def popupContent(htmlFile: HTMLFile, width: Double, height: Double): AppContent = (^.asInstanceOf[js.Dynamic].applyDynamic("popupContent")(htmlFile.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AppContent]
}
