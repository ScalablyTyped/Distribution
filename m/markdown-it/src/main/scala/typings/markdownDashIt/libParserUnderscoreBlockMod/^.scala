package typings.markdownDashIt.libParserUnderscoreBlockMod

import typings.markdownDashIt.libMod.MarkdownIt
import typings.markdownDashIt.libMod.RulerBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/parser_block", JSImport.Namespace)
@js.native
class ^ () extends ParserBlock {
  /* CompleteClass */
  override var ruler: RulerBlock = js.native
  /* CompleteClass */
  override def parse(
    src: String,
    md: MarkdownIt,
    env: js.Any,
    outTokens: js.Array[typings.markdownDashIt.libTokenMod.^]
  ): Unit = js.native
}

