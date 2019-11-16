package typings.jestDashConfig.buildUtilsMod

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveOptions extends js.Object {
  var filePath: Path
  var key: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var rootDir: Path
}

object ResolveOptions {
  @scala.inline
  def apply(filePath: Path, key: String, rootDir: Path, optional: js.UndefOr[Boolean] = js.undefined): ResolveOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, key = key, rootDir = rootDir)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[ResolveOptions]
  }
}

