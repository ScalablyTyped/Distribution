package typings.istanbulLibInstrument.mod

import typings.sourceMap.mod.RawSourceMap
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
    val __obj = js.Dynamic.literal(coverageVariable = coverageVariable.asInstanceOf[js.Any], inputSourceMap = inputSourceMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisitorOptions]
  }
}

