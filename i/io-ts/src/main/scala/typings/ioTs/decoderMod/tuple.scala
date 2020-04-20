package typings.ioTs.decoderMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Decoder", "tuple")
@js.native
object tuple extends js.Object {
  def apply[A /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Decoder<A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Decoder.Decoder<A[K]>}
    */ typings.ioTs.ioTsStrings.tuple with TopLevel[A]
  ): Decoder_[A] = js.native
}

