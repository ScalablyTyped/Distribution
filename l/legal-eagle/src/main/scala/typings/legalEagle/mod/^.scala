package typings.legalEagle.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("legal-eagle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(
    options: Options,
    cb: js.Function2[/* err */ Error | Null, /* licenseSummary */ LicenseLookup, Unit]
  ): Unit = js.native
}
