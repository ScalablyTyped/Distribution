package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffLinesMod {
  
  @JSImport("jest-diff/build/diffLines", "diffLinesRaw")
  @js.native
  def diffLinesRaw(aLines: js.Array[String], bLines: js.Array[String]): js.Array[Diff] = js.native
  
  @JSImport("jest-diff/build/diffLines", "diffLinesUnified")
  @js.native
  def diffLinesUnified(aLines: js.Array[String], bLines: js.Array[String]): String = js.native
  @JSImport("jest-diff/build/diffLines", "diffLinesUnified")
  @js.native
  def diffLinesUnified(aLines: js.Array[String], bLines: js.Array[String], options: DiffOptions): String = js.native
  
  @JSImport("jest-diff/build/diffLines", "diffLinesUnified2")
  @js.native
  def diffLinesUnified2(
    aLinesDisplay: js.Array[String],
    bLinesDisplay: js.Array[String],
    aLinesCompare: js.Array[String],
    bLinesCompare: js.Array[String]
  ): String = js.native
  @JSImport("jest-diff/build/diffLines", "diffLinesUnified2")
  @js.native
  def diffLinesUnified2(
    aLinesDisplay: js.Array[String],
    bLinesDisplay: js.Array[String],
    aLinesCompare: js.Array[String],
    bLinesCompare: js.Array[String],
    options: DiffOptions
  ): String = js.native
}
