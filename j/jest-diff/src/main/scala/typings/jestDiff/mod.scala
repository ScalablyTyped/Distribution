package typings.jestDiff

import typings.jestDiff.typesMod.DiffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-diff", JSImport.Default)
  @js.native
  def default(a: js.Any, b: js.Any): String | Null = js.native
  @JSImport("jest-diff", JSImport.Default)
  @js.native
  def default(a: js.Any, b: js.Any, options: DiffOptions): String | Null = js.native
  
  @JSImport("jest-diff", "DIFF_DELETE")
  @js.native
  def DIFF_DELETE: Double = js.native
  @scala.inline
  def DIFF_DELETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIFF_DELETE")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-diff", "DIFF_EQUAL")
  @js.native
  def DIFF_EQUAL: Double = js.native
  @scala.inline
  def DIFF_EQUAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIFF_EQUAL")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-diff", "DIFF_INSERT")
  @js.native
  def DIFF_INSERT: Double = js.native
  @scala.inline
  def DIFF_INSERT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIFF_INSERT")(x.asInstanceOf[js.Any])
  
  /**
    * Class representing one diff tuple.
    * Attempts to look like a two-element array (which is what this used to be).
    * @param {number} op Operation, one of: DIFF_DELETE, DIFF_INSERT, DIFF_EQUAL.
    * @param {string} text Text to be deleted, inserted, or retained.
    * @constructor
    */
  @JSImport("jest-diff", "Diff")
  @js.native
  class Diff protected ()
    extends typings.jestDiff.cleanupSemanticMod.Diff {
    def this(op: Double, text: String) = this()
  }
  
  @JSImport("jest-diff", "diffLinesRaw")
  @js.native
  def diffLinesRaw(aLines: js.Array[String], bLines: js.Array[String]): js.Array[typings.jestDiff.cleanupSemanticMod.Diff] = js.native
  
  @JSImport("jest-diff", "diffLinesUnified")
  @js.native
  def diffLinesUnified(aLines: js.Array[String], bLines: js.Array[String]): String = js.native
  @JSImport("jest-diff", "diffLinesUnified")
  @js.native
  def diffLinesUnified(aLines: js.Array[String], bLines: js.Array[String], options: DiffOptions): String = js.native
  
  @JSImport("jest-diff", "diffLinesUnified2")
  @js.native
  def diffLinesUnified2(
    aLinesDisplay: js.Array[String],
    bLinesDisplay: js.Array[String],
    aLinesCompare: js.Array[String],
    bLinesCompare: js.Array[String]
  ): String = js.native
  @JSImport("jest-diff", "diffLinesUnified2")
  @js.native
  def diffLinesUnified2(
    aLinesDisplay: js.Array[String],
    bLinesDisplay: js.Array[String],
    aLinesCompare: js.Array[String],
    bLinesCompare: js.Array[String],
    options: DiffOptions
  ): String = js.native
  
  @JSImport("jest-diff", "diffStringsRaw")
  @js.native
  def diffStringsRaw(a: String, b: String, cleanup: Boolean): js.Array[typings.jestDiff.cleanupSemanticMod.Diff] = js.native
  
  @JSImport("jest-diff", "diffStringsUnified")
  @js.native
  def diffStringsUnified(a: String, b: String): String = js.native
  @JSImport("jest-diff", "diffStringsUnified")
  @js.native
  def diffStringsUnified(a: String, b: String, options: DiffOptions): String = js.native
}
