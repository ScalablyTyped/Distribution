package typings
package markdownDashItLib.libParserUnderscoreInlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParserInline extends js.Object {
  var ruler: markdownDashItLib.libMod.MarkdownItNs.RulerInline
  var ruler2: markdownDashItLib.libMod.MarkdownItNs.RulerInline
  def parse(
    src: java.lang.String,
    md: markdownDashItLib.libMod.MarkdownIt,
    env: js.Any,
    outTokens: js.Array[markdownDashItLib.libTokenMod.namespaced]
  ): scala.Unit
  def skipToken(state: markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.namespaced): scala.Unit
  def tokenize(state: markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.namespaced): scala.Unit
}

