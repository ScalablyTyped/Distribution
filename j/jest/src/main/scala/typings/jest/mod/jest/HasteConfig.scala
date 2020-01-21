package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasteConfig extends js.Object {
  var defaultPlatform: js.UndefOr[Maybe[String]] = js.undefined
  var hasteImplModulePath: js.UndefOr[String] = js.undefined
  var platforms: js.UndefOr[js.Array[String]] = js.undefined
  var providesModuleNodeModules: js.Array[String]
}

object HasteConfig {
  @scala.inline
  def apply(
    providesModuleNodeModules: js.Array[String],
    defaultPlatform: Maybe[String] = null,
    hasteImplModulePath: String = null,
    platforms: js.Array[String] = null
  ): HasteConfig = {
    val __obj = js.Dynamic.literal(providesModuleNodeModules = providesModuleNodeModules.asInstanceOf[js.Any])
    if (defaultPlatform != null) __obj.updateDynamic("defaultPlatform")(defaultPlatform.asInstanceOf[js.Any])
    if (hasteImplModulePath != null) __obj.updateDynamic("hasteImplModulePath")(hasteImplModulePath.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasteConfig]
  }
}

