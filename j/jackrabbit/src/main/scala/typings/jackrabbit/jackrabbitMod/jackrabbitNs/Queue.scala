package typings.jackrabbit.jackrabbitMod.jackrabbitNs

import typings.amqplib.amqplibMod.Connection
import typings.amqplib.propertiesMod.Message
import typings.amqplib.propertiesMod.OptionsNs.Consume
import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends EventEmitter {
  var name: String = js.native
  var options: QueueOptions = js.native
  def cancel(done: js.Any): Unit = js.native
  def connect(con: Connection): Unit = js.native
  def consume(
    callback: js.Function4[
      /* data */ js.Any, 
      /* ack */ AckCallback, 
      /* nack */ js.Function0[Unit], 
      /* msg */ Message, 
      Unit
    ]
  ): Unit = js.native
  def consume(
    callback: js.Function4[
      /* data */ js.Any, 
      /* ack */ AckCallback, 
      /* nack */ js.Function0[Unit], 
      /* msg */ Message, 
      Unit
    ],
    options: Consume
  ): Unit = js.native
  def purge(done: js.Any): Unit = js.native
}

