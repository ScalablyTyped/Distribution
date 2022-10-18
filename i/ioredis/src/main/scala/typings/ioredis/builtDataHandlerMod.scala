package typings.ioredis

import typings.denque.mod.^
import typings.ioredis.builtTypesMod.CommandItem
import typings.ioredis.builtTypesMod.NetStream
import typings.ioredis.ioredisBooleans.`false`
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtDataHandlerMod {
  
  @JSImport("ioredis/built/DataHandler", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DataHandler {
    def this(redis: DataHandledable, parserOptions: ParserOptions) = this()
    
    /* private */ /* CompleteClass */
    var handleMonitorReply: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleSubscriberReply: Any = js.native
    
    /* private */ /* CompleteClass */
    var redis: Any = js.native
    
    /* private */ /* CompleteClass */
    var returnError: Any = js.native
    
    /* private */ /* CompleteClass */
    var returnFatalError: Any = js.native
    
    /* private */ /* CompleteClass */
    var returnReply: Any = js.native
    
    /* private */ /* CompleteClass */
    var shiftCommand: Any = js.native
  }
  
  trait Condition extends StObject {
    
    var auth: String
    
    var select: Double
    
    var subscriber: `false` | typings.ioredis.builtSubscriptionSetMod.default
  }
  object Condition {
    
    inline def apply(
      auth: String,
      select: Double,
      subscriber: `false` | typings.ioredis.builtSubscriptionSetMod.default
    ): Condition = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    extension [Self <: Condition](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: Double): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSubscriber(value: `false` | typings.ioredis.builtSubscriptionSetMod.default): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataHandledable extends EventEmitter {
    
    var commandQueue: ^[CommandItem] = js.native
    
    var condition: Condition = js.native
    
    def disconnect(reconnect: Boolean): Unit = js.native
    
    def handleReconnection(err: js.Error, item: CommandItem): Unit = js.native
    
    def recoverFromFatalError(commandError: js.Error, err: js.Error, options: Any): Unit = js.native
    
    var status: String = js.native
    
    var stream: NetStream = js.native
  }
  
  trait DataHandler extends StObject {
    
    /* private */ var handleMonitorReply: Any
    
    /* private */ var handleSubscriberReply: Any
    
    /* private */ var redis: Any
    
    /* private */ var returnError: Any
    
    /* private */ var returnFatalError: Any
    
    /* private */ var returnReply: Any
    
    /* private */ var shiftCommand: Any
  }
  object DataHandler {
    
    inline def apply(
      handleMonitorReply: Any,
      handleSubscriberReply: Any,
      redis: Any,
      returnError: Any,
      returnFatalError: Any,
      returnReply: Any,
      shiftCommand: Any
    ): DataHandler = {
      val __obj = js.Dynamic.literal(handleMonitorReply = handleMonitorReply.asInstanceOf[js.Any], handleSubscriberReply = handleSubscriberReply.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any], returnError = returnError.asInstanceOf[js.Any], returnFatalError = returnFatalError.asInstanceOf[js.Any], returnReply = returnReply.asInstanceOf[js.Any], shiftCommand = shiftCommand.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataHandler]
    }
    
    extension [Self <: DataHandler](x: Self) {
      
      inline def setHandleMonitorReply(value: Any): Self = StObject.set(x, "handleMonitorReply", value.asInstanceOf[js.Any])
      
      inline def setHandleSubscriberReply(value: Any): Self = StObject.set(x, "handleSubscriberReply", value.asInstanceOf[js.Any])
      
      inline def setRedis(value: Any): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      inline def setReturnError(value: Any): Self = StObject.set(x, "returnError", value.asInstanceOf[js.Any])
      
      inline def setReturnFatalError(value: Any): Self = StObject.set(x, "returnFatalError", value.asInstanceOf[js.Any])
      
      inline def setReturnReply(value: Any): Self = StObject.set(x, "returnReply", value.asInstanceOf[js.Any])
      
      inline def setShiftCommand(value: Any): Self = StObject.set(x, "shiftCommand", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParserOptions extends StObject {
    
    var stringNumbers: Boolean
  }
  object ParserOptions {
    
    inline def apply(stringNumbers: Boolean): ParserOptions = {
      val __obj = js.Dynamic.literal(stringNumbers = stringNumbers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setStringNumbers(value: Boolean): Self = StObject.set(x, "stringNumbers", value.asInstanceOf[js.Any])
    }
  }
}
