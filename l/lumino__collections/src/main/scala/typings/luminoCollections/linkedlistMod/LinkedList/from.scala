package typings.luminoCollections.linkedlistMod.LinkedList

import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/collections/types/linkedlist", "LinkedList.from")
@js.native
object from extends js.Object {
  /**
    * Create a linked list from an iterable of values.
    *
    * @param values - The iterable or array-like object of interest.
    *
    * @returns A new linked list initialized with the given values.
    *
    * #### Complexity
    * Linear.
    */
  def apply[T](values: IterableOrArrayLike[T]): typings.luminoCollections.linkedlistMod.LinkedList[T] = js.native
}

