package typings.markdownIt.parserBlockMod

import org.scalablytyped.runtime.Instantiable4
import typings.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBlock extends js.Object {
  var State: Instantiable4[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    /* tokens */ js.Array[typings.markdownIt.tokenMod.^], 
    typings.markdownIt.stateBlockMod.^
  ]
  /**
    * [[Ruler]] instance. Keep configuration of block rules.
    */
  var ruler: typings.markdownIt.rulerMod.^[RuleBlock]
  /**
    * Process input string and push block tokens into `outTokens`
    */
  def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typings.markdownIt.tokenMod.^]): Unit
  /**
    * Generate tokens for input range
    */
  def tokenize(state: typings.markdownIt.stateBlockMod.^, startLine: Double, endLine: Double): Unit
}

object ParserBlock {
  @scala.inline
  def apply(
    State: Instantiable4[
      /* src */ String, 
      /* md */ MarkdownIt, 
      /* env */ js.Any, 
      /* tokens */ js.Array[typings.markdownIt.tokenMod.^], 
      typings.markdownIt.stateBlockMod.^
    ],
    parse: (String, MarkdownIt, js.Any, js.Array[typings.markdownIt.tokenMod.^]) => Unit,
    ruler: typings.markdownIt.rulerMod.^[RuleBlock],
    tokenize: (typings.markdownIt.stateBlockMod.^, Double, Double) => Unit
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = js.Any.fromFunction4(parse), ruler = ruler.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3(tokenize))
    __obj.asInstanceOf[ParserBlock]
  }
}

