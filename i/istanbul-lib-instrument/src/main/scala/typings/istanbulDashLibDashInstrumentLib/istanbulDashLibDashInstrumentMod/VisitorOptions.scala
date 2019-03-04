package typings
package istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisitorOptions extends js.Object {
  var coverageVariable: java.lang.String
  var inputSourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap
}

object VisitorOptions {
  @scala.inline
  def apply(coverageVariable: java.lang.String, inputSourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap): VisitorOptions = {
    val __obj = js.Dynamic.literal(coverageVariable = coverageVariable, inputSourceMap = inputSourceMap)
  
    __obj.asInstanceOf[VisitorOptions]
  }
}

