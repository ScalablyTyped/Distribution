package typings.markdownDashIt.libParserUnderscoreInlineMod

import typings.markdownDashIt.libMod.MarkdownIt
import typings.markdownDashIt.libMod.RulerInline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/parser_inline", JSImport.Namespace)
@js.native
class ^ () extends ParserInline {
  /* CompleteClass */
  override var ruler: RulerInline = js.native
  /* CompleteClass */
  override var ruler2: RulerInline = js.native
  /* CompleteClass */
  override def parse(
    src: String,
    md: MarkdownIt,
    env: js.Any,
    outTokens: js.Array[typings.markdownDashIt.libTokenMod.^]
  ): Unit = js.native
  /* CompleteClass */
  override def skipToken(state: typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^): Unit = js.native
  /* CompleteClass */
  override def tokenize(state: typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^): Unit = js.native
}

