package typings.kBucket.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k-bucket", JSImport.Namespace)
@js.native
/**
  * `options`:
  *   `distance`: _Function_
  *     `function (firstId, secondId) { return distance }` An optional
  *     `distance` function that gets two `id` Uint8Arrays
  *     and return distance (as number) between them.
  *   `arbiter`: _Function_ _(Default: vectorClock arbiter)_
  *     `function (incumbent, candidate) { return contact; }` An optional
  *     `arbiter` function that givent two `contact` objects with the same `id`
  *     returns the desired object to be used for updating the k-bucket. For
  *     more details, see [arbiter function](#arbiter-function).
  *   `localNodeId`: _Uint8Array_ An optional Uint8Array representing the local node id.
  *     If not provided, a local node id will be created via `randomBytes(20)`.
  *     `metadata`: _Object_ _(Default: {})_ Optional satellite data to include
  *     with the k-bucket. `metadata` property is guaranteed not be altered by,
  *     it is provided as an explicit container for users of k-bucket to store
  *     implementation-specific data.
  *   `numberOfNodesPerKBucket`: _Integer_ _(Default: 20)_ The number of nodes
  *     that a k-bucket can contain before being full or split.
  *     `numberOfNodesToPing`: _Integer_ _(Default: 3)_ The number of nodes to
  *     ping when a bucket that should not be split becomes full. KBucket will
  *     emit a `ping` event that contains `numberOfNodesToPing` nodes that have
  *     not been contacted the longest.
  *
  * @param options optional
  */
class ^[T /* <: Contact */] () extends KBucket[T] {
  def this(options: typings.kBucket.anon.Arbiter[T]) = this()
}
@JSImport("k-bucket", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Default arbiter function for contacts with the same id. Uses
    * contact.vectorClock to select which contact to update the k-bucket with.
    * Contact with larger vectorClock field will be selected. If vectorClock is
    * the same, candidate will be selected.
    *
    * @param incumbent Contact currently stored in the k-bucket.
    * @param candidate Contact being added to the k-bucket.
    * @return Contact to updated the k-bucket with.
    */
  def arbiter(incumbent: Contact, candidate: Contact): Contact = js.native
  
  /**
    * Default distance function. Finds the XOR
    * distance between firstId and secondId.
    *
    * @param firstId  Uint8Array containing first id.
    * @param secondId Uint8Array containing second id.
    * @return Integer The XOR distance between firstId and secondId.
    */
  def distance(firstId: Uint8Array, secondId: Uint8Array): Double = js.native
  /**
    * Default distance function. Finds the XOR
    * distance between firstId and secondId.
    *
    * @param firstId  Uint8Array containing first id.
    * @param secondId Uint8Array containing second id.
    * @return Integer The XOR distance between firstId and secondId.
    */
  @JSName("distance")
  var distance_Original: Distance = js.native
}
