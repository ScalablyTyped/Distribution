package typings.kafkaDashNode.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPartitionAssignmentProtocol extends js.Object {
  var name: String
  var version: Double
  def assign(
    topicPattern: js.Any,
    groupMembers: js.Any,
    cb: js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]
  ): Unit
}

object CustomPartitionAssignmentProtocol {
  @scala.inline
  def apply(
    assign: (js.Any, js.Any, js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]) => Unit,
    name: String,
    version: Double
  ): CustomPartitionAssignmentProtocol = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction3(assign), name = name, version = version)
  
    __obj.asInstanceOf[CustomPartitionAssignmentProtocol]
  }
}

