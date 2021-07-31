package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptionsColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAlignedDiffsMod {
  
  @JSImport("jest-diff/build/getAlignedDiffs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(diffs: js.Array[Diff], changeColor: DiffOptionsColor): js.Array[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(diffs.asInstanceOf[js.Any], changeColor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff]]
}
