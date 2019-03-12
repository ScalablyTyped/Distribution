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

object ParserInline {
  @scala.inline
  def apply(
    parse: (java.lang.String, markdownDashItLib.libMod.MarkdownIt, js.Any, js.Array[markdownDashItLib.libTokenMod.namespaced]) => scala.Unit,
    ruler: markdownDashItLib.libMod.MarkdownItNs.RulerInline,
    ruler2: markdownDashItLib.libMod.MarkdownItNs.RulerInline,
    skipToken: markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.namespaced => scala.Unit,
    tokenize: markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.namespaced => scala.Unit
  ): ParserInline = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), ruler = ruler, ruler2 = ruler2, skipToken = js.Any.fromFunction1(skipToken), tokenize = js.Any.fromFunction1(tokenize))
  
    __obj.asInstanceOf[ParserInline]
  }
}

