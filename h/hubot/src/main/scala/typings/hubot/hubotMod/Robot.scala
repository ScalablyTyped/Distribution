package typings.hubot.hubotMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Robot")
@js.native
class Robot[A] protected () extends js.Object {
  def this(adapterPath: String, adapter: String, httpd: Boolean, name: String) = this()
  def this(adapterPath: String, adapter: String, httpd: Boolean, name: String, alias: String) = this()
  val adapter: A = js.native
  var alias: String = js.native
  var brain: Brain[A] = js.native
  var name: String = js.native
  def catchAll(callback: ListenerCallback[this.type]): Unit = js.native
  def catchAll(options: js.Any, callback: ListenerCallback[this.type]): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  def enter(callback: ListenerCallback[this.type]): Unit = js.native
  def enter(options: js.Any, callback: ListenerCallback[this.type]): Unit = js.native
  def hear(regex: RegExp, callback: ListenerCallback[this.type]): Unit = js.native
  def hear(regex: RegExp, options: js.Any, callback: ListenerCallback[this.type]): Unit = js.native
  def helpCommands(): js.Array[String] = js.native
  def loadFile(directory: String, fileName: String): Unit = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def respond(regex: RegExp, callback: ListenerCallback[this.type]): Unit = js.native
  def respond(regex: RegExp, options: js.Any, callback: ListenerCallback[this.type]): Unit = js.native
  def topic(callback: ListenerCallback[this.type]): Unit = js.native
  def topic(options: js.Any, callback: ListenerCallback[this.type]): Unit = js.native
}

