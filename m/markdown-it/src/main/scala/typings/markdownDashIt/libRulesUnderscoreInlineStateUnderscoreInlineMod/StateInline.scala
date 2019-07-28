package typings.markdownDashIt.libRulesUnderscoreInlineStateUnderscoreInlineMod

import org.scalablytyped.runtime.NumberDictionary
import typings.markdownDashIt.Anon_Canclose
import typings.markdownDashIt.libMod.Delimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateInline
  extends typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^ {
  /**
    * Stores `{ start: end }` pairs. Useful for backtrack
    * optimization of pairs parse (emphasis, strikes).
    */
  var cache: NumberDictionary[Double] = js.native
  /** Emphasis-like delimiters */
  var delimiters: js.Array[Delimiter] = js.native
  var pending: String = js.native
  var pendingLevel: Double = js.native
  /** Index of the first character of this token. */
  var pos: Double = js.native
  /** Index of the last character that can be used (for example the one before the end of this line). */
  var posMax: Double = js.native
  /**
    * Push new token to "stream".
    * If pending text exists, flush it as text token.
    */
  def push(`type`: String, tag: String, nesting: Double): typings.markdownDashIt.libTokenMod.^ = js.native
  /** Flush pending text */
  def pushPending(): typings.markdownDashIt.libTokenMod.^ = js.native
  /**
    * Scan a sequence of emphasis-like markers and determine whether
    * it can start an emphasis sequence or end an emphasis sequence.
    * @param start - position to scan from (it should point to a valid marker)
    * @param canSplitWord - determine if these markers can be found inside a word
    */
  def scanDelims(start: Double, canSplitWord: Boolean): Anon_Canclose = js.native
}

