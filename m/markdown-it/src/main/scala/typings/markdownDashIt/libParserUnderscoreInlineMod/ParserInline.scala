package typings.markdownDashIt.libParserUnderscoreInlineMod

import typings.markdownDashIt.libMod.MarkdownIt
import typings.markdownDashIt.libMod.RulerInline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserInline extends js.Object {
  var ruler: RulerInline
  var ruler2: RulerInline
  def parse(
    src: String,
    md: MarkdownIt,
    env: js.Any,
    outTokens: js.Array[typings.markdownDashIt.libTokenMod.^]
  ): Unit
  def skipToken(state: typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^): Unit
  def tokenize(state: typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^): Unit
}

object ParserInline {
  @scala.inline
  def apply(
    parse: (String, MarkdownIt, js.Any, js.Array[typings.markdownDashIt.libTokenMod.^]) => Unit,
    ruler: RulerInline,
    ruler2: RulerInline,
    skipToken: typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^ => Unit,
    tokenize: typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^ => Unit
  ): ParserInline = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any], skipToken = js.Any.fromFunction1(skipToken), tokenize = js.Any.fromFunction1(tokenize))
  
    __obj.asInstanceOf[ParserInline]
  }
}

