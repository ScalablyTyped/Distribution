package typings.istanbulLibInstrument.anon

import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-instrument.istanbul-lib-instrument.VisitorOptions> */
trait PartialVisitorOptions extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.undefined
  var inputSourceMap: js.UndefOr[RawSourceMap] = js.undefined
}

object PartialVisitorOptions {
  @scala.inline
  def apply(coverageVariable: String = null, inputSourceMap: RawSourceMap = null): PartialVisitorOptions = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable.asInstanceOf[js.Any])
    if (inputSourceMap != null) __obj.updateDynamic("inputSourceMap")(inputSourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialVisitorOptions]
  }
}

