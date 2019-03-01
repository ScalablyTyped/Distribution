package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptions[T /* <: ProjectType */] extends BaseBuildOptions {
  var `type`: T
}

object BuildOptions {
  @scala.inline
  def apply[T /* <: ProjectType */](
    `--`: js.Array[java.lang.String],
    engine: java.lang.String,
    `type`: T,
    platform: java.lang.String = null,
    project: java.lang.String = null
  ): BuildOptions[T] = {
    val __obj = js.Dynamic.literal(`--` = `--`, `type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("engine")(engine)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[BuildOptions[T]]
  }
}

