package typings.ioTs.decoderMod.fpTsLibHKTAugmentingMod

import typings.ioTs.codecMod.Codec_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  val Codec: Codec_[A]
}

object URItoKind {
  @scala.inline
  def apply[A](Codec: Codec_[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Codec = Codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[URItoKind[A]]
  }
}

