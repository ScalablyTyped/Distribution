package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var events: kafkajsLib.kafkajsMod.ProducerEvents
  def connect(): js.Promise[scala.Unit]
  def disconnect(): js.Promise[scala.Unit]
  def isIdempotent(): scala.Boolean
  def logger(): kafkajsLib.kafkajsMod.Logger
  def on(
    eventName: kafkajsLib.kafkajsMod.ValueOf[kafkajsLib.kafkajsMod.ProducerEvents],
    listener: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): scala.Unit
  def transaction(): js.Promise[kafkajsLib.kafkajsMod.Transaction]
}

object Anon_Args {
  @scala.inline
  def apply(
    connect: () => js.Promise[scala.Unit],
    disconnect: () => js.Promise[scala.Unit],
    events: kafkajsLib.kafkajsMod.ProducerEvents,
    isIdempotent: () => scala.Boolean,
    logger: () => kafkajsLib.kafkajsMod.Logger,
    on: (kafkajsLib.kafkajsMod.ValueOf[kafkajsLib.kafkajsMod.ProducerEvents], js.Function1[/* repeated */ js.Any, scala.Unit]) => scala.Unit,
    transaction: () => js.Promise[kafkajsLib.kafkajsMod.Transaction]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), events = events, isIdempotent = js.Any.fromFunction0(isIdempotent), logger = js.Any.fromFunction0(logger), on = js.Any.fromFunction2(on), transaction = js.Any.fromFunction0(transaction))
  
    __obj.asInstanceOf[Anon_Args]
  }
}

