package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.JSPMWebSocket")
@js.native
open class JSPMWebSocket () extends StObject {
  def this(addr: String) = this()
  def this(addr: String, port: Double) = this()
  def this(addr: Unit, port: Double) = this()
  def this(addr: String, port: Double, secure: Boolean) = this()
  def this(addr: String, port: Unit, secure: Boolean) = this()
  def this(addr: Unit, port: Double, secure: Boolean) = this()
  def this(addr: Unit, port: Unit, secure: Boolean) = this()
  def this(addr: String, port: Double, secure: Boolean, auto_reconnect: Boolean) = this()
  def this(addr: String, port: Double, secure: Unit, auto_reconnect: Boolean) = this()
  def this(addr: String, port: Unit, secure: Boolean, auto_reconnect: Boolean) = this()
  def this(addr: String, port: Unit, secure: Unit, auto_reconnect: Boolean) = this()
  def this(addr: Unit, port: Double, secure: Boolean, auto_reconnect: Boolean) = this()
  def this(addr: Unit, port: Double, secure: Unit, auto_reconnect: Boolean) = this()
  def this(addr: Unit, port: Unit, secure: Boolean, auto_reconnect: Boolean) = this()
  def this(addr: Unit, port: Unit, secure: Unit, auto_reconnect: Boolean) = this()
  
  /* private */ var _addr: Any = js.native
  
  /* private */ def _genID(): Any = js.native
  
  /* private */ var _job_list: Any = js.native
  
  /* private */ def _onClose(e: Any, __this: Any): Any = js.native
  
  /* private */ def _onError(e: Any): Any = js.native
  
  /* private */ def _onMessage(e: Any, job_list: Any): Any = js.native
  
  /* private */ def _onOpen(e: Any, __this: Any): Any = js.native
  
  /* private */ def _pingPong(): Any = js.native
  
  /* private */ var _port: Any = js.native
  
  /* private */ var _secure: Any = js.native
  
  /* private */ def _send(data: Any, ok: Any, err: Any): Any = js.native
  
  /* private */ var _status: Any = js.native
  
  /* private */ var _ws: Any = js.native
  
  val address: String = js.native
  
  var autoReconnect: Boolean = js.native
  
  val isSecure: Boolean = js.native
  
  def onClose(e: Any): Unit = js.native
  
  def onOpen(e: Any): Unit = js.native
  
  def onStatusChanged(): Unit = js.native
  
  val port: Double = js.native
  
  def send(data: Any): js.Promise[Any] = js.native
  
  def start(): js.Promise[Unit] = js.native
  
  val status: WSStatus = js.native
  
  def stop(): Unit = js.native
}
