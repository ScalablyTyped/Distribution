package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetadata[I, O] extends Metadata {
  var exampleCommands: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var inputs: js.UndefOr[js.Array[I]] = js.undefined
  var options: js.UndefOr[js.Array[O]] = js.undefined
}

object CommandMetadata {
  @scala.inline
  def apply[I, O](
    name: java.lang.String,
    summary: java.lang.String,
    description: java.lang.String = null,
    exampleCommands: js.Array[java.lang.String] = null,
    footnotes: js.Array[Footnote] = null,
    groups: js.Array[java.lang.String] = null,
    inputs: js.Array[I] = null,
    options: js.Array[O] = null
  ): CommandMetadata[I, O] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("summary")(summary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (exampleCommands != null) __obj.updateDynamic("exampleCommands")(exampleCommands)
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[CommandMetadata[I, O]]
  }
}

