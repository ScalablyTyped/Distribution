package typings.jestDiff.printDiffsMod

import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptionsNormalized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-diff/build/printDiffs", "printDiffLines")
@js.native
object printDiffLines extends js.Object {
  
  def apply(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = js.native
}
