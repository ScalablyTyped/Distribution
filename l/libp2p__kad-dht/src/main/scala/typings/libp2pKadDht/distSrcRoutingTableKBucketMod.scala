package typings.libp2pKadDht

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRoutingTableKBucketMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/routing-table/k-bucket", "KBucket")
  @js.native
  open class KBucket protected () extends EventEmitter[KBucketEvents] {
    def this(options: KBucketOptions) = this()
    
    /**
      * Determines whether the id at the bitIndex is 0 or 1.
      * Return left leaf if `id` at `bitIndex` is 0, right leaf otherwise
      *
      * @param {object} node - internal object that has 2 leafs: left and right
      * @param {Uint8Array} id - Id to compare localNodeId with.
      * @param {number} bitIndex - Integer (Default: 0) The bit index to which bit to check in the id Uint8Array.
      * @returns {object} left leaf if id at bitIndex is 0, right leaf otherwise.
      */
    def _determineNode(node: Any, id: js.typedarray.Uint8Array, bitIndex: Double): Bucket = js.native
    
    /**
      * Returns the index of the contact with provided
      * id if it exists, returns -1 otherwise.
      *
      * @param {object} node - internal object that has 2 leafs: left and right
      * @param {Uint8Array} id - Contact node id.
      * @returns {number} Integer Index of contact with provided id if it exists, -1 otherwise.
      */
    def _indexOf(node: Bucket, id: js.typedarray.Uint8Array): Double = js.native
    
    /**
      * Splits the node, redistributes contacts to the new nodes, and marks the
      * node that was split as an inner node of the binary tree of nodes by
      * setting this.root.contacts = null
      *
      * @param {object} node - node for splitting
      * @param {number} bitIndex - the bitIndex to which byte to check in the Uint8Array for navigating the binary tree
      */
    def _split(node: Bucket, bitIndex: Double): Unit = js.native
    
    /**
      * Updates the contact selected by the arbiter.
      * If the selection is our old contact and the candidate is some new contact
      * then the new contact is abandoned (not added).
      * If the selection is our old contact and the candidate is our old contact
      * then we are refreshing the contact and it is marked as most recently
      * contacted (by being moved to the right/end of the bucket array).
      * If the selection is our new contact, the old contact is removed and the new
      * contact is marked as most recently contacted.
      *
      * @param {object} node - internal object that has 2 leafs: left and right
      * @param {number} index - the index in the bucket where contact exists (index has already been computed in a previous calculation)
      * @param {object} contact - The contact object to update
      */
    def _update(node: Bucket, index: Double, contact: Contact): Unit = js.native
    
    /**
      * Adds a contact to the k-bucket.
      *
      * @param {object} contact - the contact object to add
      */
    def add(contact: Contact): KBucket = js.native
    
    /* private */ val arbiter: Any = js.native
    
    /**
      * Get the n closest contacts to the provided node id. "Closest" here means:
      * closest according to the XOR metric of the contact node id.
      *
      * @param {Uint8Array} id - Contact node id
      * @param {number} n - Integer (Default: Infinity) The maximum number of closest contacts to return
      * @returns {Array} Array Maximum of n closest contacts to the node id
      */
    def closest(id: js.typedarray.Uint8Array): js.Array[Contact] = js.native
    def closest(id: js.typedarray.Uint8Array, n: Double): js.Array[Contact] = js.native
    
    /**
      * Counts the total number of contacts in the tree.
      *
      * @returns {number} The number of contacts held in the tree
      */
    def count(): Double = js.native
    
    /* private */ val distance: Any = js.native
    
    /**
      * Get a contact by its exact ID.
      * If this is a leaf, loop through the bucket contents and return the correct
      * contact if we have it or null if not. If this is an inner node, determine
      * which branch of the tree to traverse and repeat.
      *
      * @param {Uint8Array} id - The ID of the contact to fetch.
      * @returns {object | null} The contact if available, otherwise null
      */
    def get(id: js.typedarray.Uint8Array): js.UndefOr[Contact] = js.native
    
    var localNodeId: js.typedarray.Uint8Array = js.native
    
    /* private */ val numberOfNodesPerKBucket: Any = js.native
    
    /* private */ val numberOfNodesToPing: Any = js.native
    
    /**
      * Removes contact with the provided id.
      *
      * @param {Uint8Array} id - The ID of the contact to remove
      * @returns {object} The k-bucket itself
      */
    def remove(id: js.typedarray.Uint8Array): KBucket = js.native
    
    var root: Bucket = js.native
    
    /**
      * Returns all the contacts contained in the tree as an array.
      * If this is a leaf, return a copy of the bucket. If this is not a leaf,
      * return the union of the low and high branches (themselves also as arrays).
      *
      * @returns {Array} All of the contacts in the tree, as an array
      */
    def toArray(): js.Array[Contact] = js.native
    
    /**
      * Similar to `toArray()` but instead of buffering everything up into an
      * array before returning it, yields contacts as they are encountered while
      * walking the tree.
      *
      * @returns {Iterable} All of the contacts in the tree, as an iterable
      */
    def toIterable(): js.Iterable[Contact] = js.native
  }
  /* static members */
  object KBucket {
    
    @JSImport("@libp2p/kad-dht/dist/src/routing-table/k-bucket", "KBucket")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default arbiter function for contacts with the same id. Uses
      * contact.vectorClock to select which contact to update the k-bucket with.
      * Contact with larger vectorClock field will be selected. If vectorClock is
      * the same, candidate will be selected.
      *
      * @param {object} incumbent - Contact currently stored in the k-bucket.
      * @param {object} candidate - Contact being added to the k-bucket.
      * @returns {object} Contact to updated the k-bucket with.
      */
    inline def arbiter(incumbent: Contact, candidate: Contact): Contact = (^.asInstanceOf[js.Dynamic].applyDynamic("arbiter")(incumbent.asInstanceOf[js.Any], candidate.asInstanceOf[js.Any])).asInstanceOf[Contact]
    
    /**
      * Default distance function. Finds the XOR
      * distance between firstId and secondId.
      *
      * @param  {Uint8Array} firstId -  Uint8Array containing first id.
      * @param  {Uint8Array} secondId -  Uint8Array containing second id.
      * @returns {number} Integer The XOR distance between firstId and secondId.
      */
    inline def distance(firstId: js.typedarray.Uint8Array, secondId: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(firstId.asInstanceOf[js.Any], secondId.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  trait Bucket extends StObject {
    
    var contacts: js.Array[Contact]
    
    var dontSplit: Boolean
    
    var id: js.typedarray.Uint8Array
    
    var left: Bucket
    
    var right: Bucket
  }
  object Bucket {
    
    inline def apply(
      contacts: js.Array[Contact],
      dontSplit: Boolean,
      id: js.typedarray.Uint8Array,
      left: Bucket,
      right: Bucket
    ): Bucket = {
      val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], dontSplit = dontSplit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bucket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
      
      inline def setContacts(value: js.Array[Contact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
      
      inline def setContactsVarargs(value: Contact*): Self = StObject.set(x, "contacts", js.Array(value*))
      
      inline def setDontSplit(value: Boolean): Self = StObject.set(x, "dontSplit", value.asInstanceOf[js.Any])
      
      inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Bucket): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Bucket): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait Contact extends StObject {
    
    var id: js.typedarray.Uint8Array
    
    var peer: PeerId
    
    var vectorClock: js.UndefOr[Double] = js.undefined
  }
  object Contact {
    
    inline def apply(id: js.typedarray.Uint8Array, peer: PeerId): Contact = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contact]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
      
      inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setVectorClock(value: Double): Self = StObject.set(x, "vectorClock", value.asInstanceOf[js.Any])
      
      inline def setVectorClockUndefined: Self = StObject.set(x, "vectorClock", js.undefined)
    }
  }
  
  trait KBucketEvents extends StObject {
    
    var added: CustomEvent[Contact]
    
    var ping: CustomEvent[PingEventDetails]
    
    var removed: CustomEvent[Contact]
    
    var updated: CustomEvent[UpdatedEventDetails]
  }
  object KBucketEvents {
    
    inline def apply(
      added: CustomEvent[Contact],
      ping: CustomEvent[PingEventDetails],
      removed: CustomEvent[Contact],
      updated: CustomEvent[UpdatedEventDetails]
    ): KBucketEvents = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[KBucketEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KBucketEvents] (val x: Self) extends AnyVal {
      
      inline def setAdded(value: CustomEvent[Contact]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setPing(value: CustomEvent[PingEventDetails]): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: CustomEvent[Contact]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: CustomEvent[UpdatedEventDetails]): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait KBucketOptions extends StObject {
    
    /**
      * An optional `arbiter` function that given two `contact` objects with the
      * same `id` returns the desired object to be used for updating the k-bucket.
      * For more details, see [arbiter function](#arbiter-function).
      */
    var arbiter: js.UndefOr[js.Function2[/* incumbent */ Contact, /* candidate */ Contact, Contact]] = js.undefined
    
    /**
      * An optional `distance` function that gets two `id` Uint8Arrays and return
      * distance (as number) between them.
      */
    var distance: js.UndefOr[
        js.Function2[/* a */ js.typedarray.Uint8Array, /* b */ js.typedarray.Uint8Array, Double]
      ] = js.undefined
    
    /**
      * A Uint8Array representing the local node id
      */
    var localNodeId: js.typedarray.Uint8Array
    
    /**
      * The number of nodes that a k-bucket can contain before being full or split.
      */
    var numberOfNodesPerKBucket: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of nodes to ping when a bucket that should not be split becomes
      * full. KBucket will emit a `ping` event that contains `numberOfNodesToPing`
      * nodes that have not been contacted the longest.
      */
    var numberOfNodesToPing: js.UndefOr[Double] = js.undefined
  }
  object KBucketOptions {
    
    inline def apply(localNodeId: js.typedarray.Uint8Array): KBucketOptions = {
      val __obj = js.Dynamic.literal(localNodeId = localNodeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[KBucketOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KBucketOptions] (val x: Self) extends AnyVal {
      
      inline def setArbiter(value: (/* incumbent */ Contact, /* candidate */ Contact) => Contact): Self = StObject.set(x, "arbiter", js.Any.fromFunction2(value))
      
      inline def setArbiterUndefined: Self = StObject.set(x, "arbiter", js.undefined)
      
      inline def setDistance(value: (/* a */ js.typedarray.Uint8Array, /* b */ js.typedarray.Uint8Array) => Double): Self = StObject.set(x, "distance", js.Any.fromFunction2(value))
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setLocalNodeId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "localNodeId", value.asInstanceOf[js.Any])
      
      inline def setNumberOfNodesPerKBucket(value: Double): Self = StObject.set(x, "numberOfNodesPerKBucket", value.asInstanceOf[js.Any])
      
      inline def setNumberOfNodesPerKBucketUndefined: Self = StObject.set(x, "numberOfNodesPerKBucket", js.undefined)
      
      inline def setNumberOfNodesToPing(value: Double): Self = StObject.set(x, "numberOfNodesToPing", value.asInstanceOf[js.Any])
      
      inline def setNumberOfNodesToPingUndefined: Self = StObject.set(x, "numberOfNodesToPing", js.undefined)
    }
  }
  
  trait PingEventDetails extends StObject {
    
    var newContact: Contact
    
    var oldContacts: js.Array[Contact]
  }
  object PingEventDetails {
    
    inline def apply(newContact: Contact, oldContacts: js.Array[Contact]): PingEventDetails = {
      val __obj = js.Dynamic.literal(newContact = newContact.asInstanceOf[js.Any], oldContacts = oldContacts.asInstanceOf[js.Any])
      __obj.asInstanceOf[PingEventDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PingEventDetails] (val x: Self) extends AnyVal {
      
      inline def setNewContact(value: Contact): Self = StObject.set(x, "newContact", value.asInstanceOf[js.Any])
      
      inline def setOldContacts(value: js.Array[Contact]): Self = StObject.set(x, "oldContacts", value.asInstanceOf[js.Any])
      
      inline def setOldContactsVarargs(value: Contact*): Self = StObject.set(x, "oldContacts", js.Array(value*))
    }
  }
  
  trait UpdatedEventDetails extends StObject {
    
    var incumbent: Contact
    
    var selection: Contact
  }
  object UpdatedEventDetails {
    
    inline def apply(incumbent: Contact, selection: Contact): UpdatedEventDetails = {
      val __obj = js.Dynamic.literal(incumbent = incumbent.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatedEventDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdatedEventDetails] (val x: Self) extends AnyVal {
      
      inline def setIncumbent(value: Contact): Self = StObject.set(x, "incumbent", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: Contact): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
}
