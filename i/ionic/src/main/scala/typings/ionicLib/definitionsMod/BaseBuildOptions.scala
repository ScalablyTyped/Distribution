package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseBuildOptions extends js.Object {
  var `--`: js.Array[java.lang.String]
  var engine: java.lang.String
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var project: js.UndefOr[java.lang.String] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object BaseBuildOptions {
  @scala.inline
  def apply(
    `--`: js.Array[java.lang.String],
    engine: java.lang.String,
    platform: java.lang.String = null,
    project: java.lang.String = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine)
    __obj.updateDynamic("--")(`--`)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[BaseBuildOptions]
  }
}

