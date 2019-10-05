package typings.kafkajs.kafkajsMod.AssignerProtocol

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberAssignment extends js.Object {
  def decode(buffer: Buffer): MemberAssignmentOptions
  def encode(options: MemberAssignmentOptions): Buffer
}

object MemberAssignment {
  @scala.inline
  def apply(decode: Buffer => MemberAssignmentOptions, encode: MemberAssignmentOptions => Buffer): MemberAssignment = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[MemberAssignment]
  }
}

