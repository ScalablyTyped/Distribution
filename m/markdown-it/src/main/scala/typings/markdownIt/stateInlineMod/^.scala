package typings.markdownIt.stateInlineMod

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/rules_inline/state_inline", JSImport.Namespace)
@js.native
class ^ protected () extends StateInline {
  def this(src: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typings.markdownIt.tokenMod.^]) = this()
  /* CompleteClass */
  override var Token: Instantiable3[
    /* type */ String, 
    /* tag */ String, 
    /* nesting */ Nesting, 
    typings.markdownIt.tokenMod.^
  ] = js.native
  /**
    * Stores { start: end } pairs. Useful for backtrack
    * optimization of pairs parse (emphasis, strikes).
    */
  /* CompleteClass */
  override var cache: js.Any = js.native
  /**
    * List of emphasis-like delimiters for current tag
    */
  /* CompleteClass */
  override var delimiters: js.Array[Delimiter] = js.native
  /* CompleteClass */
  override var env: js.Any = js.native
  /* CompleteClass */
  override var level: Double = js.native
  /* CompleteClass */
  override var md: MarkdownIt = js.native
  /* CompleteClass */
  override var pending: String = js.native
  /* CompleteClass */
  override var pendingLevel: Double = js.native
  /* CompleteClass */
  override var pos: Double = js.native
  /* CompleteClass */
  override var posMax: Double = js.native
  /* CompleteClass */
  override var src: String = js.native
  /* CompleteClass */
  override var tokens: js.Array[typings.markdownIt.tokenMod.^] = js.native
  /* CompleteClass */
  override var tokens_meta: js.Array[TokenMata] = js.native
  /**
    * Push new token to "stream".
    * If pending text exists - flush it as text token
    */
  /* CompleteClass */
  override def push(`type`: String, tag: String, nesting: Nesting): typings.markdownIt.tokenMod.^ = js.native
  // Stack of delimiter lists for upper level tags
  // _prev_delimiters: StateInline.Delimiter[][];
  /**
    * Flush pending text
    */
  /* CompleteClass */
  override def pushPending(): typings.markdownIt.tokenMod.^ = js.native
  /**
    * Scan a sequence of emphasis-like markers, and determine whether
    * it can start an emphasis sequence or end an emphasis sequence.
    *
    * @param start position to scan from (it should point at a valid marker);
    * @param canSplitWord determine if these markers can be found inside a word
    */
  /* CompleteClass */
  override def scanDelims(start: Double, canSplitWord: Boolean): Scanned = js.native
}

