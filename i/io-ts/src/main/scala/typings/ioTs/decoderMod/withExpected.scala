package typings.ioTs.decoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Decoder", "withExpected")
@js.native
object withExpected extends js.Object {
  def apply[A](
    decoder: Decoder_[A],
    expected: js.Function2[
      /* actual */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NonEmptyArray<Tree<string>> */ /* nea */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NonEmptyArray<Tree<string>> */ _
    ]
  ): Decoder_[A] = js.native
}

