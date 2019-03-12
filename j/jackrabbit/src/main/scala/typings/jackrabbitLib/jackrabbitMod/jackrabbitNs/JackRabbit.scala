package typings
package jackrabbitLib.jackrabbitMod.jackrabbitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JackRabbit
  extends nodeLib.NodeJSNs.EventEmitter {
  def close(callback: js.Function1[/* e */ stdLib.Error, _]): scala.Unit = js.native
  def default(): Exchange = js.native
  def direct(): Exchange = js.native
  def direct(name: java.lang.String): Exchange = js.native
  def fanout(): Exchange = js.native
  def fanout(name: java.lang.String): Exchange = js.native
  def getInternals(): jackrabbitLib.Anon_Amqp = js.native
  def topic(): Exchange = js.native
  def topic(name: java.lang.String): Exchange = js.native
}

