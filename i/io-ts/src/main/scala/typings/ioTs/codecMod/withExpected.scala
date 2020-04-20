package typings.ioTs.codecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Codec", "withExpected")
@js.native
object withExpected extends js.Object {
  def apply[A](
    codec: Codec_[A],
    expected: js.Function2[
      /* actual */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NonEmptyArray<Tree<string>> */ /* nea */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NonEmptyArray<Tree<string>> */ _
    ]
  ): Codec_[A] = js.native
}

