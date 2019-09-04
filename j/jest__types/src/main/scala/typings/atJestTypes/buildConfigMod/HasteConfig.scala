package typings.atJestTypes.buildConfigMod

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
    val __obj = js.Dynamic.literal(providesModuleNodeModules = providesModuleNodeModules)
    if (!js.isUndefined(computeSha1)) __obj.updateDynamic("computeSha1")(computeSha1)
    if (defaultPlatform != null) __obj.updateDynamic("defaultPlatform")(defaultPlatform)
    if (hasteImplModulePath != null) __obj.updateDynamic("hasteImplModulePath")(hasteImplModulePath)
    if (platforms != null) __obj.updateDynamic("platforms")(platforms)
    if (!js.isUndefined(throwOnModuleCollision)) __obj.updateDynamic("throwOnModuleCollision")(throwOnModuleCollision)
    __obj.asInstanceOf[HasteConfig]
  }
}

