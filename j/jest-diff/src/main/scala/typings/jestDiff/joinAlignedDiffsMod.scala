package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptionsNormalized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/joinAlignedDiffs", JSImport.Namespace)
@js.native
object joinAlignedDiffsMod extends js.Object {
  def joinAlignedDiffsExpand(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = js.native
  def joinAlignedDiffsNoExpand(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = js.native
}

