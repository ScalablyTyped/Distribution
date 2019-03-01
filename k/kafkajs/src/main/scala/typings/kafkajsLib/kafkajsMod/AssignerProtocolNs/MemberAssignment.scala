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
    decode: js.Function1[nodeLib.Buffer, MemberAssignmentOptions],
    encode: js.Function1[MemberAssignmentOptions, nodeLib.Buffer]
  ): MemberAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("encode")(encode)
    __obj.asInstanceOf[MemberAssignment]
  }
}

