package typings.ioTs.decoderMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Decoder", "union")
@js.native
object union extends js.Object {
  def apply[A /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type {[ K in keyof A ]: Decoder<A[K]>} is not an array type */ members: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Decoder.Decoder<A[K]>}
    */ typings.ioTs.ioTsStrings.union with TopLevel[A]
  ): Decoder_[
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = js.native
}

