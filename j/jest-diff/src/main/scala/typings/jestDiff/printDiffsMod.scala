package typings.jestDiff

import typings.chalk.mod.Chalk
import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/printDiffs", JSImport.Namespace)
@js.native
object printDiffsMod extends js.Object {
  trait _StringDiffResult extends js.Object
  
  val DIM_COLOR: Chalk with AnonSupportsColor = js.native
  val EXPECTED_COLOR: Chalk with AnonSupportsColor = js.native
  val INVERTED_COLOR: Chalk with AnonSupportsColor = js.native
  val MULTILINE_REGEXP: RegExp = js.native
  val RECEIVED_COLOR: Chalk with AnonSupportsColor = js.native
  def computeStringDiffs(expected: String, received: String): AnonDiffs = js.native
  def createPatchMark(aStart: Double, aEnd: Double, bStart: Double, bEnd: Double): String = js.native
  def getExpectedString(diffs: js.Array[Diff]): String = js.native
  def getHighlightedString(op: Double, diffs: js.Array[Diff]): String = js.native
  def getReceivedString(diffs: js.Array[Diff]): String = js.native
  def getStringDiff(expected: String, received: String): StringDiffResult = js.native
  def getStringDiff(expected: String, received: String, options: DiffOptions): StringDiffResult = js.native
  def hasCommonDiff(diffs: js.Array[Diff], isMultiline: Boolean): Boolean = js.native
  def printAnnotation(): String = js.native
  def printAnnotation(options: DiffOptions): String = js.native
  def printCommonLine(line: String): String = js.native
  def printCommonLine(line: String, isFirstOrLast: Boolean): String = js.native
  def printDeleteLine(line: String): String = js.native
  def printInsertLine(line: String): String = js.native
  def printMultilineStringDiffs(diffs: js.Array[Diff], expand: Boolean): String = js.native
  /* Rewritten from type alias, can be one of: 
    - typings.jestDiff.AnonAnnotatedDiff
    - typings.jestDiff.AnonA
    - scala.Null
  */
  type StringDiffResult = _StringDiffResult | Null
}

