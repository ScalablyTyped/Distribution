package typings.luminoCollections.linkedlistMod.LinkedList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents a node in a linked list.
  *
  * #### Notes
  * User code will not create linked list nodes directly. Nodes
  * are created automatically when values are added to a list.
  */
@js.native
trait INode[T] extends js.Object {
  /**
    * The linked list which created and owns the node.
    *
    * This will be `null` when the node is removed from the list.
    */
  val list: typings.luminoCollections.linkedlistMod.LinkedList[T] | Null = js.native
  /**
    * The next node in the list.
    *
    * This will be `null` when the node is the last node in the list
    * or when the node is removed from the list.
    */
  val next: INode[T] | Null = js.native
  /**
    * The previous node in the list.
    *
    * This will be `null` when the node is the first node in the list
    * or when the node is removed from the list.
    */
  val prev: INode[T] | Null = js.native
  /**
    * The user value stored in the node.
    */
  val value: T = js.native
}

object INode {
  @scala.inline
  def apply[T](value: T): INode[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INode[T]]
  }
  @scala.inline
  implicit class INodeOps[Self <: INode[_], T] (val x: Self with INode[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: typings.luminoCollections.linkedlistMod.LinkedList[T]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setListNull: Self = this.set("list", null)
    @scala.inline
    def setNext(value: INode[T]): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    @scala.inline
    def setPrev(value: INode[T]): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevNull: Self = this.set("prev", null)
  }
  
}

