package typings.istanbulReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LcovOnlyOptions
  extends FileOptions
     with ProjectOptions

object LcovOnlyOptions {
  @scala.inline
  def apply(file: String, projectRoot: String): LcovOnlyOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[LcovOnlyOptions]
  }
}

