package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectConfigOptions
  extends atIonicCliDashFrameworkLib.libConfigMod.BaseConfigOptions {
  val `type`: js.UndefOr[ionicLib.definitionsMod.ProjectType] = js.undefined
}

object ProjectConfigOptions {
  @scala.inline
  def apply(pathPrefix: js.Array[java.lang.String] = null, `type`: ionicLib.definitionsMod.ProjectType = null): ProjectConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProjectConfigOptions]
  }
}

