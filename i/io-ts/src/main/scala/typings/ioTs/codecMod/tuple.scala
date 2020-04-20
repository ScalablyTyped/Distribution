package typings.ioTs.codecMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Codec", "tuple")
@js.native
object tuple extends js.Object {
  def apply[A /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Codec<A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Codec.Codec<A[K]>}
    */ typings.ioTs.ioTsStrings.tuple with TopLevel[A]
  ): Codec_[A] = js.native
}

