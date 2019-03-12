package typings
package kafkajsLib.kafkajsMod.AssignerProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberAssignment extends js.Object {
  def decode(buffer: nodeLib.Buffer): MemberAssignmentOptions
  def encode(options: MemberAssignmentOptions): nodeLib.Buffer
}

object MemberAssignment {
  @scala.inline
  def apply(
    decode: nodeLib.Buffer => MemberAssignmentOptions,
    encode: MemberAssignmentOptions => nodeLib.Buffer
  ): MemberAssignment = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[MemberAssignment]
  }
}

