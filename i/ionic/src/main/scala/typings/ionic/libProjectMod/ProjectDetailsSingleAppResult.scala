package typings.ionic.libProjectMod

import typings.ionic.definitionsMod.ProjectType
import typings.ionic.ionicStrings.app
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsSingleAppResult extends ProjectDetailsResultBase {
  val context: app
}

object ProjectDetailsSingleAppResult {
  @scala.inline
  def apply(context: app, errors: js.Array[ProjectDetailsError], `type`: ProjectType = null): ProjectDetailsSingleAppResult = {
    val __obj = js.Dynamic.literal(context = context, errors = errors)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProjectDetailsSingleAppResult]
  }
}

