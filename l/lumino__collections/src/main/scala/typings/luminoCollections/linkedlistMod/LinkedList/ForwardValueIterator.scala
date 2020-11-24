package typings.luminoCollections.linkedlistMod.LinkedList

import typings.luminoAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A forward iterator for values in a linked list.
  */
@JSImport("@lumino/collections/types/linkedlist", "LinkedList.ForwardValueIterator")
@js.native
/**
  * Construct a forward value iterator.
  *
  * @param node - The first node in the list.
  */
class ForwardValueIterator[T] () extends IIterator[T] {
  def this(node: INode[T]) = this()
  
  var _node: js.Any = js.native
}
