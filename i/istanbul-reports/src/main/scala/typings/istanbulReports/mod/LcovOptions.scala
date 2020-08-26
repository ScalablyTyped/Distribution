package typings.istanbulReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LcovOptions
  extends FileOptions
     with ProjectOptions

object LcovOptions {
  @scala.inline
  def apply(file: String, projectRoot: String): LcovOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[LcovOptions]
  }
}

