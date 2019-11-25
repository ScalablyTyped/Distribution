package typings.atIonicCliDashFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var footnotes: js.UndefOr[js.Array[Footnote]] = js.undefined
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  var summary: String
}

object Metadata {
  @scala.inline
  def apply(
    name: String,
    summary: String,
    description: String = null,
    footnotes: js.Array[Footnote] = null,
    groups: js.Array[String] = null
  ): Metadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

