package typings.kBucket.mod

import typings.kBucket.kBucketStrings.added
import typings.kBucket.kBucketStrings.ping
import typings.kBucket.kBucketStrings.removed
import typings.kBucket.kBucketStrings.updated
import typings.node.eventsMod.EventEmitter
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KBucket[T /* <: Contact */] extends EventEmitter {
  
  /**
    * Adds a contact to the k-bucket.
    *
    * @param contact the contact object to add
    */
  def add(contact: T): KBucket[T] = js.native
  
  def arbiter(incumbent: T, candidate: T): T = js.native
  @JSName("arbiter")
  var arbiter_Original: Arbiter[T] = js.native
  
  /**
    * Get the n closest contacts to the provided node id. "Closest" here means:
    * closest according to the XOR metric of the contact node id.
    *
    * @param id Contact node id
    * @param n Integer (Default: Infinity) The maximum number of closest contacts to return
    * @return Array Maximum of n closest contacts to the node id
    */
  def closest(id: Uint8Array): js.Array[T] = js.native
  def closest(id: Uint8Array, n: Double): js.Array[T] = js.native
  
  /**
    * Counts the total number of contacts in the tree.
    *
    * @return The number of contacts held in the tree
    */
  def count(): Double = js.native
  
  def distance(firstId: Uint8Array, secondId: Uint8Array): Double = js.native
  @JSName("distance")
  var distance_Original: Distance = js.native
  
  /**
    * Get a contact by its exact ID.
    * If this is a leaf, loop through the bucket contents and return the correct
    * contact if we have it or null if not. If this is an inner node, determine
    * which branch of the tree to traverse and repeat.
    *
    * @param id The ID of the contact to fetch.
    * @return The contact if available, otherwise null
    */
  def get(id: Uint8Array): T | Null = js.native
  
  var localNodeId: Uint8Array = js.native
  
  var metadata: js.Any = js.native
  
  var numberOfNodesPerKBucket: Double = js.native
  
  var numberOfNodesToPing: Double = js.native
  
  @JSName("on")
  def on_added(`type`: added, listener: js.Function1[/* peer */ T, Unit]): this.type = js.native
  @JSName("on")
  def on_ping(`type`: ping, listener: js.Function2[/* peers */ js.Array[T], /* peer */ T, Unit]): this.type = js.native
  @JSName("on")
  def on_removed(`type`: removed, listener: js.Function1[/* peer */ T, Unit]): this.type = js.native
  @JSName("on")
  def on_updated(`type`: updated, listener: js.Function2[/* incumbent */ T, /* selection */ T, Unit]): this.type = js.native
  
  /**
    * Removes contact with the provided id.
    *
    * @param id The ID of the contact to remove.
    * @return The k-bucket itself.
    */
  def remove(id: Uint8Array): KBucket[T] = js.native
  
  var root: Node[T] = js.native
  
  /**
    * Returns all the contacts contained in the tree as an array.
    * If this is a leaf, return a copy of the bucket. `slice` is used so that we
    * don't accidentally leak an internal reference out that might be
    * accidentally misused. If this is not a leaf, return the union of the low
    * and high branches (themselves also as arrays).
    *
    * @return All of the contacts in the tree, as an array
    */
  def toArray(): js.Array[T] = js.native
}
