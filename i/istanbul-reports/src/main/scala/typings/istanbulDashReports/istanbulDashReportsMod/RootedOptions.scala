package typings.istanbulDashReports.istanbulDashReportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootedOptions extends Options {
  var projectRoot: String
}

object RootedOptions {
  @scala.inline
  def apply(file: String, projectRoot: String): RootedOptions = {
    val __obj = js.Dynamic.literal(file = file, projectRoot = projectRoot)
  
    __obj.asInstanceOf[RootedOptions]
  }
}

