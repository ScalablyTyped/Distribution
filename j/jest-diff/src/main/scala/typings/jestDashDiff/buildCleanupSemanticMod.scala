package typings.jestDashDiff

import typings.jestDashDiff.buildCleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/cleanupSemantic", JSImport.Namespace)
@js.native
object buildCleanupSemanticMod extends js.Object {
  /**
    * Class representing one diff tuple.
    * Attempts to look like a two-element array (which is what this used to be).
    * @param {number} op Operation, one of: DIFF_DELETE, DIFF_INSERT, DIFF_EQUAL.
    * @param {string} text Text to be deleted, inserted, or retained.
    * @constructor
    */
  @js.native
  class Diff protected () extends js.Object {
    def this(op: Double, text: String) = this()
    var `0`: Double = js.native
    var `1`: String = js.native
  }
  
  var DIFF_DELETE: Double = js.native
  var DIFF_EQUAL: Double = js.native
  var DIFF_INSERT: Double = js.native
  /**
    * Reduce the number of edits by eliminating semantically trivial equalities.
    * @param {!Array.<!diff_match_patch.Diff>} diffs Array of diff tuples.
    */
  var cleanupSemantic: js.Function1[/* diffs */ js.Array[Diff], Unit] = js.native
}

