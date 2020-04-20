package typings.markdownIt.parserBlockMod

import org.scalablytyped.runtime.Instantiable4
import typings.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/parser_block", JSImport.Namespace)
@js.native
class ^ () extends ParserBlock {
  /* CompleteClass */
  override var State: Instantiable4[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    /* tokens */ js.Array[typings.markdownIt.tokenMod.^], 
    typings.markdownIt.stateBlockMod.^
  ] = js.native
  /**
    * [[Ruler]] instance. Keep configuration of block rules.
    */
  /* CompleteClass */
  override var ruler: typings.markdownIt.rulerMod.^[RuleBlock] = js.native
  /**
    * Process input string and push block tokens into `outTokens`
    */
  /* CompleteClass */
  override def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typings.markdownIt.tokenMod.^]): Unit = js.native
  /**
    * Generate tokens for input range
    */
  /* CompleteClass */
  override def tokenize(state: typings.markdownIt.stateBlockMod.^, startLine: Double, endLine: Double): Unit = js.native
}

