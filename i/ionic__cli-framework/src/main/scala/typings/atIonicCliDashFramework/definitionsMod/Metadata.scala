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
    val __obj = js.Dynamic.literal(name = name, summary = summary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    __obj.asInstanceOf[Metadata]
  }
}

