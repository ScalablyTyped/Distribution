package typings.ioredis

import typings.ioredis.anon.Ip
import typings.ioredis.anon.PartialSentinelAddress
import typings.ioredis.anon.Role
import typings.ioredis.clusterOptionsMod.NatMap
import typings.ioredis.ioredisStrings.master_
import typings.ioredis.ioredisStrings.slave
import typings.node.eventsMod.EventEmitter
import typings.node.tlsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sentinelConnectorMod {
  
  @JSImport("ioredis/built/connectors/SentinelConnector", JSImport.Default)
  @js.native
  open class default protected () extends SentinelConnector {
    def this(options: SentinelConnectionOptions) = this()
  }
  
  @JSImport("ioredis/built/connectors/SentinelConnector", "SentinelIterator")
  @js.native
  open class SentinelIterator protected ()
    extends typings.ioredis.sentinelIteratorMod.default {
    def this(sentinels: js.Array[PartialSentinelAddress]) = this()
  }
  
  trait AddressFromResponse extends StObject {
    
    var flags: js.UndefOr[String] = js.undefined
    
    var ip: String
    
    var port: String
  }
  object AddressFromResponse {
    
    inline def apply(ip: String, port: String): AddressFromResponse = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressFromResponse]
    }
    
    extension [Self <: AddressFromResponse](x: Self) {
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  type PreferredSlaves = (js.Function1[/* slaves */ js.Array[AddressFromResponse], AddressFromResponse | Null]) | js.Array[Ip] | Ip
  
  trait SentinelConnectionOptions extends StObject {
    
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    var disconnectTimeout: js.UndefOr[Double] = js.undefined
    
    var enableTLSForSentinelMode: js.UndefOr[Boolean] = js.undefined
    
    var failoverDetector: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Master group name of the Sentinel
      */
    var name: js.UndefOr[String] = js.undefined
    
    var natMap: js.UndefOr[NatMap] = js.undefined
    
    var preferredSlaves: js.UndefOr[PreferredSlaves] = js.undefined
    
    /**
      * @default "master"
      */
    var role: js.UndefOr[master_ | slave] = js.undefined
    
    var sentinelCommandTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 10
      */
    var sentinelMaxConnections: js.UndefOr[Double] = js.undefined
    
    var sentinelPassword: js.UndefOr[String] = js.undefined
    
    var sentinelReconnectStrategy: js.UndefOr[js.Function1[/* retryAttempts */ Double, Double | Unit | Null]] = js.undefined
    
    var sentinelRetryStrategy: js.UndefOr[js.Function1[/* retryAttempts */ Double, Double | Unit | Null]] = js.undefined
    
    var sentinelTLS: js.UndefOr[ConnectionOptions] = js.undefined
    
    var sentinelUsername: js.UndefOr[String] = js.undefined
    
    var sentinels: js.UndefOr[js.Array[PartialSentinelAddress]] = js.undefined
    
    var tls: js.UndefOr[ConnectionOptions] = js.undefined
    
    var updateSentinels: js.UndefOr[Boolean] = js.undefined
  }
  object SentinelConnectionOptions {
    
    inline def apply(): SentinelConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SentinelConnectionOptions]
    }
    
    extension [Self <: SentinelConnectionOptions](x: Self) {
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setDisconnectTimeout(value: Double): Self = StObject.set(x, "disconnectTimeout", value.asInstanceOf[js.Any])
      
      inline def setDisconnectTimeoutUndefined: Self = StObject.set(x, "disconnectTimeout", js.undefined)
      
      inline def setEnableTLSForSentinelMode(value: Boolean): Self = StObject.set(x, "enableTLSForSentinelMode", value.asInstanceOf[js.Any])
      
      inline def setEnableTLSForSentinelModeUndefined: Self = StObject.set(x, "enableTLSForSentinelMode", js.undefined)
      
      inline def setFailoverDetector(value: Boolean): Self = StObject.set(x, "failoverDetector", value.asInstanceOf[js.Any])
      
      inline def setFailoverDetectorUndefined: Self = StObject.set(x, "failoverDetector", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNatMap(value: NatMap): Self = StObject.set(x, "natMap", value.asInstanceOf[js.Any])
      
      inline def setNatMapUndefined: Self = StObject.set(x, "natMap", js.undefined)
      
      inline def setPreferredSlaves(value: PreferredSlaves): Self = StObject.set(x, "preferredSlaves", value.asInstanceOf[js.Any])
      
      inline def setPreferredSlavesFunction1(value: /* slaves */ js.Array[AddressFromResponse] => AddressFromResponse | Null): Self = StObject.set(x, "preferredSlaves", js.Any.fromFunction1(value))
      
      inline def setPreferredSlavesUndefined: Self = StObject.set(x, "preferredSlaves", js.undefined)
      
      inline def setPreferredSlavesVarargs(value: Ip*): Self = StObject.set(x, "preferredSlaves", js.Array(value*))
      
      inline def setRole(value: master_ | slave): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSentinelCommandTimeout(value: Double): Self = StObject.set(x, "sentinelCommandTimeout", value.asInstanceOf[js.Any])
      
      inline def setSentinelCommandTimeoutUndefined: Self = StObject.set(x, "sentinelCommandTimeout", js.undefined)
      
      inline def setSentinelMaxConnections(value: Double): Self = StObject.set(x, "sentinelMaxConnections", value.asInstanceOf[js.Any])
      
      inline def setSentinelMaxConnectionsUndefined: Self = StObject.set(x, "sentinelMaxConnections", js.undefined)
      
      inline def setSentinelPassword(value: String): Self = StObject.set(x, "sentinelPassword", value.asInstanceOf[js.Any])
      
      inline def setSentinelPasswordUndefined: Self = StObject.set(x, "sentinelPassword", js.undefined)
      
      inline def setSentinelReconnectStrategy(value: /* retryAttempts */ Double => Double | Unit | Null): Self = StObject.set(x, "sentinelReconnectStrategy", js.Any.fromFunction1(value))
      
      inline def setSentinelReconnectStrategyUndefined: Self = StObject.set(x, "sentinelReconnectStrategy", js.undefined)
      
      inline def setSentinelRetryStrategy(value: /* retryAttempts */ Double => Double | Unit | Null): Self = StObject.set(x, "sentinelRetryStrategy", js.Any.fromFunction1(value))
      
      inline def setSentinelRetryStrategyUndefined: Self = StObject.set(x, "sentinelRetryStrategy", js.undefined)
      
      inline def setSentinelTLS(value: ConnectionOptions): Self = StObject.set(x, "sentinelTLS", value.asInstanceOf[js.Any])
      
      inline def setSentinelTLSUndefined: Self = StObject.set(x, "sentinelTLS", js.undefined)
      
      inline def setSentinelUsername(value: String): Self = StObject.set(x, "sentinelUsername", value.asInstanceOf[js.Any])
      
      inline def setSentinelUsernameUndefined: Self = StObject.set(x, "sentinelUsername", js.undefined)
      
      inline def setSentinels(value: js.Array[PartialSentinelAddress]): Self = StObject.set(x, "sentinels", value.asInstanceOf[js.Any])
      
      inline def setSentinelsUndefined: Self = StObject.set(x, "sentinels", js.undefined)
      
      inline def setSentinelsVarargs(value: PartialSentinelAddress*): Self = StObject.set(x, "sentinels", js.Array(value*))
      
      inline def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUpdateSentinels(value: Boolean): Self = StObject.set(x, "updateSentinels", value.asInstanceOf[js.Any])
      
      inline def setUpdateSentinelsUndefined: Self = StObject.set(x, "updateSentinels", js.undefined)
    }
  }
  
  @js.native
  trait SentinelConnector
    extends typings.ioredis.abstractConnectorMod.default {
    
    def check(info: Role): Boolean = js.native
    
    /* private */ var connectToSentinel: Any = js.native
    
    var emitter: EventEmitter | Null = js.native
    
    /* private */ var failoverDetector: Any = js.native
    
    /* private */ var initFailoverDetector: Any = js.native
    
    /* protected */ var options: SentinelConnectionOptions = js.native
    
    /* private */ var resolve: Any = js.native
    
    /* private */ var resolveMaster: Any = js.native
    
    /* private */ var resolveSlave: Any = js.native
    
    /* private */ var retryAttempts: Any = js.native
    
    /* protected */ var sentinelIterator: typings.ioredis.sentinelIteratorMod.default = js.native
    
    /* private */ var sentinelNatResolve: Any = js.native
    
    /* private */ var updateSentinels: Any = js.native
  }
}
