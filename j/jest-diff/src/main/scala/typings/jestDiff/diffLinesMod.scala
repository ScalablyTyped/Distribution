package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffLinesMod {
  
  @JSImport("jest-diff/build/diffLines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diffLinesRaw(aLines: js.Array[String], bLines: js.Array[String]): js.Array[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLinesRaw")(aLines.asInstanceOf[js.Any], bLines.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff]]
  
  inline def diffLinesUnified(aLines: js.Array[String], bLines: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLinesUnified")(aLines.asInstanceOf[js.Any], bLines.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def diffLinesUnified(aLines: js.Array[String], bLines: js.Array[String], options: DiffOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLinesUnified")(aLines.asInstanceOf[js.Any], bLines.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def diffLinesUnified2(
    aLinesDisplay: js.Array[String],
    bLinesDisplay: js.Array[String],
    aLinesCompare: js.Array[String],
    bLinesCompare: js.Array[String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLinesUnified2")(aLinesDisplay.asInstanceOf[js.Any], bLinesDisplay.asInstanceOf[js.Any], aLinesCompare.asInstanceOf[js.Any], bLinesCompare.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def diffLinesUnified2(
    aLinesDisplay: js.Array[String],
    bLinesDisplay: js.Array[String],
    aLinesCompare: js.Array[String],
    bLinesCompare: js.Array[String],
    options: DiffOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLinesUnified2")(aLinesDisplay.asInstanceOf[js.Any], bLinesDisplay.asInstanceOf[js.Any], aLinesCompare.asInstanceOf[js.Any], bLinesCompare.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
