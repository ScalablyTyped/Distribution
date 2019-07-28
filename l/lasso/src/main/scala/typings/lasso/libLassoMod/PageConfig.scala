package typings.lasso.libLassoMod

import typings.lasso.libDependenciesMod.DependencyConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageConfig extends js.Object {
  var cache: js.UndefOr[js.Any] = js.undefined
  var cacheKey: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dependencies: (js.Array[DependencyConfig | String]) | String | Null
  var flags: js.UndefOr[js.Array[String]] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var lassoContext: js.UndefOr[typings.lasso.libLassoContextMod.default] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var packagePath: js.UndefOr[String] = js.undefined
  var packagePaths: js.UndefOr[js.Array[String]] = js.undefined
  var pageName: js.UndefOr[String] = js.undefined
}

object PageConfig {
  @scala.inline
  def apply(
    cache: js.Any = null,
    cacheKey: String = null,
    data: js.Any = null,
    dependencies: (js.Array[DependencyConfig | String]) | String = null,
    flags: js.Array[String] = null,
    from: String = null,
    lassoContext: typings.lasso.libLassoContextMod.default = null,
    name: String = null,
    packagePath: String = null,
    packagePaths: js.Array[String] = null,
    pageName: String = null
  ): PageConfig = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (from != null) __obj.updateDynamic("from")(from)
    if (lassoContext != null) __obj.updateDynamic("lassoContext")(lassoContext)
    if (name != null) __obj.updateDynamic("name")(name)
    if (packagePath != null) __obj.updateDynamic("packagePath")(packagePath)
    if (packagePaths != null) __obj.updateDynamic("packagePaths")(packagePaths)
    if (pageName != null) __obj.updateDynamic("pageName")(pageName)
    __obj.asInstanceOf[PageConfig]
  }
}

