package typings.ioTs.decoderMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Decoder", "partial")
@js.native
object partial extends js.Object {
  def apply[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Decoder.Decoder<A[K]>}
    */ typings.ioTs.ioTsStrings.partial with TopLevel[A]
  ): Decoder_[Partial[A]] = js.native
}

