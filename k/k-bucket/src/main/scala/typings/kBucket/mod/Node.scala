package typings.kBucket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node[T /* <: Contact */] extends js.Object {
  var contacts: js.Array[T] = js.native
  var dontSplit: Boolean = js.native
  var left: T = js.native
  var right: T = js.native
}

object Node {
  @scala.inline
  def apply[/* <: typings.kBucket.mod.Contact */ T](contacts: js.Array[T], dontSplit: Boolean, left: T, right: T): Node[T] = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], dontSplit = dontSplit.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[T]]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node[_], /* <: typings.kBucket.mod.Contact */ T] (val x: Self with Node[T]) extends AnyVal {
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
    def setContactsVarargs(value: T*): Self = this.set("contacts", js.Array(value :_*))
    @scala.inline
    def setContacts(value: js.Array[T]): Self = this.set("contacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setDontSplit(value: Boolean): Self = this.set("dontSplit", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: T): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: T): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}

