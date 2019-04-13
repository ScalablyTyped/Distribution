package typings
package markdownDashItLib.libRulesUnderscoreInlineStateUnderscoreInlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateInline
  extends markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.^ {
  /**
    * Stores `{ start: end }` pairs. Useful for backtrack
    * optimization of pairs parse (emphasis, strikes).
    */
  var cache: org.scalablytyped.runtime.NumberDictionary[scala.Double] = js.native
  /** Emphasis-like delimiters */
  var delimiters: js.Array[markdownDashItLib.libMod.Delimiter] = js.native
  var pending: java.lang.String = js.native
  var pendingLevel: scala.Double = js.native
  /** Index of the first character of this token. */
  var pos: scala.Double = js.native
  /** Index of the last character that can be used (for example the one before the end of this line). */
  var posMax: scala.Double = js.native
  /**
    * Push new token to "stream".
    * If pending text exists, flush it as text token.
    */
  def push(`type`: java.lang.String, tag: java.lang.String, nesting: scala.Double): markdownDashItLib.libTokenMod.^ = js.native
  /** Flush pending text */
  def pushPending(): markdownDashItLib.libTokenMod.^ = js.native
  /**
    * Scan a sequence of emphasis-like markers and determine whether
    * it can start an emphasis sequence or end an emphasis sequence.
    * @param start - position to scan from (it should point to a valid marker)
    * @param canSplitWord - determine if these markers can be found inside a word
    */
  def scanDelims(start: scala.Double, canSplitWord: scala.Boolean): markdownDashItLib.Anon_Canclose = js.native
}

