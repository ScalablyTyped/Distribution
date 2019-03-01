package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MemberAssignment extends js.Object {
  var memberAssignment: nodeLib.Buffer
  var memberId: scala.Double
}

object Anon_MemberAssignment {
  @scala.inline
  def apply(memberAssignment: nodeLib.Buffer, memberId: scala.Double): Anon_MemberAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("memberAssignment")(memberAssignment)
    __obj.updateDynamic("memberId")(memberId)
    __obj.asInstanceOf[Anon_MemberAssignment]
  }
}

