package typings.atIonicCliDashFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetadata[I, O] extends Metadata {
  var exampleCommands: js.UndefOr[js.Array[String]] = js.undefined
  var inputs: js.UndefOr[js.Array[I]] = js.undefined
  var options: js.UndefOr[js.Array[O]] = js.undefined
}

object CommandMetadata {
  @scala.inline
  def apply[I, O](
    name: String,
    summary: String,
    description: String = null,
    exampleCommands: js.Array[String] = null,
    footnotes: js.Array[Footnote] = null,
    groups: js.Array[String] = null,
    inputs: js.Array[I] = null,
    options: js.Array[O] = null
  ): CommandMetadata[I, O] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (exampleCommands != null) __obj.updateDynamic("exampleCommands")(exampleCommands.asInstanceOf[js.Any])
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadata[I, O]]
  }
}

