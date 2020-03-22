package typings.jestDiff.printDiffsMod

import typings.jestDiff.cleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/printDiffs", "countChanges")
@js.native
object countChanges extends js.Object {
  def apply(diffs: js.Array[Diff]): ChangeCounts = js.native
}

