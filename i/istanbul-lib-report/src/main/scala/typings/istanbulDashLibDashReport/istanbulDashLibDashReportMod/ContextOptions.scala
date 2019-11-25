package typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  var dir: String
  var watermarks: Watermarks
  def sourceFinder(filepath: String): String
}

object ContextOptions {
  @scala.inline
  def apply(dir: String, sourceFinder: String => String, watermarks: Watermarks): ContextOptions = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], sourceFinder = js.Any.fromFunction1(sourceFinder), watermarks = watermarks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContextOptions]
  }
}

