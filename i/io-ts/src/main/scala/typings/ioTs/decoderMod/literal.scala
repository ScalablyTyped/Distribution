package typings.ioTs.decoderMod

import typings.ioTs.schemableMod.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Decoder", "literal")
@js.native
object literal extends js.Object {
  def apply[A /* <: js.Array[Literal] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): Decoder_[
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = js.native
}

