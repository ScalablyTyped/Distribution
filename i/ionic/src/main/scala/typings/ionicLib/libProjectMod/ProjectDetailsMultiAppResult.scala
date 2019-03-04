package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsMultiAppResult extends ProjectDetailsResultBase {
  val context: ionicLib.ionicLibStrings.multiapp
  val id: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectDetailsMultiAppResult {
  @scala.inline
  def apply(
    context: ionicLib.ionicLibStrings.multiapp,
    errors: js.Array[ProjectDetailsError],
    id: java.lang.String = null,
    `type`: ionicLib.definitionsMod.ProjectType = null
  ): ProjectDetailsMultiAppResult = {
    val __obj = js.Dynamic.literal(context = context, errors = errors)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProjectDetailsMultiAppResult]
  }
}

