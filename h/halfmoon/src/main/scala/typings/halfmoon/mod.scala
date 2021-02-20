package typings.halfmoon

import typings.halfmoon.anon.AlertType
import typings.halfmoon.halfmoonStrings.no
import typings.halfmoon.halfmoonStrings.yes
import typings.std.Element
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("halfmoon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("halfmoon", "clickHandler")
  @js.native
  def clickHandler(event: MouseEvent): Unit = js.native
  
  @JSImport("halfmoon", "createCookie")
  @js.native
  def createCookie(name: String, value: String): Unit = js.native
  @JSImport("halfmoon", "createCookie")
  @js.native
  def createCookie(name: String, value: String, days: Double): Unit = js.native
  
  @JSImport("halfmoon", "darkModeOn")
  @js.native
  def darkModeOn: yes | no = js.native
  @scala.inline
  def darkModeOn_=(x: yes | no): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkModeOn")(x.asInstanceOf[js.Any])
  
  @JSImport("halfmoon", "deactivateAllDropdownToggles")
  @js.native
  def deactivateAllDropdownToggles(): Unit = js.native
  
  @JSImport("halfmoon", "eraseCookie")
  @js.native
  def eraseCookie(name: String): Unit = js.native
  
  @JSImport("halfmoon", "initStickyAlert")
  @js.native
  def initStickyAlert(param: AlertType): Unit = js.native
  
  @JSImport("halfmoon", "keydownHandler")
  @js.native
  def keydownHandler(event: KeyboardEvent): Unit = js.native
  
  @JSImport("halfmoon", "makeId")
  @js.native
  def makeId(length: Double): String = js.native
  
  @JSImport("halfmoon", "onDOMContentLoaded")
  @js.native
  def onDOMContentLoaded(): Unit = js.native
  
  @JSImport("halfmoon", "pageWrapper")
  @js.native
  val pageWrapper: Element = js.native
  
  @JSImport("halfmoon", "readCookie")
  @js.native
  def readCookie(name: String): String | Null = js.native
  
  @JSImport("halfmoon", "stickyAlerts")
  @js.native
  val stickyAlerts: Element = js.native
  
  @JSImport("halfmoon", "toastAlert")
  @js.native
  def toastAlert(alertId: String): Unit = js.native
  @JSImport("halfmoon", "toastAlert")
  @js.native
  def toastAlert(alertId: String, timeShown: Double): Unit = js.native
  
  @JSImport("halfmoon", "toggleDarkMode")
  @js.native
  def toggleDarkMode(): Unit = js.native
  
  @JSImport("halfmoon", "toggleModal")
  @js.native
  def toggleModal(modalId: String): Unit = js.native
  
  @JSImport("halfmoon", "toggleSidebar")
  @js.native
  def toggleSidebar(): Unit = js.native
}
