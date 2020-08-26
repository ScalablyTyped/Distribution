package typings.jsprintmanager.mod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "JSPM.JSPMWebSocket")
@js.native
class JSPMWebSocket () extends js.Object {
  def this(addr: String) = this()
  def this(addr: js.UndefOr[scala.Nothing], port: Double) = this()
  def this(addr: String, port: Double) = this()
  def this(addr: js.UndefOr[scala.Nothing], port: js.UndefOr[scala.Nothing], secure: Boolean) = this()
  def this(addr: js.UndefOr[scala.Nothing], port: Double, secure: Boolean) = this()
  def this(addr: String, port: js.UndefOr[scala.Nothing], secure: Boolean) = this()
  def this(addr: String, port: Double, secure: Boolean) = this()
  def this(
    addr: js.UndefOr[scala.Nothing],
    port: js.UndefOr[scala.Nothing],
    secure: js.UndefOr[scala.Nothing],
    auto_reconnect: Boolean
  ) = this()
  def this(
    addr: js.UndefOr[scala.Nothing],
    port: js.UndefOr[scala.Nothing],
    secure: Boolean,
    auto_reconnect: Boolean
  ) = this()
  def this(
    addr: js.UndefOr[scala.Nothing],
    port: Double,
    secure: js.UndefOr[scala.Nothing],
    auto_reconnect: Boolean
  ) = this()
  def this(addr: js.UndefOr[scala.Nothing], port: Double, secure: Boolean, auto_reconnect: Boolean) = this()
  def this(
    addr: String,
    port: js.UndefOr[scala.Nothing],
    secure: js.UndefOr[scala.Nothing],
    auto_reconnect: Boolean
  ) = this()
  def this(addr: String, port: js.UndefOr[scala.Nothing], secure: Boolean, auto_reconnect: Boolean) = this()
  def this(addr: String, port: Double, secure: js.UndefOr[scala.Nothing], auto_reconnect: Boolean) = this()
  def this(addr: String, port: Double, secure: Boolean, auto_reconnect: Boolean) = this()
  var _addr: js.Any = js.native
  var _job_list: js.Any = js.native
  var _port: js.Any = js.native
  var _secure: js.Any = js.native
  var _status: js.Any = js.native
  var _ws: js.Any = js.native
  val address: String = js.native
  var autoReconnect: Boolean = js.native
  val isSecure: Boolean = js.native
  val port: Double = js.native
  val status: WSStatus = js.native
  /* private */ def _genID(): js.Any = js.native
  /* private */ def _onClose(e: js.Any, __this: js.Any): js.Any = js.native
  /* private */ def _onError(e: js.Any): js.Any = js.native
  /* private */ def _onMessage(e: js.Any, job_list: js.Any): js.Any = js.native
  /* private */ def _onOpen(e: js.Any, __this: js.Any): js.Any = js.native
  /* private */ def _pingPong(): js.Any = js.native
  /* private */ def _send(data: js.Any, ok: js.Any, err: js.Any): js.Any = js.native
  def onClose(e: js.Any): Unit = js.native
  def onOpen(e: js.Any): Unit = js.native
  def onStatusChanged(): Unit = js.native
  def send(data: js.Any): js.Promise[_] = js.native
  def start(): js.Promise[Unit] = js.native
  def stop(): Unit = js.native
}

