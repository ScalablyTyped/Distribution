package typings.ioredisMock

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.ioredis.anon.PartialSentinelAddress
import typings.ioredis.anon.TypeofRedis
import typings.ioredis.anon.keyinkeyofCommandNameFlag
import typings.ioredis.builtCommandMod.ArgumentTransformer
import typings.ioredis.builtCommandMod.ArgumentType
import typings.ioredis.builtCommandMod.CommandOptions
import typings.ioredis.builtCommandMod.ReplyTransformer
import typings.ioredis.builtConnectorsSentinelConnectorMod.SentinelConnectionOptions
import typings.ioredis.builtScanStreamMod.Options
import typings.ioredisMock.ioredisMockStrings.ENTER_SUBSCRIBER_MODE
import typings.ioredisMock.ioredisMockStrings.EXIT_SUBSCRIBER_MODE
import typings.ioredisMock.ioredisMockStrings.VALID_IN_MONITOR_MODE
import typings.ioredisMock.ioredisMockStrings.VALID_IN_SUBSCRIBER_MODE
import typings.ioredisMock.ioredisMockStrings.WILL_DISCONNECT
import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("ioredis-mock", JSImport.Default)
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
    @JSImport("ioredis-mock", "default.default")
    @js.native
    open class default ()
      extends typings.ioredis.mod.default {
      def this(options: typings.ioredis.builtRedisRedisOptionsMod.RedisOptions) = this()
      def this(path: String) = this()
      def this(port: Double) = this()
      def this(path: String, options: typings.ioredis.builtRedisRedisOptionsMod.RedisOptions) = this()
      def this(port: Double, host: String) = this()
      def this(port: Double, options: typings.ioredis.builtRedisRedisOptionsMod.RedisOptions) = this()
      def this(port: Double, host: String, options: typings.ioredis.builtRedisRedisOptionsMod.RedisOptions) = this()
    }
    object default {
      
      @JSImport("ioredis-mock", "default.default")
      @js.native
      val ^ : js.Any = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport("ioredis-mock", "default.default.Cluster")
      @js.native
      open class Cluster protected ()
        extends typings.ioredis.builtClusterMod.default {
        /**
          * Creates an instance of Cluster.
          */
        def this(startupNodes: js.Array[typings.ioredis.builtClusterMod.ClusterNode]) = this()
        def this(
          startupNodes: js.Array[typings.ioredis.builtClusterMod.ClusterNode],
          options: typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions
        ) = this()
      }
      /* static member */
      /* was `typeof Cluster` */
      @JSImport("ioredis-mock", "default.default.Cluster")
      @js.native
      def Cluster: Instantiable2[
            /* startupNodes */ js.Array[typings.ioredis.builtClusterMod.ClusterNode], 
            /* options */ js.UndefOr[typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions], 
            typings.ioredis.builtClusterMod.default
          ] = js.native
      inline def Cluster_=(
        x: Instantiable2[
              /* startupNodes */ js.Array[typings.ioredis.builtClusterMod.ClusterNode], 
              /* options */ js.UndefOr[typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions], 
              typings.ioredis.builtClusterMod.default
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cluster")(x.asInstanceOf[js.Any])
      
      /* static member */
      /* was `typeof Command` */
      object Command {
        
        @JSImport("ioredis-mock", "default.default.Command")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("ioredis-mock", "default.default.Command.FLAGS")
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
        
        @JSImport("ioredis-mock", "default.default.Command.flagMap")
        @js.native
        def flagMap: Any = js.native
        inline def flagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flagMap")(x.asInstanceOf[js.Any])
        
        @JSImport("ioredis-mock", "default.default.Command.getFlagMap")
        @js.native
        def getFlagMap: Any = js.native
        inline def getFlagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFlagMap")(x.asInstanceOf[js.Any])
        
        inline def setArgumentTransformer(name: String, func: ArgumentTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setArgumentTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def setReplyTransformer(name: String, func: ReplyTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReplyTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        @JSImport("ioredis-mock", "default.default.Command._transformer")
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
                /* options */ typings.ioredis.builtRedisRedisOptionsMod.RedisOptions, 
                typings.ioredis.builtRedisMod.Redis
              ])
            ]
      ): typings.ioredis.builtRedisMod.Redis = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(args.asInstanceOf[js.Any]).asInstanceOf[typings.ioredis.builtRedisMod.Redis]
      
      /**
        * Default options
        */
      /* static member */
      @JSImport("ioredis-mock", "default.default.defaultOptions")
      @js.native
      def defaultOptions: Any = js.native
      inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    }
    
    /* note: abstract class */ @JSImport("ioredis-mock", "default.AbstractConnector")
    @js.native
    open class AbstractConnector protected ()
      extends typings.ioredis.mod.AbstractConnector {
      def this(disconnectTimeout: Double) = this()
    }
    
    /**
      * Client for the official Redis Cluster
      */
    @JSImport("ioredis-mock", "default.Cluster")
    @js.native
    open class Cluster protected ()
      extends typings.ioredis.mod.Cluster {
      /**
        * Creates an instance of Cluster.
        */
      def this(startupNodes: js.Array[typings.ioredis.builtClusterMod.ClusterNode]) = this()
      def this(
        startupNodes: js.Array[typings.ioredis.builtClusterMod.ClusterNode],
        options: typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions
      ) = this()
    }
    
    @JSImport("ioredis-mock", "default.Command")
    @js.native
    open class Command protected ()
      extends typings.ioredis.mod.Command {
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
      def this(
        name: String,
        args: js.Array[ArgumentType],
        options: Unit,
        callback: typings.ioredis.builtTypesMod.Callback[Any]
      ) = this()
      def this(
        name: String,
        args: js.Array[ArgumentType],
        options: CommandOptions,
        callback: typings.ioredis.builtTypesMod.Callback[Any]
      ) = this()
      def this(name: String, args: Unit, options: Unit, callback: typings.ioredis.builtTypesMod.Callback[Any]) = this()
      def this(
        name: String,
        args: Unit,
        options: CommandOptions,
        callback: typings.ioredis.builtTypesMod.Callback[Any]
      ) = this()
    }
    /* static members */
    object Command {
      
      @JSImport("ioredis-mock", "default.Command")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ioredis-mock", "default.Command.FLAGS")
      @js.native
      def FLAGS: keyinkeyofCommandNameFlag = js.native
      inline def FLAGS_=(x: keyinkeyofCommandNameFlag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAGS")(x.asInstanceOf[js.Any])
      
      @JSImport("ioredis-mock", "default.Command._transformer")
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
      
      @JSImport("ioredis-mock", "default.Command.flagMap")
      @js.native
      def flagMap: Any = js.native
      inline def flagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flagMap")(x.asInstanceOf[js.Any])
      
      @JSImport("ioredis-mock", "default.Command.getFlagMap")
      @js.native
      def getFlagMap: Any = js.native
      inline def getFlagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFlagMap")(x.asInstanceOf[js.Any])
      
      inline def setArgumentTransformer(name: String, func: ArgumentTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setArgumentTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setReplyTransformer(name: String, func: ReplyTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReplyTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    @JSImport("ioredis-mock", "default.Pipeline")
    @js.native
    open class Pipeline protected ()
      extends typings.ioredis.mod.Pipeline {
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
    @JSImport("ioredis-mock", "default.Redis")
    @js.native
    open class Redis ()
      extends typings.ioredis.mod.Redis {
      def this(options: typings.ioredis.builtRedisRedisOptionsMod.RedisOptions) = this()
      def this(path: String) = this()
      def this(port: Double) = this()
      def this(path: String, options: typings.ioredis.builtRedisRedisOptionsMod.RedisOptions) = this()
      def this(port: Double, host: String) = this()
      def this(port: Double, options: typings.ioredis.builtRedisRedisOptionsMod.RedisOptions) = this()
      def this(port: Double, host: String, options: typings.ioredis.builtRedisRedisOptionsMod.RedisOptions) = this()
    }
    object Redis {
      
      @JSImport("ioredis-mock", "default.Redis")
      @js.native
      val ^ : js.Any = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport("ioredis-mock", "default.Redis.Cluster")
      @js.native
      open class Cluster protected ()
        extends typings.ioredis.builtClusterMod.default {
        /**
          * Creates an instance of Cluster.
          */
        def this(startupNodes: js.Array[typings.ioredis.builtClusterMod.ClusterNode]) = this()
        def this(
          startupNodes: js.Array[typings.ioredis.builtClusterMod.ClusterNode],
          options: typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions
        ) = this()
      }
      /* static member */
      /* was `typeof Cluster` */
      @JSImport("ioredis-mock", "default.Redis.Cluster")
      @js.native
      def Cluster: Instantiable2[
            /* startupNodes */ js.Array[typings.ioredis.builtClusterMod.ClusterNode], 
            /* options */ js.UndefOr[typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions], 
            typings.ioredis.builtClusterMod.default
          ] = js.native
      inline def Cluster_=(
        x: Instantiable2[
              /* startupNodes */ js.Array[typings.ioredis.builtClusterMod.ClusterNode], 
              /* options */ js.UndefOr[typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions], 
              typings.ioredis.builtClusterMod.default
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cluster")(x.asInstanceOf[js.Any])
      
      /* static member */
      /* was `typeof Command` */
      object Command {
        
        @JSImport("ioredis-mock", "default.Redis.Command")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("ioredis-mock", "default.Redis.Command.FLAGS")
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
        
        @JSImport("ioredis-mock", "default.Redis.Command.flagMap")
        @js.native
        def flagMap: Any = js.native
        inline def flagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flagMap")(x.asInstanceOf[js.Any])
        
        @JSImport("ioredis-mock", "default.Redis.Command.getFlagMap")
        @js.native
        def getFlagMap: Any = js.native
        inline def getFlagMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFlagMap")(x.asInstanceOf[js.Any])
        
        inline def setArgumentTransformer(name: String, func: ArgumentTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setArgumentTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def setReplyTransformer(name: String, func: ReplyTransformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReplyTransformer")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        @JSImport("ioredis-mock", "default.Redis.Command._transformer")
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
                /* options */ typings.ioredis.builtRedisRedisOptionsMod.RedisOptions, 
                typings.ioredis.builtRedisMod.Redis
              ])
            ]
      ): typings.ioredis.builtRedisMod.Redis = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(args.asInstanceOf[js.Any]).asInstanceOf[typings.ioredis.builtRedisMod.Redis]
      
      /**
        * Default options
        */
      /* static member */
      @JSImport("ioredis-mock", "default.Redis.defaultOptions")
      @js.native
      def defaultOptions: Any = js.native
      inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("ioredis-mock", "default.ReplyError")
    @js.native
    val ReplyError: Any = js.native
    
    @JSImport("ioredis-mock", "default.ScanStream")
    @js.native
    open class ScanStream protected ()
      extends typings.ioredis.mod.ScanStream {
      def this(opt: Options) = this()
    }
    
    @JSImport("ioredis-mock", "default.SentinelConnector")
    @js.native
    open class SentinelConnector protected ()
      extends typings.ioredis.mod.SentinelConnector {
      def this(options: SentinelConnectionOptions) = this()
    }
    
    @JSImport("ioredis-mock", "default.SentinelIterator")
    @js.native
    open class SentinelIterator protected ()
      extends typings.ioredis.mod.SentinelIterator {
      def this(sentinels: js.Array[PartialSentinelAddress]) = this()
    }
    
    inline def print(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")().asInstanceOf[Unit]
    inline def print(err: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def print(err: js.Error, reply: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(err.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def print(err: Null, reply: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(err.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type AddressFromResponse = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.AddressFromResponse */ Any
  
  type BooleanResponse = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.BooleanResponse */ Any
  
  type Callback[T] = typings.ioredis.builtTypesMod.Callback[T]
  
  type CallbackFunction = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.CallbackFunction */ Any
  
  type Cluster = typings.ioredis.mod.Cluster
  
  type ClusterNode = typings.ioredis.builtClusterMod.ClusterNode
  
  type ClusterOptions = typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions
  
  type ClusterStatic = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.ClusterStatic */ Any
  
  type Command = typings.ioredis.mod.Command
  
  type Commands = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.Commands */ Any
  
  type DNSLookupFunction = typings.ioredis.builtClusterClusterOptionsMod.DNSLookupFunction
  
  type KeyType = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.KeyType */ Any
  
  type MultiOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.MultiOptions */ Any
  
  type NatMap = typings.ioredis.builtClusterClusterOptionsMod.NatMap
  
  type NodeConfiguration = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.NodeConfiguration */ Any
  
  type NodeRole = typings.ioredis.builtClusterUtilMod.NodeRole
  
  type Ok = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.Ok */ Any
  
  type OverloadedBlockingListCommand[T, U] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.OverloadedBlockingListCommand<T, U> */ Any
  
  type OverloadedCommand[T, U] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.OverloadedCommand<T, U> */ Any
  
  type OverloadedEvalCommand[T, U] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.OverloadedEvalCommand<T, U> */ Any
  
  type OverloadedHashCommand[T, U] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.OverloadedHashCommand<T, U> */ Any
  
  type OverloadedKeyCommand[T, U] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.OverloadedKeyCommand<T, U> */ Any
  
  type OverloadedKeyedHashCommand[T, U] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.OverloadedKeyedHashCommand<T, U> */ Any
  
  type OverloadedListCommand[T, U] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.OverloadedListCommand<T, U> */ Any
  
  type OverloadedScanCommand[T, U] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.OverloadedScanCommand<T, U> */ Any
  
  type OverloadedSubCommand[T, U] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.OverloadedSubCommand<T, U> */ Any
  
  type Pipeline = typings.ioredis.mod.Pipeline
  
  type PreferredSlaves = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.PreferredSlaves */ Any
  
  type Redis = typings.ioredis.mod.Redis
  
  type RedisOptions = typings.ioredis.builtRedisRedisOptionsMod.RedisOptions
  
  type ScanStreamOption = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.ScanStreamOption */ Any
  
  type SecureContextOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.SecureContextOptions */ Any
  
  type SecureVersion = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.SecureVersion */ Any
  
  type ValueType = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RealIORedis.ValueType */ Any
}
