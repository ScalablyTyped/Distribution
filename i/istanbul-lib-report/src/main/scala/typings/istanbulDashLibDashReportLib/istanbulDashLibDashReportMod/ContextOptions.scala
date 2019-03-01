package typings
package istanbulDashLibDashReportLib.istanbulDashLibDashReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  var dir: java.lang.String
  var watermarks: Watermarks
  def sourceFinder(filepath: java.lang.String): java.lang.String
}

object ContextOptions {
  @scala.inline
  def apply(
    dir: java.lang.String,
    sourceFinder: js.Function1[java.lang.String, java.lang.String],
    watermarks: Watermarks
  ): ContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dir")(dir)
    __obj.updateDynamic("sourceFinder")(sourceFinder)
    __obj.updateDynamic("watermarks")(watermarks)
    __obj.asInstanceOf[ContextOptions]
  }
}

