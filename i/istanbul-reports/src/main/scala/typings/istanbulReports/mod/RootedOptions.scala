package typings.istanbulReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootedOptions extends Options {
  var projectRoot: String
}

object RootedOptions {
  @scala.inline
  def apply(file: String, projectRoot: String): RootedOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootedOptions]
  }
}

