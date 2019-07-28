package typings.kafkajs.kafkajsMod.AssignerProtocolNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberMetadata extends js.Object {
  def decode(buffer: Buffer): MemberMetadataOptions
  def encode(options: MemberMetadataOptions): Buffer
}

object MemberMetadata {
  @scala.inline
  def apply(decode: Buffer => MemberMetadataOptions, encode: MemberMetadataOptions => Buffer): MemberMetadata = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[MemberMetadata]
  }
}

