package typings
package markdownDashItLib.libParserUnderscoreBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBlock extends js.Object {
  var ruler: markdownDashItLib.libMod.MarkdownItNs.RulerBlock
  def parse(
    src: java.lang.String,
    md: markdownDashItLib.libMod.MarkdownIt,
    env: js.Any,
    outTokens: js.Array[markdownDashItLib.libTokenMod.namespaced]
  ): scala.Unit
}

object ParserBlock {
  @scala.inline
  def apply(
    parse: js.Function4[
      java.lang.String, 
      markdownDashItLib.libMod.MarkdownIt, 
      js.Any, 
      js.Array[markdownDashItLib.libTokenMod.namespaced], 
      scala.Unit
    ],
    ruler: markdownDashItLib.libMod.MarkdownItNs.RulerBlock
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(parse = parse, ruler = ruler)
  
    __obj.asInstanceOf[ParserBlock]
  }
}

