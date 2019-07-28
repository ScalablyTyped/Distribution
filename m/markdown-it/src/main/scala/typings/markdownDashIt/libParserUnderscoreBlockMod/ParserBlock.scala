package typings.markdownDashIt.libParserUnderscoreBlockMod

import typings.markdownDashIt.libMod.MarkdownIt
import typings.markdownDashIt.libMod.RulerBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBlock extends js.Object {
  var ruler: RulerBlock
  def parse(
    src: String,
    md: MarkdownIt,
    env: js.Any,
    outTokens: js.Array[typings.markdownDashIt.libTokenMod.^]
  ): Unit
}

object ParserBlock {
  @scala.inline
  def apply(
    parse: (String, MarkdownIt, js.Any, js.Array[typings.markdownDashIt.libTokenMod.^]) => Unit,
    ruler: RulerBlock
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), ruler = ruler)
  
    __obj.asInstanceOf[ParserBlock]
  }
}

