package typings.jestDiff.printDiffsMod

import typings.jestDiff.typesMod.DiffOptionsNormalized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/printDiffs", "printDeleteLine")
@js.native
object printDeleteLine extends js.Object {
  def apply(
    line: String,
    isFirstOrLast: Boolean,
    hasAColorAIndicatorChangeLineTrailingSpaceColorEmptyFirstOrLastLinePlaceholder: DiffOptionsNormalized
  ): String = js.native
}

