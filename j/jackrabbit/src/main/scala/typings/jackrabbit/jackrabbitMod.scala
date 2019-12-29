package typings.jackrabbit

import typings.amqplib.amqplibMod.Connection
import typings.amqplib.propertiesMod.Message
import typings.amqplib.propertiesMod.Options.AssertExchange
import typings.amqplib.propertiesMod.Options.AssertQueue
import typings.amqplib.propertiesMod.Options.Consume
import typings.amqplib.propertiesMod.Options.Publish
import typings.jackrabbit.jackrabbitMod.jackrabbit.JackRabbit
import typings.node.NodeJS.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jackrabbit", JSImport.Namespace)
@js.native
object jackrabbitMod extends js.Object {
  def default(url: String): JackRabbit = js.native
  @js.native
  object jackrabbit extends js.Object {
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
    
    @js.native
    sealed trait exchangeType extends js.Object
    
    @js.native
    object exchangeType extends js.Object {
      @js.native
      sealed trait direct extends exchangeType
      
      @js.native
      sealed trait fanout extends exchangeType
      
      @js.native
      sealed trait topic extends exchangeType
      
    }
    
    type AckCallback = js.Function1[/* data */ js.UndefOr[js.Any], Unit]
    type PublishOptions = Publish with Anon_Key
    type QueueOptions = AssertQueue with Anon_KeyKeys
  }
  
}

