package typings.ionic.libProjectMod

import typings.ionic.definitionsMod.ProjectType
import typings.ionic.ionicStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsUnknownResult extends ProjectDetailsResultBase {
  val context: unknown
}

object ProjectDetailsUnknownResult {
  @scala.inline
  def apply(context: unknown, errors: js.Array[ProjectDetailsError], `type`: ProjectType = null): ProjectDetailsUnknownResult = {
    val __obj = js.Dynamic.literal(context = context, errors = errors)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProjectDetailsUnknownResult]
  }
}

