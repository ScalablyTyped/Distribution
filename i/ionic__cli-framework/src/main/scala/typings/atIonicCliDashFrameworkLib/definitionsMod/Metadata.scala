package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var footnotes: js.UndefOr[js.Array[Footnote]] = js.undefined
  var groups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var summary: java.lang.String
}

object Metadata {
  @scala.inline
  def apply(
    name: java.lang.String,
    summary: java.lang.String,
    description: java.lang.String = null,
    footnotes: js.Array[Footnote] = null,
    groups: js.Array[java.lang.String] = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("summary")(summary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    __obj.asInstanceOf[Metadata]
  }
}

