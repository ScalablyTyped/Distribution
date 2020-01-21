package typings.markdownIt.parserCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserCore extends js.Object {
  var State: typings.markdownIt.stateCoreMod.^
  var ruler: typings.markdownIt.rulerMod.^[typings.markdownIt.stateCoreMod.^]
  def process(state: js.Any): Unit
}

object ParserCore {
  @scala.inline
  def apply(
    State: typings.markdownIt.stateCoreMod.^,
    process: js.Any => Unit,
    ruler: typings.markdownIt.rulerMod.^[typings.markdownIt.stateCoreMod.^]
  ): ParserCore = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), ruler = ruler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParserCore]
  }
}

