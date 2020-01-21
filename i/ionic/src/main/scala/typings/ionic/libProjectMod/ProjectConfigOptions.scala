package typings.ionic.libProjectMod

import typings.ionic.definitionsMod.ProjectType
import typings.ionicCliFramework.configMod.BaseConfigOptions
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
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfigOptions]
  }
}

