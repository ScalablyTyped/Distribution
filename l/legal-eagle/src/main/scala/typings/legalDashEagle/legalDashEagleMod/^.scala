package typings.legalDashEagle.legalDashEagleMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("legal-eagle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    options: Options,
    cb: js.Function2[/* err */ Error | Null, /* licenseSummary */ LicenseLookup, Unit]
  ): Unit = js.native
}

