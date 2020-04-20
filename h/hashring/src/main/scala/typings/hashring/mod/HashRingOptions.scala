package typings.hashring.mod

import typings.hashring.hashringStrings.hash_ring
import typings.hashring.hashringStrings.ketama
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

