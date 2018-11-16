package typings
package jackrabbitLib.jackrabbitMod.jackrabbitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue
  extends nodeLib.NodeJSNs.EventEmitter {
  var name: java.lang.String = js.native
  var options: QueueOptions = js.native
  def cancel(done: js.Any): scala.Unit = js.native
  def connect(con: amqplibLib.amqplibMod.Connection): scala.Unit = js.native
  def consume(
    callback: js.Function4[
      /* data */ js.Any, 
      /* ack */ AckCallback, 
      /* nack */ js.Function0[scala.Unit], 
      /* msg */ amqplibLib.propertiesMod.Message, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def consume(
    callback: js.Function4[
      /* data */ js.Any, 
      /* ack */ AckCallback, 
      /* nack */ js.Function0[scala.Unit], 
      /* msg */ amqplibLib.propertiesMod.Message, 
      scala.Unit
    ],
    options: amqplibLib.propertiesMod.OptionsNs.Consume
  ): scala.Unit = js.native
  def purge(done: js.Any): scala.Unit = js.native
}

