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
    project: java.lang.String = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): BuildOptions[T] = {
    val __obj = js.Dynamic.literal(engine = engine)
    __obj.updateDynamic("--")(`--`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[BuildOptions[T]]
  }
}

