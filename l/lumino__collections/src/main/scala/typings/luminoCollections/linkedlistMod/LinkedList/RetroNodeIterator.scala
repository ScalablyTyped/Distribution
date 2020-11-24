package typings.luminoCollections.linkedlistMod.LinkedList

import typings.luminoAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reverse iterator for nodes in a linked list.
  */
@JSImport("@lumino/collections/types/linkedlist", "LinkedList.RetroNodeIterator")
@js.native
/**
  * Construct a retro node iterator.
  *
  * @param node - The last node in the list.
  */
class RetroNodeIterator[T] () extends IIterator[INode[T]] {
  def this(node: INode[T]) = this()
  
  var _node: js.Any = js.native
}
