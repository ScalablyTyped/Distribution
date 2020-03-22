package typings.jackrabbit.mod.jackrabbit

import typings.amqplib.mod.Connection
import typings.amqplib.propertiesMod.Options.AssertExchange
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exchange extends EventEmitter {
  var name: String = js.native
  var options: AssertExchange = js.native
  var `type`: exchangeType = js.native
  def connect(con: Connection): Exchange = js.native
  def publish(message: js.Any): Exchange = js.native
  def publish(message: js.Any, options: PublishOptions): Exchange = js.native
  def queue(options: QueueOptions): Queue = js.native
}

