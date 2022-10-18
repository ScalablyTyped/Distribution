package typings.ioredis

import typings.ioredis.anon.keyinkeyofCommandNameFlag
import typings.ioredis.builtTypesMod.Callback
import typings.ioredis.builtTypesMod.CommandParameter
import typings.ioredis.builtTypesMod.Respondable
import typings.ioredis.ioredisStrings.ENTER_SUBSCRIBER_MODE
import typings.ioredis.ioredisStrings.EXIT_SUBSCRIBER_MODE
import typings.ioredis.ioredisStrings.VALID_IN_MONITOR_MODE
import typings.ioredis.ioredisStrings.VALID_IN_SUBSCRIBER_MODE
import typings.ioredis.ioredisStrings.WILL_DISCONNECT
import typings.ioredis.ioredisStrings.auth_
import typings.ioredis.ioredisStrings.monitor
import typings.ioredis.ioredisStrings.ping
import typings.ioredis.ioredisStrings.psubscribe
import typings.ioredis.ioredisStrings.punsubscribe
import typings.ioredis.ioredisStrings.quit
import typings.ioredis.ioredisStrings.subscribe
import typings.ioredis.ioredisStrings.unsubscribe
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtCommandMod {
  
  @JSImport("ioredis/built/Command", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Command {
    /**
      * Creates an instance of Command.
      * @param name Command name
      * @param args An array of command arguments
      * @param options
      * @param callback The callback that handles the response.
      * If omit, the response will be handled via Promise
      */
    def this(name: String) = this()
    def this(name: String, args: js.Array[ArgumentType]) = this()
    def this(name: String, args: js.Array[ArgumentType], options: CommandOptions) = this()
    def this(name: String, args: Unit, options: CommandOptions) = this()
    def this(name: String, args: js.Array[ArgumentType], options: Unit, callback: Callback[Any]) = this()
    def this(name: String, args: js.Array[ArgumentType], options: CommandOptions, callback: Callback[Any]) = this()
    def this(name: String, args: Unit, options: Unit, callback: Callback[Any]) = this()
    def this(name: String, args: Unit, options: CommandOptions, callback: Callback[Any]) = this()
    
    /* CompleteClass */
    var args: js.Array[CommandParameter] = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def reject(error: js.Error): Unit = js.native
    
    /* CompleteClass */
    override def resolve(result: Any): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("ioredis/built/Command", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ioredis/built/Command", "default.FLAGS")
    @js.native
    def FLAGS: keyinkeyofCommandNameFlag = js.native
    inline def FLAGS_=(x: keyinkeyofCommandNameFlag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAGS")(x.asInstanceOf[js.Any])
    
    @JSImport("ioredis/built/Command", "default._transformer")
    @js.native
    def _transformer: Any = js.native
    inline def _transformer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_transformer")(x.asInstanceOf[js.Any])
    
    inline def checkFlag_ENTERSUBSCRIBERMODE(flagName: ENTER_SUBSCRIBER_MODE, commandName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFlag")(flagName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def checkFlag_EXITSUBSCRIBERMODE(flagName: EXIT_SUBSCRIBER_MODE, commandName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFlag")(flagName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def checkFlag_VALIDINMONITORMODE(flagName: VALID_IN_MONITOR_MODE, commandName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFlag")(flagName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check whether the command has the flag
      */
    inline def checkFlag_VALIDINSUBSCRIBERMODE(flagName: VALID_IN_SUBSCRIBER_MODE, commandName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFlag")(flagName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def checkFlag_WILLDISCONNECT(flagName: WILL_DISCONNECT, commandName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFlag")(flagName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("ioredis/built/Command", "default.flagMap")
    @js.native
    def flagMap: Any = js.native
    inline def flagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flagMap")(x.asInstanceOf[js.Any])
    
    @JSImport("ioredis/built/Command", "default.getFlagMap")
    @js.native
    def getFlagMap: Any = js.native
    inline def getFlagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFlagMap")(x.asInstanceOf[js.Any])
    
    inline def setArgumentTransformer(name: String, func: ArgumentTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setArgumentTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setReplyTransformer(name: String, func: ReplyTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReplyTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type ArgumentTransformer = js.Function1[/* args */ js.Array[Any], js.Array[Any]]
  
  type ArgumentType = String | Buffer | Double | (js.Array[String | Buffer | Double | js.Array[Any]])
  
  @js.native
  trait Command
    extends StObject
       with Respondable {
    
    /* private */ var _commandTimeoutTimer: Any = js.native
    
    /**
      * Convert the value from buffer to the target encoding.
      */
    /* private */ var _convertValue: Any = js.native
    
    /**
      * Iterate through the command arguments that are considered keys.
      */
    /* private */ var _iterateKeys: Any = js.native
    
    /* private */ var bufferMode: Any = js.native
    
    /* private */ var callback: Any = js.native
    
    /* private */ var errorStack: Any = js.native
    
    def getKeys(): js.Array[String | Buffer] = js.native
    
    def getSlot(): Double = js.native
    
    var ignore: js.UndefOr[Boolean] = js.native
    
    var inTransaction: Boolean = js.native
    
    /* private */ var initPromise: Any = js.native
    
    var isReadOnly: js.UndefOr[Boolean] = js.native
    
    var isResolved: Boolean = js.native
    
    /* private */ var keys: Any = js.native
    
    var pipelineIndex: js.UndefOr[Double] = js.native
    
    var promise: js.Promise[Any] = js.native
    
    /* private */ var replyEncoding: Any = js.native
    
    /**
      * Set the wait time before terminating the attempt to execute a command
      * and generating an error.
      */
    def setTimeout(ms: Double): Unit = js.native
    
    /* private */ var slot: Any = js.native
    
    def stringifyArguments(): Unit = js.native
    
    /**
      * Convert command to writable buffer or string
      */
    def toWritable(_socket: js.Object): String | Buffer = js.native
    
    def transformReply(result: js.Array[Buffer]): String | (js.Array[Buffer | String]) | Buffer = js.native
    /**
      * Convert buffer/buffer[] to string/string[],
      * and apply reply transformer.
      */
    def transformReply(result: Buffer): String | (js.Array[Buffer | String]) | Buffer = js.native
    
    /* private */ var transformed: Any = js.native
  }
  
  trait CommandNameFlags extends StObject {
    
    var ENTER_SUBSCRIBER_MODE: js.Tuple2[subscribe, psubscribe]
    
    var EXIT_SUBSCRIBER_MODE: js.Tuple2[unsubscribe, punsubscribe]
    
    var VALID_IN_MONITOR_MODE: js.Tuple2[monitor, auth_]
    
    var VALID_IN_SUBSCRIBER_MODE: js.Tuple6[subscribe, psubscribe, unsubscribe, punsubscribe, ping, quit]
    
    var WILL_DISCONNECT: js.Array[quit]
  }
  object CommandNameFlags {
    
    inline def apply(
      ENTER_SUBSCRIBER_MODE: js.Tuple2[subscribe, psubscribe],
      EXIT_SUBSCRIBER_MODE: js.Tuple2[unsubscribe, punsubscribe],
      VALID_IN_MONITOR_MODE: js.Tuple2[monitor, auth_],
      VALID_IN_SUBSCRIBER_MODE: js.Tuple6[subscribe, psubscribe, unsubscribe, punsubscribe, ping, quit],
      WILL_DISCONNECT: js.Array[quit]
    ): CommandNameFlags = {
      val __obj = js.Dynamic.literal(ENTER_SUBSCRIBER_MODE = ENTER_SUBSCRIBER_MODE.asInstanceOf[js.Any], EXIT_SUBSCRIBER_MODE = EXIT_SUBSCRIBER_MODE.asInstanceOf[js.Any], VALID_IN_MONITOR_MODE = VALID_IN_MONITOR_MODE.asInstanceOf[js.Any], VALID_IN_SUBSCRIBER_MODE = VALID_IN_SUBSCRIBER_MODE.asInstanceOf[js.Any], WILL_DISCONNECT = WILL_DISCONNECT.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandNameFlags]
    }
    
    extension [Self <: CommandNameFlags](x: Self) {
      
      inline def setENTER_SUBSCRIBER_MODE(value: js.Tuple2[subscribe, psubscribe]): Self = StObject.set(x, "ENTER_SUBSCRIBER_MODE", value.asInstanceOf[js.Any])
      
      inline def setEXIT_SUBSCRIBER_MODE(value: js.Tuple2[unsubscribe, punsubscribe]): Self = StObject.set(x, "EXIT_SUBSCRIBER_MODE", value.asInstanceOf[js.Any])
      
      inline def setVALID_IN_MONITOR_MODE(value: js.Tuple2[monitor, auth_]): Self = StObject.set(x, "VALID_IN_MONITOR_MODE", value.asInstanceOf[js.Any])
      
      inline def setVALID_IN_SUBSCRIBER_MODE(value: js.Tuple6[subscribe, psubscribe, unsubscribe, punsubscribe, ping, quit]): Self = StObject.set(x, "VALID_IN_SUBSCRIBER_MODE", value.asInstanceOf[js.Any])
      
      inline def setWILL_DISCONNECT(value: js.Array[quit]): Self = StObject.set(x, "WILL_DISCONNECT", value.asInstanceOf[js.Any])
      
      inline def setWILL_DISCONNECTVarargs(value: quit*): Self = StObject.set(x, "WILL_DISCONNECT", js.Array(value*))
    }
  }
  
  trait CommandOptions extends StObject {
    
    var errorStack: js.UndefOr[js.Error] = js.undefined
    
    var keyPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Force the command to be readOnly so it will also execute on slaves
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the encoding of the reply, by default buffer will be returned.
      */
    var replyEncoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  }
  object CommandOptions {
    
    inline def apply(): CommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandOptions]
    }
    
    extension [Self <: CommandOptions](x: Self) {
      
      inline def setErrorStack(value: js.Error): Self = StObject.set(x, "errorStack", value.asInstanceOf[js.Any])
      
      inline def setErrorStackUndefined: Self = StObject.set(x, "errorStack", js.undefined)
      
      inline def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setReplyEncoding(value: BufferEncoding): Self = StObject.set(x, "replyEncoding", value.asInstanceOf[js.Any])
      
      inline def setReplyEncodingNull: Self = StObject.set(x, "replyEncoding", null)
      
      inline def setReplyEncodingUndefined: Self = StObject.set(x, "replyEncoding", js.undefined)
    }
  }
  
  type ReplyTransformer = js.Function1[/* reply */ Any, Any]
}
