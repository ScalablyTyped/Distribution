package typings.luminoCollections

import typings.luminoAlgorithm.iterMod.IIterable
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import typings.luminoAlgorithm.retroMod.IRetroable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/collections/types/bplustree", JSImport.Namespace)
@js.native
object bplustreeMod extends js.Object {
  @js.native
  class BPlusTree[T] protected ()
    extends IIterable[T]
       with IRetroable[T] {
    /**
      * Construct a new B+ tree.
      *
      * @param cmp - The item comparison function for the tree.
      */
    def this(cmp: js.Function2[/* a */ T, /* b */ T, Double]) = this()
    var _root: js.Any = js.native
    /**
      * The first item in the tree.
      *
      * This is `undefined` if the tree is empty.
      *
      * #### Complexity
      * `O(log32 n)`
      */
    val first: js.UndefOr[T] = js.native
    /**
      * Whether the tree is empty.
      *
      * #### Complexity
      * `O(1)`
      */
    val isEmpty: Boolean = js.native
    /**
      * The last item in the tree.
      *
      * This is `undefined` if the tree is empty.
      *
      * #### Complexity
      * `O(log32 n)`
      */
    val last: js.UndefOr[T] = js.native
    /**
      * The size of the tree.
      *
      * #### Complexity
      * `O(1)`
      */
    val size: Double = js.native
    /**
      * Assign new items to the tree, replacing all current items.
      *
      * @param items - The items to assign to the tree.
      *
      * #### Complexity
      * `O(n log32 n)`
      */
    def assign(items: IterableOrArrayLike[T]): Unit = js.native
    /**
      * Get the item at a particular index.
      *
      * @param index - The index of the item of interest. Negative
      *   values are taken as an offset from the end of the tree.
      *
      * @returns The item at the specified index, or `undefined` if
      *   the index is out of range.
      *
      * #### Complexity
      * `O(log32 n)`
      */
    def at(index: Double): js.UndefOr[T] = js.native
    /**
      * Clear the contents of the tree.
      *
      * #### Complexity
      * `O(n)`
      */
    def clear(): Unit = js.native
    /**
      * The item comparison function for the tree.
      *
      * #### Complexity
      * `O(1)`
      */
    def cmp(a: T, b: T): Double = js.native
    /**
      * Delete an item which matches a particular key.
      *
      * @param key - The key of interest.
      *
      * @param cmp - A function which compares an item against the key.
      *
      * @returns The item removed from the tree, or `undefined` if no
      *   item matched the given key.
      *
      * #### Complexity
      * `O(log32 n)`
      */
    def delete[U](key: U, cmp: js.Function2[/* item */ T, /* key */ U, Double]): js.UndefOr[T] = js.native
    /**
      * Get the item which matches a key.
      *
      * @param item - The key of interest.
      *
      * @param cmp - A function which compares an item against the key.
      *
      * @returns The item which matches the given key, or `undefined` if
      *   the tree does not have a matching item.
      *
      * #### Complexity
      * `O(log32 n)`
      */
    def get[U](key: U, cmp: js.Function2[/* item */ T, /* key */ U, Double]): js.UndefOr[T] = js.native
    /**
      * Test whether the tree has an item which matches a key.
      *
      * @param key - The key of interest.
      *
      * @param cmp - A function which compares an item against the key.
      *
      * @returns `true` if the tree has an item which matches the given
      *   key, `false` otherwise.
      *
      * #### Complexity
      * `O(log32 n)`
      */
    def has[U](key: U, cmp: js.Function2[/* item */ T, /* key */ U, Double]): Boolean = js.native
    /**
      * Get the index of an item which matches a key.
      *
      * @param key - The key of interest.
      *
      * @param cmp - A function which compares an item against the key.
      *
      * @returns The index of the item which matches the given key. A
      *   negative value means that a matching item does not exist in
      *   the tree, but if one did it would reside at `-index - 1`.
      *
      * #### Complexity
      * `O(log32 n)`
      */
    def indexOf[U](key: U, cmp: js.Function2[/* item */ T, /* key */ U, Double]): Double = js.native
    /**
      * Insert an item into the tree.
      *
      * @param item - The item of interest.
      *
      * @returns If the given item matches an existing item in the tree,
      *   the given item will replace it, and the existing item will be
      *   returned. Otherwise, this method returns `undefined`.
      *
      * #### Complexity
      * `O(log32 n)`
      */
    def insert(item: T): js.UndefOr[T] = js.native
    /**
      * Remove an item at a particular index.
      *
      * @param index - The index of the item to remove. Negative
      *   values are taken as an offset from the end of the tree.
      *
      * @returns The item removed from the tree, or `undefined` if
      *   the given index is out of range.
      *
      * #### Complexity
      * `O(log32 n)`
      */
    def remove(index: Double): js.UndefOr[T] = js.native
    /**
      * Create a reverse iterator for a slice of items in the tree.
      *
      * @param start - The index of the first item, inclusive. This
      *   should be `> stop`. Negative values are taken as an offset
      *   from the end of the tree. The default is `size - 1`.
      *
      * @param stop - The index of the last item, exclusive. This
      *   should be `< start`. Negative values are taken as an offset
      *   from the end of the tree. The default is `-size - 1`.
      *
      * @returns A new reverse iterator starting with the specified item.
      *
      * #### Complexity
      * `O(log32 n)`
      */
    def retroSlice(): IIterator[T] = js.native
    def retroSlice(start: js.UndefOr[scala.Nothing], stop: Double): IIterator[T] = js.native
    def retroSlice(start: Double): IIterator[T] = js.native
    def retroSlice(start: Double, stop: Double): IIterator[T] = js.native
    /**
      * Create an iterator for a slice of items in the tree.
      *
      * @param start - The index of the first item, inclusive. This
      *   should be `< stop`. Negative values are taken as an offset
      *   from the end of the tree. The default is `0`.
      *
      * @param stop - The index of the last item, exclusive. This
      *   should be `> start`. Negative values are taken as an offset
      *   from the end of the tree. The default is `size`.
      *
      * @returns A new iterator starting with the specified item.
      *
      * #### Complexity
      * `O(log32 n)`
      */
    def slice(): IIterator[T] = js.native
    def slice(start: js.UndefOr[scala.Nothing], stop: Double): IIterator[T] = js.native
    def slice(start: Double): IIterator[T] = js.native
    def slice(start: Double, stop: Double): IIterator[T] = js.native
    /**
      * Update the tree with multiple items.
      *
      * @param items - The items to insert into the tree.
      *
      * #### Complexity
      * `O(k log32 n)`
      */
    def update(items: IterableOrArrayLike[T]): Unit = js.native
  }
  
  @js.native
  object BPlusTree extends js.Object {
    /**
      * Create a new B+ tree populated with the given items.
      *
      * @param items - The items to add to the tree.
      *
      * @param cmp - The item comparison function for the tree.
      *
      * @returns A new B+ tree populated with the given items.
      *
      * #### Complexity
      * `O(n log32 n)`
      */
    def from[T](items: IterableOrArrayLike[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): BPlusTree[T] = js.native
  }
  
}

