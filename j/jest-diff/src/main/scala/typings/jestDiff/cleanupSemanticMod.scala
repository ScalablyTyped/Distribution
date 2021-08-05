package typings.jestDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cleanupSemanticMod {
  
  @JSImport("jest-diff/build/cleanupSemantic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-diff/build/cleanupSemantic", "DIFF_DELETE")
  @js.native
  def DIFF_DELETE: Double = js.native
  inline def DIFF_DELETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIFF_DELETE")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-diff/build/cleanupSemantic", "DIFF_EQUAL")
  @js.native
  def DIFF_EQUAL: Double = js.native
  inline def DIFF_EQUAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIFF_EQUAL")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-diff/build/cleanupSemantic", "DIFF_INSERT")
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
  @JSImport("jest-diff/build/cleanupSemantic", "Diff")
  @js.native
  class Diff protected () extends StObject {
    def this(op: Double, text: String) = this()
    
    var `0`: Double = js.native
    
    var `1`: String = js.native
  }
  
  /**
    * Reduce the number of edits by eliminating semantically trivial equalities.
    * @param {!Array.<!diff_match_patch.Diff>} diffs Array of diff tuples.
    */
  @JSImport("jest-diff/build/cleanupSemantic", "cleanupSemantic")
  @js.native
  def cleanupSemantic: js.Function1[/* diffs */ js.Array[Diff], Unit] = js.native
  inline def cleanupSemantic_=(x: js.Function1[/* diffs */ js.Array[Diff], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cleanupSemantic")(x.asInstanceOf[js.Any])
}
