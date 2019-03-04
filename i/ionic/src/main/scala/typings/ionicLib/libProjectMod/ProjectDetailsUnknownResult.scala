package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsUnknownResult extends ProjectDetailsResultBase {
  val context: ionicLib.ionicLibStrings.unknown
}

object ProjectDetailsUnknownResult {
  @scala.inline
  def apply(
    context: ionicLib.ionicLibStrings.unknown,
    errors: js.Array[ProjectDetailsError],
    `type`: ionicLib.definitionsMod.ProjectType = null
  ): ProjectDetailsUnknownResult = {
    val __obj = js.Dynamic.literal(context = context, errors = errors)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProjectDetailsUnknownResult]
  }
}

