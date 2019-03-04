package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsSingleAppResult extends ProjectDetailsResultBase {
  val context: ionicLib.ionicLibStrings.app
}

object ProjectDetailsSingleAppResult {
  @scala.inline
  def apply(
    context: ionicLib.ionicLibStrings.app,
    errors: js.Array[ProjectDetailsError],
    `type`: ionicLib.definitionsMod.ProjectType = null
  ): ProjectDetailsSingleAppResult = {
    val __obj = js.Dynamic.literal(context = context, errors = errors)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProjectDetailsSingleAppResult]
  }
}

