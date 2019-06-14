package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberAssignment extends js.Object {
  var assignment: Assignment
  var userData: nodeLib.Buffer
  var version: scala.Double
}

object MemberAssignment {
  @scala.inline
  def apply(assignment: Assignment, userData: nodeLib.Buffer, version: scala.Double): MemberAssignment = {
    val __obj = js.Dynamic.literal(assignment = assignment, userData = userData, version = version)
  
    __obj.asInstanceOf[MemberAssignment]
  }
}

