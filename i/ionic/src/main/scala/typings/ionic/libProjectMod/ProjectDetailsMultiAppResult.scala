package typings.ionic.libProjectMod

import typings.ionic.definitionsMod.ProjectType
import typings.ionic.ionicStrings.multiapp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsMultiAppResult extends ProjectDetailsResultBase {
  val context: multiapp
  val id: js.UndefOr[String] = js.undefined
}

object ProjectDetailsMultiAppResult {
  @scala.inline
  def apply(
    context: multiapp,
    errors: js.Array[ProjectDetailsError],
    id: String = null,
    `type`: ProjectType = null
  ): ProjectDetailsMultiAppResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsMultiAppResult]
  }
}

