package typings
package istanbulDashReportsLib.istanbulDashReportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootedOptions extends Options {
  var projectRoot: java.lang.String
}

object RootedOptions {
  @scala.inline
  def apply(file: java.lang.String, projectRoot: java.lang.String): RootedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("projectRoot")(projectRoot)
    __obj.asInstanceOf[RootedOptions]
  }
}

