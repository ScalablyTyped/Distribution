package typings.hashring

import typings.hashring.anon.PartialHashRingOptions
import typings.hashring.anon.PartialServerConfig
import typings.hashring.hashringStrings.hash_ring
import typings.hashring.hashringStrings.ketama
import typings.node.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hashring", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with HashRing {
    def this(servers: Servers) = this()
    def this(servers: Servers, algorithm: String) = this()
    def this(servers: Servers, algorithm: js.Function1[/* key */ String, String | Buffer]) = this()
    def this(servers: Servers, algorithm: String, options: PartialHashRingOptions) = this()
    def this(
      servers: Servers,
      algorithm: js.Function1[/* key */ String, String | Buffer],
      options: PartialHashRingOptions
    ) = this()
    def this(servers: Servers, algorithm: Unit, options: PartialHashRingOptions) = this()
  }
  
  @js.native
  trait HashRing extends StObject {
    
    /**
      * Add a new server to ring without having to re-initialize the hashring.
      * It accepts the same arguments as you can use in the constructor.
      * @param servers Servers that need to be added to the ring.
      */
    def add(servers: Servers): this.type = js.native
    
    /**
      * Generates the continuum of server a.k.a as the Hash Ring
      * based on their weights and virtual nodes assigned.
      */
    def continuum(): this.type = js.native
    
    /**
      * Resets the HashRing and closes the ring.
      */
    def end(): this.type = js.native
    
    /**
      * Find the correct node for which the key is closest to the point
      * after what the given key hashes to.
      * @param key Random key that needs to be searched in the hash ring
      * @returns The matching server address
      */
    def get(key: String): String = js.native
    
    /**
      * Checks if a given server exists in the hash ring.
      * @param server Server for whose existence we're checking.
      * @returns Indication if we have that server.
      */
    def has(server: String): Boolean = js.native
    
    /**
      * Returns the points per server.
      * @param servers server Optional server to filter down.
      * @returns server -> Array(points).
      */
    def points(servers: Servers): js.Array[Record[String, Double]] = js.native
    
    /**
      * Returns a range of servers. Could be useful for replication.
      * @param key Random key that needs to be searched in the hash ring
      * @param size Amount items to be returned (maximum).
      *        Defaults to the amount of servers that are in the hashring.
      * @param unique Don't return duplicate servers. Defaults to true.
      */
    def range(key: String): js.Array[String] = js.native
    def range(key: String, size: Double): js.Array[String] = js.native
    def range(key: String, size: Double, unique: Boolean): js.Array[String] = js.native
    def range(key: String, size: Unit, unique: Boolean): js.Array[String] = js.native
    
    /**
      * Remove a server from the hash ring.
      * @param server Server that need to be removed from the ring.
      */
    def remove(server: Servers): this.type = js.native
    
    /**
      * Reset the HashRing and clean up it's references.
      */
    def reset(): this.type = js.native
    
    /**
      * Hotswap identical servers with each other.
      * This doesn't require the cache to be completely nuked and
      * the hash ring distribution to be re-calculated.
      * @param from The server that needs to be replaced
      * @param to The server that replaces the server
      */
    def swap(from: String, to: String): this.type = js.native
  }
  
  trait HashRingOptions extends StObject {
    
    /**
      * Allows you to force a compatibility mode of the HashRing.
      * It default to ketama hash rings but if you are coming from
      * a python world you might want compatibility with the hash_ring module.
      *
      * There's a small diff between
      * `hash_ring` and `ketama` and that's the amount of replica's of a server.
      * `Ketama` uses 4 and `hash_ring` uses 3.
      *
      * Set this to `hash_ring` if you want to use 3.
      */
    var compatibility: hash_ring | ketama
    
    /**
      * The default port number which will removed from the server address
      * to provide ketama compatibility.
      */
    var `default port`: Double
    
    /**
      * We use a simple LRU cache
      * inside the module to speed up frequent key lookups,
      * you can customize the amount of keys that need to be cached.
      *
      * It defaults to 5000.
      */
    var `max cache size`: Double
    
    /**
      * The amount of replicas per server.
      * Defaults to 4.
      */
    var replicas: Double
    
    /**
      * The amount of virtual nodes per server,
      * defaults to 40 as this generates 160 points per server
      * as used by ketama hashing.
      */
    var `vnode count`: Double
  }
  object HashRingOptions {
    
    inline def apply(
      compatibility: hash_ring | ketama,
      `default port`: Double,
      `max cache size`: Double,
      replicas: Double,
      `vnode count`: Double
    ): HashRingOptions = {
      val __obj = js.Dynamic.literal(compatibility = compatibility.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
      __obj.updateDynamic("default port")((`default port`).asInstanceOf[js.Any])
      __obj.updateDynamic("max cache size")((`max cache size`).asInstanceOf[js.Any])
      __obj.updateDynamic("vnode count")((`vnode count`).asInstanceOf[js.Any])
      __obj.asInstanceOf[HashRingOptions]
    }
    
    extension [Self <: HashRingOptions](x: Self) {
      
      inline def setCompatibility(value: hash_ring | ketama): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
      
      inline def `setDefault port`(value: Double): Self = StObject.set(x, "default port", value.asInstanceOf[js.Any])
      
      inline def `setMax cache size`(value: Double): Self = StObject.set(x, "max cache size", value.asInstanceOf[js.Any])
      
      inline def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      inline def `setVnode count`(value: Double): Self = StObject.set(x, "vnode count", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerConfig extends StObject {
    
    var vnodes: Double
    
    var weight: Double
  }
  object ServerConfig {
    
    inline def apply(vnodes: Double, weight: Double): ServerConfig = {
      val __obj = js.Dynamic.literal(vnodes = vnodes.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerConfig]
    }
    
    extension [Self <: ServerConfig](x: Self) {
      
      inline def setVnodes(value: Double): Self = StObject.set(x, "vnodes", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  type Servers = String | js.Array[String] | (Record[String, PartialServerConfig])
}
