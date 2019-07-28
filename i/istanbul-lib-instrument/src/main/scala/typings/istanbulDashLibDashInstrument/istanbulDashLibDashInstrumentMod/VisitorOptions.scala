package typings.istanbulDashLibDashInstrument.istanbulDashLibDashInstrumentMod

import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisitorOptions extends js.Object {
  var coverageVariable: String
  var inputSourceMap: RawSourceMap
}

object VisitorOptions {
  @scala.inline
  def apply(coverageVariable: String, inputSourceMap: RawSourceMap): VisitorOptions = {
    val __obj = js.Dynamic.literal(coverageVariable = coverageVariable, inputSourceMap = inputSourceMap)
  
    __obj.asInstanceOf[VisitorOptions]
  }
}

