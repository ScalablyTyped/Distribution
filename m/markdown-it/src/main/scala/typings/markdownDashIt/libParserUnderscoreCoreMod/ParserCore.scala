package typings.markdownDashIt.libParserUnderscoreCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserCore extends js.Object {
  var State: typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^
  var ruler: typings.markdownDashIt.libRulerMod.^[typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^]
  def process(state: js.Any): Unit
}

object ParserCore {
  @scala.inline
  def apply(
    State: typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^,
    process: js.Any => Unit,
    ruler: typings.markdownDashIt.libRulerMod.^[typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^]
  ): ParserCore = {
    val __obj = js.Dynamic.literal(State = State, process = js.Any.fromFunction1(process), ruler = ruler)
  
    __obj.asInstanceOf[ParserCore]
  }
}

