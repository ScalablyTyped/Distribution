package typings.markdownIt.stateInlineMod

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateInline extends js.Object {
  var Token: Instantiable3[
    /* type */ String, 
    /* tag */ String, 
    /* nesting */ Nesting, 
    typings.markdownIt.tokenMod.^
  ]
  /**
    * Stores { start: end } pairs. Useful for backtrack
    * optimization of pairs parse (emphasis, strikes).
    */
  var cache: js.Any
  /**
    * List of emphasis-like delimiters for current tag
    */
  var delimiters: js.Array[Delimiter]
  var env: js.Any
  var level: Double
  var md: MarkdownIt
  var pending: String
  var pendingLevel: Double
  var pos: Double
  var posMax: Double
  var src: String
  var tokens: js.Array[typings.markdownIt.tokenMod.^]
  var tokens_meta: js.Array[TokenMata]
  /**
    * Push new token to "stream".
    * If pending text exists - flush it as text token
    */
  def push(`type`: String, tag: String, nesting: Nesting): typings.markdownIt.tokenMod.^
  // Stack of delimiter lists for upper level tags
  // _prev_delimiters: StateInline.Delimiter[][];
  /**
    * Flush pending text
    */
  def pushPending(): typings.markdownIt.tokenMod.^
  /**
    * Scan a sequence of emphasis-like markers, and determine whether
    * it can start an emphasis sequence or end an emphasis sequence.
    *
    * @param start position to scan from (it should point at a valid marker);
    * @param canSplitWord determine if these markers can be found inside a word
    */
  def scanDelims(start: Double, canSplitWord: Boolean): Scanned
}

object StateInline {
  @scala.inline
  def apply(
    Token: Instantiable3[
      /* type */ String, 
      /* tag */ String, 
      /* nesting */ Nesting, 
      typings.markdownIt.tokenMod.^
    ],
    cache: js.Any,
    delimiters: js.Array[Delimiter],
    env: js.Any,
    level: Double,
    md: MarkdownIt,
    pending: String,
    pendingLevel: Double,
    pos: Double,
    posMax: Double,
    push: (String, String, Nesting) => typings.markdownIt.tokenMod.^,
    pushPending: () => typings.markdownIt.tokenMod.^,
    scanDelims: (Double, Boolean) => Scanned,
    src: String,
    tokens: js.Array[typings.markdownIt.tokenMod.^],
    tokens_meta: js.Array[TokenMata]
  ): StateInline = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pendingLevel = pendingLevel.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], posMax = posMax.asInstanceOf[js.Any], push = js.Any.fromFunction3(push), pushPending = js.Any.fromFunction0(pushPending), scanDelims = js.Any.fromFunction2(scanDelims), src = src.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], tokens_meta = tokens_meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateInline]
  }
}

