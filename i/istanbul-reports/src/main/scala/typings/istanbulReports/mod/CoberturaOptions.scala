package typings.istanbulReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoberturaOptions
  extends FileOptions
     with ProjectOptions
object CoberturaOptions {
  
  @scala.inline
  def apply(file: String, projectRoot: String): CoberturaOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoberturaOptions]
  }
}
