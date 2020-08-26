package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPartitionAssignmentProtocol extends js.Object {
  var name: String = js.native
  var version: Double = js.native
  def assign(
    topicPattern: js.Any,
    groupMembers: js.Any,
    cb: js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]
  ): Unit = js.native
}

object CustomPartitionAssignmentProtocol {
  @scala.inline
  def apply(
    assign: (js.Any, js.Any, js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]) => Unit,
    name: String,
    version: Double
  ): CustomPartitionAssignmentProtocol = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction3(assign), name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPartitionAssignmentProtocol]
  }
  @scala.inline
  implicit class CustomPartitionAssignmentProtocolOps[Self <: CustomPartitionAssignmentProtocol] (val x: Self) extends AnyVal {
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
    def setAssign(value: (js.Any, js.Any, js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]) => Unit): Self = this.set("assign", js.Any.fromFunction3(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

