package typings.luminoCollections.linkedlistMod.LinkedList

import typings.luminoAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reverse iterator for values in a linked list.
  */
@JSImport("@lumino/collections/types/linkedlist", "LinkedList.RetroValueIterator")
@js.native
/**
  * Construct a retro value iterator.
  *
  * @param node - The last node in the list.
  */
class RetroValueIterator[T] () extends IIterator[T] {
  def this(node: INode[T]) = this()
  
  var _node: js.Any = js.native
}
