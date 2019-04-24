package typings
package hubotLib.hubotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Robot")
@js.native
class Robot[A] protected () extends js.Object {
  def this(adapterPath: java.lang.String, adapter: java.lang.String, httpd: scala.Boolean, name: java.lang.String) = this()
  def this(adapterPath: java.lang.String, adapter: java.lang.String, httpd: scala.Boolean, name: java.lang.String, alias: java.lang.String) = this()
  val adapter: A = js.native
  var alias: java.lang.String = js.native
  var brain: Brain[A] = js.native
  var name: java.lang.String = js.native
  def catchAll(callback: ListenerCallback[this.type]): scala.Unit = js.native
  def catchAll(options: js.Any, callback: ListenerCallback[this.type]): scala.Unit = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  def enter(callback: ListenerCallback[this.type]): scala.Unit = js.native
  def enter(options: js.Any, callback: ListenerCallback[this.type]): scala.Unit = js.native
  def hear(regex: stdLib.RegExp, callback: ListenerCallback[this.type]): scala.Unit = js.native
  def hear(regex: stdLib.RegExp, options: js.Any, callback: ListenerCallback[this.type]): scala.Unit = js.native
  def helpCommands(): js.Array[java.lang.String] = js.native
  def loadFile(directory: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def respond(regex: stdLib.RegExp, callback: ListenerCallback[this.type]): scala.Unit = js.native
  def respond(regex: stdLib.RegExp, options: js.Any, callback: ListenerCallback[this.type]): scala.Unit = js.native
  def topic(callback: ListenerCallback[this.type]): scala.Unit = js.native
  def topic(options: js.Any, callback: ListenerCallback[this.type]): scala.Unit = js.native
}

