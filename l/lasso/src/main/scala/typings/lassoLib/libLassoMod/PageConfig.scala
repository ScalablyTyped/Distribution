package typings
package lassoLib.libLassoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageConfig extends js.Object {
  var cache: js.UndefOr[js.Any] = js.undefined
  var cacheKey: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dependencies: js.Array[lassoLib.libDependenciesMod.DependencyConfig] | js.Array[java.lang.String] | java.lang.String | scala.Null
  var flags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var lassoContext: js.UndefOr[lassoLib.libLassoContextMod.default] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var packagePath: js.UndefOr[java.lang.String] = js.undefined
  var packagePaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var pageName: js.UndefOr[java.lang.String] = js.undefined
}

object PageConfig {
  @scala.inline
  def apply(
    cache: js.Any = null,
    cacheKey: java.lang.String = null,
    data: js.Any = null,
    dependencies: js.Array[lassoLib.libDependenciesMod.DependencyConfig] | js.Array[java.lang.String] | java.lang.String = null,
    flags: js.Array[java.lang.String] = null,
    from: java.lang.String = null,
    lassoContext: lassoLib.libLassoContextMod.default = null,
    name: java.lang.String = null,
    packagePath: java.lang.String = null,
    packagePaths: js.Array[java.lang.String] = null,
    pageName: java.lang.String = null
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

