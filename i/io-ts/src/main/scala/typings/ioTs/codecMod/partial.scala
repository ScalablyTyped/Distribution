package typings.ioTs.codecMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Codec", "partial")
@js.native
object partial extends js.Object {
  def apply[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Codec.Codec<A[K]>}
    */ typings.ioTs.ioTsStrings.partial with TopLevel[A]
  ): Codec_[Partial[A]] = js.native
}

