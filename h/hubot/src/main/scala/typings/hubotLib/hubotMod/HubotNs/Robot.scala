package typings
package hubotLib.hubotMod.HubotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Robot[A] extends js.Object {
  val adapter: A = js.native
  var alias: java.lang.String = js.native
  var brain: Brain = js.native
  var name: java.lang.String = js.native
  def catchAll(callback: ListenerCallback[this.type]): scala.Unit = js.native
  def catchAll(options: js.Any, callback: ListenerCallback[this.type]): scala.Unit = js.native
  def hear(regex: stdLib.RegExp, callback: ListenerCallback[this.type]): scala.Unit = js.native
  def hear(regex: stdLib.RegExp, options: js.Any, callback: ListenerCallback[this.type]): scala.Unit = js.native
  def helpCommands(): js.Array[java.lang.String] = js.native
  def loadFile(directory: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
  def respond(regex: stdLib.RegExp, callback: ListenerCallback[this.type]): scala.Unit = js.native
  def respond(regex: stdLib.RegExp, options: js.Any, callback: ListenerCallback[this.type]): scala.Unit = js.native
}

