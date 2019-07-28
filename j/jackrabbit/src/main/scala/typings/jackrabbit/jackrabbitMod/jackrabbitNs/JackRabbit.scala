package typings.jackrabbit.jackrabbitMod.jackrabbitNs

import typings.jackrabbit.Anon_Amqp
import typings.node.NodeJSNs.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JackRabbit extends EventEmitter {
  def close(callback: js.Function1[/* e */ Error, _]): Unit = js.native
  def default(): Exchange = js.native
  def direct(): Exchange = js.native
  def direct(name: String): Exchange = js.native
  def fanout(): Exchange = js.native
  def fanout(name: String): Exchange = js.native
  def getInternals(): Anon_Amqp = js.native
  def topic(): Exchange = js.native
  def topic(name: String): Exchange = js.native
}

