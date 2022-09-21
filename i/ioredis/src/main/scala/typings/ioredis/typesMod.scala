package typings.ioredis

import typings.ioredis.anon.PartialSentinelAddress
import typings.ioredis.ioredisStrings.`get-master-addr-by-name`
import typings.ioredis.ioredisStrings.error_
import typings.ioredis.ioredisStrings.message
import typings.ioredis.ioredisStrings.reconnecting
import typings.ioredis.ioredisStrings.sentinels
import typings.ioredis.ioredisStrings.slaves_
import typings.ioredis.redisOptionsMod.RedisOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait RedisClient extends StObject {
    
    def disconnect(): Unit = js.native
    
    @JSName("on")
    def on_error(event: error_, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    @JSName("on")
    def on_message(event: message, callback: js.Function2[/* channel */ String, /* message */ String, Unit]): Unit = js.native
    @JSName("on")
    def on_reconnecting(event: reconnecting, callback: js.Function0[Unit]): Unit = js.native
    
    var options: RedisOptions = js.native
    
    @JSName("sentinel")
    def sentinel_getmasteraddrbyname(subcommand: `get-master-addr-by-name`, name: String): js.Promise[js.Array[String]] = js.native
    @JSName("sentinel")
    def sentinel_sentinels(subcommand: sentinels, name: String): js.Promise[js.Array[String]] = js.native
    @JSName("sentinel")
    def sentinel_slaves(subcommand: slaves_, name: String): js.Promise[js.Array[String]] = js.native
    
    def subscribe(channelNames: String*): js.Promise[Double] = js.native
  }
  
  trait Sentinel extends StObject {
    
    var address: PartialSentinelAddress
    
    var client: RedisClient
  }
  object Sentinel {
    
    inline def apply(address: PartialSentinelAddress, client: RedisClient): Sentinel = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sentinel]
    }
    
    extension [Self <: Sentinel](x: Self) {
      
      inline def setAddress(value: PartialSentinelAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setClient(value: RedisClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentinelAddress extends StObject {
    
    var family: js.UndefOr[Double] = js.undefined
    
    var host: String
    
    var port: Double
  }
  object SentinelAddress {
    
    inline def apply(host: String, port: Double): SentinelAddress = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentinelAddress]
    }
    
    extension [Self <: SentinelAddress](x: Self) {
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
