package typings.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandMetadata[I, O] extends Metadata {
  var exampleCommands: js.UndefOr[js.Array[String]] = js.native
  var inputs: js.UndefOr[js.Array[I]] = js.native
  var options: js.UndefOr[js.Array[O]] = js.native
}

object CommandMetadata {
  @scala.inline
  def apply[I, O](name: String, summary: String): CommandMetadata[I, O] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadata[I, O]]
  }
  @scala.inline
  implicit class CommandMetadataOps[Self <: CommandMetadata[_, _], I, O] (val x: Self with (CommandMetadata[I, O])) extends AnyVal {
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
    def setExampleCommandsVarargs(value: String*): Self = this.set("exampleCommands", js.Array(value :_*))
    @scala.inline
    def setExampleCommands(value: js.Array[String]): Self = this.set("exampleCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExampleCommands: Self = this.set("exampleCommands", js.undefined)
    @scala.inline
    def setInputsVarargs(value: I*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[I]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: O*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[O]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

