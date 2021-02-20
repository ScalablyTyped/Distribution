package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptionsNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinAlignedDiffsMod {
  
  @JSImport("jest-diff/build/joinAlignedDiffs", "joinAlignedDiffsExpand")
  @js.native
  def joinAlignedDiffsExpand(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = js.native
  
  @JSImport("jest-diff/build/joinAlignedDiffs", "joinAlignedDiffsNoExpand")
  @js.native
  def joinAlignedDiffsNoExpand(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = js.native
}
