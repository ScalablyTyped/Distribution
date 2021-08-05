package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptionsNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinAlignedDiffsMod {
  
  @JSImport("jest-diff/build/joinAlignedDiffs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def joinAlignedDiffsExpand(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = (^.asInstanceOf[js.Dynamic].applyDynamic("joinAlignedDiffsExpand")(diffs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def joinAlignedDiffsNoExpand(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = (^.asInstanceOf[js.Dynamic].applyDynamic("joinAlignedDiffsNoExpand")(diffs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
