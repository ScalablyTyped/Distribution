package typings.luminoCollections.linkedlistMod.LinkedList

import typings.luminoAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reverse iterator for nodes in a linked list.
  */
@JSImport("@lumino/collections/lib/linkedlist", "LinkedList.RetroNodeIterator")
@js.native
class RetroNodeIterator[T] () extends IIterator[INode[T]] {
  /**
    * Construct a retro node iterator.
    *
    * @param node - The last node in the list.
    */
  def this(node: INode[T]) = this()
  var _node: js.Any = js.native
  /**
    * Get an iterator over the object's values.
    *
    * @returns An iterator which yields the object's values.
    *
    * #### Notes
    * Depending on the iterable, the returned iterator may or may not be
    * a new object. A collection or other container-like object should
    * typically return a new iterator, while an iterator itself should
    * normally return `this`.
    */
  /* CompleteClass */
  override def iter(): IIterator[INode[T]] = js.native
  /**
    * Get the next value from the iterator.
    *
    * @returns The next value from the iterator, or `undefined`.
    *
    * #### Notes
    * The `undefined` value is used to signal the end of iteration and
    * should therefore not be used as a value in a collection.
    *
    * The use of the `undefined` sentinel is an explicit design choice
    * which favors performance over purity. The ES6 iterator design of
    * returning a `{ value, done }` pair is suboptimal, as it requires
    * an object allocation on each iteration; and an `isDone()` method
    * would increase implementation and runtime complexity.
    */
  /* CompleteClass */
  override def next(): js.UndefOr[INode[T]] = js.native
}

