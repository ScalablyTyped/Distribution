package typings.ioTs.guardMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Guard", "partial")
@js.native
object partial extends js.Object {
  def apply[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Guard.Guard<A[K]>}
    */ typings.ioTs.ioTsStrings.partial with TopLevel[A]
  ): Guard_[Partial[A]] = js.native
}

