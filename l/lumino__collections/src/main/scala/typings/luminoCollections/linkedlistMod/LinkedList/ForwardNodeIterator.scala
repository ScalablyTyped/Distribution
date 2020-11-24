package typings.luminoCollections.linkedlistMod.LinkedList

import typings.luminoAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A forward iterator for nodes in a linked list.
  */
@JSImport("@lumino/collections/types/linkedlist", "LinkedList.ForwardNodeIterator")
@js.native
/**
  * Construct a forward node iterator.
  *
  * @param node - The first node in the list.
  */
class ForwardNodeIterator[T] () extends IIterator[INode[T]] {
  def this(node: INode[T]) = this()
  
  var _node: js.Any = js.native
}
