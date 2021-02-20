package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSPrintManager {
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.WS")
  @js.native
  def WS: JSPMWebSocket = js.native
  @scala.inline
  def WS_=(x: JSPMWebSocket): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WS")(x.asInstanceOf[js.Any])
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.auto_reconnect")
  @js.native
  def autoReconnect: Boolean = js.native
  
  @scala.inline
  def autoReconnect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auto_reconnect")(x.asInstanceOf[js.Any])
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.getPrinters")
  @js.native
  def getPrinters(): js.Promise[js.Object] = js.native
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.getPrintersInfo")
  @js.native
  def getPrintersInfo(): js.Promise[js.Object] = js.native
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.showAbout")
  @js.native
  def showAbout(): js.Promise[_] = js.native
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.start")
  @js.native
  def start(): js.Promise[Unit] = js.native
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.start")
  @js.native
  def start(secure: js.UndefOr[scala.Nothing], host: js.UndefOr[scala.Nothing], port: Double): js.Promise[Unit] = js.native
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.start")
  @js.native
  def start(secure: js.UndefOr[scala.Nothing], host: String): js.Promise[Unit] = js.native
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.start")
  @js.native
  def start(secure: js.UndefOr[scala.Nothing], host: String, port: Double): js.Promise[Unit] = js.native
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.start")
  @js.native
  def start(secure: Boolean): js.Promise[Unit] = js.native
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.start")
  @js.native
  def start(secure: Boolean, host: js.UndefOr[scala.Nothing], port: Double): js.Promise[Unit] = js.native
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.start")
  @js.native
  def start(secure: Boolean, host: String): js.Promise[Unit] = js.native
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.start")
  @js.native
  def start(secure: Boolean, host: String, port: Double): js.Promise[Unit] = js.native
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.stop")
  @js.native
  def stop(): Unit = js.native
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.updateClient")
  @js.native
  def updateClient(): js.Promise[_] = js.native
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.websocket_status")
  @js.native
  val websocketStatus: WSStatus = js.native
}
