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
  def apply(
    decode: js.Function1[nodeLib.Buffer, MemberMetadataOptions],
    encode: js.Function1[MemberMetadataOptions, nodeLib.Buffer]
  ): MemberMetadata = {
    val __obj = js.Dynamic.literal(decode = decode, encode = encode)
  
    __obj.asInstanceOf[MemberMetadata]
  }
}

