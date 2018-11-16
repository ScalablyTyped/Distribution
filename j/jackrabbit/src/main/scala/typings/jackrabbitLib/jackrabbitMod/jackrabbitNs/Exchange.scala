package typings
package jackrabbitLib.jackrabbitMod.jackrabbitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exchange
  extends nodeLib.NodeJSNs.EventEmitter {
  var name: java.lang.String = js.native
  var options: amqplibLib.propertiesMod.OptionsNs.AssertExchange = js.native
  var `type`: exchangeType = js.native
  def connect(con: amqplibLib.amqplibMod.Connection): Exchange = js.native
  def publish(message: js.Any): Exchange = js.native
  def publish(message: js.Any, options: PublishOptions): Exchange = js.native
  def queue(options: QueueOptions): Queue = js.native
}

