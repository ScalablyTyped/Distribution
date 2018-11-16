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

