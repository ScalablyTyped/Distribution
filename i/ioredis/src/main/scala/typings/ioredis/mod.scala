package typings.ioredis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.ioredis.anon.PartialSentinelAddress
import typings.ioredis.anon.TypeofRedis
import typings.ioredis.anon.keyinkeyofCommandNameFlag
import typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions
import typings.ioredis.builtClusterMod.ClusterNode
import typings.ioredis.builtCommandMod.ArgumentTransformer
import typings.ioredis.builtCommandMod.ArgumentType
import typings.ioredis.builtCommandMod.CommandOptions
import typings.ioredis.builtCommandMod.ReplyTransformer
import typings.ioredis.builtConnectorsSentinelConnectorMod.SentinelConnectionOptions
import typings.ioredis.builtRedisRedisOptionsMod.RedisOptions
import typings.ioredis.builtScanStreamMod.Options
import typings.ioredis.builtTypesMod.Callback
import typings.ioredis.ioredisStrings.ENTER_SUBSCRIBER_MODE
import typings.ioredis.ioredisStrings.EXIT_SUBSCRIBER_MODE
import typings.ioredis.ioredisStrings.VALID_IN_MONITOR_MODE
import typings.ioredis.ioredisStrings.VALID_IN_SUBSCRIBER_MODE
import typings.ioredis.ioredisStrings.WILL_DISCONNECT
import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ioredis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("ioredis", JSImport.Default)
  @js.native
  open class default ()
    extends typings.ioredis.builtRedisMod.default {
    def this(options: RedisOptions) = this()
    def this(path: String) = this()
    def this(port: Double) = this()
    def this(path: String, options: RedisOptions) = this()
    def this(port: Double, host: String) = this()
    def this(port: Double, options: RedisOptions) = this()
    def this(port: Double, host: String, options: RedisOptions) = this()
  }
  object default {
    
    @JSImport("ioredis", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ioredis", "default.Cluster")
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
    @JSImport("ioredis", "default.Cluster")
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
    @JSImport("ioredis", "default.Command")
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
      
      @JSImport("ioredis", "default.Command")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ioredis", "default.Command.FLAGS")
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
      
      @JSImport("ioredis", "default.Command.flagMap")
      @js.native
      def flagMap: Any = js.native
      inline def flagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flagMap")(x.asInstanceOf[js.Any])
      
      @JSImport("ioredis", "default.Command.getFlagMap")
      @js.native
      def getFlagMap: Any = js.native
      inline def getFlagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFlagMap")(x.asInstanceOf[js.Any])
      
      inline def setArgumentTransformer(name: String, func: ArgumentTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setArgumentTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setReplyTransformer(name: String, func: ReplyTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReplyTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("ioredis", "default.Command._transformer")
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
          TypeofRedis & (Instantiable3[
            /* port */ Double, 
            /* host */ String, 
            /* options */ RedisOptions, 
            typings.ioredis.builtRedisMod.Redis
          ])
        ]
    ): typings.ioredis.builtRedisMod.Redis = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(args.asInstanceOf[js.Any]).asInstanceOf[typings.ioredis.builtRedisMod.Redis]
    
    /**
      * Default options
      */
    /* static member */
    @JSImport("ioredis", "default.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("ioredis", "AbstractConnector")
  @js.native
  open class AbstractConnector protected ()
    extends typings.ioredis.builtConnectorsAbstractConnectorMod.default {
    def this(disconnectTimeout: Double) = this()
  }
  
  /**
    * Client for the official Redis Cluster
    */
  @JSImport("ioredis", "Cluster")
  @js.native
  open class Cluster protected ()
    extends typings.ioredis.builtClusterMod.default {
    /**
      * Creates an instance of Cluster.
      */
    def this(startupNodes: js.Array[ClusterNode]) = this()
    def this(startupNodes: js.Array[ClusterNode], options: ClusterOptions) = this()
  }
  
  @JSImport("ioredis", "Command")
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
  /* static members */
  object Command {
    
    @JSImport("ioredis", "Command")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ioredis", "Command.FLAGS")
    @js.native
    def FLAGS: keyinkeyofCommandNameFlag = js.native
    inline def FLAGS_=(x: keyinkeyofCommandNameFlag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAGS")(x.asInstanceOf[js.Any])
    
    @JSImport("ioredis", "Command._transformer")
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
    
    @JSImport("ioredis", "Command.flagMap")
    @js.native
    def flagMap: Any = js.native
    inline def flagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flagMap")(x.asInstanceOf[js.Any])
    
    @JSImport("ioredis", "Command.getFlagMap")
    @js.native
    def getFlagMap: Any = js.native
    inline def getFlagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFlagMap")(x.asInstanceOf[js.Any])
    
    inline def setArgumentTransformer(name: String, func: ArgumentTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setArgumentTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setReplyTransformer(name: String, func: ReplyTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReplyTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("ioredis", "Pipeline")
  @js.native
  open class Pipeline protected ()
    extends typings.ioredis.builtPipelineMod.default {
    def this(redis: typings.ioredis.builtClusterMod.default) = this()
    def this(redis: typings.ioredis.builtRedisMod.default) = this()
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
  @JSImport("ioredis", "Redis")
  @js.native
  open class Redis ()
    extends typings.ioredis.builtRedisMod.default {
    def this(options: RedisOptions) = this()
    def this(path: String) = this()
    def this(port: Double) = this()
    def this(path: String, options: RedisOptions) = this()
    def this(port: Double, host: String) = this()
    def this(port: Double, options: RedisOptions) = this()
    def this(port: Double, host: String, options: RedisOptions) = this()
  }
  object Redis {
    
    @JSImport("ioredis", "Redis")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ioredis", "Redis.Cluster")
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
    @JSImport("ioredis", "Redis.Cluster")
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
    @JSImport("ioredis", "Redis.Command")
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
      
      @JSImport("ioredis", "Redis.Command")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ioredis", "Redis.Command.FLAGS")
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
      
      @JSImport("ioredis", "Redis.Command.flagMap")
      @js.native
      def flagMap: Any = js.native
      inline def flagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flagMap")(x.asInstanceOf[js.Any])
      
      @JSImport("ioredis", "Redis.Command.getFlagMap")
      @js.native
      def getFlagMap: Any = js.native
      inline def getFlagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFlagMap")(x.asInstanceOf[js.Any])
      
      inline def setArgumentTransformer(name: String, func: ArgumentTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setArgumentTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setReplyTransformer(name: String, func: ReplyTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReplyTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("ioredis", "Redis.Command._transformer")
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
          TypeofRedis & (Instantiable3[
            /* port */ Double, 
            /* host */ String, 
            /* options */ RedisOptions, 
            typings.ioredis.builtRedisMod.Redis
          ])
        ]
    ): typings.ioredis.builtRedisMod.Redis = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(args.asInstanceOf[js.Any]).asInstanceOf[typings.ioredis.builtRedisMod.Redis]
    
    /**
      * Default options
      */
    /* static member */
    @JSImport("ioredis", "Redis.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ioredis", "ReplyError")
  @js.native
  val ReplyError: Any = js.native
  
  @JSImport("ioredis", "ScanStream")
  @js.native
  open class ScanStream protected ()
    extends typings.ioredis.builtScanStreamMod.default {
    def this(opt: Options) = this()
  }
  
  @JSImport("ioredis", "SentinelConnector")
  @js.native
  open class SentinelConnector protected ()
    extends typings.ioredis.builtConnectorsSentinelConnectorMod.default {
    def this(options: SentinelConnectionOptions) = this()
  }
  
  @JSImport("ioredis", "SentinelIterator")
  @js.native
  open class SentinelIterator protected ()
    extends typings.ioredis.builtConnectorsSentinelConnectorSentinelIteratorMod.default {
    def this(sentinels: js.Array[PartialSentinelAddress]) = this()
  }
  
  inline def print(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")().asInstanceOf[Unit]
  inline def print(err: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def print(err: js.Error, reply: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(err.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def print(err: Null, reply: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(err.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
