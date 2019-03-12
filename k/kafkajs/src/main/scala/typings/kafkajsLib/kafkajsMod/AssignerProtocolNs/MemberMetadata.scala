package typings
package kafkajsLib.kafkajsMod.AssignerProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberMetadata extends js.Object {
  def decode(buffer: nodeLib.Buffer): MemberMetadataOptions
  def encode(options: MemberMetadataOptions): nodeLib.Buffer
}

object MemberMetadata {
  @scala.inline
  def apply(decode: nodeLib.Buffer => MemberMetadataOptions, encode: MemberMetadataOptions => nodeLib.Buffer): MemberMetadata = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[MemberMetadata]
  }
}

