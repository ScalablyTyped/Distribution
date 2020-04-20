package typings.markdownIt.parserInlineMod

import org.scalablytyped.runtime.Instantiable4
import typings.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserInline extends js.Object {
  var State: Instantiable4[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    /* outTokens */ js.Array[typings.markdownIt.tokenMod.^], 
    typings.markdownIt.stateInlineMod.^
  ]
  /**
    * [[Ruler]] instance. Keep configuration of inline rules.
    */
  var ruler: typings.markdownIt.rulerMod.^[RuleInline]
  /**
    * [[Ruler]] instance. Second ruler used for post-processing
    * (e.g. in emphasis-like rules).
    */
  var ruler2: typings.markdownIt.rulerMod.^[RuleInline2]
  /**
    * Process input string and push inline tokens into `outTokens`
    */
  def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typings.markdownIt.tokenMod.^]): Unit
  /**
    * Skip single token by running all rules in validation mode;
    * returns `true` if any rule reported success
    */
  def skipToken(state: typings.markdownIt.stateInlineMod.^): Unit
  /**
    * Generate tokens for input range
    */
  def tokenize(state: typings.markdownIt.stateInlineMod.^): Unit
}

object ParserInline {
  @scala.inline
  def apply(
    State: Instantiable4[
      /* src */ String, 
      /* md */ MarkdownIt, 
      /* env */ js.Any, 
      /* outTokens */ js.Array[typings.markdownIt.tokenMod.^], 
      typings.markdownIt.stateInlineMod.^
    ],
    parse: (String, MarkdownIt, js.Any, js.Array[typings.markdownIt.tokenMod.^]) => Unit,
    ruler: typings.markdownIt.rulerMod.^[RuleInline],
    ruler2: typings.markdownIt.rulerMod.^[RuleInline2],
    skipToken: typings.markdownIt.stateInlineMod.^ => Unit,
    tokenize: typings.markdownIt.stateInlineMod.^ => Unit
  ): ParserInline = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = js.Any.fromFunction4(parse), ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any], skipToken = js.Any.fromFunction1(skipToken), tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[ParserInline]
  }
}

