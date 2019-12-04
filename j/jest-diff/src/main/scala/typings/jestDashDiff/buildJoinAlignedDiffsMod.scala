package typings.jestDashDiff

import typings.jestDashDiff.buildCleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/joinAlignedDiffs", JSImport.Namespace)
@js.native
object buildJoinAlignedDiffsMod extends js.Object {
  def joinAlignedDiffsExpand(diffs: js.Array[Diff]): String = js.native
  def joinAlignedDiffsNoExpand(diffs: js.Array[Diff]): String = js.native
  def joinAlignedDiffsNoExpand(diffs: js.Array[Diff], nContextLines: Double): String = js.native
}

