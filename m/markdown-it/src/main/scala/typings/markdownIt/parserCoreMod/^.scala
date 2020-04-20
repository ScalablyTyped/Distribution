package typings.markdownIt.parserCoreMod

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/parser_core", JSImport.Namespace)
@js.native
class ^ () extends Core {
  /* CompleteClass */
  override var State: Instantiable3[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    typings.markdownIt.stateCoreMod.^
  ] = js.native
  /* CompleteClass */
  override var ruler: typings.markdownIt.rulerMod.^[RuleCore] = js.native
  /**
    * Executes core chain rules.
    */
  /* CompleteClass */
  override def process(state: typings.markdownIt.stateCoreMod.^): Unit = js.native
}

