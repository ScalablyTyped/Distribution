package typings.kBucket

import typings.kBucket.anon.Arbiter
import typings.kBucket.kBucketStrings.added
import typings.kBucket.kBucketStrings.ping
import typings.kBucket.kBucketStrings.removed
import typings.kBucket.kBucketStrings.updated
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  open class ^[T /* <: Contact */] () extends KBucket[T] {
    def this(options: Arbiter[T]) = this()
  }
  @JSImport("k-bucket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  @JSImport("k-bucket", "arbiter")
  @js.native
  def arbiter: js.Function2[/* incumbent */ Contact, /* candidate */ Contact, Contact] = js.native
  inline def arbiter_=(x: js.Function2[/* incumbent */ Contact, /* candidate */ Contact, Contact]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arbiter")(x.asInstanceOf[js.Any])
  
  /**
    * Default distance function. Finds the XOR
    * distance between firstId and secondId.
    *
    * @param firstId  Uint8Array containing first id.
    * @param secondId Uint8Array containing second id.
    * @return Integer The XOR distance between firstId and secondId.
    */
  /* static member */
  @JSImport("k-bucket", "distance")
  @js.native
  def distance: Distance_ = js.native
  inline def distance_=(x: Distance_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("distance")(x.asInstanceOf[js.Any])
  
  type Arbiter_[T /* <: Contact */] = js.Function2[/* incumbent */ T, /* candidate */ T, T]
  
  trait Contact extends StObject {
    
    var id: js.typedarray.Uint8Array
    
    var vectorClock: Double
  }
  object Contact {
    
    inline def apply(id: js.typedarray.Uint8Array, vectorClock: Double): Contact = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], vectorClock = vectorClock.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contact]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
      
      inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVectorClock(value: Double): Self = StObject.set(x, "vectorClock", value.asInstanceOf[js.Any])
    }
  }
  
  type Distance_ = js.Function2[
    /* firstId */ js.typedarray.Uint8Array, 
    /* secondId */ js.typedarray.Uint8Array, 
    Double
  ]
  
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
    var arbiter_Original: Arbiter_[T] = js.native
    
    /**
      * Get the n closest contacts to the provided node id. "Closest" here means:
      * closest according to the XOR metric of the contact node id.
      *
      * @param id Contact node id
      * @param n Integer (Default: Infinity) The maximum number of closest contacts to return
      * @return Array Maximum of n closest contacts to the node id
      */
    def closest(id: js.typedarray.Uint8Array): js.Array[T] = js.native
    def closest(id: js.typedarray.Uint8Array, n: Double): js.Array[T] = js.native
    
    /**
      * Counts the total number of contacts in the tree.
      *
      * @return The number of contacts held in the tree
      */
    def count(): Double = js.native
    
    def distance(firstId: js.typedarray.Uint8Array, secondId: js.typedarray.Uint8Array): Double = js.native
    @JSName("distance")
    var distance_Original: Distance_ = js.native
    
    /**
      * Get a contact by its exact ID.
      * If this is a leaf, loop through the bucket contents and return the correct
      * contact if we have it or null if not. If this is an inner node, determine
      * which branch of the tree to traverse and repeat.
      *
      * @param id The ID of the contact to fetch.
      * @return The contact if available, otherwise null
      */
    def get(id: js.typedarray.Uint8Array): T | Null = js.native
    
    var localNodeId: js.typedarray.Uint8Array = js.native
    
    var metadata: Any = js.native
    
    var numberOfNodesPerKBucket: Double = js.native
    
    var numberOfNodesToPing: Double = js.native
    
    def on(`type`: added | removed, listener: js.Function1[/* peer */ T, Unit]): this.type = js.native
    @JSName("on")
    def on_ping(`type`: ping, listener: js.Function2[/* peers */ js.Array[T], /* peer */ T, Unit]): this.type = js.native
    @JSName("on")
    def on_updated(`type`: updated, listener: js.Function2[/* incumbent */ T, /* selection */ T, Unit]): this.type = js.native
    
    /**
      * Removes contact with the provided id.
      *
      * @param id The ID of the contact to remove.
      * @return The k-bucket itself.
      */
    def remove(id: js.typedarray.Uint8Array): KBucket[T] = js.native
    
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
  
  trait Node[T /* <: Contact */] extends StObject {
    
    var contacts: js.Array[T]
    
    var dontSplit: Boolean
    
    var left: T
    
    var right: T
  }
  object Node {
    
    inline def apply[T /* <: Contact */](contacts: js.Array[T], dontSplit: Boolean, left: T, right: T): Node[T] = {
      val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], dontSplit = dontSplit.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node[?], T /* <: Contact */] (val x: Self & Node[T]) extends AnyVal {
      
      inline def setContacts(value: js.Array[T]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
      
      inline def setContactsVarargs(value: T*): Self = StObject.set(x, "contacts", js.Array(value*))
      
      inline def setDontSplit(value: Boolean): Self = StObject.set(x, "dontSplit", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: T): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: T): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
}
