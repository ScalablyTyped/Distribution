package typings.halfmoon

import typings.halfmoon.anon.AlertType
import typings.halfmoon.halfmoonStrings.no
import typings.halfmoon.halfmoonStrings.yes
import typings.std.Element
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("halfmoon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clickHandler(event: MouseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clickHandler")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createCookie(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createCookie(name: String, value: String, days: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("halfmoon", "darkModeOn")
  @js.native
  def darkModeOn: yes | no = js.native
  inline def darkModeOn_=(x: yes | no): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkModeOn")(x.asInstanceOf[js.Any])
  
  inline def deactivateAllDropdownToggles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deactivateAllDropdownToggles")().asInstanceOf[Unit]
  
  inline def eraseCookie(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eraseCookie")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initStickyAlert(param: AlertType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initStickyAlert")(param.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def keydownHandler(event: KeyboardEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keydownHandler")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def makeId(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeId")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def onDOMContentLoaded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDOMContentLoaded")().asInstanceOf[Unit]
  
  @JSImport("halfmoon", "pageWrapper")
  @js.native
  val pageWrapper: Element = js.native
  
  inline def readCookie(name: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readCookie")(name.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @JSImport("halfmoon", "stickyAlerts")
  @js.native
  val stickyAlerts: Element = js.native
  
  inline def toastAlert(alertId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toastAlert")(alertId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def toastAlert(alertId: String, timeShown: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toastAlert")(alertId.asInstanceOf[js.Any], timeShown.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toggleDarkMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDarkMode")().asInstanceOf[Unit]
  
  inline def toggleModal(modalId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleModal")(modalId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toggleSidebar(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleSidebar")().asInstanceOf[Unit]
}
