package typings.ionic.libProjectMod

import typings.atIonicCliDashFramework.libConfigMod.BaseConfigOptions
import typings.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectConfigOptions extends BaseConfigOptions {
  val `type`: js.UndefOr[ProjectType] = js.undefined
}

object ProjectConfigOptions {
  @scala.inline
  def apply(pathPrefix: js.Array[String] = null, `type`: ProjectType = null): ProjectConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProjectConfigOptions]
  }
}

