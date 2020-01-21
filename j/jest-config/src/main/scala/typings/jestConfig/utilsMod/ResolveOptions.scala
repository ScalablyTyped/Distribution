package typings.jestConfig.utilsMod

import typings.jestTypes.configMod.Path
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
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveOptions]
  }
}

