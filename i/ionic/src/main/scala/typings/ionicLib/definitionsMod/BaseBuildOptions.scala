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
}

object BaseBuildOptions {
  @scala.inline
  def apply(
    `--`: js.Array[java.lang.String],
    engine: java.lang.String,
    platform: java.lang.String = null,
    project: java.lang.String = null
  ): BaseBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine)
    __obj.updateDynamic("--")(`--`)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[BaseBuildOptions]
  }
}

