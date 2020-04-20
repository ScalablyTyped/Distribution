package typings.markdownIt.parserCoreMod

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Core extends js.Object {
  var State: Instantiable3[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    typings.markdownIt.stateCoreMod.^
  ]
  var ruler: typings.markdownIt.rulerMod.^[RuleCore]
  /**
    * Executes core chain rules.
    */
  def process(state: typings.markdownIt.stateCoreMod.^): Unit
}

object Core {
  @scala.inline
  def apply(
    State: Instantiable3[
      /* src */ String, 
      /* md */ MarkdownIt, 
      /* env */ js.Any, 
      typings.markdownIt.stateCoreMod.^
    ],
    process: typings.markdownIt.stateCoreMod.^ => Unit,
    ruler: typings.markdownIt.rulerMod.^[RuleCore]
  ): Core = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), ruler = ruler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Core]
  }
}

