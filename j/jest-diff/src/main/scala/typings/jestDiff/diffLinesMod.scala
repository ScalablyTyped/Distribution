package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-diff/build/diffLines", JSImport.Namespace)
@js.native
object diffLinesMod extends js.Object {
  
  def diffLinesRaw(aLines: js.Array[String], bLines: js.Array[String]): js.Array[Diff] = js.native
  
  def diffLinesUnified(aLines: js.Array[String], bLines: js.Array[String]): String = js.native
  def diffLinesUnified(aLines: js.Array[String], bLines: js.Array[String], options: DiffOptions): String = js.native
  
  def diffLinesUnified2(
    aLinesDisplay: js.Array[String],
    bLinesDisplay: js.Array[String],
    aLinesCompare: js.Array[String],
    bLinesCompare: js.Array[String]
  ): String = js.native
  def diffLinesUnified2(
    aLinesDisplay: js.Array[String],
    bLinesDisplay: js.Array[String],
    aLinesCompare: js.Array[String],
    bLinesCompare: js.Array[String],
    options: DiffOptions
  ): String = js.native
}
