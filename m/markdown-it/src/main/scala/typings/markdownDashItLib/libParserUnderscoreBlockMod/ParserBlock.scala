package typings
package markdownDashItLib.libParserUnderscoreBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBlock extends js.Object {
  var ruler: markdownDashItLib.libMod.RulerBlock
  def parse(
    src: java.lang.String,
    md: markdownDashItLib.libMod.MarkdownIt,
    env: js.Any,
    outTokens: js.Array[markdownDashItLib.libTokenMod.^]
  ): scala.Unit
}

object ParserBlock {
  @scala.inline
  def apply(
    parse: (java.lang.String, markdownDashItLib.libMod.MarkdownIt, js.Any, js.Array[markdownDashItLib.libTokenMod.^]) => scala.Unit,
    ruler: markdownDashItLib.libMod.RulerBlock
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), ruler = ruler)
  
    __obj.asInstanceOf[ParserBlock]
  }
}

