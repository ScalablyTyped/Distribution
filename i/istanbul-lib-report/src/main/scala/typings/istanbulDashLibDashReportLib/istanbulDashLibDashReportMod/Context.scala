package typings
package istanbulDashLibDashReportLib.istanbulDashLibDashReportMod

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
    dir: java.lang.String,
    sourceFinder: js.Function1[java.lang.String, java.lang.String],
    watermarks: Watermarks,
    writer: FileWriter
  ): Context = {
    val __obj = js.Dynamic.literal(data = data, dir = dir, sourceFinder = sourceFinder, watermarks = watermarks, writer = writer)
  
    __obj.asInstanceOf[Context]
  }
}

