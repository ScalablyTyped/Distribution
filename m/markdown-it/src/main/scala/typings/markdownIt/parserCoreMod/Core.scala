package typings.markdownIt.parserCoreMod

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Core extends js.Object {
  var State: Instantiable3[
    /* src */ String, 
    /* md */ MarkdownIt, 
    /* env */ js.Any, 
    typings.markdownIt.stateCoreMod.^
  ] = js.native
  var ruler: typings.markdownIt.rulerMod.^[RuleCore] = js.native
  /**
    * Executes core chain rules.
    */
  def process(state: typings.markdownIt.stateCoreMod.^): Unit = js.native
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
  @scala.inline
  implicit class CoreOps[Self <: Core] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setState(
      value: Instantiable3[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ js.Any, 
          typings.markdownIt.stateCoreMod.^
        ]
    ): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcess(value: typings.markdownIt.stateCoreMod.^ => Unit): Self = this.set("process", js.Any.fromFunction1(value))
    @scala.inline
    def setRuler(value: typings.markdownIt.rulerMod.^[RuleCore]): Self = this.set("ruler", value.asInstanceOf[js.Any])
  }
  
}

