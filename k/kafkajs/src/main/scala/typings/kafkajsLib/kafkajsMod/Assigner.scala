package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assigner extends js.Object {
  var name: java.lang.String
  var version: scala.Double
  def assign(group: kafkajsLib.Anon_Members): js.Promise[js.Array[GroupMemberAssignment]]
  def protocol(subscription: kafkajsLib.Anon_Topics): GroupState
}

object Assigner {
  @scala.inline
  def apply(
    assign: kafkajsLib.Anon_Members => js.Promise[js.Array[GroupMemberAssignment]],
    name: java.lang.String,
    protocol: kafkajsLib.Anon_Topics => GroupState,
    version: scala.Double
  ): Assigner = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction1(assign), name = name, protocol = js.Any.fromFunction1(protocol), version = version)
  
    __obj.asInstanceOf[Assigner]
  }
}

