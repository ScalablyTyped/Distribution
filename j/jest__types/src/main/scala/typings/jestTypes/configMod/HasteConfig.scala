package typings.jestTypes.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasteConfig extends js.Object {
  var computeSha1: js.UndefOr[Boolean] = js.undefined
  var defaultPlatform: js.UndefOr[String | Null] = js.undefined
  var hasteImplModulePath: js.UndefOr[String] = js.undefined
  var platforms: js.UndefOr[js.Array[String]] = js.undefined
  var providesModuleNodeModules: js.Array[String]
  var throwOnModuleCollision: js.UndefOr[Boolean] = js.undefined
}

object HasteConfig {
  @scala.inline
  def apply(
    providesModuleNodeModules: js.Array[String],
    computeSha1: js.UndefOr[Boolean] = js.undefined,
    defaultPlatform: String = null,
    hasteImplModulePath: String = null,
    platforms: js.Array[String] = null,
    throwOnModuleCollision: js.UndefOr[Boolean] = js.undefined
  ): HasteConfig = {
    val __obj = js.Dynamic.literal(providesModuleNodeModules = providesModuleNodeModules.asInstanceOf[js.Any])
    if (!js.isUndefined(computeSha1)) __obj.updateDynamic("computeSha1")(computeSha1.asInstanceOf[js.Any])
    if (defaultPlatform != null) __obj.updateDynamic("defaultPlatform")(defaultPlatform.asInstanceOf[js.Any])
    if (hasteImplModulePath != null) __obj.updateDynamic("hasteImplModulePath")(hasteImplModulePath.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnModuleCollision)) __obj.updateDynamic("throwOnModuleCollision")(throwOnModuleCollision.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasteConfig]
  }
}

