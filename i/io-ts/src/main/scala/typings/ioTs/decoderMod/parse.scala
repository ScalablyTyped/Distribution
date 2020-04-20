package typings.ioTs.decoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Decoder", "parse")
@js.native
object parse extends js.Object {
  def apply[A, B](
    from: Decoder_[A],
    parser: js.Function1[
      /* a */ A, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Either<string, B> */ _
    ]
  ): Decoder_[B] = js.native
}

