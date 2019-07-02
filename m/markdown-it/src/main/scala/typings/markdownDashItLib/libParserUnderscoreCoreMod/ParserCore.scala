package typings
package markdownDashItLib.libParserUnderscoreCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserCore extends js.Object {
  var State: markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.^
  var ruler: markdownDashItLib.libRulerMod.^[markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.^]
  def process(state: js.Any): scala.Unit
}

object ParserCore {
  @scala.inline
  def apply(
    State: markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.^,
    process: js.Any => scala.Unit,
    ruler: markdownDashItLib.libRulerMod.^[markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.^]
  ): ParserCore = {
    val __obj = js.Dynamic.literal(State = State, process = js.Any.fromFunction1(process), ruler = ruler)
  
    __obj.asInstanceOf[ParserCore]
  }
}

