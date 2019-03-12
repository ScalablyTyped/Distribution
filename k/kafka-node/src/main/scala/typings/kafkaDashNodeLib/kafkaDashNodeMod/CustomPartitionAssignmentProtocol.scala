package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPartitionAssignmentProtocol extends js.Object {
  var name: java.lang.String
  var version: scala.Double
  def assign(
    topicPattern: js.Any,
    groupMembers: js.Any,
    cb: js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit]
  ): scala.Unit
}

object CustomPartitionAssignmentProtocol {
  @scala.inline
  def apply(
    assign: (js.Any, js.Any, js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit]) => scala.Unit,
    name: java.lang.String,
    version: scala.Double
  ): CustomPartitionAssignmentProtocol = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction3(assign), name = name, version = version)
  
    __obj.asInstanceOf[CustomPartitionAssignmentProtocol]
  }
}

