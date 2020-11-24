package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptionsColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-diff/build/getAlignedDiffs", JSImport.Namespace)
@js.native
object getAlignedDiffsMod extends js.Object {
  
  def default(diffs: js.Array[Diff], changeColor: DiffOptionsColor): js.Array[Diff] = js.native
}
