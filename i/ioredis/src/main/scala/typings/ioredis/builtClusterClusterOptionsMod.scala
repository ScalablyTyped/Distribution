package typings.ioredis

import org.scalablytyped.runtime.StringDictionary
import typings.ioredis.anon.Host
import typings.ioredis.anon.Lua
import typings.ioredis.anon.OmitRedisOptionsporthostp
import typings.ioredis.builtClusterUtilMod.NodeRole
import typings.ioredis.builtUtilsCommanderMod.CommanderOptions
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.SrvRecord
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtClusterClusterOptionsMod {
  
  @JSImport("ioredis/built/cluster/ClusterOptions", "DEFAULT_CLUSTER_OPTIONS")
  @js.native
  val DEFAULT_CLUSTER_OPTIONS: ClusterOptions = js.native
  
  trait ClusterOptions
    extends StObject
       with CommanderOptions {
    
    /**
      * See Redis class.
      *
      * @default []
      */
    var autoPipeliningIgnoredCommands: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * See "Quick Start" section.
      *
      * @default (times) => Math.min(100 + times * 2, 2000)
      */
    var clusterRetryStrategy: js.UndefOr[
        js.Function2[/* times */ Double, /* reason */ js.UndefOr[js.Error], Double | Unit | Null]
      ] = js.undefined
    
    /**
      * Hostnames will be resolved to IP addresses via this function.
      * This is needed when the addresses of startup nodes are hostnames instead
      * of IPs.
      *
      * You may provide a custom `lookup` function when you want to customize
      * the cache behavior of the default function.
      *
      * @default require('dns').lookup
      */
    var dnsLookup: js.UndefOr[DNSLookupFunction] = js.undefined
    
    /**
      * See Redis class.
      *
      * @default false
      */
    var enableAutoPipelining: js.UndefOr[Boolean] = js.undefined
    
    /**
      * See Redis class.
      *
      * @default true
      */
    var enableOfflineQueue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled, ioredis only emits "ready" event when `CLUSTER INFO`
      * command reporting the cluster is ready for handling commands.
      *
      * @default true
      */
    var enableReadyCheck: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, When a new Cluster instance is created,
      * it will connect to the Redis cluster automatically.
      * If you want to keep the instance disconnected until the first command is called,
      * set this option to `true`.
      *
      * @default false
      */
    var lazyConnect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When a MOVED or ASK error is received, client will redirect the
      * command to another node.
      * This option limits the max redirections allowed to send a command.
      *
      * @default 16
      */
    var maxRedirections: js.UndefOr[Double] = js.undefined
    
    var natMap: js.UndefOr[NatMap] = js.undefined
    
    /**
      * Passed to the constructor of `Redis`
      *
      * @default null
      */
    var redisOptions: js.UndefOr[OmitRedisOptionsporthostp] = js.undefined
    
    /**
      * SRV records will be resolved via this function.
      *
      * You may provide a custom `resolveSrv` function when you want to customize
      * the cache behavior of the default function.
      *
      * @default require('dns').resolveSrv
      */
    var resolveSrv: js.UndefOr[DNSResolveSrvFunction] = js.undefined
    
    /**
      * When a CLUSTERDOWN error is received, client will retry
      * if `retryDelayOnClusterDown` is valid delay time (in ms).
      *
      * @default 100
      */
    var retryDelayOnClusterDown: js.UndefOr[Double] = js.undefined
    
    /**
      * When an error is received when sending a command (e.g.
      * "Connection is closed." when the target Redis node is down), client will retry
      * if `retryDelayOnFailover` is valid delay time (in ms).
      *
      * @default 100
      */
    var retryDelayOnFailover: js.UndefOr[Double] = js.undefined
    
    /**
      * By default, this value is 0, which means when a `MOVED` error is received,
      * the client will resend the command instantly to the node returned together with
      * the `MOVED` error. However, sometimes it takes time for a cluster to become
      * state stabilized after a failover, so adding a delay before resending can
      * prevent a ping pong effect.
      *
      * @default 0
      */
    var retryDelayOnMoved: js.UndefOr[Double] = js.undefined
    
    /**
      * When a TRYAGAIN error is received, client will retry
      * if `retryDelayOnTryAgain` is valid delay time (in ms).
      *
      * @default 100
      */
    var retryDelayOnTryAgain: js.UndefOr[Double] = js.undefined
    
    /**
      * Scale reads to the node with the specified role.
      *
      * @default "master"
      */
    var scaleReads: js.UndefOr[NodeRole | js.Function] = js.undefined
    
    /**
      * Custom LUA commands
      */
    var scripts: js.UndefOr[Record[String, Lua]] = js.undefined
    
    /**
      * The milliseconds between every automatic slots refresh.
      *
      * @default 5000
      */
    var slotsRefreshInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * The milliseconds before a timeout occurs while refreshing
      * slots from the cluster.
      *
      * @default 1000
      */
    var slotsRefreshTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Discover nodes using SRV records
      *
      * @default false
      */
    var useSRVRecords: js.UndefOr[Boolean] = js.undefined
  }
  object ClusterOptions {
    
    inline def apply(): ClusterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterOptions]
    }
    
    extension [Self <: ClusterOptions](x: Self) {
      
      inline def setAutoPipeliningIgnoredCommands(value: js.Array[String]): Self = StObject.set(x, "autoPipeliningIgnoredCommands", value.asInstanceOf[js.Any])
      
      inline def setAutoPipeliningIgnoredCommandsUndefined: Self = StObject.set(x, "autoPipeliningIgnoredCommands", js.undefined)
      
      inline def setAutoPipeliningIgnoredCommandsVarargs(value: String*): Self = StObject.set(x, "autoPipeliningIgnoredCommands", js.Array(value*))
      
      inline def setClusterRetryStrategy(value: (/* times */ Double, /* reason */ js.UndefOr[js.Error]) => Double | Unit | Null): Self = StObject.set(x, "clusterRetryStrategy", js.Any.fromFunction2(value))
      
      inline def setClusterRetryStrategyUndefined: Self = StObject.set(x, "clusterRetryStrategy", js.undefined)
      
      inline def setDnsLookup(
        value: (/* hostname */ String, /* callback */ js.Function3[
              /* err */ js.UndefOr[ErrnoException | Null], 
              /* address */ String, 
              /* family */ js.UndefOr[Double], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "dnsLookup", js.Any.fromFunction2(value))
      
      inline def setDnsLookupUndefined: Self = StObject.set(x, "dnsLookup", js.undefined)
      
      inline def setEnableAutoPipelining(value: Boolean): Self = StObject.set(x, "enableAutoPipelining", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoPipeliningUndefined: Self = StObject.set(x, "enableAutoPipelining", js.undefined)
      
      inline def setEnableOfflineQueue(value: Boolean): Self = StObject.set(x, "enableOfflineQueue", value.asInstanceOf[js.Any])
      
      inline def setEnableOfflineQueueUndefined: Self = StObject.set(x, "enableOfflineQueue", js.undefined)
      
      inline def setEnableReadyCheck(value: Boolean): Self = StObject.set(x, "enableReadyCheck", value.asInstanceOf[js.Any])
      
      inline def setEnableReadyCheckUndefined: Self = StObject.set(x, "enableReadyCheck", js.undefined)
      
      inline def setLazyConnect(value: Boolean): Self = StObject.set(x, "lazyConnect", value.asInstanceOf[js.Any])
      
      inline def setLazyConnectUndefined: Self = StObject.set(x, "lazyConnect", js.undefined)
      
      inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
      
      inline def setNatMap(value: NatMap): Self = StObject.set(x, "natMap", value.asInstanceOf[js.Any])
      
      inline def setNatMapUndefined: Self = StObject.set(x, "natMap", js.undefined)
      
      inline def setRedisOptions(value: OmitRedisOptionsporthostp): Self = StObject.set(x, "redisOptions", value.asInstanceOf[js.Any])
      
      inline def setRedisOptionsUndefined: Self = StObject.set(x, "redisOptions", js.undefined)
      
      inline def setResolveSrv(
        value: (/* hostname */ String, /* callback */ js.Function2[
              /* err */ js.UndefOr[ErrnoException | Null], 
              /* records */ js.UndefOr[js.Array[SrvRecord]], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "resolveSrv", js.Any.fromFunction2(value))
      
      inline def setResolveSrvUndefined: Self = StObject.set(x, "resolveSrv", js.undefined)
      
      inline def setRetryDelayOnClusterDown(value: Double): Self = StObject.set(x, "retryDelayOnClusterDown", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayOnClusterDownUndefined: Self = StObject.set(x, "retryDelayOnClusterDown", js.undefined)
      
      inline def setRetryDelayOnFailover(value: Double): Self = StObject.set(x, "retryDelayOnFailover", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayOnFailoverUndefined: Self = StObject.set(x, "retryDelayOnFailover", js.undefined)
      
      inline def setRetryDelayOnMoved(value: Double): Self = StObject.set(x, "retryDelayOnMoved", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayOnMovedUndefined: Self = StObject.set(x, "retryDelayOnMoved", js.undefined)
      
      inline def setRetryDelayOnTryAgain(value: Double): Self = StObject.set(x, "retryDelayOnTryAgain", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayOnTryAgainUndefined: Self = StObject.set(x, "retryDelayOnTryAgain", js.undefined)
      
      inline def setScaleReads(value: NodeRole | js.Function): Self = StObject.set(x, "scaleReads", value.asInstanceOf[js.Any])
      
      inline def setScaleReadsUndefined: Self = StObject.set(x, "scaleReads", js.undefined)
      
      inline def setScripts(value: Record[String, Lua]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setSlotsRefreshInterval(value: Double): Self = StObject.set(x, "slotsRefreshInterval", value.asInstanceOf[js.Any])
      
      inline def setSlotsRefreshIntervalUndefined: Self = StObject.set(x, "slotsRefreshInterval", js.undefined)
      
      inline def setSlotsRefreshTimeout(value: Double): Self = StObject.set(x, "slotsRefreshTimeout", value.asInstanceOf[js.Any])
      
      inline def setSlotsRefreshTimeoutUndefined: Self = StObject.set(x, "slotsRefreshTimeout", js.undefined)
      
      inline def setUseSRVRecords(value: Boolean): Self = StObject.set(x, "useSRVRecords", value.asInstanceOf[js.Any])
      
      inline def setUseSRVRecordsUndefined: Self = StObject.set(x, "useSRVRecords", js.undefined)
    }
  }
  
  type DNSLookupFunction = js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function3[
      /* err */ js.UndefOr[ErrnoException | Null], 
      /* address */ String, 
      /* family */ js.UndefOr[Double], 
      Unit
    ], 
    Unit
  ]
  
  type DNSResolveSrvFunction = js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[ErrnoException | Null], 
      /* records */ js.UndefOr[js.Array[SrvRecord]], 
      Unit
    ], 
    Unit
  ]
  
  type NatMap = StringDictionary[Host]
}
