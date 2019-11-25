package typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends ContextOptions {
  var data: js.Any
  var writer: FileWriter
}

object Context {
  @scala.inline
  def apply(
    data: js.Any,
    dir: String,
    sourceFinder: String => String,
    watermarks: Watermarks,
    writer: FileWriter
  ): Context = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], sourceFinder = js.Any.fromFunction1(sourceFinder), watermarks = watermarks.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context]
  }
}

