package typings.jestDiff

import typings.jestDiff.typesMod.DiffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Class representing one diff tuple.
    * Attempts to look like a two-element array (which is what this used to be).
    * @param {number} op Operation, one of: DIFF_DELETE, DIFF_INSERT, DIFF_EQUAL.
    * @param {string} text Text to be deleted, inserted, or retained.
    * @constructor
    */
  @js.native
  class Diff protected ()
    extends typings.jestDiff.cleanupSemanticMod.Diff {
    def this(op: Double, text: String) = this()
  }
  
  var DIFF_DELETE: Double = js.native
  var DIFF_EQUAL: Double = js.native
  var DIFF_INSERT: Double = js.native
  def default(a: js.Any, b: js.Any): String | Null = js.native
  def default(a: js.Any, b: js.Any, options: DiffOptions): String | Null = js.native
  def diffLinesRaw(aLines: js.Array[String], bLines: js.Array[String]): js.Array[typings.jestDiff.cleanupSemanticMod.Diff] = js.native
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
  def diffStringsRaw(a: String, b: String, cleanup: Boolean): js.Array[typings.jestDiff.cleanupSemanticMod.Diff] = js.native
  def diffStringsUnified(a: String, b: String): String = js.native
  def diffStringsUnified(a: String, b: String, options: DiffOptions): String = js.native
}

