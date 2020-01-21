package typings.javascriptStringify

import typings.javascriptStringify.javascriptStringifyStrings.Graveaccent
import typings.javascriptStringify.typesMod.Next
import typings.javascriptStringify.typesMod.ToString
import typings.std.PropertyKey
import typings.std.RegExp
import typings.std.RegExpExecArray
import typings.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-stringify/dist/function", JSImport.Namespace)
@js.native
object functionMod extends js.Object {
  @js.native
  class FunctionParser protected () extends js.Object {
    def this(fn: js.Function, indent: String, next: Next) = this()
    def this(fn: js.Function, indent: String, next: Next, key: String) = this()
    var fn: js.Function = js.native
    var fnString: String = js.native
    var fnType: String = js.native
    var hadKeyword: Boolean = js.native
    var indent: String = js.native
    var isMethodCandidate: Boolean = js.native
    var key: js.UndefOr[String] = js.native
    var keyPrefix: String = js.native
    var keyQuote: js.UndefOr[String] = js.native
    @JSName("next")
    var next_Original: Next = js.native
    var pos: Double = js.native
    def consumeMatch(re: RegExp): RegExpExecArray | Null = js.native
    /**
      * Advance the parser past an arbitrary regular expression. Return `token`,
      * or the match object of the regexp.
      */
    def consumeRegExp(re: RegExp, token: String): js.UndefOr[String] = js.native
    /**
      * Advance the parser past one element of JavaScript syntax. This could be a
      * matched pair of delimiters, like braces or parentheses, or an atomic unit
      * like a keyword, variable, or operator. Return a normalized string
      * representation of the element parsed--for example, returns '{}' for a
      * matched pair of braces. Comments and whitespace are skipped.
      *
      * (This isn't a full parser, so the token scanning logic used here is as
      * simple as it can be. As a consequence, some things that are one token in
      * JavaScript, like decimal number literals or most multicharacter operators
      * like '&&', are split into more than one token here. However, awareness of
      * some multicharacter sequences like '=>' is necessary, so we match the few
      * of them that we care about.)
      */
    def consumeSyntax(): js.UndefOr[String] = js.native
    def consumeSyntax(wordLikeToken: String): js.UndefOr[String] = js.native
    def consumeSyntaxUntil(startToken: String, endToken: String): js.UndefOr[String] = js.native
    /**
      * Advance the parser past a template string.
      */
    def consumeTemplate(): js.UndefOr[Graveaccent] = js.native
    /**
      * Advance the parser past any whitespace or comments.
      */
    def consumeWhitespace(): Unit = js.native
    def getPrefix(): String = js.native
    def next(value: js.Any): js.UndefOr[String] = js.native
    def next(value: js.Any, key: PropertyKey): js.UndefOr[String] = js.native
    def stringify(): String = js.native
    def tryParse(): js.UndefOr[String] = js.native
    /**
      * Attempt to advance the parser past the keywords expected to be at the
      * start of this function's definition. This method sets `this.hadKeyword`
      * based on whether or not a `function` keyword is consumed.
      *
      * @return {boolean}
      */
    def tryParsePrefixTokens(): Boolean = js.native
    /**
      * Attempt to parse the function from the current position by first stripping
      * the function's name from the front. This is not a fool-proof method on all
      * JavaScript engines, but yields good results on Node.js 4 (and slightly
      * less good results on Node.js 6 and 8).
      */
    def tryStrippingName(): js.UndefOr[String] = js.native
  }
  
  val USED_METHOD_KEY: WeakSet[js.Function] = js.native
  val functionToString: ToString = js.native
  def dedentFunction(fnString: String): String = js.native
}

