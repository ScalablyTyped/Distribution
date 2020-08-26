package typings.jsprintmanager.mod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "JSPM.JSPrintManager")
@js.native
object JSPrintManager extends js.Object {
  var WS: JSPMWebSocket = js.native
  @JSName("auto_reconnect")
  var autoReconnect: Boolean = js.native
  @JSName("websocket_status")
  val websocketStatus: WSStatus = js.native
  def getPrinters(): js.Promise[js.Object] = js.native
  def getPrintersInfo(): js.Promise[js.Object] = js.native
  def showAbout(): js.Promise[_] = js.native
  def start(): js.Promise[Unit] = js.native
  def start(secure: js.UndefOr[scala.Nothing], host: js.UndefOr[scala.Nothing], port: Double): js.Promise[Unit] = js.native
  def start(secure: js.UndefOr[scala.Nothing], host: String): js.Promise[Unit] = js.native
  def start(secure: js.UndefOr[scala.Nothing], host: String, port: Double): js.Promise[Unit] = js.native
  def start(secure: Boolean): js.Promise[Unit] = js.native
  def start(secure: Boolean, host: js.UndefOr[scala.Nothing], port: Double): js.Promise[Unit] = js.native
  def start(secure: Boolean, host: String): js.Promise[Unit] = js.native
  def start(secure: Boolean, host: String, port: Double): js.Promise[Unit] = js.native
  def stop(): Unit = js.native
  def updateClient(): js.Promise[_] = js.native
}

