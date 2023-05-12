package typings.ioredis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.denque.mod.^
import typings.ioredis.anon.PartialRedisOptions
import typings.ioredis.anon.TypeofRedis
import typings.ioredis.anon.`0`
import typings.ioredis.anon.keyinkeyofCommandNameFlag
import typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions
import typings.ioredis.builtClusterMod.ClusterNode
import typings.ioredis.builtCommandMod.ArgumentTransformer
import typings.ioredis.builtCommandMod.ArgumentType
import typings.ioredis.builtCommandMod.CommandOptions
import typings.ioredis.builtCommandMod.ReplyTransformer
import typings.ioredis.builtDataHandlerMod.Condition
import typings.ioredis.builtDataHandlerMod.FlushQueueOptions
import typings.ioredis.builtRedisRedisOptionsMod.RedisOptions
import typings.ioredis.builtTransactionMod.Transaction
import typings.ioredis.builtTypesMod.Callback
import typings.ioredis.builtTypesMod.CommandItem
import typings.ioredis.builtTypesMod.NetStream
import typings.ioredis.builtTypesMod.ScanStreamOptions
import typings.ioredis.ioredisStrings.ENTER_SUBSCRIBER_MODE
import typings.ioredis.ioredisStrings.EXIT_SUBSCRIBER_MODE
import typings.ioredis.ioredisStrings.VALID_IN_MONITOR_MODE
import typings.ioredis.ioredisStrings.VALID_IN_SUBSCRIBER_MODE
import typings.ioredis.ioredisStrings.WILL_DISCONNECT
import typings.ioredis.ioredisStrings.error_
import typings.ioredis.ioredisStrings.message
import typings.ioredis.ioredisStrings.messageBuffer
import typings.ioredis.ioredisStrings.monitor
import typings.ioredis.ioredisStrings.normal_
import typings.ioredis.ioredisStrings.pmessage
import typings.ioredis.ioredisStrings.pmessageBuffer
import typings.ioredis.ioredisStrings.subscriber
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtRedisMod {
  
  /**
    * This is the major component of ioredis.
    * Use it to connect to a standalone Redis server or Sentinels.
    *
    * ```typescript
    * const redis = new Redis(); // Default port is 6379
    * async function main() {
    *   redis.set("foo", "bar");
    *   redis.get("foo", (err, result) => {
    *     // `result` should be "bar"
    *     console.log(err, result);
    *   });
    *   // Or use Promise
    *   const result = await redis.get("foo");
    * }
    * ```
    */
  @JSImport("ioredis/built/Redis", JSImport.Default)
  @js.native
  open class default () extends Redis {
    def this(options: RedisOptions) = this()
    def this(path: String) = this()
    def this(port: Double) = this()
    def this(path: String, options: RedisOptions) = this()
    def this(port: Double, host: String) = this()
    def this(port: Double, options: RedisOptions) = this()
    def this(port: Double, host: String, options: RedisOptions) = this()
  }
  object default {
    
    @JSImport("ioredis/built/Redis", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ioredis/built/Redis", "default.Cluster")
    @js.native
    open class Cluster protected ()
      extends typings.ioredis.builtClusterMod.default {
      /**
        * Creates an instance of Cluster.
        */
      def this(startupNodes: js.Array[ClusterNode]) = this()
      def this(startupNodes: js.Array[ClusterNode], options: ClusterOptions) = this()
    }
    /* static member */
    /* was `typeof Cluster` */
    @JSImport("ioredis/built/Redis", "default.Cluster")
    @js.native
    def Cluster: Instantiable2[
        /* startupNodes */ js.Array[ClusterNode], 
        /* options */ js.UndefOr[ClusterOptions], 
        typings.ioredis.builtClusterMod.default
      ] = js.native
    inline def Cluster_=(
      x: Instantiable2[
          /* startupNodes */ js.Array[ClusterNode], 
          /* options */ js.UndefOr[ClusterOptions], 
          typings.ioredis.builtClusterMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cluster")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ioredis/built/Redis", "default.Command")
    @js.native
    open class Command protected ()
      extends typings.ioredis.builtCommandMod.default {
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
    }
    /* static member */
    /* was `typeof Command` */
    object Command {
      
      @JSImport("ioredis/built/Redis", "default.Command")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ioredis/built/Redis", "default.Command.FLAGS")
      @js.native
      def FLAGS: keyinkeyofCommandNameFlag = js.native
      inline def FLAGS_=(x: keyinkeyofCommandNameFlag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAGS")(x.asInstanceOf[js.Any])
      
      inline def checkFlag_ENTERSUBSCRIBERMODE(flagName: ENTER_SUBSCRIBER_MODE, commandName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFlag")(flagName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def checkFlag_EXITSUBSCRIBERMODE(flagName: EXIT_SUBSCRIBER_MODE, commandName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFlag")(flagName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def checkFlag_VALIDINMONITORMODE(flagName: VALID_IN_MONITOR_MODE, commandName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFlag")(flagName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Check whether the command has the flag
        */
      inline def checkFlag_VALIDINSUBSCRIBERMODE(flagName: VALID_IN_SUBSCRIBER_MODE, commandName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFlag")(flagName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def checkFlag_WILLDISCONNECT(flagName: WILL_DISCONNECT, commandName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkFlag")(flagName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      @JSImport("ioredis/built/Redis", "default.Command.flagMap")
      @js.native
      def flagMap: Any = js.native
      inline def flagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flagMap")(x.asInstanceOf[js.Any])
      
      @JSImport("ioredis/built/Redis", "default.Command.getFlagMap")
      @js.native
      def getFlagMap: Any = js.native
      inline def getFlagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFlagMap")(x.asInstanceOf[js.Any])
      
      inline def setArgumentTransformer(name: String, func: ArgumentTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setArgumentTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setReplyTransformer(name: String, func: ReplyTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReplyTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("ioredis/built/Redis", "default.Command._transformer")
      @js.native
      def transformer: Any = js.native
      
      inline def transformer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_transformer")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Create a Redis instance.
      * This is the same as `new Redis()` but is included for compatibility with node-redis.
      */
    /* static member */
    inline def createClient(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Redis> is not an array type */ args: ConstructorParameters[
          TypeofRedis & (Instantiable3[/* port */ Double, /* host */ String, /* options */ RedisOptions, Redis])
        ]
    ): Redis = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(args.asInstanceOf[js.Any]).asInstanceOf[Redis]
    
    /**
      * Default options
      */
    /* static member */
    @JSImport("ioredis/built/Redis", "default.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
  
  /**
    * This is the major component of ioredis.
    * Use it to connect to a standalone Redis server or Sentinels.
    *
    * ```typescript
    * const redis = new Redis(); // Default port is 6379
    * async function main() {
    *   redis.set("foo", "bar");
    *   redis.get("foo", (err, result) => {
    *     // `result` should be "bar"
    *     console.log(err, result);
    *   });
    *   // Or use Promise
    *   const result = await redis.get("foo");
    * }
    * ```
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.eventsMod.EventEmitter because Inheritance from two classes. Inlined 
  - typings.ioredis.builtDataHandlerMod.DataHandledable because Inheritance from two classes. Inlined stream, status, condition, commandQueue, disconnect, recoverFromFatalError, handleReconnection */ @js.native
  trait Redis
    extends typings.ioredis.builtUtilsCommanderMod.default[`0`]
       with Transaction
       with EventEmitter {
    
    /* private */ var _autoPipelines: Any = js.native
    
    /**
      * Get description of the connection. Used for debugging.
      */
    /* private */ var _getDescription: Any = js.native
    
    /**
      * Check whether Redis has finished loading the persistent data and is able to
      * process commands.
      */
    /* private */ var _readyCheck: Any = js.native
    
    /* private */ var _runningAutoPipelines: Any = js.native
    
    def autoPipelineQueueSize: Double = js.native
    
    /**
      * @ignore
      */
    var commandQueue: ^[CommandItem] = js.native
    
    /**
      * @ignore
      */
    var condition: Condition | Null = js.native
    
    /**
      * Create a connection to Redis.
      * This method will be invoked automatically when creating a new Redis instance
      * unless `lazyConnect: true` is passed.
      *
      * When calling this method manually, a Promise is returned, which will
      * be resolved when the connection status is ready.
      */
    def connect(): js.Promise[Unit] = js.native
    def connect(callback: Callback[Unit]): js.Promise[Unit] = js.native
    
    /* private */ var connectionEpoch: Any = js.native
    
    /* private */ var connector: Any = js.native
    
    /* private */ var createScanStream: Any = js.native
    
    /**
      * Disconnect from Redis.
      *
      * This method closes the connection immediately,
      * and may lose some pending replies that haven't written to client.
      * If you want to wait for the pending replies, use Redis#quit instead.
      */
    def disconnect(): Unit = js.native
    def disconnect(reconnect: Boolean): Unit = js.native
    
    /**
      * Create a new instance with the same options as the current one.
      *
      * @example
      * ```js
      * var redis = new Redis(6380);
      * var anotherRedis = redis.duplicate();
      * ```
      */
    def duplicate(): Redis = js.native
    def duplicate(`override`: PartialRedisOptions): Redis = js.native
    
    /**
      * Disconnect from Redis.
      *
      * @deprecated
      */
    def end(): Unit = js.native
    
    /**
      * Flush offline queue and command queue with error.
      *
      * @param error The error object to send to the commands
      * @param options options
      */
    /* private */ var flushQueue: Any = js.native
    
    /**
      * @ignore
      */
    def handleReconnection(err: js.Error, item: CommandItem): Unit = js.native
    
    def hscanBufferStream(key: String): typings.ioredis.builtScanStreamMod.default = js.native
    def hscanBufferStream(key: String, options: ScanStreamOptions): typings.ioredis.builtScanStreamMod.default = js.native
    
    def hscanStream(key: String): typings.ioredis.builtScanStreamMod.default = js.native
    def hscanStream(key: String, options: ScanStreamOptions): typings.ioredis.builtScanStreamMod.default = js.native
    
    /**
      * @ignore
      */
    var isCluster: Boolean = js.native
    
    /* private */ var manuallyClosing: Any = js.native
    
    /**
      * Mode of the connection.
      *
      * One of `"normal"`, `"subscriber"`, or `"monitor"`. When the connection is
      * not in `"normal"` mode, certain commands are not allowed.
      */
    def mode: normal_ | subscriber | monitor = js.native
    
    /**
      * Listen for all requests received by the server in real time.
      *
      * This command will create a new connection to Redis and send a
      * MONITOR command via the new connection in order to avoid disturbing
      * the current connection.
      *
      * @param callback The callback function. If omit, a promise will be returned.
      * @example
      * ```js
      * var redis = new Redis();
      * redis.monitor(function (err, monitor) {
      *   // Entering monitoring mode.
      *   monitor.on('monitor', function (time, args, source, database) {
      *     console.log(time + ": " + util.inspect(args));
      *   });
      * });
      *
      * // supports promise as well as other commands
      * redis.monitor().then(function (monitor) {
      *   monitor.on('monitor', function (time, args, source, database) {
      *     console.log(time + ": " + util.inspect(args));
      *   });
      * });
      * ```
      */
    def monitor(): js.Promise[Redis] = js.native
    def monitor(callback: Callback[Redis]): js.Promise[Redis] = js.native
    
    /* private */ var offlineQueue: Any = js.native
    
    def on(event: RedisStatus, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error_, cb: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, cb: js.Function2[/* channel */ String, /* message */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_messageBuffer(event: messageBuffer, cb: js.Function2[/* channel */ Buffer, /* message */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_pmessage(
      event: pmessage,
      cb: js.Function3[/* pattern */ String, /* channel */ String, /* message */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_pmessageBuffer(
      event: pmessageBuffer,
      cb: js.Function3[/* pattern */ String, /* channel */ Buffer, /* message */ Buffer, Unit]
    ): this.type = js.native
    
    def once(event: RedisStatus, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error_, cb: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_message(event: message, cb: js.Function2[/* channel */ String, /* message */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_messageBuffer(event: messageBuffer, cb: js.Function2[/* channel */ Buffer, /* message */ Buffer, Unit]): this.type = js.native
    @JSName("once")
    def once_pmessage(
      event: pmessage,
      cb: js.Function3[/* pattern */ String, /* channel */ String, /* message */ String, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_pmessageBuffer(
      event: pmessageBuffer,
      cb: js.Function3[/* pattern */ String, /* channel */ Buffer, /* message */ Buffer, Unit]
    ): this.type = js.native
    
    @JSName("options")
    var options_Redis: RedisOptions = js.native
    
    /* private */ var parseOptions: Any = js.native
    
    /* private */ var reconnectTimeout: Any = js.native
    
    /**
      * @ignore
      */
    def recoverFromFatalError(_commandError: js.Error, err: js.Error, options: FlushQueueOptions): Unit = js.native
    
    /* private */ var resetCommandQueue: Any = js.native
    
    /* private */ var resetOfflineQueue: Any = js.native
    
    /* private */ var retryAttempts: Any = js.native
    
    def scanBufferStream(): typings.ioredis.builtScanStreamMod.default = js.native
    def scanBufferStream(options: ScanStreamOptions): typings.ioredis.builtScanStreamMod.default = js.native
    
    def scanStream(): typings.ioredis.builtScanStreamMod.default = js.native
    def scanStream(options: ScanStreamOptions): typings.ioredis.builtScanStreamMod.default = js.native
    
    /**
      * Change instance's status
      */
    /* private */ var setStatus: Any = js.native
    
    /**
      * Emit only when there's at least one listener.
      *
      * @ignore
      */
    def silentEmit(eventName: String): Boolean = js.native
    def silentEmit(eventName: String, arg: Any): Boolean = js.native
    
    def sscanBufferStream(key: String): typings.ioredis.builtScanStreamMod.default = js.native
    def sscanBufferStream(key: String, options: ScanStreamOptions): typings.ioredis.builtScanStreamMod.default = js.native
    
    def sscanStream(key: String): typings.ioredis.builtScanStreamMod.default = js.native
    def sscanStream(key: String, options: ScanStreamOptions): typings.ioredis.builtScanStreamMod.default = js.native
    
    var status: RedisStatus | String = js.native
    
    /**
      * @ignore
      */
    var stream: NetStream = js.native
    
    def zscanBufferStream(key: String): typings.ioredis.builtScanStreamMod.default = js.native
    def zscanBufferStream(key: String, options: ScanStreamOptions): typings.ioredis.builtScanStreamMod.default = js.native
    
    def zscanStream(key: String): typings.ioredis.builtScanStreamMod.default = js.native
    def zscanStream(key: String, options: ScanStreamOptions): typings.ioredis.builtScanStreamMod.default = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ioredis.ioredisStrings.wait
    - typings.ioredis.ioredisStrings.reconnecting
    - typings.ioredis.ioredisStrings.connecting
    - typings.ioredis.ioredisStrings.connect
    - typings.ioredis.ioredisStrings.ready
    - typings.ioredis.ioredisStrings.close
    - typings.ioredis.ioredisStrings.end
  */
  trait RedisStatus extends StObject
  object RedisStatus {
    
    inline def close: typings.ioredis.ioredisStrings.close = "close".asInstanceOf[typings.ioredis.ioredisStrings.close]
    
    inline def connect: typings.ioredis.ioredisStrings.connect = "connect".asInstanceOf[typings.ioredis.ioredisStrings.connect]
    
    inline def connecting: typings.ioredis.ioredisStrings.connecting = "connecting".asInstanceOf[typings.ioredis.ioredisStrings.connecting]
    
    inline def end: typings.ioredis.ioredisStrings.end = "end".asInstanceOf[typings.ioredis.ioredisStrings.end]
    
    inline def ready: typings.ioredis.ioredisStrings.ready = "ready".asInstanceOf[typings.ioredis.ioredisStrings.ready]
    
    inline def reconnecting: typings.ioredis.ioredisStrings.reconnecting = "reconnecting".asInstanceOf[typings.ioredis.ioredisStrings.reconnecting]
  }
}
