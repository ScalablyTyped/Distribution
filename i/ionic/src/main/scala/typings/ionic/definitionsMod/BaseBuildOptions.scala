package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseBuildOptions extends js.Object {
  var `--`: js.Array[String]
  var engine: String
  var platform: js.UndefOr[String] = js.undefined
  var project: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object BaseBuildOptions {
  @scala.inline
  def apply(
    `--`: js.Array[String],
    engine: String,
    platform: String = null,
    project: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): BaseBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine)
    __obj.updateDynamic("--")(`--`)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[BaseBuildOptions]
  }
}

