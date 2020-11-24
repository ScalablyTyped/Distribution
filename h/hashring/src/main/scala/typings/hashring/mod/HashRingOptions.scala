package typings.hashring.mod

import typings.hashring.hashringStrings.hash_ring
import typings.hashring.hashringStrings.ketama
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashRingOptions extends js.Object {
  
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
  var compatibility: hash_ring | ketama = js.native
  
  /**
    * The default port number which will removed from the server address
    * to provide ketama compatibility.
    */
  var `default port`: Double = js.native
  
  /**
    * We use a simple LRU cache
    * inside the module to speed up frequent key lookups,
    * you can customize the amount of keys that need to be cached.
    *
    * It defaults to 5000.
    */
  var `max cache size`: Double = js.native
  
  /**
    * The amount of replicas per server.
    * Defaults to 4.
    */
  var replicas: Double = js.native
  
  /**
    * The amount of virtual nodes per server,
    * defaults to 40 as this generates 160 points per server
    * as used by ketama hashing.
    */
  var `vnode count`: Double = js.native
}
object HashRingOptions {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class HashRingOptionsOps[Self <: HashRingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompatibility(value: hash_ring | ketama): Self = this.set("compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDefault port`(value: Double): Self = this.set("default port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax cache size`(value: Double): Self = this.set("max cache size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicas(value: Double): Self = this.set("replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVnode count`(value: Double): Self = this.set("vnode count", value.asInstanceOf[js.Any])
  }
}
