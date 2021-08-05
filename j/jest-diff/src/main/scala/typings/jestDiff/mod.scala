package typings.jestDiff

import typings.jestDiff.typesMod.DiffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: js.Any, b: js.Any): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def default(a: js.Any, b: js.Any, options: DiffOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("jest-diff", "DIFF_DELETE")
  @js.native
  def DIFF_DELETE: Double = js.native
  inline def DIFF_DELETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIFF_DELETE")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-diff", "DIFF_EQUAL")
  @js.native
  def DIFF_EQUAL: Double = js.native
  inline def DIFF_EQUAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIFF_EQUAL")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-diff", "DIFF_INSERT")
  @js.native
  def DIFF_INSERT: Double = js.native
  inline def DIFF_INSERT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIFF_INSERT")(x.asInstanceOf[js.Any])
  
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
  
  inline def diffLinesRaw(aLines: js.Array[String], bLines: js.Array[String]): js.Array[typings.jestDiff.cleanupSemanticMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLinesRaw")(aLines.asInstanceOf[js.Any], bLines.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.jestDiff.cleanupSemanticMod.Diff]]
  
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
  
  inline def diffStringsRaw(a: String, b: String, cleanup: Boolean): js.Array[typings.jestDiff.cleanupSemanticMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffStringsRaw")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.jestDiff.cleanupSemanticMod.Diff]]
  
  inline def diffStringsUnified(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffStringsUnified")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def diffStringsUnified(a: String, b: String, options: DiffOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffStringsUnified")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
